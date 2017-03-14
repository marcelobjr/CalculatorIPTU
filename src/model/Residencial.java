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
public class Residencial extends CalcBase{
    
    /**
     * Dados
     */
    private final ArrayList<CalcBase> dados;

    public Residencial() {
        
         // Carregando Lista
        
        this.dados  = new ArrayList();
        
        CalcBase cb = new CalcBase();
        cb.setAliquota(0.60);
        cb.setValorInicial(0);
        cb.setValorFinal(95450);
        cb.setIntervalo(95450);
        this.dados.add(cb);
        
        CalcBase cb2 = new CalcBase();
        cb2.setAliquota(0.70);
        cb2.setValorInicial(95450);
        cb2.setValorFinal(238626);
        cb2.setIntervalo(143176);
        this.dados.add(cb2);
        
        CalcBase cb3 = new CalcBase();
        cb3.setAliquota(0.75);
        cb3.setValorInicial(238626);
        cb3.setValorFinal(417596);
        cb3.setIntervalo(178970);
        this.dados.add(cb3);
        
        CalcBase cb4 = new CalcBase();
        cb4.setAliquota(0.80);
        cb4.setValorInicial(417596);
        cb4.setValorFinal(715879);
        cb4.setIntervalo(298283);
        this.dados.add(cb4);
        
        CalcBase cb5 = new CalcBase();
        cb5.setAliquota(0.85);
        cb5.setValorInicial(715879);
        cb5.setValorFinal(954505);
        cb5.setIntervalo(238626);
        this.dados.add(cb5);
        
        CalcBase cb6 = new CalcBase();
        cb6.setAliquota(0.90);
        cb6.setValorInicial(954505);
        cb6.setValorFinal(1193131);
        cb6.setIntervalo(238626);
        this.dados.add(cb6);
        
        CalcBase cb7 = new CalcBase();
        cb7.setAliquota(1.00);
        cb7.setValorInicial(1193131);
        cb7.setValorFinal(999999999);
        cb7.setIntervalo(238626);
        this.dados.add(cb7);
        
        
    }

    /**
     * @return the dados
     */
    public ArrayList<CalcBase> getDados() {
        return dados;
    }
    
    
    
}
