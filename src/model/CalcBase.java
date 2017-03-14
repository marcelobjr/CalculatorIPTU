/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author marcelo
 */
public class CalcBase {
    
    private double aliquota;
    private double valorInicial;
    private double valorFinal;
    private double intervalo;

    /**
     * @return the aliquota
     */
    public double getAliquota() {
        return aliquota;
    }

    /**
     * @return the valorInicial
     */
    public double getValorInicial() {
        return valorInicial;
    }

    /**
     * @return the valorFinal
     */
    public double getValorFinal() {
        return valorFinal;
    }

    /**
     * @return the intervalo
     */
    public double getIntervalo() {
        return intervalo;
    }

    /**
     * @param aliquota the aliquota to set
     */
    protected void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    /**
     * @param valorInicial the valorInicial to set
     */
    protected void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    /**
     * @param valorFinal the valorFinal to set
     */
    protected void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    /**
     * @param intervalo the intervalo to set
     */
    protected void setIntervalo(double intervalo) {
        this.intervalo = intervalo;
    }
    
    
}
