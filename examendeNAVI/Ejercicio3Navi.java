package examendeNAVI;
import java.util.Scanner;

public class Ejercicio3Navi {
    public static void main(String[] args) {
        double num1, num2, total,signo; 
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1=lt.nextDouble();
        System.out.println("ingrese el segundo numero");
        num2=lt.nextDouble();
        System.out.println("1 = (+=suma) \n2 = (-=resta) \n3 = (*=multiplicacion) \n4 = (/=division) \n5 = (R=raiz) \n6 = (^=potencia) \n7 = (%=modulo de 2) \ningrese el signo: ");
        signo=lt.nextDouble();
        if (signo==1) {
            total=num1+num2;
        }else if (signo==2) {
            total=num1-num2;
        }else if (signo==3) {
            total=num1*num2;
        }else if (signo==4) {
            total=num1/num2;
        }else if (signo==5) {
            total=Math.pow(num1,0.5);   
        }else if (signo==6) {
            total=Math.pow(num1,num2);
        }else{
            total=num1%num2;
        }
        System.out.println("el resusltado es: "+total);
    }
}
