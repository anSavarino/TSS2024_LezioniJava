
public class Array2 {

	public static void main(String[] args) {
		int array[] = {14, 5, 23, 89, 4, 50};
		int i = 0;
		int j = array.length-1;
		
		while(i<j) {
			System.out.print(array[i]+","+array[j]);
			if (i!= j-1) {
				System.out.print(",");
			}
			i++;
			j--;
		}
		if (array.length %2 != 0) {
			System.out.println(array[i]);
		}
	}

}
