package Atividades;

public class Exer04 {

	public static void main(String[] args) {
		
		float numero1 = 5.0f;
		float numero2 = 6.0f;
		float numero3 = 7.0f;
		float numero4 = 8.0f;
		
		float calculo;
		
		calculo = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println("Primeiro exemplo:");
		System.out.println(calculo);
		
		numero3 = -7.0f;
		
		calculo = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println();
		
		System.out.println("Segundo exemplo:");
		System.out.println(calculo);
		
	}

}
