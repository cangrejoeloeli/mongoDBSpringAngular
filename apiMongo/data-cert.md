# Creación de certificado
keytool -genkeypair -alias myalias -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore testCert.p12 -validity 365

-alias myalias: Nombre del alias para identificar el certificado.
-keyalg RSA: Algoritmo de clave (puedes elegir entre RSA, DSA, etc.).
-keysize 2048: Tamaño de la clave en bits.
-storetype PKCS12: Tipo de almacén de claves.
-keystore testCert.p12: Nombre del archivo generado.
-validity 365: Días de validez del certificado (por ejemplo, un año).

keytool -genkeypair -alias firmadesarrollo -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore desarrolloCert.p12 -validity 365

# Firma con itextpdf

