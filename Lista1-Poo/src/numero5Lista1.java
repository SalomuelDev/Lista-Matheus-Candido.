import java.util.Scanner;
public class numero5Lista1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        if( numero % 3 == 0 && numero % 7 == 0){
            System.out.print("O seu numero é divisivel por 3 e 7");
        }
        else{
            System.out.print("O seu numero não é divisivel por 3 e 7");
        }



        }
    }
