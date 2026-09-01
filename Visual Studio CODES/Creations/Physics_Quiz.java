import java.util.*;

public class Physics_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Loading CHEMISTRY questions   :::");
        System.out.println("Initializing databases & ");
        System.out.println("        the variables with magic   :::");
        System.out.println("<:::    Almost done    :::>    :::\n\n");

        int userInput = 0;
        do {
            try {
                System.out.println("How many questions should I ask you? \nEnter 0 to exit.");
                userInput = sc.nextInt();
                if (userInput < 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            }

            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
                sc.next(); // Clear the invalid input from the scanner
            }

        } while (userInput < 0);

        if (userInput > 0) {
            System.out.println("Starting up with the questions:\n");
            System.out.println("*****************************************************************");

            int score = 0; // Initialize the score variable

            for (int h = 1; h <= userInput; h++) {

                System.out.println("Enter 'Q' to quit the quiz.\n");

                // Array of physics questions and corresponding answers
                String[] physicsQuestions = {
                        "What is the SI unit of force?",
                        "Which law of motion states 'Every action has an equal and opposite reaction'?",
                        "What is the acceleration due to gravity on Earth?",
                        "What is the unit of electrical resistance?"
                };

                String[] physicsAnswers = {
                        "a", // Newton
                        "c", // Newton's Third Law
                        "a", // 9.8 m/s^2
                        "a" // Ohm
                };

                // Array of options for each physics question
                String[][] physicsOptions = {
                        { "a] Newton", "b] Kilogram", "c] Joule" },
                        { "a] Newton's First Law", "b] Newton's Second Law", "c] Newton's Third Law" },
                        { "a] 9.8 m/s^2", "b] 6.7 m/s^2", "c] 5.3 m/s^2" },
                        { "a] Ohm", "b] Watt", "c] Volt" }
                };

                // Array of arithmetic operations
                String[] arithmeticOperations = { "+", "-", "*", "/" };

                while (true) {
                    // Generate a random number between 0 and 1 to decide whether to ask a physics,
                    // arithmetic, or numerical question
                    double randomNumber = Math.random();

                    if (randomNumber < 0.33) {
                        // Generate a random physics question index
                        int randomPhysicsIndex = random.nextInt(physicsQuestions.length);

                        // Display the random physics question and its options
                        System.out.println(physicsQuestions[randomPhysicsIndex]);
                        for (String option : physicsOptions[randomPhysicsIndex]) {
                            System.out.println(option);
                        }
                        System.out.println("Your answer : press ( a / b / c /Q to quit) ::::::");
                        String userAnswer = sc.nextLine().toLowerCase();

                        // Check if the user wants to quit
                        if (userAnswer.equalsIgnoreCase("q")) {
                            break;
                        }

                        // Validate the user's answer
                        if (userAnswer.equals(physicsAnswers[randomPhysicsIndex])) {
                            System.out.println("\n__________________________");
                            System.out.println("| Great !! Correct Answer! |");
                            System.out.println("--------------------------");
                            score++;
                        } else {
                            System.out.println("\n______________________________________________");
                            System.out.println("| Uh ! That was close ... \nIncorrect Answer   |");
                            System.out.println("------------------------------------------------");
                            System.out.println("The correct answer is: " + physicsAnswers[randomPhysicsIndex] + "\n");
                        }
                    } else if (randomNumber < 0.66) {
                        // Generate two random numbers between 1 and 20 for the arithmetic question
                        int number1 = random.nextInt(20) + 1;
                        int number2 = random.nextInt(20) + 1;

                        // Generate a random arithmetic operation index
                        int randomOperationIndex = random.nextInt(arithmeticOperations.length);
                        String operation = arithmeticOperations[randomOperationIndex];

                        // Display the arithmetic question
                        System.out.println(
                                "Arithmetic Question : What is " + number1 + " " + operation + " " + number2 + "?");
                        System.out.println("Your answer here (Enter Q to quit): ");
                        String userAnswer = sc.nextLine().toLowerCase();

                        // Check if the user wants to quit
                        if (userAnswer.equalsIgnoreCase("q")) {
                            break;
                        }

                        // Calculate the correct answer for the arithmetic question
                        double correctAnswer = 0;
                        switch (operation) {
                            case "+":
                                correctAnswer = number1 + number2;
                                break;
                            case "-":
                                correctAnswer = number1 - number2;
                                break;
                            case "*":
                                correctAnswer = number1 * number2;
                                break;
                            case "/":
                                correctAnswer = (double) number1 / number2;
                                break;
                        }

                        // Validate the user's answer
                        try {
                            double userAnswerDouble = Double.parseDouble(userAnswer);
                            if (userAnswerDouble == correctAnswer) {
                                System.out.println("\n__________________________");
                                System.out.println("| Great !! Correct Answer! |");
                                System.out.println("--------------------------");
                                score++;
                            } else {
                                System.out.println("\n______________________________________________");
                                System.out.println("| Uh ! That was close ... \nIncorrect Answer   |");
                                System.out.println("------------------------------------------------");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input !  \nIf you want then press 'Q' to quit.\n");
                        }
                    } else {
                        // Generate a random numerical question
                        double numericalAnswer = 0;
                        String numericalQuestion = "";

                        int numericalType = random.nextInt(3);

                        switch (numericalType) {
                            case 0:
                                // Area of a rectangle
                                int length = random.nextInt(10) + 1;
                                int width = random.nextInt(10) + 1;
                                numericalAnswer = length * width;
                                numericalQuestion = "What is the area of a rectangle with length " + length
                                        + " and width " + width + "?";
                                break;

                            case 1:
                                // Solve an equation: 2x + 5 = 15
                                int coefficient = random.nextInt(5) + 1;
                                int constant = random.nextInt(10) + 1;
                                int equationAnswer = (15 - constant) / coefficient;
                                numericalAnswer = equationAnswer;
                                numericalQuestion = "Solve for x in the equation: " + coefficient + "x + " + constant
                                        + " = 15";
                                break;

                            case 2:
                                // Calculate a simple numerical expression
                                int num1 = random.nextInt(10) + 1;
                                int num2 = random.nextInt(10) + 1;
                                int num3 = random.nextInt(10) + 1;
                                numericalAnswer = num1 + num2 - num3;
                                numericalQuestion = "Calculate the value of " + num1 + " + " + num2 + " - " + num3
                                        + "?";
                                break;
                        }

                        // Display the numerical question
                        System.out.println("Numerical Question : " + numericalQuestion);
                        System.out.println("Your answer (Q to quit) : ");
                        String userAnswer = sc.nextLine().toLowerCase();

                        // Check if the user wants to quit
                        if (userAnswer.equalsIgnoreCase("q")) {
                            break;
                        }

                        // Validate the user's answer

                        try {
                            double userAnswerDouble = Double.parseDouble(userAnswer);
                            if (userAnswerDouble == numericalAnswer) {
                                System.out.println("\n__________________________");
                                System.out.println("| Great !! Correct Answer! |");
                                System.out.println("--------------------------");
                                score++;
                            }

                            else {
                                System.out.println("\n______________________________________________");
                                System.out.println("| Uh ! That was close ... \nIncorrect Answer   |");
                                System.out.println("------------------------------------------------");
                            }
                        }

                        catch (NumberFormatException e) {
                            System.out.println("Invalid input ! Please enter a valid number or 'q' to quit.\n");
                        }
                    }
                }
            }
            // Displaying the final score
            System.out.println("Your score is : " + score + " ::::::::::  Keep it up !! ::::::::::");

            sc.close();
        }
    }
}