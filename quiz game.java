// 1. Quiz Questions Array
// Stores objects with the question text and the correct answer.
const quizQuestions = [
    { question: "What is the capital of France?", answer: "Paris" },
    { question: "Which planet is known as the Red Planet?", answer: "Mars" },
    { question: "What is 5 + 7?", answer: "12" },
    { question: "Who is the President of Russia?", answer: "Vladimir Putin" },
    { question: "Which language is used for web development?", answer: "JavaScript" }
];

// 2. Function to Run the Quiz
function runQuiz() {
    // 3. Score Initialization
    let score = 0; 

    // 4. Loop Through Questions
    for (let i = 0; i < quizQuestions.length; i++) {
        // 5. Prompt for User Input
        let userAnswer = prompt(quizQuestions[i].question);

        // Handle case where user clicks "Cancel"
        if (userAnswer === null) {
            alert("Question skipped!");
            continue;
        }

        // 6. Normalize the Input (lowercase and trim whitespace)
        let cleanedUserAnswer = userAnswer.trim().toLowerCase();
        let cleanedCorrectAnswer = quizQuestions[i].answer.trim().toLowerCase();

        // 7. Check the Answer & 8. Provide Immediate Feedback
        if (cleanedUserAnswer === cleanedCorrectAnswer) {
            alert("Correct!");
            score++; // Increase score
        } else {
            alert(`Wrong! The correct answer is: ${quizQuestions[i].answer}`);
        }
    }

    // 9. Display the Final Score
    alert(`Quiz Over! Your final score is ${score} out of ${quizQuestions.length}`);
}

// 10. Run the Quiz immediately when pasted into the console
runQuiz();