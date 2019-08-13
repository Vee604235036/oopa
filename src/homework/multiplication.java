package homework;

public class multiplication {
    public static void main(String[] args){
        //System.out.println("--------------------------------------Multiplication Table----------------------------------------"); 
        //System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12");
        //System.out.println("--------------------------------------------------------------------------------------------------");
        int sum;
        for(int i= 1;i<=12;i++){
            for(int j=2;j<=12;j++){
               sum=i*j;
               System.out.print(sum+"\t");
  
            }
            System.out.println("\n");
        }
     
        
    }
    
}
