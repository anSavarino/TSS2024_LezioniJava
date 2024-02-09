public class Array {

	public static void main(String[] args) {
		
		int array[] = {14, 5, 23, 89, 4, 50, 6};
		
		for (int i = 0; i < array.length/2; i++) {
			System.out.print(array[i]+","+ array[array.length-i-1]);
			if(!(i == array.length/2-1)) {
				System.out.print(",");
			}
		}
		if (array.length%2 != 0) {
			System.out.print(","+array[array.length/2]);			
		}

	}

}
