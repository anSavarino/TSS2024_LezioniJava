package view;

public class ProvaEccezioni1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] voti = {22, 23, 25, 30, 29};
		try {
			for (int i = 0; i <= voti.length; i++) {
//				double divisione = voti[i]/i;
				System.out.println(voti[i]);
			}
			
		} 
		catch (ArithmeticException e) {
			System.err.println("Eccezione Balorda Aritmetica");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Eccezione Balorda fuori array");
		}
		catch (Exception e) {
			System.err.println("Eccezione Balorda");
		}
		finally {
			System.out.println("Comunque vada faccio questo");
		}
		
		System.out.println("Finito");
	}

}
