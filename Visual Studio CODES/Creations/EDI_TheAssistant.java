//  <<<<      WELCOME TO THE WORLD OF EDI       >>>>

//          Avoid short phrases as your answers
//          Please don't use punctuation marks
//             Follow the Intructions given 
//                  Enjoy his world...

import java.util.*;

public class EDI_TheAssistant {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Loader .load();
        Thread.sleep(2000);
        DelayTime("\nWelcome to the\n\t        < <  WORLD  OF  EDI  > >    ", 70);
        Thread.sleep(850);
        
        DelayTime("AN INTERACTIVE UI ASSISTANT \n ", 50);
        Thread.sleep(950);
        DelayTime("EDI is currently out of the world\n",70);
        Thread.sleep(950);
        DelayTime("Calling EDI ! May take some time", 50);
        
        Thread.sleep(900);
        DelayTime("> )  > )  > )  > )  > )  > )  > ) ", 60);
        System.out.println("\n");
        Thread.sleep(900);
        
        String c = String.valueOf(Math.random());
        String codeActual = c.substring(2);
        String actualCode = codeActual.substring(0, 6);
        int intCode = Integer.parseInt(actualCode);
        
        DelayTime("Enter the COSMIC Code to bring back EDI ::: ", 70);
        DelayTime("////            \\\\\\\\", 50);
        System.out.print("       ");
        DelayTime(actualCode, 300);
        
        System.out.print("       ");
        int input = sc.nextInt();
        DelayTime("\\\\\\\\            ////", 70);
        
