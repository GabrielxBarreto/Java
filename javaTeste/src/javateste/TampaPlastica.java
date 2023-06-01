/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javateste;

/**
 *
 * @author IFBA
 */
public class TampaPlastica {
   
    int diametro;
    String cor;
    boolean biodegradavel;
    //métodods:
    TampaPlastica(){
    diametro = 1;
    }
    TampaPlastica(String cor,int diametro,boolean biodegradavel){
    this.cor = cor;
    this.diametro = diametro;
    this.biodegradavel = biodegradavel;
    }
    public void imprimeAsCoisas(){
        System.out.println("Cor da Tampa:"+this.cor);
        System.out.println("Diâmetro da Tampa:"+this.diametro);
        if(this.biodegradavel == true){
            System.out.println("Este produto possui certificação biodegradável");
        }else{
           System.out.println("Este produto NÃO possui certificação biodegradável"); 
        }
        }
    }
      
    

