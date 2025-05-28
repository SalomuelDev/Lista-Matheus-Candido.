import java.util.Scanner;
public class numero7Lista1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.println("Nota 1: ");
        float nota = entrada.nextFloat();

        System.out.println("Nota 2: ");
        float nota2 = entrada.nextFloat();

        float soma = (nota + nota2) / 2;

        if(soma > 7){
        System.out.println("Aluno aprovado! \n"+ nota + "\n" + nota2 + "\n" + soma);}
        else if(soma < 3){
            System.out.println("em Prova Final! \n"+ nota + "\n" + nota2);
        }
        else{
            System.out.println("Aluno reprovado! \n"+ nota + "\n" + nota2);
        }


    }
}