        if (intCode == input) {
            System.out.println("\u000C");
            Blinker("\n\n\n\n\n\n\n             COSMIC   CODE   ENTERED !" , 4);
            DelayTime("-------------------------------------------------------------------", 20);
            System.out.println("\nZooop Switchhh..! \n\nHello User! AM back");
            
            DelayTime("May I know ur name buddy .. ?", 70);
            sc.next();
            System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
            System.out.print("\nHi\n");
            DelayTime("Nice to meet you ! Am EDI , \nYour Cyber friend...", 70);
            
            DelayTime("[ TIPS -  TRY - Entering Hi ] ", 30);
            DelayTime("-------------------------------------------------------------------", 20);
            
            while (true) {
                String n1 = sc.nextLine();
                
                if (n1.equalsIgnoreCase("Hi") || n1.equalsIgnoreCase("Hello")) {
                    DelayTime("Hi buddy whats up !! \n", 40);
                    System.out.println("If you are bored I have something special for you\nARE YOU READY ???");
                    DelayTime("[ TIPS - Say  YES  or  ya  or  OK fine  or OK  ? ] ", 70);
                    
                    DelayTime("-------------------------------------------------------------------", 20);
                    String n2 = sc.nextLine();
                    if (n2.equalsIgnoreCase("yes") || n2.equalsIgnoreCase("ya") || n2.equalsIgnoreCase("ok")
                    || n2.equalsIgnoreCase("ok fine") || n2.equalsIgnoreCase("sure")
                    || n2.equalsIgnoreCase("ya sure")) {
                        DelayTime("Let me unlock my Brief case ....\n", 40);
                        DelayTime("     |||  U N L E A S I N G    T H E   G R A N D    Q U I Z  ||| ", 50);
                        System.out.println("\n\n       Choose the  Difficulty Level  and enter the number as follows :: \n");
                        DelayTime("       1)   EASY         2)   MEDIUM           3)   HARD ", 20);
                        DelayTime("          CHEMISTRY         MATHEMATICS            PHYSICS", 15);
                        DelayTime("-------------------------------------------------------------------", 20);
                        
                        int freshen = sc.nextInt();
                        
                        switch (freshen) {
                            case 1:
                            DelayTime(":::   Loading CHEMISTRY questions   :::", 55);
                            DelayTime("Initializing databases & ", 55);
                            DelayTime("        the variables with magic   :::\n", 55);
                            DelayTime("<:::    Almost done    :::>    \n", 55);
                           
                            int userInput = 0;
                            do {
                                try {
                                    DelayTime("How many questions should I ask you? \nEnter 0 to exit.", 40);
                                    userInput = sc.nextInt();
                                    if (userInput < 0) {
                                        DelayTime("Invalid input. Please enter a positive integer.", 40);
                                    }
                                } catch (InputMismatchException e) {
                                    DelayTime("Invalid input. Please enter a positive integer.", 40);
                                    sc.next(); // Clear the invalid input from the scanner
                                }
                            } while (userInput < 0);
                           
                            if (userInput > 0) {
                                System.out.println("Select difficulty level: ");
                                System.out.println("1. Easy (1-10)");
                                System.out.println("2. Medium (1-20)");
                                System.out.println("3. Hard (1-30)");
                                int difficulty = sc.nextInt();
                                int maxAtomicNumber = getMaxAtomicNumber(difficulty);
                    
                                DelayTime("Starting up with the questions:\n", 40);
                                DelayTime("-------------------------------------------------------------------", 40);
                               
                                int score = 0; // Initialize the score variable
                                int qNo = 1;
                    
                                for (int h = 1; h <= userInput; h++) {
                                    int atomicNumber1 = (int) (Math.random() * maxAtomicNumber) + 1; // Random atomic number
                                    int atomicNumber2 = (int) (Math.random() * maxAtomicNumber) + 1;
                                   
                                    // Ask bond type question
                                    System.out.println(qNo + " > Element 1 <<  Atomic Number: " + atomicNumber1 + " >>  ");
                                    System.out.println("Element 2 <<  Atomic Number: " + atomicNumber2 + " >>");
                                    System.out.print("Enter the type of bond (Ionic / Covalent): ");
                                    String userBondType = sc.next();
                                   
                                    boolean isCorrectBond = determineBondType(atomicNumber1, atomicNumber2, userBondType);
                                   
                                    if (isCorrectBond) {
                                        DelayTime("| Great !! Correct Answer! |", 40);
                                        score++;
                                    } else {
                                        DelayTime("| Incorrect Answer |", 40);
                                        // Provide feedback on the correct bond type
                                        String correctBond = getCorrectBondType(atomicNumber1, atomicNumber2);
                                        System.out.println("The correct bond type is: " + correctBond);
                                    }
                    
                                    qNo++;
                                }
                               
                                System.out.println("Your score is : " + score + " ::::::::::  Keep it up !! ::::::::::");
                            } else {
                                System.out.println("You have chosen to exit the CHEMISTRY QUIZ.\n");
                            }
                            break;
                            case 2:
                            System.out.println(":::   Loading MATHS questions   :::");
                            System.out.println("Initializing databases & ");
                            System.out.println("        the variables with magic   :::\n");
                            System.out.println("<: :    Almost done    : :>    :::\n");
                            DelayTime("-------------------------------------------------------------------", 40);
                            
                            int seconduserInput = 0, score = 0;
                            do {
                                try {
                                    System.out.println(
                                    "How many questions should I ask you ? \nIf needed , Enter 0 to exit..");
                                    DelayTime("-------------------------------------------------------------------", 40);
                                    seconduserInput = sc.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a positive integer.");
                                    DelayTime("-------------------------------------------------------------------", 40);
                                    seconduserInput = -1; // set to -1 to trigger the loop again
                                }
                            } while (seconduserInput < 0);
                            
                            if (seconduserInput > 0) {
                                System.out.println(" Starting up with the Maths questions ::: \n\n");
                                System.out.println(
                                "*****************************************************************");
                                
                                for (int h = 1; h <= seconduserInput; h++) {
                                    double rand = Math.random();
                                    
                                    String code = String.valueOf(rand);
                                    int len = (code.length()) - 2;
                                    
                                    String strNumcode = code.substring(2);
                                    char fChar = strNumcode.charAt(0);
                                    String StrFchar = fChar + "";
                                    
                                    // First number of the code
                                    
                                    int FNum = Integer.parseInt(StrFchar);
                                    
                                    char LChar = code.charAt(len);
                                    String samplestrLchar = LChar + "";
                                    
                                    // Last number of the code
                                    
                                    int LNum = Integer.parseInt(samplestrLchar);
                                    
                                    if (FNum <= 5 && LNum > 5) // CONDITION 1
                                    {
                                        
                                        int Num1 = (int) (Math.random() * 5) + 1; // generate a random number
                                        // between 1 and 5
                                        int extraNum = (int) (Math.random() * 10) + 1; // generate a random number
                                        // between 1 and 10
                                        
                                        System.out.println(
                                        "Say whether " + extraNum + " is divisible by " + Num1 + ".");
                                        System.out.println("Enter Yes or No: ");
                                        
                                        String ans = sc.next();
                                        
                                        if ((extraNum % Num1 == 0 && ans.equalsIgnoreCase("Yes"))
                                        || (extraNum % Num1 != 0 && ans.equalsIgnoreCase("No"))) {
                                            System.out.println("\n__________________________");
                                            DelayTime("| Great !! Correct Answer! |", 40);
                                            System.out.println("--------------------------");
                                            score++;
                                        } else {
                                            System.out.println("\n______________________________________________");
                                            DelayTime("| Uh ! That was close ... \nIncorrect Answer   |", 40);
                                            System.out.println("------------------------------------------------");
                                        }
                                        
                                    } // End of CONDITION 1
                                    
                                    if (FNum > 5 && LNum <= 5) // CONDITION 2
                                    {
                                        int extraNum = (int) (Math.random() * 50); //
                                        
                                        System.out.println(
                                        "Say whether " + extraNum + " is a perfect square number .");
                                        System.out.println("Enter Yes or No: ");
                                        
                                        String ans = sc.next();
                                        
                                        int sqrt = (int) Math.sqrt(extraNum);
                                        
                                        if ((sqrt * sqrt == extraNum && ans.equalsIgnoreCase("Yes"))
                                        || (sqrt * sqrt != extraNum && ans.equalsIgnoreCase("No"))) {
                                            System.out.println("\n__________________________");
                                            DelayTime("| Great !! Correct Answer! |", 40);
                                            System.out.println("--------------------------");
                                            score++;
                                        }
                                        
                                        else {
                                            System.out.println("\n______________________________________________");
                                            DelayTime("| Uh ! That was close ... \nIncorrect Answer   |", 40);
                                            System.out.println("------------------------------------------------");
                                        }
                                        
                                    } // End of CONDITION 2
                                    
                                    if (FNum > 5 && LNum > 5) // CONDITION 3
                                    {
                                        int extraNum = (int) (Math.random() * 20) + 4; //
                                        
                                        System.out.println("Say any one of the factors of " + extraNum + "...");
                                        System.out.println("Enter Yes or No: ");
                                        
                                        int ans = sc.nextInt();
                                        
                                        if (extraNum % ans == 0) {
                                            System.out.println("\n__________________________");
                                            DelayTime("| Great !! Correct Answer! |", 40);
                                            System.out.println("--------------------------");
                                            score++;
                                        } else {
                                            System.out.println("\n______________________________________________");
                                            DelayTime("| Uh ! That was close ... \nIncorrect Answer   |", 40);
                                            System.out.println("------------------------------------------------");
                                        }
                                        
                                    } // End of CONDITION 3
                                    
                                    if (FNum <= 5 && LNum <= 5) // CONDITION 4
                                    {
                                        int Num = (int) (Math.random() * 50) + 1; // generate a random number
                                        // between 6 and 10
                                        int Num2 = (int) (Math.random() * 20) + 1; // generate a random number
                                        // between 1 and 10
                                        
                                        System.out
                                        .println("What is the perimeter of a rectangle with \nlength " + Num
                                        + " and breadth " + Num2 + " ? ");
                                        
                                        int ans = sc.nextInt();
                                        
                                        if (2 * (Num + Num2) == ans) {
                                            DelayTime("| Great !! Correct Answer! |", 40);
                                            score++;
                                        } else {
                                            DelayTime("Incorrect Answer...[ Reason ~ Wrong answer or Invalid Input ] \n", 40);
                                        }
                                        
                                    } // End of CONDITION 4
                                } // for OF QUESTIONS
                                
                            } // if of starting question STATEMENTS
                            
                            else
                            System.out.println("You have chosen to exit MATH QUIZ....\n");
                            DelayTime("-------------------------------------------------------------------", 40);
                            DelayTime(" Your score is ----------- { " + score + " }", 40);
                            break; // End of case 2
                            
                            case 3:
                            Random random = new Random();
                            System.out.println("Loading CHEMISTRY questions   :::");
                            System.out.println("Initializing databases & ");
                            System.out.println("        the variables with magic   :::\n");
                            System.out.println("<:::    Almost done    :::>    :::\n");
                            
                            int userInput2 = 0;
                            do {
                                try {
                                    System.out.println("How many questions should I ask you? \nEnter 0 to exit.");
                                    userInput2 = sc.nextInt();
                                    if (userInput2 < 0) {
                                        System.out.println("Invalid input. Please enter a positive integer.");
                                    }
                                }
                                
                                catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a positive integer.");
                                    sc.next(); // Clear the invalid input from the scanner
                                }
                                
                            } while (userInput2 < 0);
                            
                            if (userInput2 > 0) {
                                System.out.println("Starting up with the questions:\n");
                                System.out.println(
                                "*****************************************************************");
                                
                                int score2 = 0; // Initialize the score variable
                                
                                for (int h = 1; h <= userInput2; h++) {
                                    
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
                                        { "a] Newton's First Law", "b] Newton's Second Law",
                                        "c] Newton's Third Law" },
                                        { "a] 9.8 m/s^2", "b] 6.7 m/s^2", "c] 5.3 m/s^2" },
                                        { "a] Ohm", "b] Watt", "c] Volt" }
                                    };
                                    
                                    // Array of arithmetic operations
                                    String[] arithmeticOperations = { "+", "-", "*", "/" };
                                    sc.nextLine();
                                    while (true) {
                                        // Generate a random number between 0 and 1 to decide whether to ask a
                                        // physics, arithmetic, or numerical question
                                        double randomNumber = Math.random();
                                        
                                        if (randomNumber < 0.33) {
                                            // Generate a random physics question index
                                            int randomPhysicsIndex = random.nextInt(physicsQuestions.length);
                                            
                                            // Display the random physics question and its options
                                            System.out.println(physicsQuestions[randomPhysicsIndex]);
                                            for (String option : physicsOptions[randomPhysicsIndex]) {
                                                System.out.println(option);
                                            }
                                            System.out
                                            .println("Your answer : press ( a / b / c /Q to quit) ::::::");
                                            String userAnswer = sc.nextLine().toLowerCase();
                                            
                                            // Check if the user wants to quit
                                            if (userAnswer.equalsIgnoreCase("q")) {
                                                break;
                                            }
                                            
                                            // Validate the user's answer
                                            if (userAnswer.equals(physicsAnswers[randomPhysicsIndex])) {
                                                System.out.println("\n__________________________");
                                                DelayTime("| Great !! Correct Answer! |", 40);
                                                System.out.println("--------------------------");
                                                score2++;
                                            } else {
                                                System.out.println("\n______________________________________________");
                                                DelayTime("| Uh ! That was close ... \nIncorrect Answer   |", 40);
                                                System.out.println("------------------------------------------------");
                                                System.out.println("The correct answer is: "
                                                + physicsAnswers[randomPhysicsIndex] + "\n");
                                            }
                                        } else if (randomNumber < 0.66) {
                                            // Generate two random numbers between 1 and 20 for the arithmetic
                                            // question
                                            int number1 = random.nextInt(20) + 1;
                                            int number2 = random.nextInt(20) + 1;
                                            
                                            // Generate a random arithmetic operation index
                                            int randomOperationIndex = random.nextInt(arithmeticOperations.length);
                                            String operation = arithmeticOperations[randomOperationIndex];
                                            
                                            // Display the arithmetic question
                                            System.out.println("Arithmetic Question : What is " + number1 + " "
                                            + operation + " " + number2 + "?");
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
                                                    DelayTime("| Great !! Correct Answer! |", 40);
                                                    System.out.println("--------------------------");
                                                    score2++;
                                                } else {
                                                    System.out.println("\n______________________________________________");
                                                    DelayTime("| Uh ! That was close ... \nIncorrect Answer   |", 40);
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
                                                numericalQuestion = "What is the area of a rectangle with length "
                                                + length + " and width " + width + "?";
                                                break;
                                                
                                                case 1:
                                                // Solve an equation: 2x + 5 = 15
                                                int coefficient = random.nextInt(5) + 1;
                                                int constant = random.nextInt(10) + 1;
                                                int equationAnswer = (15 - constant) / coefficient;
                                                numericalAnswer = equationAnswer;
                                                numericalQuestion = "Solve for x in the equation: "
                                                + coefficient + "x + " + constant + " = 15";
                                                break;
                                                
                                                case 2:
                                                // Calculate a simple numerical expression
                                                int num1 = random.nextInt(10) + 1;
                                                int num2 = random.nextInt(10) + 1;
                                                int num3 = random.nextInt(10) + 1;
                                                numericalAnswer = num1 + num2 - num3;
                                                numericalQuestion = "Calculate the value of " + num1 + " + "
                                                + num2 + " - " + num3 + "?";
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
                                                    DelayTime("| Great !! Correct Answer! |", 40);
                                                    System.out.println("--------------------------");
                                                    score2++;
                                                }
                                                
                                                else {
                                                    System.out.println("\n______________________________________________");
                                                    DelayTime("| Uh ! That was close ... \nIncorrect Answer   |", 40);
                                                    DelayTime("-------------------------------------------------------------------", 40);
                                                }
                                            }
                                            
                                            catch (NumberFormatException e) {
                                                DelayTime("Invalid input ! Please enter a valid number or 'q' to quit.\n" , 40);
                                            }
                                        }
                                    }
                                }
                                // Displaying the final score
                                DelayTime("Your score is : " + score2 + " ::::::::::  Keep it up !! ::::::::::", 40);
                                break;
                            }
                        }
                        
                    }
                }
            } // while loop
        } // if - - - - << for checking whether the cosmic code is correct or not >>
        
        else {
            System.out.println("EDI crashed due to the wrong cosmic code !!");
            DelayTime("-------------------------------------------------------------------", 40);
        }
    } // main func.
    
     // Method to get max atomic number based on difficulty
     public static int getMaxAtomicNumber(int difficulty) {
        switch (difficulty) {
            case 1: return 10;
            case 2: return 20;
            case 3: return 30;
            default: return 20; // Default to medium difficulty
        }
    }

    // Method to determine bond type based on atomic numbers
    public static boolean determineBondType(int atomicNumber1, int atomicNumber2, String userBondType) {
        String correctBond = getCorrectBondType(atomicNumber1, atomicNumber2);
        return correctBond.equalsIgnoreCase(userBondType);
    }

    // Method to return correct bond type based on atomic numbers
    public static String getCorrectBondType(int atomicNumber1, int atomicNumber2) {
        // Simplified logic: Assume elements with a large difference form Ionic bonds, others form Covalent bonds
        if (Math.abs(atomicNumber1 - atomicNumber2) > 5) {
            return "Ionic";
        } else {
            return "Covalent";
        }
    }
    
    public static void DelayTime(String str, int time) {
        for (int i = 0; i < str.length(); i++) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    
    public class Loader
    {       
        public static void load()
        {
            System.out.println("\u000C");
            int temp = 25;
            double arr[] = new double[temp];
            for(int i = 0; i< temp; i++)
            arr[i] = (int)(Math.random()*100);
            Arrays.sort(arr);
            
            for(int i = 0; i< temp; i++)
            {
                System.out.println("\u000C");
                try
                {
                    System.out.println("Loading ..."+arr[i]+" %");
                    if(arr[i] < 20)
                    {
                        System.out.println("         ^");
                        System.out.println("      <     >");
                        System.out.println("         v");
                        System.out.println("Initiating Configurations ..");
                        Bar((int)arr[i]);
                    }
                    if(arr[i] >= 20 && arr[i] < 30)
                    {
                        System.out.println("         ^");
                        System.out.println("       <   >");
                        System.out.println("         v");
                        System.out.println("Initiating Materials ..");
                        Bar((int)arr[i]);
                    }
                    if(arr[i] >= 30 && arr[i] < 40)
                    {
                        System.out.println("         ^");
                        System.out.println("        < >");
                        System.out.println("         v");
                        System.out.println("Initiating Data Variables ..");
                        Bar((int)arr[i]);
                    }
                    if(arr[i] >= 40 && arr[i] < 50)
                    {
                        System.out.println("         ^\n");
                        System.out.println("         v");
                        System.out.println("Initiating Data Packs ..");
                        Bar((int)arr[i]);
                    }
                    if(arr[i] >= 50 && arr[i] < 60)
                    {
                        System.out.println("\n        < >\n");
                        System.out.println("Initiating Back-ups ..");
                        Bar((int)arr[i]);
                        Thread.sleep(300);
                    }
                    if(arr[i] >= 60 && arr[i] < 70)
                    {
                        System.out.println("\n        ( )\n");
                        System.out.println("Initiating Functions ..");
                        Bar((int)arr[i]);
                    }
                    if(arr[i] >= 70 && arr[i] < 80)
                    {
                        System.out.println("\n       (   )\n");
                        System.out.println("Initiating  Effects ..");
                        Bar((int)arr[i]);
                    }
                    if(arr[i] >= 80 && arr[i] < 90)
                    {
                        System.out.println("\n         O\n");
                        System.out.println("Initiating Animation Config ..");
                        Bar((int)arr[i]);
                    }
                    if(arr[i] >= 90 && arr[i] < 100)
                    {
                        System.out.println("\n         o\n");
                        System.out.println("Getting Biometric Data .Almost Done..");
                        Bar((int)arr[i]);
                    }
                    Thread.sleep(180);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
            }
            System.out.println("\u000C");
            System.out.println("Initialisation Complete ..");
            Bar(100);
        }
        
        public static void Bar(int perc)
        {
            int rest = 100 - perc;
            System.out.print("|");
            for(int i = 1; i <=(int)(perc/5) ; i++)
            {
                System.out.print("/");
            }
            for(int i = 1; i <=(int)(rest/5) ; i++)
            System.out.print(" ");
            System.out.println("|");
            try
            {
                Thread.sleep(650);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
    
    public static void Blinker(String str , int n)
    {
            for(int i = 0; i < n ; i++)
            {
                try
                {
                    System.out.println(str);
                    Thread.sleep(500);
                    System.out.println("\u000C");
                    Thread.sleep(500);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
            }
    }
} // class