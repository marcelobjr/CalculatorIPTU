/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatoriptu;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author marcelo
 */
public class CalculatorIPTU {
    

    public void calculator(double valorVenal, int tipo) {
        
        ArrayList<CalcBase> list = null;
        double totalIPTU = 0.0;
        
        switch (tipo) {
            case 1:
                Residencial res = new Residencial();
                list = res.getDados();
                break;
            case 2:
                Territorial ter = new Territorial();
                list = ter.getDados();
                break;
            case 3:
                NaoResidencial nores = new NaoResidencial();
                list = nores.getDados();
                break;
            default:
                 System.out.println("Tipo informado nao e válido!");
         }
     double intervalo = 0;
     double total = 0;
        for (CalcBase obj : list) {
            
            if (valorVenal >= obj.getValorFinal()) {
                total = (obj.getIntervalo() * obj.getAliquota()) / 100;
                totalIPTU = total + totalIPTU;
                intervalo = obj.getIntervalo();

            } else {
                intervalo = valorVenal - obj.getValorInicial();
                total = (intervalo * obj.getAliquota()) / 100;
                totalIPTU = total + totalIPTU;
                System.err.println(valorVenal + " = " + intervalo + " x " + obj.getAliquota() + "% = "+ total);
                    break;

            }
            System.err.println(valorVenal + " = " + intervalo + " x " + obj.getAliquota() + "% = "+ total);
        }
         
        System.err.println(totalIPTU);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new CalculatorIPTU().calculator(430000.00, 2);
    }
    
}
