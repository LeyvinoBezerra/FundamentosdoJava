

public class Jogo {

	public static void main(String[] args) {
		
		int number = RandomUtils.nextInt(0, 50);
	
		int guess;
		
		do {
			System.out.print("Adivinhe o n�mero: ");
			guess = ConsoleUtils.readInt();
			
			if (guess > number) {
				System.out.println("O valor � menor");
			} else if (guess < number) {
				System.out.println("O valor � maior");
			}
			
		} while (guess != number);
		
		System.out.println("Voc� acertou! O valor era " + number + ". Fim do jogo!");
	}
}
