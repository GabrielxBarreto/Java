/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tempo;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author gyeel
 */
public class Tempo {

    public static void main(String[] args) {
        String txt = "Oi,olá";
        Timer timer = new Timer();
        final int SEG = (1*600);
        
        TimerTask tarefa;
        tarefa = new TimerTask(){
            
            Integer  i  = 0;
            public void run(){
                if(i == txt.length()){
                    timer.cancel();
                } else {
                System.out.print(txt.charAt(i));
                i++;
                }
                
                
                
            }
        };
        timer.scheduleAtFixedRate(tarefa,0,SEG);
    }
}
