package bitwise;
//Opera��o split (Atrav�s de vetores exibe dados um abaixo do outro
public class op_split {

	public static void main(String args[]) {
		String s ="potato apple lemon";
		
		String[] vect = s.split(" ");//Dar o espa�o dentro das aspas
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}
