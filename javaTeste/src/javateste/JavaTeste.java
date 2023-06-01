/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javateste;

public class JavaTeste {

    public static void main(String [] args) {
       
        TampaPlastica tamp01 = new TampaPlastica();
        TampaPlastica tamp02 = new TampaPlastica();
        TampaPlastica tamp03 = new TampaPlastica("amarelo",3,true);

        //tamp01.diametro = 7;
        System.out.println("\n-exemplo 01:");
        tamp01.cor = "azul";
        tamp01.biodegradavel = false;
       
        tamp01.imprimeAsCoisas();
        System.out.println("\n-exemplo 02:");
        tamp02.imprimeAsCoisas();
        System.out.println("\n-exemplo 03:");
        tamp03.imprimeAsCoisas();
        System.out.println("\n----------------------------------------------");
        Riquelme john = new Riquelme();
        System.out.print(john.nome = "Riquelme\n");
        
       
       
    }
}
