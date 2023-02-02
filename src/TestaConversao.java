
public class TestaConversao {

	public static void main(String[] args) {
	
		double salario = 1270.50;
		int valor = (int) salario;		
		System.out.println(valor);
		
		long numeroGrande = 32432423523L;
		short valorPequeno = 2131;
		byte b = 127;
		int x = 2000000000;
		
		System.out.println(b + valorPequeno + x + numeroGrande);
		
		double num = 0.2;
		double num2 = 0.1;
		double soma = num + num2;		
		System.out.println(soma);


	}

}
