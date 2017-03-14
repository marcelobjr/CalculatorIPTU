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
        
        cb.setAliquota(0.60);
        cb.setValorInicial(0);
        cb.setValorFinal(95450);
        cb.setIntervalo(95450);
        dados.add(cb);
        
        cb.setAliquota(0.70);
        cb.setValorInicial(95450);
        cb.setValorFinal(238626);
        cb.setIntervalo(143176);
        dados.add(cb);
        
        cb.setAliquota(0.75);
        cb.setValorInicial(238626);
        cb.setValorFinal(417596);
        cb.setIntervalo(178970);
        dados.add(cb);
        
        cb.setAliquota(0.80);
        cb.setValorInicial(417596);
        cb.setValorFinal(715879);
        cb.setIntervalo(298283);
        dados.add(cb);
        
        cb.setAliquota(0.85);
        cb.setValorInicial(715879);
        cb.setValorFinal(954505);
        cb.setIntervalo(238626);
        dados.add(cb);
        
        cb.setAliquota(0.90);
        cb.setValorInicial(954505);
        cb.setValorFinal(1193131);
        cb.setIntervalo(238626);
        dados.add(cb);
        
        cb.setAliquota(1.00);
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
