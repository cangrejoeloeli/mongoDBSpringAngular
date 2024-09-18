package com.simple.email.services;

import jakarta.mail.MessagingException;

import jakarta.mail.internet.*;

import lombok.RequiredArgsConstructor;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.simple.email.requests.MailRequest;
import com.simple.email.utils.FormateoDatos;

@Service
@RequiredArgsConstructor
public class EmailingService {
    private final JavaMailSender mailSender;
    private final TemplateEngine templateEngine;

    @Value("${spring.mail.username}")
    private String fromMail;

    @Async
    public void sendMail(MailRequest request) throws MessagingException, UnsupportedEncodingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);

        mimeMessage.setFrom(new InternetAddress(fromMail, "Avisos GrupoJunín"));
        // mimeMessageHelper.setFrom(fromMail);
        mimeMessageHelper.setTo(request.getToEmail());

        List<String> palabras = new ArrayList<>();
        palabras.add("Dionisio");
        palabras.add("Vega");
        palabras.add("Eguilor");
        palabras.add("Anastasia");
        palabras.add("Ceballos");
        palabras.add("José");
        palabras.add("Laurel");
        palabras.add("Hernández");
        palabras.add("Ávalo");
        palabras.add("Gómez");
        Random random = new Random();
        for (int i = 1; i < 7; i++) {

            DecimalFormat formato = new DecimalFormat("00000000000");
            DecimalFormat formato4 = new DecimalFormat("0000");
            DecimalFormat formato2 = new DecimalFormat("0000");

            String cis = FormateoDatos.getCis(formato.format(Math.random() * 999999999));
            String subject = cis;
            String nombreApellido = palabras.get(random.nextInt(palabras.size())) + " "
                    + palabras.get(random.nextInt(palabras.size()));
            ;
            String dni = formato.format(Math.random() * 99999999);
            String direccion = palabras.get(random.nextInt(palabras.size())) + " "
                    + formato4.format(random.nextInt(9999)) + " Piso " + formato2.format(random.nextInt(25)) + "º";
            String factura = "C" + formato.format(Math.random() * 999999999);
            String vencimiento = FormateoDatos.getFechaActual();
            String plantilla;
            Context context = new Context();

            switch (i) {
                case 1:
                    subject = "Acerca - CIS " + cis + " - Factura disponible";
                    plantilla = "acerca-FacturaDisponible";
                    break;
                case 2:
                    subject = "Acerca - CIS " + cis + " - Factura Vencida";
                    plantilla = "acerca-FacturaVencida";
                    context.setVariable("deuda", "$ " + FormateoDatos.getNumber(Math.random() * 2500000f));
                    break;
                case 3:
                    subject = "Acerca - CIS " + cis + " - Vencimiento próximo";
                    plantilla = "acerca-FacturaPorVencer";
                    break;
                case 4:
                    subject = "Gas - CIS " + cis + " - Factura disponible";
                    plantilla = "gas-FacturaDisponible";
                    break;
                case 5:
                    subject = "Gas - CIS " + cis + " - Factura Vencida";
                    plantilla = "gas-FacturaVencida";
                    context.setVariable("deuda", "$ " + FormateoDatos.getNumber(Math.random() * 99999999));
                    break;
                case 6:
                    subject = "Gas - CIS " + cis + " - Vencimiento próximo";
                    plantilla = "gas-FacturaPorVencer";
                    break;
                default:
                    subject = "ERROR - template";
                    plantilla = "template";
                    break;
            }

            mimeMessageHelper.setSubject(subject);

            /*
             * content is the variable defined in our HTML template within the div tag
             */
            context.setVariable("cis", cis);
            context.setVariable("nombreApellido", nombreApellido);
            context.setVariable("doc_cuit", dni);
            context.setVariable("direccion", direccion);
            context.setVariable("factura", factura);
            context.setVariable("importe", "$ " + FormateoDatos.getNumber(Math.random() * 99999999f));
            context.setVariable("vencimiento", vencimiento);

            String processedString = templateEngine.process(plantilla, context);

            mimeMessageHelper.setText(processedString, true);

            mailSender.send(mimeMessage);

            System.out.println("Enviado " + plantilla);
        }
        System.out.println("Enviados a " + request.getToEmail());
    }
}
