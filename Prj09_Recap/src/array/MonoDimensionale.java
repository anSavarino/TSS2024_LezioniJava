package array;

import java.util.Arrays;

public class MonoDimensionale {

	public static void main(String[] args) {

		int[] voti = new int[5];
		
		int[] voti2= {24,27,22,25,23};
		
		Arrays.sort(voti2);
		
		voti[0] = 22;
		voti[1] = 23;
		voti[2] = 24;
		voti[3] = 25;
		voti[4] = 26;
		
		for (int i = 0; i < voti2.length; i++) {
			System.out.println(voti2[i]);
		}
		System.out.println();
		for (int i : voti2) {
			System.out.println(i);
		}
		
		
	}

}
