package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int A1, A2, A3;
         boolean vA1,vA2,vA3;
        System.out.println("Digite sua nota da A1");
            A1 = Integer.parseInt(scanner.nextLine());
            vA1 = validarNumero(A1,30);
        System.out.println("Digite sua nota da A2");
            A2 = Integer.parseInt(scanner.nextLine());
            vA2 = validarNumero(A1,30);
        System.out.println("Digite sua nota da A3");
            A3 = Integer.parseInt(scanner.nextLine());
            vA3= validarNumero(A1,40);
        
               double valor = A1 + A2 + A3;
            if(vA1 && vA2 && vA2){
                System.out.println("Sua nota final "+ valor );
            }else {
                System.out.println("parametros invalidos" );
            }
     
        
     
    }
    public static boolean validarNumero(double numero, int valorMaximo){
        if (numero <0 || numero >= valorMaximo){
            return false;
        }
       
        return true;
        
        
    }
}
