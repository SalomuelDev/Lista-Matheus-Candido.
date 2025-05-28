package com.mycompany.java;

import java.util.Scanner;

public class Numero1Lista1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        System.out.println("Digite outro numero ");
        int numero2 = entrada.nextInt();

        int soma = numero + numero2;

        if(soma >10 ){
            System.out.println("A soma dos valores esta acima de 10!: " + soma);
        }
        else{
            System.out.println("Ops! Temos nada aqui.");
        }





    }
}