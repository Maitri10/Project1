/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// STONE_PAPER_SCISSOR
package project_1;
import java.util.*;
/**
 *
 * @author Maitri
 R P S*/
public class PROJECT_1 {

    /**
     * @param args the command line arguments
     */
    public static void display_option(){
        System.out.println("1. Rock\n2. Paper\n3. Scissor");
    }
    
    public static String userChoice(Scanner sc){
        System.out.println("user plz enter ur choice");
        String chosen_str=sc.nextLine();
        return chosen_str;
    }
    
    public static void compareChoice(String s1,String s2,String s3,String s4){
        String choice[]={s1,s2,s3,s4};
        String[][] result=new String[10][10];
        //1st choice
        for(int k=0;k<=3;k++){
        if(choice[k].equalsIgnoreCase("Rock")){
            for(int i=0;i<=3;i++){
            switch(choice[i]){
                case "Rock": result[k][i]="0";break;
                case "Paper":result[k][i]="0";break;
                case "Scissor":result[k][i]="1";break;
            }
            if(i==k){result[i][i]="-";}
            }  
        }
        else if(choice[k].equalsIgnoreCase("Paper")){
          for(int i=0;i<=3;i++){
             switch(choice[i]){
                 case "Rock": result[k][i]="1";break;
                 case "Paper":result[k][i]="0";break;
                 case "Scissor":result[k][i]="0";break;
            }
            if(i==k){result[i][i]="-";}
          }  
        }
        else if(choice[k].equalsIgnoreCase("Scissor")){
          for(int i=0;i<=3;i++){
             switch(choice[i]){
                 case "Rock": result[k][i]="0";break;
                 case "Paper":result[k][i]="1";break;
                 case "Scissor":result[k][i]="0";break;
             } 
             if(i==k){result[i][i]="-";}
          }  
        }
        }
        System.out.println("        "+" Player0"+"   "+"   Player1"+"   "+"   Player2"+"   "+"   Player3");
        for(int j=0;j<=3;j++){
            System.out.print("Player"+j);
            for(int l=0;l<=3;l++){
                System.out.print("       ");
                System.out.print(result[j][l]+"     ");
                
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String p1,p2,p3,p4;
        int pnt_p1,pnt_p2,pnt_p3,pnt_p4;
        Scanner sc=new Scanner(System.in);
        display_option();
        p1=userChoice(sc);
        p2=userChoice(sc);
        p3=userChoice(sc);
        p4=userChoice(sc);
        
        compareChoice(p1,p2,p3,p4);
        
        
    }
    }
    

