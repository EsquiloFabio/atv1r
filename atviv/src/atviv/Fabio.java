package atviv;
import java.util.Scanner;
public class Fabio {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu primeiro zero aluno estranho: ");
        nota1 = input.nextDouble();
        System.out.println("Digite seu segundo zero aluno estranho: ");
        nota2 = input.nextDouble();
        
        media = ((nota1*2)+(nota2*3))/2;
        
        System.out.println("A media de suas notas pateticas e " +media);
        
    }
	

}
