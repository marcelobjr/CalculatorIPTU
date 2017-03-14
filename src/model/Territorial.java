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
        
        cb.setAliquota(1.60);
        cb.setValorInicial(47724);
        cb.setValorFinal(357939);
        cb.setIntervalo(310215);
        dados.add(cb);
        
        cb.setAliquota(2.00);
        cb.setValorInicial(357939);
        cb.setValorFinal(715879);
        cb.setIntervalo(357940);
        dados.add(cb);
        
        cb.setAliquota(2.50);
        cb.setValorInicial(715879);
        cb.setValorFinal(1193131);
        cb.setIntervalo(477252);
        dados.add(cb);
        
        cb.setAliquota(3.00);
        cb.setValorInicial(1193131);
        cb.setValorFinal(999999999);
        cb.setIntervalo(238626);
        dados.add(cb);
        
        
        
    }

    /**
     * @return the dados
     */
    public ArrayList<CalcBase> getDados() {
        return dados;
    }
    
}
