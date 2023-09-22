
package examen1u2;

import java.util.Scanner;

public class Examen1u2 {


    
    public static void main(String[] args) {

        Scanner ent=new Scanner(System.in);
        String i1,i2,i3;
        double p1,p2,p3,G1, G2,G3,T1,T2,T3;
   double  V1=1250.45,V2=3743.00, V3=2683.78;
        System.out.println("Dame el primer instrumento <");
         i1=ent.nextLine();
        System.out.println("Dame el Segundo Instrumento");
        i2=ent.nextLine();
        System.out.println("Dame el tercer instrumento");
        i3=ent.nextLine();
        
       
        
        
        System.out.println("Dame el precio de compra");       
        p1=ent.nextDouble();
        System.out.println("Dame el precio de compra");
            p2=ent.nextDouble();
        System.out.println("Dame el precio de compra ");
            p3=ent.nextDouble();
   
    G1=V1-p1;
    T1=(G1/p1)*100;
    
    G2=V2-p2;
    T2=(G2/p3)*100;
      
    G3=V3-p3;
    T3=(G3/p3)*100;
      
    
    
    System.out.println("El porcentaje de ganancia de" + i1 + "es" + T1);
    System.out.println("El porcentaje de ganancia de" + i2 + "es" + T2);
     System.out.println("El porcentaje de ganancia de" + i3 + "es" + T3);
     
    }
    
    
}
