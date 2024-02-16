public class Array {

	public static void main(String[] args) {
		
		int array[] = {14, 5, 23, 89, 4, 50, 6};
		String stringa = "";
		for (int i = 0; i < array.length/2; i++) {
			stringa += array[i]+","+ array[array.length-i-1]+",";
		}
		if (array.length%2 != 0) {
			stringa += array[array.length/2]+",";			
		}
		String nstring = stringa.substring(0, stringa.length()-1);
		System.out.println(nstring);

	}

}
