package examendeIVAN;
import java.util.Scanner;

public class Ejercicio4navi {

    public static void main(String[] args) {
        double año;
        String mensaje, genero;
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese la cantidad de años: ");
        año=lt.nextDouble();
        System.out.println("ingrese el genero (masculino o femenino): ");
        genero=lt.next();
        if (año>=70) {
            mensaje=("su vauna es de tipo C");
        }else if (año>=16 && año<=69 && genero=="masculino") {
            mensaje=("su vacuna es de tipo A");
        }else if (año>=16 && año<=69 && genero=="femenino") {
            mensaje=("su vacuna es de tipo B");
        }else{
            mensaje=("vacuna de tipo A");
        }
        System.out.println(mensaje);
    }
}

