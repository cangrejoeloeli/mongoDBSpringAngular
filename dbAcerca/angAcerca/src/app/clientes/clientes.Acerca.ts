export interface ClientesAcerca {
    CLIENTE_ID: number;
    NUMERADOR_HIJOS: number;
    CODIGO_CALLE: number;
    NUMERO: number;
    PISO: number;
    SECTOR: string;
    TORRE: string;
    CASA: number;
    BARRIO: string;
    Block_titular: string;
    DTO: string;
    LOCALIDAD_ID: number;
    CODIGO_POSTAL: string;
    FISICA_JURIDICA: string;
    APELLIDO_NOMBRES_RAZON_SOCIAL: string;
    TE_TITULAR: string;
    CLASIFICACION_IVA_ID: number;
    PIB: string;
    CLAVE: number;
    TIPO_DOC: string;
    NUMERO_DOC: string;
    DIGITO_VERIFICADOR: number;
    DOCUMENTO: string;
    fECHA_ingreso_al_sistema?: any;
    apoderado?: any;
    tIPO_DOC_apoderado?: any;
    nUMERO_DOC_apoderado?: any;
    nombre_calle: string;
    te_1: string;
    cliente_agrupado?: any;
    acerca_tv?: any;

    [key: string]: any;
}