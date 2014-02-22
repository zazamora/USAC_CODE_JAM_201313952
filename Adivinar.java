import java.util.Random;
import java.util.Scanner;
public class Adivinar{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		Random azar = new Random();
		int numeroAdivinar = azar.nextInt(100) + 1;
		int numero = 0;
		do{
			System.out.println("Ingrese el numero que crea es el correcto.");
			numero = lector.nextInt();
			if(numero > numeroAdivinar){
				System.out.println("El numero que ingreso es mayor.\n");
			}else if(numero < numeroAdivinar){
				System.out.println("El numero que ingreso es menor.\n");
			}else{
				System.out.println("El numero que ingreso es el correcto FELICIDADES.");
			}
		}while(numero != numeroAdivinar);
	}
}