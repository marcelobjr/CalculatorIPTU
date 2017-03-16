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
public class NaoResidencial extends CalcBase{
    
    private final ArrayList<CalcBase> dados;

    public NaoResidencial() {
        
         // Carregando Lista
        
        this.dados  = new ArrayList();
        
        CalcBase cb = new CalcBase();
        cb.setAliquota(1.20);
        cb.setValorInicial(0);
        cb.setValorFinal(35793);
        cb.setIntervalo(35793);
        dados.add(cb);
        
        CalcBase cb1 = new CalcBase();
        cb1.setAliquota(1.30);
        cb1.setValorInicial(35793);
        cb1.setValorFinal(119131);
        cb1.setIntervalo(83520);
        dados.add(cb1);
        
        CalcBase cb2 = new CalcBase();
        cb2.setAliquota(1.40);
        cb2.setValorInicial(119131);
        cb2.setValorFinal(596565);
        cb2.setIntervalo(477252);
        dados.add(cb2);
        
        CalcBase cb3 = new CalcBase();
        cb3.setAliquota(1.50);
        cb3.setValorInicial(596565);
        cb3.setValorFinal(1193131);
        cb3.setIntervalo(596566);
        dados.add(cb3);
        
        CalcBase cb4 = new CalcBase();
        cb4.setAliquota(1.60);
        cb4.setValorInicial(1193131);
        cb4.setValorFinal(999999999);
        cb4.setIntervalo(596566);
        dados.add(cb4);
        
        
        
    }

    /**
     * @return the dados
     */
    public ArrayList<CalcBase> getDados() {
        return dados;
    }
    
    
    
}
