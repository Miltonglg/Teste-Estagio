package application;

import java.util.Scanner;

public class InversaoString {

public static void main(String[] args) {
		
     Scanner sc = new Scanner (System.in);
	
     System.out.print("Digite uma palavra para inverter: ");
     String entrada = sc.nextLine();
     
     String palavrainvertida = inverterString(entrada);
     System.out.println("palavra invertida: " + palavrainvertida);
     
     sc.close();
	}
	
	public static String inverterString(String str) {
      
        char[] charArray = str.toCharArray();

        int i = 0;
        int j = charArray.length - 1;
		
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;          
            i++;
            j--;
        }
        return new String(charArray);
	}
}	
