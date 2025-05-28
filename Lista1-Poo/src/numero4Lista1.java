import java.util.Scanner;

public class numero4Lista1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        if(numero % 5 == 0){
        System.out.println("O seu numero é divisivel por 5! ");}

        else{
            System.out.println("O seu numero não divisivel por 5. ");
        }



        }
    }
