
public class Question {

	private String question;
	private String[] answers = new String[4];
	private int correctAnswer;
	
	public Question(String question, String ans1, String ans2, String ans3, String ans4, int CorrectAnswer) {
		this.question = question;
		answers[0] = ans1;
		answers[1] = ans2;
		answers[2] = ans3;
		answers[3] = ans4;
		this.correctAnswer = correctAnswer;
	}

	public String toString() {
		return this.question + "\n1. " + answers[0] + "\n2. " + answers[1] + "\n3. " + answers[2]
				 + "\n4. " + answers[3];
	}
	
	public boolean isCorrect(int userAnswer) {
		if(userAnswer-1 == this.correctAnswer) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getCorrectAnswer() {
		String answer = "";
		
		if(this.correctAnswer == 0) {
			answer = "The correct answer is " + answers[0];
		}
		if(this.correctAnswer == 1) {
			answer = "The correct answer is " + answers[1];
		}
		if(this.correctAnswer == 2) {
			answer = "The correct answer is " + answers[2];
		}
		if(this.correctAnswer == 3) {
			answer = "The correct answer is " + answers[3];
		}

		return answer;
	}
}
