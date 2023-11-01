import java.util.Random;

public class Dado {

	private int caraSuperior;

	public int getCaraSuperior() {
		return this.caraSuperior;
	}

	public void lanzarDado() {

		Random random = new Random();
		this.caraSuperior = random.nextInt(5)+1;
	}

}