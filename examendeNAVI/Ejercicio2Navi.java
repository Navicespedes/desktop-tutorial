package examendeNAVI;
import java.util.Scanner;

public class Ejercicio2Navi {
    public static void main(String[] args) {
        double precio, descuento, igv, total, pf;
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precio=lt.nextDouble();
        if (precio>=2000){
            descuento=precio*0.10;
        }else if (precio>1000 && precio<2000){
            descuento=precio*0.05;
        }else if (precio>=500 && precio<1000){
            descuento=precio*0.02;
        }else{
            descuento=precio*0;
        }
        total=precio-descuento;
        igv=total*0.18;
        pf=total+igv;
        System.out.println("El igv total es: "+igv);
        System.out.println("El descuento total es :"+descuento);
        System.out.println("El total a pagar es :"+pf); 
    }
}
