package homework;

public class multiplication {
    public static void main(String[] args){
        int W = 12;
        int h = 12;
        System.out.println("--------------------------------------Multiplication Table----------------------------------------"); 
        System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12");
        System.out.println("--------------------------------------------------------------------------------------------------");
        int sum;
        for(int i= 2;i<=h;i++){
            System.out.print(i);
            for(int j=1;j<=W;j++){
               sum=i*j;
               System.out.print("\t"+sum);
  
            }
            System.out.println("\n");
        }
     
        
    }
    
}
