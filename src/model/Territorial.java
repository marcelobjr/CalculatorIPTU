/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author marcelo
 */
public class Territorial extends CalcBase{
    
    private final ArrayList<CalcBase> dados;

    public Territorial() {
        
        // Carregando Lista
        
        this.dados  = new ArrayList();
        
        CalcBase cb = new CalcBase();
        
        cb.setAliquota(1.00);
        cb.setValorInicial(0);
        cb.setValorFinal(47724);
        cb.setIntervalo(47724);
        dados.add(cb);
        
        CalcBase cb1 = new CalcBase();
        cb1.setAliquota(1.60);
        cb1.setValorInicial(47724);
        cb1.setValorFinal(357939);
        cb1.setIntervalo(310215);
        dados.add(cb1);
        
        CalcBase cb2 = new CalcBase();
        cb2.setAliquota(2.00);
        cb2.setValorInicial(357939);
        cb2.setValorFinal(715879);
        cb2.setIntervalo(357940);
        dados.add(cb2);
        
        CalcBase cb3 = new CalcBase();
        cb3.setAliquota(2.50);
        cb3.setValorInicial(715879);
        cb3.setValorFinal(1193131);
        cb3.setIntervalo(477252);
        dados.add(cb3);
        
        CalcBase cb4 = new CalcBase();
        cb4.setAliquota(3.00);
        cb4.setValorInicial(1193131);
        cb4.setValorFinal(999999999);
        cb4.setIntervalo(238626);
        dados.add(cb4);
        
        
    }

    /**
     * @return the dados
     */
    public ArrayList<CalcBase> getDados() {
        return dados;
    }
    
}
