

import java.util.Scanner;

public class Numero2Lista1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = entrada.nextInt();

        System.out.println("Digite mais um valor: ");
        int valor2 = entrada.nextInt();

        if(valor + valor2 > 20){
            System.out.println("O resultado foi de: " + (valor + valor2 + 8));
        }
        else{
            System.out.println("O resultado foi de: " + (valor + valor2 - 5));
        }
        
        }
    }