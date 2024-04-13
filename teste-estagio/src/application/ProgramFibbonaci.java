package application;

import java.util.Scanner;

public class ProgramFibbonaci {

	public static void main(String[] args) {

	 Scanner sc = new Scanner (System.in);
		
      System.out.print("informe um para verificar se pertence à sequência de Fibonacci: ");
	  int num = sc.nextInt();
	       
	  if (pertenceSequencia(num)) {
          System.out.println(num + " pertence à sequência de Fibonacci.");
          System.out.println("Sequência de Fibonacci até o número " + num + ":");
          for (int i = 0; i <= num; i++) {
              System.out.print(calcularFibonacci(i) + " ");
          }   
      } else {
          System.out.println(num + " não pertence à sequência de Fibonacci.");
      }
	       
	 sc.close();

	}

	public static boolean pertenceSequencia(int num) {
		
        int a = 0;
        int b = 1;

        while (a <= num) {
            if (a == num) {
                return true; 
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return false;
    }
	
	public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

}
