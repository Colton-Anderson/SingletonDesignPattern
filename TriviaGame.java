import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class TriviaGame {

	private static TriviaGame triviaGame;
	private int score;
	private Random rand;
	private Scanner key;
	private ArrayList<Question> questions;
	
	private TriviaGame() {
		this.rand = new Random();
		this.key = new Scanner(System.in);
		this.questions = new ArrayList<Question>();
		this.questions = DataLoader.getTriviaQuestions();
		this.score = 0;
	}

	public static TriviaGame getInstance() {
		if(triviaGame == null) {
			triviaGame = new TriviaGame();
		}
		return triviaGame;
	}
	
	public void play() {
		String answer = "p";
		while(answer.equalsIgnoreCase("p")) {
			this.playRound();
			System.out.println("(P)lay or (Q)uit:");
			score++;
			answer = key.next();
		}
		System.out.println("You won " + score + " games!");
		
	}
	
	public boolean playRound() {
		int rand_int = rand.nextInt(questions.size());
		System.out.println(questions.get(rand_int).toString());
		int userInput = key.nextInt();
		key.nextLine();
		if(questions.get(rand_int).isCorrect(userInput)) {
			System.out.println("YAY! You got it right!");
			return true;
		}
		else {
			System.out.println("You got it wrong!\n" + questions.get(rand_int).getCorrectAnswer());
			return false;
		}
	}
}
