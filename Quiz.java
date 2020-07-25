
public class Quiz {

	public static void main(String[] args) {
		
		
		Question question1 = new MultipleChoiceQuestion(
				"1. What House is Harry Potter sorted in?",
				"Slytherin",
				"Hufflepuff",
				"Gryffindor",
				"Hogwarts",
				"Ravenclaw", "c");
		question1.check();
		
		Question question2 = new MultipleChoiceQuestion(
				"2. What kind of pet was Hedwig?",
				"Owl",
				"Dog",
				"Cat",
				"Dragon",
				"Rat", "a");
		question2.check();
		
		Question question3 = new MultipleChoiceQuestion(
				"3. Which one is NOT a Weasley child?",
				"Fred",
				"Ron",
				"Percy",
				"Ginny",
				"Neville", "e");
		question3.check();
		
		Question question4 = new MultipleChoiceQuestion(
				"4. How many Harry Potter books are there?",
				"3",
				"7",
				"6",
				"4",
				"8", "b");
		question4.check();
		
		Question question5 = new MultipleChoiceQuestion(
				"5. Who is Tom Riddle?",
				"Harry's father",
				"The Headmaster",
				"The Minister of Magic",
				"Voldemort",
				"Harry's uncle", "d");
		question5.check();
		
		Question question6 = new TrueFalseQuestion(
				"6. Luna Lovegood is a Ravenclaw.",
				"true");
		question6.check();
		
		Question question7 = new TrueFalseQuestion(
				"7. Cedric Diggory wins the Triwizard Cup.",
				"false");
		question7.check();
		
		Question question8 = new TrueFalseQuestion(
				"8. JK Rowling is the author of the Harry Potter series",
				"true");
		question8.check();
		
		Question question9 = new TrueFalseQuestion(
				"9. Professor Severes Snape is a Pureblood",
				"false");
		question9.check();
		
		Question question10 = new TrueFalseQuestion(
				"10. Tonks is a metamorphmagus.",
				"true");
		question10.check();
		
		MultipleChoiceQuestion.showResults();
	}

}
