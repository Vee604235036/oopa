package homework;

import java.util.Scanner;

public class LetterPostShop {
    public static void main(String[] args) {
        System.out.println("-------------Menu-------------");
        System.out.println("0=Exit");
        System.out.println("1=Normal Letter");
        System.out.println("2=Register Letter");
        System.out.println("3=EMS Letter");
        System.out.println("------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Menu[0-3] : ");
        int menu = sc.nextInt();
        
        
        switch (menu) {
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                System.out.println("1.Normal Letter");
                break;
            case 2:
                System.out.println("2.Register Letter");
                break;
            case 3:
                System.out.println("3.EMS Letter");
                break;
            default:
                break;
        }
        System.out.print("\tEnter Weight(g) : ");
        int weight = sc.nextInt();
        
        //Menu = 1 
        if (menu==1 && weight<=20) {
            System.out.println("Normal Letter Service Price : 3 baht");
            
        }else if(menu==1 && weight<=100) {
            System.out.println("Normal Letter Service Price : 5 baht");
            
        }else if(menu==1 && weight<=250) {
            System.out.println("Normal Letter Service Price : 9 baht");
            
        }else if(menu==1 && weight<=500) {
            System.out.println("Normal Letter Service Price : 15 baht");
            
        }else if(menu==1 && weight<=1000) {
            System.out.println("Normal Letter Service Price : 25 baht");
            
        }else if(menu==1 && weight<=2000) {
            System.out.println("Normal Letter Service Price : 45 baht");
            
        //Menu = 2  
               
        }else if(menu==2 && weight<=20) {
            System.out.println("Register Letter Service Price : 16 baht");  
            
        }else if(menu==2 && weight<=100) {
            System.out.println("Register Letter Service Price : 18 baht");
          
        }else if(menu==2 && weight<=250) {
            System.out.println("Register Letter Service Price : 22 baht");
            
        }else if(menu==2 && weight<=500) {
            System.out.println("Register Letter Service Price : 28 baht");
            
        }else if(menu==2 && weight<=1000) {
            System.out.println("Register Letter Service Price : 38 baht");
            
        }else if(menu==2 && weight<=2000) {
            System.out.println("Register Letter Service Price : 58 baht");
            
        //Menu = 3  
            
        }else if(menu==3 && weight<=20) {
            System.out.println("EMS Letter Service Price : 27 baht");  
            
        }else if(menu==3 && weight<=100) {
            System.out.println("EMS Letter Service Price : 32 baht");
          
        }else if(menu==3 && weight<=250) {
            System.out.println("EMS Letter Service Price : 37 baht");
            
        }else if(menu==3 && weight<=500) {
            System.out.println("EMS Letter Service Price : 47 baht");
            
        }else if(menu==3 && weight<=1000) {
            System.out.println("EMS Letter Service Price : 62 baht");
            
        }else if(menu==3 && weight<=2000) {
            System.out.println("EMS Letter Service Price : 77 baht");
        
        }
    }
}
