import java.util.Scanner;
public class numero6Lista1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu salario?: ");
        float salario = entrada.nextFloat();

        System.out.println("Quanto é o valor do emprestimo?: ");
        float valorEmprestimo = entrada.nextFloat();

        System.out.println("Quantas prestações: ");
        int prestacoes = entrada.nextInt();

        float checagem = (valorEmprestimo / prestacoes);

        if((salario * 0.30) < checagem){
        System.out.println("O emprestimo nao pode ser feito.");}
        else{
            System.out.println("O emprestimo pode ser feito.");

        }





        }
    }
