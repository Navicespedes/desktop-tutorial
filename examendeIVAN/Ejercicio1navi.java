package examendeIVAN;
import java.util.Scanner;

public class Ejercicio1navi {
    public static void main(String[] args) {

        double ec, ep, tp, promedio;
        String estado;
        Scanner lt=new Scanner(System.in);
        System.out.println("Nota de conocimiento");
        ec=lt.nextDouble();
        System.out.println("Nota de entrevista personal");
        ep=lt.nextDouble();
        System.out.println("Nota del test psicologico");
        tp=lt.nextDouble();
        promedio=ec*0.4+ep*0.25+tp*0.35;
        if (promedio>=17 && promedio<=20) {
            estado="\n\nAprobo \n\tSe encuentra en el nivel 4 y alcanza una vacante";
        }else if(promedio<17 && promedio>=14){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 3 y alcanza una vacante";
        }else if(promedio<14 && promedio>=11){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 2 y alcanza una vacante";
        }else if(promedio<11){
            estado="\n\nDesaprobo y pierde la vacante \n\tSe encuentra en el nivel 1";
        }else{
            estado="\n\nDesaprobado";
        }
        System.out.println(estado);
    }   
}

