import java.util.Scanner;

public class Numero9Lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-_-_--_-_--_-_--_-_--_-_--_-_--_-_-" );
        System.out.println("DESCONTO INSS");
        System.out.println("-_-_--_-_--_-_--_-_--_-_--_-_--_-_-" );

        System.out.println("Qual o seu salário?: ");
        double salario = sc.nextDouble();

        if (salario <= 600) {
            System.out.println("Voce tera um Isento!");
        }
        else if (salario <= 1200) {
            System.out.printf("Desconto de 20%%: %.2f \n" , salario * 0.20);
        }
        else if (salario <= 2000) {
            System.out.printf("Desconto de 25%%: %.2f \n" , salario * 0.25);
        }
        else {
            System.out.printf("Voce tera um desconto de 30%%: %.2f \n", salario * 0.30);
        }


    }
    }
