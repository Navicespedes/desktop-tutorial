package examendeIVAN;
import java.util.Scanner;

public class EJercicio5 {
    static Scanner lt=new Scanner(System.in);
    public static void Ejercicio1FJQR() {
        double ec, ep, tp, promedio;
        String estado;
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
    public static void Ejercicio2FJQR() {
        double precio, descuento, igv, total, pf;
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
        System.out.println("El descuento total es:"+descuento);
        System.out.println("El total a pagar es:"+pf); 
    }
    public static void Ejercicio3FJQR() {
        double num1, num2, total,signo; 
        System.out.println("Ingrese el primer numero");
        num1=lt.nextDouble();
        System.out.println("Ingrese el segundo numero");
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
        System.out.println("El resultado es: "+total);
    }
    public static void Ejercicio4FJQR() {
        double año;
        String mensaje, genero;
        System.out.println("Ingrese la cantidad de años:");
        año=lt.nextDouble();
        System.out.println("Ingrese el genero (Masculino o Femenino):");
        genero=lt.next();
        if (año>=70) {
            mensaje=("Vacuna de tipo C");
        }else if (año>=16 && año<=69 && genero=="masculino") {
            mensaje=("Vacuna de tipo A");
        }else if (año>=16 && año<=69 && genero=="femenino") {
            mensaje=("Vacuna tipo B");
        }else{
            mensaje=("Vacuna tipo A");
        }
        System.out.println(mensaje);
    }
    public static void main(String[] args) {
        int numero;
        System.out.println("¿Que ejercicio desea ejecutar?");
        numero=lt.nextInt();
        switch (numero) {
            case 1:Ejercicio1FJQR(); break;
            case 2:Ejercicio2FJQR(); break;
            case 3:Ejercicio3FJQR(); break;
            case 4:Ejercicio4FJQR(); break;
            default: break;
        }
        
    }
    } 
