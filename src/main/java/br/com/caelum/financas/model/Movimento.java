package br.com.caelum.financas.model;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Movimento {

    private Integer id;
    private boolean ganho;

    public boolean isGanho() {
        return ganho;
    }

    public void setGanho(boolean ganho) {
        this.ganho = ganho;
    }

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Calendar data;

    private String fonte;
    private String tipo;
    private double valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
