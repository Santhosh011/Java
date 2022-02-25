public class Game {
	Player p1;
	Player p2;
	Player p3;
	void Start_Game(){
		int number = 0;
		int turn = 1;
		int p1Guess = 0;
		int p2Guess = 0;
		int p3Guess = 0;

		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;

		p1 = new Player();
		p2 = new Player();
		p3 = new Player();


		number = (int)(Math.random() * 10);
		System.out.println("I am thinking of " + number);
		while (true){

		System.out.println("Turn" + turn);

		p1.guess();
		p2.guess();
		p3.guess();


		p1Guess = p1.number;
		System.out.println("P1 has guessed "+ p1.number);
		p2Guess = p2.number;
		System.out.println("P2 has guessed "+ p2.number);
		p3Guess = p3.number;
		System.out.println("P3 has guessed "+ p3.number);


			if (p1Guess == number) {
				p1IsRight = true;
			}
			if (p2Guess == number) {
				p2IsRight = true;
			}
			if (p3Guess == number) {
				p3IsRight = true;
			}

			if (p1IsRight == true || p2IsRight == true || p3IsRight == true) {
				System.out.println("Has P1 guessed correctly " + p1IsRight);
				System.out.println("Has P2 guessed correctly " + p2IsRight);
				System.out.println("Has P3 guessed correctly " + p3IsRight);
				break;
			}
			else {
				System.out.println("No winner yet, so one more round");
				turn += 1;
				System.out.println();
				System.out.println();
			}

		}
	}



}
