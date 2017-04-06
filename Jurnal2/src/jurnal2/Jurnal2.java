/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal2;

/**
 *
 * @author Praktikan
 */
public class Jurnal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i <=7; i++){
            for(int j=1; j<=7; j++){
                if(i == 4 && j==4){
                    System.out.print("*");
                }else if(i==2 && j>2 && j<6){
                    System.out.print("*");
                }else if(i==3 && j>1 && j<7){
                    System.out.print("*");
                }else if(i==5 && j>1 && j<7){
                    System.out.print("*");
                }else if(i==6 && j>2 && j<6){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    
}
