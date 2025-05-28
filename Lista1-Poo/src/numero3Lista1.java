import java.util.Scanner;
public class numero3Lista1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        if(numero % 3 == 0){
            System.out.println("O seu numero é múltiplo de 3 ");
        }
        else{
            System.out.print("O seu numero nao é múiltiplo de 3 ");
        }

        }
    }
