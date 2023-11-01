public class JuegoDados {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		dado1.lanzarDado();
		dado2.lanzarDado();
		System.out.println(dado1.getCaraSuperior());
		System.out.println(dado2.getCaraSuperior());

		int suma = calc.suma(dado1.getCaraSuperior(), dado2.getCaraSuperior() );
		System.out.println("Suma: "+suma);

		if (suma ==7){
			System.out.println("Ganaste");
		}else{
			System.out.println("Perdiste");
		}
	}

}