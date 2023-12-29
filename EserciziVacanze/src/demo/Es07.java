package demo;
import java.math.BigInteger;


public class Es07 {

	public static void main(String[] args) {
		/*
		 * 1.7. Esercizio Fibonacci
		Scrivere un programma che stampi i primi 100 elementi della successione di Fibonacci.*/
		
		
		//Utilizzo BigInteger perchè gli ultimi numeri della sequenza passano il valore del long
		BigInteger[] fibionacci = new BigInteger[100];
		
		fibionacci[0]=BigInteger.ZERO;
		fibionacci[1]=BigInteger.ONE;
		for (int i = 2; i < 100; i++) {
			//BigInteger è una classe perciò uso ilmeodo add per la somma
			fibionacci[i]= fibionacci[i-1].add(fibionacci[i-2]);
		}
		for (int i = 0; i < fibionacci.length; i++) {
			System.out.println(fibionacci[i]);
		}
	}

}
