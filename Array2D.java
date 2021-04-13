/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi6;

/**
 *
 * @author HP
 */
public class Array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] listJawaban =
                    {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
                    ,{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}
                    ,{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}
                    ,{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}
                    ,{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
                    ,{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
                    ,{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
                    ,{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
    };
        char[] kunciJawaban = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int jumlahMurid = 8;
        int correct = 0;
        int questions = 10;
        int i, j;
    
        int[] resultList = new int[jumlahMurid];
        
        for(i = 0; i<jumlahMurid; i++){
            for(j=0; j<questions; j++) {
                if(listJawaban[i][j] == kunciJawaban[j])
                    correct++;
            }
            resultList[i] = correct;
            correct = 0; //reset score
        }
        
        for(i=0; i<jumlahMurid; i++) {
            System.out.printf("Mhs %d jumlah jawaban benar adalah %d\n", i, resultList[i]);
        }
    }
    
}
