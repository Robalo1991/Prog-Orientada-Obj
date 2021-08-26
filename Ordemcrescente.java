import java.util.Arrays;
import java.util.Scanner;

public class Vetor_ordem_crescente
{
public static void main(String[] args)
{
Scanner numeros = new Scanner(System.in);

int[] lista = new int[5];
        for (int i = 1; i < lista.length; i++) 
           {
	           System.out.print("Digite "+ i + "° numeros: "); 
	           lista[i] = (numeros.nextInt());
	       }

           Arrays.sort(lista);
       
          System.out.print("Ordem crescente:    "); 
       	  for (int j = 1; j < lista.length; j++) 
       	  {
       		System.out.print(lista[j]+ "  ");       		
		  }	           
        	 
}
}
