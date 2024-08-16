package com.gsj.clienteunico.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

@Service
public class LongTimeService {

    private final Map<String, String> processStatus = new ConcurrentHashMap<>();

    @Async
    public void startProcess(String processId) {
        processStatus.put(processId, "Iniciado");
        // Simular un proceso largo
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000); // 5 segundos
                processStatus.put(processId, "En ejecución " + String.valueOf(i));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        processStatus.put(processId, "Finalizado");
    }

    public String getProcessStatus(String processId) {
        return processStatus.getOrDefault(processId, "No encontrado");
    }

}
