package com.db.acerca.models;

public class Cliente {

public Cliente(){}

private Long CLIENTE_ID;
private String TIPO_DOC;

public Cliente(Long cLIENTE_ID, String tIPO_DOC, String nUMERO_DOC) {
    CLIENTE_ID = cLIENTE_ID;
    TIPO_DOC = tIPO_DOC;
    NUMERO_DOC = nUMERO_DOC;
}
public Cliente(String tIPO_DOC, String nUMERO_DOC) {
    TIPO_DOC = tIPO_DOC;
    NUMERO_DOC = nUMERO_DOC;
}

private String NUMERO_DOC;

public Long getCLIENTE_ID() {
    return CLIENTE_ID;
}
public void setCLIENTE_ID(Long cLIENTE_ID) {
    CLIENTE_ID = cLIENTE_ID;
}
public String getTIPO_DOC() {
    return TIPO_DOC;
}
public void setTIPO_DOC(String tIPO_DOC) {
    TIPO_DOC = tIPO_DOC;
}
public String getNUMERO_DOC() {
    return NUMERO_DOC;
}
public void setNUMERO_DOC(String nUMERO_DOC) {
    NUMERO_DOC = nUMERO_DOC;
}



}
