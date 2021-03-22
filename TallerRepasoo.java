/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrepasoo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author javi1
 */
public class TallerRepasoo {
    public static void ejercicio1(){
        System.out.println("Programa que lea dos números y muestre la suma, resta y residuo de cada uno\n");
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero");
        int num2 = entrada.nextInt();
        
        System.out.println("La suma: "+(num1+num2));
        System.out.println("La resta: "+(num1-num2));
        double res = num1 % num2;
        System.out.println("El modulo: "+res);
    }
    public static void ejercicio2(){
        System.out.println("Programa que lea un ser vivo y muestre a cual pertenece. Programar 5 posibilidades\n");
        System.out.println("Digite algunos de los siguientes seres vivos:\n"+"Sapo\n"+"Lechuga\n"+"Champiñon\n"+"Amebas\n"+"Serpulina\n");
        Scanner entrada = new Scanner(System.in);
        String vivo = entrada.nextLine();
        if ("Sapo".equals(vivo)) {
            System.out.println("Pertenece al reino animal");
        } else {
            if ("Lechuga".equals(vivo)) {
                System.out.println("Pertenece al reino vegetal");
            } else {
                if ("Champiñon".equals(vivo)) {
                    System.out.println("Pertenece al reino fungi");
                } else {
                    if ("Amebas".equals(vivo)) {
                        System.out.println("Pertenece al reino protista");
                    } else {
                        if ("Serpulina".equals(vivo)) {
                            System.out.println("Pertenece al reino monera");
                        } else {
                            System.out.println("Ser vivo desconocido");
                        }
                    }
                }
            }
        }
    }
    public static void ejercicio3(){
        JOptionPane.showMessageDialog(null, "Desarrolle un programa que lea un número de 1 a 7, muestre la nota musical correspondiente");
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite algun numero del 1 al 7"));
        switch (a){
            case 1:
                JOptionPane.showMessageDialog(null, "Do");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Re");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Mi");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Fa");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Sol");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "La");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Si");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion desconocida");
                break;
        }
    }
    public static void ejercicio4(){
        JOptionPane.showMessageDialog(null, "Método que lea un valor y muestre los números desde 0 hasta el valor ingresado");
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Hasta que numero desea registrar"));
        for (int i = 0; i <= n; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
    public static void ejercicio5(){
        JOptionPane.showMessageDialog(null, "Método que lea un valor y muestre los números desde 0 hasta el valor ingresado de 3 en 3, para esto reemplace en el for el unario i++ por i= i+3");
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Hasta que numero quieres parar"));
        for (int i = 0; i < n; i+=3) {
            JOptionPane.showMessageDialog(null, i);
        }
        JOptionPane.showMessageDialog(null, n);
    }
    public static void ejercicio6(){
        JOptionPane.showMessageDialog(null, "NÚMEROS PARES: realice un programa que permita leer un valor cualquiera N y escriba si dicho número es par\n" +
                                    "o impar. Para calcular si un número es par es necesario dividirlo por 2 y saber si tiene residuo (resto), para esto\n" +
                                    "utilice el operador Mod o módulo representado con el signo %, el cual arroja como resultado el residuo, por\n" +
                                    "ejemplo 20%7 da como resultado 6. El condicional que indica si es par es: if(numeroDigitado%2==0)");
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un numero"));
         if (num%2 == 0) {
            JOptionPane.showMessageDialog(null, num+" es numero par");
        } else {
             JOptionPane.showMessageDialog(null, num+" es numero impar");
        }
    }
    public static void ejercicio7(){
        JOptionPane.showMessageDialog(null, "SERIE DE FIBONACCI: la serie de Fibonacci es la sucesión infinita de números naturales 0,1,1,2,3,5,8,13,21...\n" +
                                    "donde los dos primeros números son cero(0) y uno(1) y los restantes resultan de la suma de los dos anteriores.\n" +
                                    "Desarrolle un programa que lea un número n y genere hasta el número leído, los números de la serie de\n" +
                                    "Fibonacci");
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba hasta que numero de la serie fibonacci quiere imprimir"));
        int con=1, i=0, stop=0;
        while (con<=n) {            
            if(stop==0){
                JOptionPane.showMessageDialog(null, "0");
            }
            stop=con;
            JOptionPane.showMessageDialog(null, con);
            con+=i;
            i=stop;
        }
        if (i==n) {
            
        } else {
            JOptionPane.showMessageDialog(null, n+" no es un numero de la serie fibonacci por lo que la secuencia es una aproximacion");
        }
    }
    public static void ejercicio8(){
        JOptionPane.showMessageDialog(null, "Desarrolle un programa que permita adivinar una clave secreta, este consiste en intentar adivinar un número\n" +
                                    "en tres oportunidades, para esto se deben declarar dos valores del mismo tipo, el primero constante e\n" +
                                    "inicializado en el número a adivinar, el segundo leído y comparado con el primero, se debe poder intentar tres\n" +
                                    "veces, en cada uno de los intentos se debe generar un mensaje que diga: “Acceso permitido”, si los números\n" +
                                    "son iguales. “Acceso denegado” si los números son diferentes, si al finalizar los tres intentos no se acierta debe\n" +
                                    "decir “Clave Bloqueada”");
        int i=1, contra=12, num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        while (i<=3) {            
            i+=1;
            if (num==contra) {
                JOptionPane.showMessageDialog(null, "Acceso permitido");
                break;
            }
            else{
                JOptionPane.showMessageDialog(null, "Acceso denegado");
            }
            if(i<4){
               num+=1; 
            }
        }
        if(num!=contra){
            JOptionPane.showMessageDialog(null, "Clave bloqueada");
        }
    }
    public static void ejercicio9(){
        JOptionPane.showMessageDialog(null, "Desarrollar un programa que lea dos numeros cualquiera, calcular la suma de sus digitos, decir cual es mayor y\n"+
                                    "si es par o impar");
        int sum1=0, sum2=0, con, num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero")); int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero"));
        while(num1>0){
            con=num1%10;
            sum1=con+sum1;
            num1/=10;
        }
        JOptionPane.showMessageDialog(null, "La suma de los primeros digitos es "+sum1);
        while(num2>0){
            con=num2%10;
            sum2=con+sum2;
            num2/=10;
        }
        JOptionPane.showMessageDialog(null, "La suma del segundos digitos es "+sum2);
        if (sum1>sum2) {
            JOptionPane.showMessageDialog(null, sum1+" es mayor");
        } else {
            if(sum2>sum1){
                JOptionPane.showMessageDialog(null, sum2+" es mayor");
            }
            else{
                JOptionPane.showMessageDialog(null, "Son iguales");
            }
        }
        if(sum1%2==0 && sum2%2==0){
            JOptionPane.showMessageDialog(null, sum1+" y "+sum2+" son pares");
        }
        else{
            if(sum1%2!=0 && sum2%2!=0){
                JOptionPane.showMessageDialog(null, sum1+" y "+sum2+" no son pares");
            }
            else{
                if(sum1%2!=0 && sum2%2==0){
                    JOptionPane.showMessageDialog(null, sum1+" no es par y "+sum2+" si es par");
                }
                else{
                    if(sum1%2==0 && sum2%2!=0){
                        JOptionPane.showMessageDialog(null, sum1+" es par y "+sum2+" no es par");
                    }
                }
            }
        }
    }
}
