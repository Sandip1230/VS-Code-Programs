public class CountLetter {
    public static void main(String[] args) {
        String str = "//  <<<<      WELCOME TO THE WORLD OF EDI       >>>>\r\n" + //
                "\r\n" + //
                "//          Avoid short phrases as your answers\r\n" + //
                "//          Please don't use punctuation marks\r\n" + //
                "//             Follow the Intructions given \r\n" + //
                "//ccc               Enjoy his world...\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "import java.util.*;\r\n" + //
                "\r\n" + //
                "public class World_Of_EDI {\r\n" + //
                "    public static void main(String[] args) throws InterruptedException {\r\n" + //
                "        Scanner sc = new Scanner(System.in);\r\n" + //
                "        System.out.println(\r\n" + //
                "                \"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\");\r\n" + //
                "        System.out.println(\"Welcome to the world of EDI  . . . \");\r\n" + //
                "        System.out.println(\"A PROTOTYPE and \\n" + //
                "    friendly COSMIC SYMBYOT\\n" + //
                "\\n" + //
                "\\n" + //
                "\");\r\n" + //
                "        System.out.println(\"EDI is currently out of the world...\\n" + //
                "\");\r\n" + //
                "        Thread.sleep(1000);\r\n" + //
                "        System.out.print(\"Calling EDI ! May take some time\\n" + //
                "\");\r\n" + //
                "        System.out.print(\"...........\");\r\n" + //
                "\r\n" + //
                "        Thread.sleep(1000);\r\n" + //
                "        System.out.print(\"......\");\r\n" + //
                "\r\n" + //
                "        Thread.sleep(2000);\r\n" + //
                "        System.out.print(\".........\");\r\n" + //
                "\r\n" + //
                "        Thread.sleep(2000);\r\n" + //
                "\r\n" + //
                "        System.out.println(\"\\n" + //
                "***************************************\");\r\n" + //
                "\r\n" + //
                "        double a = Math.random();\r\n" + //
                "        String c = String.valueOf(a);\r\n" + //
                "        String codeActual = c.substring(2);\r\n" + //
                "        String actualCode = codeActual.substring(0, 6);\r\n" + //
                "        int intCode = Integer.parseInt(actualCode);\r\n" + //
                "\r\n" + //
                "        System.out.println(\"Enter the cosmic code and let EDI enter your world ::: \");\r\n" + //
                "        System.out.println(\"////   \" + intCode + \"   \\\\\\\\\\\\\\\\\");\r\n" + //
                "        System.out.print(\"       \");\r\n" + //
                "        int input = sc.nextInt();\r\n" + //
                "        System.out.println(\"\\\\\\\\\\\\\\\\            ////\");\r\n" + //
                "\r\n" + //
                "        if (intCode == input) {\r\n" + //
                "            System.out.println(\"***************************************\");\r\n" + //
                "            System.out.println(\"\\n" + //
                "Zooop Switchhh..! \\n" + //
                "\\n" + //
                "Hello User! AM back\");\r\n" + //
                "\r\n" + //
                "            System.out.println(\"May I know ur name buddy .. ?\");\r\n" + //
                "            String n = sc.next();\r\n" + //
                "            System.out.println(\"<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>\");\r\n" + //
                "            System.out.print(\"\\n" + //
                "Hi\");\r\n" + //
                "            System.out.println(\" \" + n + \" !\\n" + //
                "Nice to meet you ! Am EDI , \\n" + //
                "Your Cyber friend...\");\r\n" + //
                "\r\n" + //
                "            System.out.println(\"(TIPS -  TRY - Entering Hi )\");\r\n" + //
                "            System.out.println(\"-------------------------------------------------------------------\");\r\n" + //
                "\r\n" + //
                "            while (true) {\r\n" + //
                "                String n1 = sc.nextLine();\r\n" + //
                "\r\n" + //
                "                if (n1.equalsIgnoreCase(\"Hi\") || n1.equalsIgnoreCase(\"Hello\")) {\r\n" + //
                "                    System.out.println(\"Hi buddy whats up !! \\n" + //
                "\");\r\n" + //
                "                    System.out.println(\"If you are bored I have brought you a surprise\\n" + //
                "ARE YOU READY ???\");\r\n" + //
                "                    System.out.println(\" TIPS - Say  YES  or  ya  or  OK fine  or OK  ? \");\r\n" + //
                "                    System.out.println(\"-------------------------------------------------------------------\");\r\n" + //
                "                    String n2 = sc.nextLine();\r\n" + //
                "                    if (n2.equalsIgnoreCase(\"yes\") || n2.equalsIgnoreCase(\"ya\") || n2.equalsIgnoreCase(\"ok\")\r\n" + //
                "                            || n2.equalsIgnoreCase(\"ok fine\") || n2.equalsIgnoreCase(\"sure\")\r\n" + //
                "                            || n2.equalsIgnoreCase(\"ya sure\")) {\r\n" + //
                "                        System.out.println(\"Let me unlock my Brief case ....\\n" + //
                "\");\r\n" + //
                "                        System.out.println(\r\n" + //
                "                                \"|||  I N T R O D U C I N G   T H E   G R A N D   W E L C O M E   Q U I Z  ||| \\n" + //
                "\\n" + //
                "\");\r\n" + //
                "                        System.out\r\n" + //
                "                                .println(\"       Choose the  Difficulty Level  and enter the number as follows :: \\n" + //
                "\");\r\n" + //
                "                        System.out.println(\"       1)   EASY            2) MEDIUM           3) HARD \");\r\n" + //
                "                        System.out.println(\"          CHEMISTRY            MATHS             PHYSICS\");\r\n" + //
                "                        System.out\r\n" + //
                "                                .println(\"       -------------------------------------------------------------------\");\r\n" + //
                "\r\n" + //
                "                        int freshen = sc.nextInt();\r\n" + //
                "\r\n" + //
                "                        switch (freshen) {\r\n" + //
                "                            case 1:\r\n" + //
                "                                System.out.println(\"Loading CHEMISTRY questions   :::\");\r\n" + //
                "                                System.out.println(\"Initializing databases & \");\r\n" + //
                "                                System.out.println(\"        the variables with magic   :::\\n" + //
                "\");\r\n" + //
                "                                System.out.println(\"<:::    Almost done    :::>    :::\\n" + //
                "\");\r\n" + //
                "\r\n" + //
                "                                int userInput = 0;\r\n" + //
                "                                do {\r\n" + //
                "                                    try {\r\n" + //
                "                                        System.out.println(\"How many questions should I ask you? \\n" + //
                "Enter 0 to exit.\");\r\n" + //
                "                                        userInput = sc.nextInt();\r\n" + //
                "                                        if (userInput < 0) {\r\n" + //
                "                                            System.out.println(\"Invalid input. Please enter a positive integer.\");\r\n" + //
                "                                        }\r\n" + //
                "                                    } catch (InputMismatchException e) {\r\n" + //
                "                                        System.out.println(\"Invalid input. Please enter a positive integer.\");\r\n" + //
                "                                        sc.next(); // Clear the invalid input from the scanner\r\n" + //
                "                                    }\r\n" + //
                "                                } while (userInput < 0);\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "                                int qNo = 1;\r\n" + //
                "                                if (userInput > 0) {\r\n" + //
                "                                    System.out.println(\"Starting up with the questions:\\n" + //
                "\");\r\n" + //
                "                                    System.out.println(\r\n" + //
                "                                            \"*****************************************************************\");\r\n" + //
                "\r\n" + //
                "                                    int score = 0; // Initialize the score variable\r\n" + //
                "\r\n" + //
                "                                    for (int h = 1; h <= userInput; h++) {\r\n" + //
                "                                        int atomicNumber1 = (int) (Math.random() * 20) + 1; // Generate random atomic\r\n" + //
                "                                                                                            // number between 1 and 20\r\n" + //
                "                                        int atomicNumber2 = (int) (Math.random() * 20) + 1; // Generate random atomic\r\n" + //
                "                                                                                            // number between 1 and 20\r\n" + //
                "\r\n" + //
                "                                        System.out.println(qNo + \" >      Element 1 <<  Atomic Number: \" + atomicNumber1\r\n" + //
                "                                                + \" >>  \");\r\n" + //
                "                                        System.out.println();\r\n" + //
                "\r\n" + //
                "                                        System.out.println(\r\n" + //
                "                                                \"         Element 2 <<  Atomic Number: \" + atomicNumber2 + \" >>\");\r\n" + //
                "                                        System.out.println();\r\n" + //
                "\r\n" + //
                "                                        System.out.print(\"Enter the type of bond \\n" + //
                "     <<  Ionic  / Covalent >>: \");\r\n" + //
                "                                        String userBondType = sc.next();\r\n" + //
                "\r\n" + //
                "                                        boolean isCorrectBond = determineBondType(atomicNumber1, atomicNumber2,\r\n" + //
                "                                                userBondType);\r\n" + //
                "\r\n" + //
                "                                        if (isCorrectBond) {\r\n" + //
                "                                            System.out.println(\"\\n" + //
                "__________________________\");\r\n" + //
                "                                            System.out.println(\"| Great !! Correct Answer! |\");\r\n" + //
                "                                            System.out.println(\"--------------------------\");\r\n" + //
                "                                            score++; // Increment the score after each correct answer\r\n" + //
                "                                        } else {\r\n" + //
                "                                            System.out.println(\"\\n" + //
                "______________________________________________\");\r\n" + //
                "                                            System.out.println(\"| Uh ! That was close ... \\n" + //
                "Incorrect Answer   |\");\r\n" + //
                "                                            System.out.println(\"------------------------------------------------\");\r\n" + //
                "                                        }\r\n" + //
                "\r\n" + //
                "                                        System.out.println(); // Add a new line for readability\r\n" + //
                "                                        qNo++;\r\n" + //
                "                                    }\r\n" + //
                "\r\n" + //
                "                                    System.out.println(\r\n" + //
                "                                            \"Your score is : \" + score + \" ::::::::::  Keep it up !! ::::::::::\");\r\n" + //
                "                                } else\r\n" + //
                "                                    System.out.println(\"You have chosen to exit the CHEMISTRY QUIZ.\\n" + //
                "\");\r\n" + //
                "\r\n" + //
                "                                break;\r\n" + //
                "                            case 2:\r\n" + //
                "                                System.out.println(\"Loading MATHS questions   :::\");\r\n" + //
                "                                System.out.println(\"Initializing databases & \");\r\n" + //
                "                                System.out.println(\"        the variables with magic   :::\\n" + //
                "\");\r\n" + //
                "                                System.out.println(\"<: :    Almost done    : :>    :::\\n" + //
                "\");\r\n" + //
                "                                System.out\r\n" + //
                "                                        .println(\"-------------------------------------------------------------------\");\r\n" + //
                "\r\n" + //
                "                                int seconduserInput = 0, score = 0;\r\n" + //
                "                                do {\r\n" + //
                "                                    try {\r\n" + //
                "                                        System.out.println(\r\n" + //
                "                                                \"How many questions should I ask you ? \\n" + //
                "If needed , Enter 0 to exit..\");\r\n" + //
                "                                        System.out.println(\r\n" + //
                "                                                \"-------------------------------------------------------------------\");\r\n" + //
                "                                        seconduserInput = sc.nextInt();\r\n" + //
                "                                    } catch (InputMismatchException e) {\r\n" + //
                "                                        System.out.println(\"Invalid input. Please enter a positive integer.\");\r\n" + //
                "                                        System.out.println(\r\n" + //
                "                                                \"-------------------------------------------------------------------\");\r\n" + //
                "                                        System.out.println(\r\n" + //
                "                                                \"-------------------------------------------------------------------\");\r\n" + //
                "                                        System.out.println(\r\n" + //
                "                                                \"-------------------------------------------------------------------\");\r\n" + //
                "                                        seconduserInput = -1; // set to -1 to trigger the loop again\r\n" + //
                "                                    }\r\n" + //
                "                                } while (seconduserInput < 0);\r\n" + //
                "\r\n" + //
                "                                if (seconduserInput > 0) {\r\n" + //
                "                                    System.out.println(\" Starting up with the Maths questions ::: \\n" + //
                "\\n" + //
                "\");\r\n" + //
                "                                    System.out.println(\r\n" + //
                "                                            \"*****************************************************************\");\r\n" + //
                "\r\n" + //
                "                                    for (int h = 1; h <= seconduserInput; h++) {\r\n" + //
                "                                        double rand = Math.random();\r\n" + //
                "\r\n" + //
                "                                        String code = String.valueOf(rand);\r\n" + //
                "                                        int len = (code.length()) - 2;\r\n" + //
                "\r\n" + //
                "                                        String strNumcode = code.substring(2);\r\n" + //
                "                                        char fChar = strNumcode.charAt(0);\r\n" + //
                "                                        String StrFchar = fChar + \"\";\r\n" + //
                "\r\n" + //
                "                                        // First number of the code\r\n" + //
                "\r\n" + //
                "                                        int FNum = Integer.parseInt(StrFchar);\r\n" + //
                "\r\n" + //
                "                                        char LChar = code.charAt(len);\r\n" + //
                "                                        String samplestrLchar = LChar + \"\";\r\n" + //
                "\r\n" + //
                "                                        // Last number of the code\r\n" + //
                "\r\n" + //
                "                                        int LNum = Integer.parseInt(samplestrLchar);\r\n" + //
                "\r\n" + //
                "                                        if (FNum <= 5 && LNum > 5) // CONDITION 1\r\n" + //
                "                                        {\r\n" + //
                "\r\n" + //
                "                                            int Num1 = (int) (Math.random() * 5) + 1; // generate a random number\r\n" + //
                "                                                                                      // between 1 and 5\r\n" + //
                "                                            int extraNum = (int) (Math.random() * 10) + 1; // generate a random number\r\n" + //
                "                                                                                           // between 1 and 10\r\n" + //
                "\r\n" + //
                "                                            System.out.println(\r\n" + //
                "                                                    \"Say whether \" + extraNum + \" is divisible by \" + Num1 + \".\");\r\n" + //
                "                                            System.out.println(\"Enter Yes or No: \");\r\n" + //
                "\r\n" + //
                "                                            String ans = sc.next();\r\n" + //
                "\r\n" + //
                "                                            if ((extraNum % Num1 == 0 && ans.equalsIgnoreCase(\"Yes\"))\r\n" + //
                "                                                    || (extraNum % Num1 != 0 && ans.equalsIgnoreCase(\"No\"))) {\r\n" + //
                "                                                System.out.println(\"\\n" + //
                "__________________________\");\r\n" + //
                "                                                System.out.println(\"| Great !! Correct Answer! |\");\r\n" + //
                "                                                System.out.println(\"--------------------------\");\r\n" + //
                "                                                score++;\r\n" + //
                "                                            } else {\r\n" + //
                "                                                System.out.println(\"\\n" + //
                "______________________________________________\");\r\n" + //
                "                                                System.out.println(\"| Uh ! That was close ... \\n" + //
                "Incorrect Answer   |\");\r\n" + //
                "                                                System.out.println(\"------------------------------------------------\");\r\n" + //
                "                                            }\r\n" + //
                "\r\n" + //
                "                                        } // End of CONDITION 1\r\n" + //
                "\r\n" + //
                "                                        if (FNum > 5 && LNum <= 5) // CONDITION 2\r\n" + //
                "                                        {\r\n" + //
                "                                            int extraNum = (int) (Math.random() * 50); //\r\n" + //
                "\r\n" + //
                "                                            System.out.println(\r\n" + //
                "                                                    \"Say whether \" + extraNum + \" is a perfect square number .\");\r\n" + //
                "                                            System.out.println(\"Enter Yes or No: \");\r\n" + //
                "\r\n" + //
                "                                            String ans = sc.next();\r\n" + //
                "\r\n" + //
                "                                            int sqrt = (int) Math.sqrt(extraNum);\r\n" + //
                "\r\n" + //
                "                                            if ((sqrt * sqrt == extraNum && ans.equalsIgnoreCase(\"Yes\"))\r\n" + //
                "                                                    || (sqrt * sqrt != extraNum && ans.equalsIgnoreCase(\"No\"))) {\r\n" + //
                "                                                System.out.println(\"\\n" + //
                "__________________________\");\r\n" + //
                "                                                System.out.println(\"| Great !! Correct Answer! |\");\r\n" + //
                "                                                System.out.println(\"--------------------------\");\r\n" + //
                "                                                score++;\r\n" + //
                "                                            }\r\n" + //
                "\r\n" + //
                "                                            else {\r\n" + //
                "                                                System.out.println(\"\\n" + //
                "______________________________________________\");\r\n" + //
                "                                                System.out.println(\"| Uh ! That was close ... \\n" + //
                "Incorrect Answer   |\");\r\n" + //
                "                                                System.out.println(\"------------------------------------------------\");\r\n" + //
                "                                            }\r\n" + //
                "\r\n" + //
                "                                        } // End of CONDITION 2\r\n" + //
                "\r\n" + //
                "                                        if (FNum > 5 && LNum > 5) // CONDITION 3\r\n" + //
                "                                        {\r\n" + //
                "                                            int extraNum = (int) (Math.random() * 20) + 4; //\r\n" + //
                "\r\n" + //
                "                                            System.out.println(\"Say any one of the factors of \" + extraNum + \"...\");\r\n" + //
                "                                            System.out.println(\"Enter Yes or No: \");\r\n" + //
                "\r\n" + //
                "                                            int ans = sc.nextInt();\r\n" + //
                "\r\n" + //
                "                                            if (extraNum % ans == 0) {\r\n" + //
                "                                                System.out.println(\"\\n" + //
                "__________________________\");\r\n" + //
                "                                                System.out.println(\"| Great !! Correct Answer! |\");\r\n" + //
                "                                                System.out.println(\"--------------------------\");\r\n" + //
                "                                                score++;\r\n" + //
                "                                            } else {\r\n" + //
                "                                                System.out.println(\"\\n" + //
                "______________________________________________\");\r\n" + //
                "                                                System.out.println(\"| Uh ! That was close ... \\n" + //
                "Incorrect Answer   |\");\r\n" + //
                "                                                System.out.println(\"------------------------------------------------\");\r\n" + //
                "                                            }\r\n" + //
                "\r\n" + //
                "                                        } // End of CONDITION 3\r\n" + //
                "\r\n" + //
                "                                        if (FNum <= 5 && LNum <= 5) // CONDITION 4\r\n" + //
                "                                        {\r\n" + //
                "                                            int Num = (int) (Math.random() * 50) + 1; // generate a random number\r\n" + //
                "                                                                                      // between 6 and 10\r\n" + //
                "                                            int Num2 = (int) (Math.random() * 20) + 1; // generate a random number\r\n" + //
                "                                                                                       // between 1 and 10\r\n" + //
                "\r\n" + //
                "                                            System.out.println(\"What is the area of a rectangle with \\n" + //
                "length \" + Num\r\n" + //
                "                                                    + \" and breadth \" + Num2 + \" ? \");\r\n" + //
                "\r\n" + //
                "                                            int ans = sc.nextInt();\r\n" + //
                "\r\n" + //
                "                                            if (2 * (Num + Num2) == ans) {\r\n" + //
                "                                                System.out.println(\"Great !! \\n" + //
                "\");\r\n" + //
                "                                                score++;\r\n" + //
                "                                            } else {\r\n" + //
                "                                                System.out.println(\r\n" + //
                "                                                        \"Incorrect Answer...[ Reason ~ Wrong answer or Invalid Input ] \\n" + //
                "\");\r\n" + //
                "                                            }\r\n" + //
                "\r\n" + //
                "                                        } // End of CONDITION 4\r\n" + //
                "\r\n" + //
                "                                    } // for OF QUESTIONS\r\n" + //
                "\r\n" + //
                "                                } // if of starting question STATEMENTS\r\n" + //
                "\r\n" + //
                "                                else\r\n" + //
                "                                    System.out.println(\"You have chosen to exit MATH QUIZ....\\n" + //
                "\");\r\n" + //
                "                                System.out\r\n" + //
                "                                        .println(\"-------------------------------------------------------------------\");\r\n" + //
                "                                System.out\r\n" + //
                "                                        .println(\"-------------------------------------------------------------------\");\r\n" + //
                "                                System.out.println(\" Your score is ----------- { \" + score + \" }\");\r\n" + //
                "                                break; // End of case 2\r\n" + //
                "\r\n" + //
                "                            case 3:\r\n" + //
                "                                Random random = new Random();\r\n" + //
                "                                System.out.println(\"Loading CHEMISTRY questions   :::\");\r\n" + //
                "                                System.out.println(\"Initializing databases & \");\r\n" + //
                "                                System.out.println(\"        the variables with magic   :::\\n" + //
                "\");\r\n" + //
                "                                System.out.println(\"<:::    Almost done    :::>    :::\\n" + //
                "\");\r\n" + //
                "\r\n" + //
                "                                int userInput2 = 0;\r\n" + //
                "                                do {\r\n" + //
                "                                    try {\r\n" + //
                "                                        System.out.println(\"How many questions should I ask you? \\n" + //
                "Enter 0 to exit.\");\r\n" + //
                "                                        userInput2 = sc.nextInt();\r\n" + //
                "                                        if (userInput2 < 0) {\r\n" + //
                "                                            System.out.println(\"Invalid input. Please enter a positive integer.\");\r\n" + //
                "                                        }\r\n" + //
                "                                    }\r\n" + //
                "\r\n" + //
                "                                    catch (InputMismatchException e) {\r\n" + //
                "                                        System.out.println(\"Invalid input. Please enter a positive integer.\");\r\n" + //
                "                                        sc.next(); // Clear the invalid input from the scanner\r\n" + //
                "                                    }\r\n" + //
                "\r\n" + //
                "                                } while (userInput2 < 0);\r\n" + //
                "\r\n" + //
                "                                if (userInput2 > 0) {\r\n" + //
                "                                    System.out.println(\"Starting up with the questions:\\n" + //
                "\");\r\n" + //
                "                                    System.out.println(\r\n" + //
                "                                            \"*****************************************************************\");\r\n" + //
                "\r\n" + //
                "                                    int score2 = 0; // Initialize the score variable\r\n" + //
                "\r\n" + //
                "                                    for (int h = 1; h <= userInput2; h++) {\r\n" + //
                "\r\n" + //
                "                                        System.out.println(\"Enter 'Q' to quit the quiz.\\n" + //
                "\");\r\n" + //
                "\r\n" + //
                "                                        // Array of physics questions and corresponding answers\r\n" + //
                "                                        String[] physicsQuestions = {\r\n" + //
                "                                                \"What is the SI unit of force?\",\r\n" + //
                "                                                \"Which law of motion states 'Every action has an equal and opposite reaction'?\",\r\n" + //
                "                                                \"What is the acceleration due to gravity on Earth?\",\r\n" + //
                "                                                \"What is the unit of electrical resistance?\"\r\n" + //
                "                                        };\r\n" + //
                "\r\n" + //
                "                                        String[] physicsAnswers = {\r\n" + //
                "                                                \"a\", // Newton\r\n" + //
                "                                                \"c\", // Newton's Third Law\r\n" + //
                "                                                \"a\", // 9.8 m/s^2\r\n" + //
                "                                                \"a\" // Ohm\r\n" + //
                "                                        };\r\n" + //
                "\r\n" + //
                "                                        // Array of options for each physics question\r\n" + //
                "                                        String[][] physicsOptions = {\r\n" + //
                "                                                { \"a] Newton\", \"b] Kilogram\", \"c] Joule\" },\r\n" + //
                "                                                { \"a] Newton's First Law\", \"b] Newton's Second Law\",\r\n" + //
                "                                                        \"c] Newton's Third Law\" },\r\n" + //
                "                                                { \"a] 9.8 m/s^2\", \"b] 6.7 m/s^2\", \"c] 5.3 m/s^2\" },\r\n" + //
                "                                                { \"a] Ohm\", \"b] Watt\", \"c] Volt\" }\r\n" + //
                "                                        };\r\n" + //
                "\r\n" + //
                "                                        // Array of arithmetic operations\r\n" + //
                "                                        String[] arithmeticOperations = { \"+\", \"-\", \"*\", \"/\" };\r\n" + //
                "                                        sc.nextLine();\r\n" + //
                "                                        while (true) {\r\n" + //
                "                                            // Generate a random number between 0 and 1 to decide whether to ask a\r\n" + //
                "                                            // physics, arithmetic, or numerical question\r\n" + //
                "                                            double randomNumber = Math.random();\r\n" + //
                "\r\n" + //
                "                                            if (randomNumber < 0.33) {\r\n" + //
                "                                                // Generate a random physics question index\r\n" + //
                "                                                int randomPhysicsIndex = random.nextInt(physicsQuestions.length);\r\n" + //
                "\r\n" + //
                "                                                // Display the random physics question and its options\r\n" + //
                "                                                System.out.println(physicsQuestions[randomPhysicsIndex]);\r\n" + //
                "                                                for (String option : physicsOptions[randomPhysicsIndex]) {\r\n" + //
                "                                                    System.out.println(option);\r\n" + //
                "                                                }\r\n" + //
                "                                                System.out\r\n" + //
                "                                                        .println(\"Your answer : press ( a / b / c /Q to quit) ::::::\");\r\n" + //
                "                                                String userAnswer = sc.nextLine().toLowerCase();\r\n" + //
                "\r\n" + //
                "                                                // Check if the user wants to quit\r\n" + //
                "                                                if (userAnswer.equalsIgnoreCase(\"q\")) {\r\n" + //
                "                                                    break;\r\n" + //
                "                                                }\r\n" + //
                "\r\n" + //
                "                                                // Validate the user's answer\r\n" + //
                "                                                if (userAnswer.equals(physicsAnswers[randomPhysicsIndex])) {\r\n" + //
                "                                                    System.out.println(\"\\n" + //
                "__________________________\");\r\n" + //
                "                                                    System.out.println(\"| Great !! Correct Answer! |\");\r\n" + //
                "                                                    System.out.println(\"--------------------------\");\r\n" + //
                "                                                    score2++;\r\n" + //
                "                                                } else {\r\n" + //
                "                                                    System.out.println(\r\n" + //
                "                                                            \"\\n" + //
                "______________________________________________\");\r\n" + //
                "                                                    System.out.println(\r\n" + //
                "                                                            \"| Uh ! That was close ... \\n" + //
                "Incorrect Answer   |\");\r\n" + //
                "                                                    System.out.println(\r\n" + //
                "                                                            \"------------------------------------------------\");\r\n" + //
                "                                                    System.out.println(\"The correct answer is: \"\r\n" + //
                "                                                            + physicsAnswers[randomPhysicsIndex] + \"\\n" + //
                "\");\r\n" + //
                "                                                }\r\n" + //
                "                                            } else if (randomNumber < 0.66) {\r\n" + //
                "                                                // Generate two random numbers between 1 and 20 for the arithmetic\r\n" + //
                "                                                // question\r\n" + //
                "                                                int number1 = random.nextInt(20) + 1;\r\n" + //
                "                                                int number2 = random.nextInt(20) + 1;\r\n" + //
                "\r\n" + //
                "                                                // Generate a random arithmetic operation index\r\n" + //
                "                                                int randomOperationIndex = random.nextInt(arithmeticOperations.length);\r\n" + //
                "                                                String operation = arithmeticOperations[randomOperationIndex];\r\n" + //
                "\r\n" + //
                "                                                // Display the arithmetic question\r\n" + //
                "                                                System.out.println(\"Arithmetic Question : What is \" + number1 + \" \"\r\n" + //
                "                                                        + operation + \" \" + number2 + \"?\");\r\n" + //
                "                                                System.out.println(\"Your answer here (Enter Q to quit): \");\r\n" + //
                "                                                String userAnswer = sc.nextLine().toLowerCase();\r\n" + //
                "\r\n" + //
                "                                                // Check if the user wants to quit\r\n" + //
                "                                                if (userAnswer.equalsIgnoreCase(\"q\")) {\r\n" + //
                "                                                    break;\r\n" + //
                "                                                }\r\n" + //
                "\r\n" + //
                "                                                // Calculate the correct answer for the arithmetic question\r\n" + //
                "                                                double correctAnswer = 0;\r\n" + //
                "                                                switch (operation) {\r\n" + //
                "                                                    case \"+\":\r\n" + //
                "                                                        correctAnswer = number1 + number2;\r\n" + //
                "                                                        break;\r\n" + //
                "                                                    case \"-\":\r\n" + //
                "                                                        correctAnswer = number1 - number2;\r\n" + //
                "                                                        break;\r\n" + //
                "                                                    case \"*\":\r\n" + //
                "                                                        correctAnswer = number1 * number2;\r\n" + //
                "                                                        break;\r\n" + //
                "                                                    case \"/\":\r\n" + //
                "                                                        correctAnswer = (double) number1 / number2;\r\n" + //
                "                                                        break;\r\n" + //
                "                                                }\r\n" + //
                "\r\n" + //
                "                                                // Validate the user's answer\r\n" + //
                "                                                try {\r\n" + //
                "                                                    double userAnswerDouble = Double.parseDouble(userAnswer);\r\n" + //
                "                                                    if (userAnswerDouble == correctAnswer) {\r\n" + //
                "                                                        System.out.println(\"\\n" + //
                "__________________________\");\r\n" + //
                "                                                        System.out.println(\"| Great !! Correct Answer! |\");\r\n" + //
                "                                                        System.out.println(\"--------------------------\");\r\n" + //
                "                                                        score2++;\r\n" + //
                "                                                    } else {\r\n" + //
                "                                                        System.out.println(\r\n" + //
                "                                                                \"\\n" + //
                "______________________________________________\");\r\n" + //
                "                                                        System.out.println(\r\n" + //
                "                                                                \"| Uh ! That was close ... \\n" + //
                "Incorrect Answer   |\");\r\n" + //
                "                                                        System.out.println(\r\n" + //
                "                                                                \"------------------------------------------------\");\r\n" + //
                "                                                    }\r\n" + //
                "                                                } catch (NumberFormatException e) {\r\n" + //
                "                                                    System.out.println(\r\n" + //
                "                                                            \"Invalid input !  \\n" + //
                "If you want then press 'Q' to quit.\\n" + //
                "\");\r\n" + //
                "                                                }\r\n" + //
                "                                            } else {\r\n" + //
                "                                                // Generate a random numerical question\r\n" + //
                "                                                double numericalAnswer = 0;\r\n" + //
                "                                                String numericalQuestion = \"\";\r\n" + //
                "\r\n" + //
                "                                                int numericalType = random.nextInt(3);\r\n" + //
                "\r\n" + //
                "                                                switch (numericalType) {\r\n" + //
                "                                                    case 0:\r\n" + //
                "                                                        // Area of a rectangle\r\n" + //
                "                                                        int length = random.nextInt(10) + 1;\r\n" + //
                "                                                        int width = random.nextInt(10) + 1;\r\n" + //
                "                                                        numericalAnswer = length * width;\r\n" + //
                "                                                        numericalQuestion = \"What is the area of a rectangle with length \"\r\n" + //
                "                                                                + length + \" and width \" + width + \"?\";\r\n" + //
                "                                                        break;\r\n" + //
                "\r\n" + //
                "                                                    case 1:\r\n" + //
                "                                                        // Solve an equation: 2x + 5 = 15\r\n" + //
                "                                                        int coefficient = random.nextInt(5) + 1;\r\n" + //
                "                                                        int constant = random.nextInt(10) + 1;\r\n" + //
                "                                                        int equationAnswer = (15 - constant) / coefficient;\r\n" + //
                "                                                        numericalAnswer = equationAnswer;\r\n" + //
                "                                                        numericalQuestion = \"Solve for x in the equation: \"\r\n" + //
                "                                                                + coefficient + \"x + \" + constant + \" = 15\";\r\n" + //
                "                                                        break;\r\n" + //
                "\r\n" + //
                "                                                    case 2:\r\n" + //
                "                                                        // Calculate a simple numerical expression\r\n" + //
                "                                                        int num1 = random.nextInt(10) + 1;\r\n" + //
                "                                                        int num2 = random.nextInt(10) + 1;\r\n" + //
                "                                                        int num3 = random.nextInt(10) + 1;\r\n" + //
                "                                                        numericalAnswer = num1 + num2 - num3;\r\n" + //
                "                                                        numericalQuestion = \"Calculate the value of \" + num1 + \" + \"\r\n" + //
                "                                                                + num2 + \" - \" + num3 + \"?\";\r\n" + //
                "                                                        break;\r\n" + //
                "                                                }\r\n" + //
                "\r\n" + //
                "                                                // Display the numerical question\r\n" + //
                "                                                System.out.println(\"Numerical Question : \" + numericalQuestion);\r\n" + //
                "                                                System.out.println(\"Your answer (Q to quit) : \");\r\n" + //
                "                                                String userAnswer = sc.nextLine().toLowerCase();\r\n" + //
                "\r\n" + //
                "                                                // Check if the user wants to quit\r\n" + //
                "                                                if (userAnswer.equalsIgnoreCase(\"q\")) {\r\n" + //
                "                                                    break;\r\n" + //
                "                                                }\r\n" + //
                "\r\n" + //
                "                                                // Validate the user's answer\r\n" + //
                "\r\n" + //
                "                                                try {\r\n" + //
                "                                                    double userAnswerDouble = Double.parseDouble(userAnswer);\r\n" + //
                "                                                    if (userAnswerDouble == numericalAnswer) {\r\n" + //
                "                                                        System.out.println(\"\\n" + //
                "__________________________\");\r\n" + //
                "                                                        System.out.println(\"| Great !! Correct Answer! |\");\r\n" + //
                "                                                        System.out.println(\"--------------------------\");\r\n" + //
                "                                                        score2++;\r\n" + //
                "                                                    }\r\n" + //
                "\r\n" + //
                "                                                    else {\r\n" + //
                "                                                        System.out.println(\r\n" + //
                "                                                                \"\\n" + //
                "______________________________________________\");\r\n" + //
                "                                                        System.out.println(\r\n" + //
                "                                                                \"| Uh ! That was close ... \\n" + //
                "Incorrect Answer   |\");\r\n" + //
                "                                                        System.out.println(\r\n" + //
                "                                                                \"------------------------------------------------\");\r\n" + //
                "                                                    }\r\n" + //
                "                                                }\r\n" + //
                "\r\n" + //
                "                                                catch (NumberFormatException e) {\r\n" + //
                "                                                    System.out.println(\r\n" + //
                "                                                            \"Invalid input ! Please enter a valid number or 'q' to quit.\\n" + //
                "\");\r\n" + //
                "                                                }\r\n" + //
                "                                            }\r\n" + //
                "                                        }\r\n" + //
                "                                    }\r\n" + //
                "\r\n" + //
                "                                    // Displaying the final score\r\n" + //
                "                                    System.out.println(\r\n" + //
                "                                            \"Your score is : \" + score2 + \" ::::::::::  Keep it up !! ::::::::::\");\r\n" + //
                "\r\n" + //
                "                                    break;\r\n" + //
                "                                }\r\n" + //
                "\r\n" + //
                "                        }\r\n" + //
                "                        System.out.println(\"EDI return to his duty !! \");\r\n" + //
                "                        System.out.println(\"-------------------------------------------------------------------\");\r\n" + //
                "                        System.out.println(\"-------------------------------------------------------------------\");\r\n" + //
                "                    }\r\n" + //
                "\r\n" + //
                "                } // if\r\n" + //
                "            } // while loop\r\n" + //
                "        } // if - - - - << for checking whether the cosmic code is correct or not >>\r\n" + //
                "\r\n" + //
                "        else {\r\n" + //
                "            System.out.println(\"EDI crashed due to wrong cosmic code !!\");\r\n" + //
                "            System.out.println(\"-------------------------------------------------------------------\");\r\n" + //
                "            System.out.println(\"-------------------------------------------------------------------\");\r\n" + //
                "        }\r\n" + //
                "    } // main func.\r\n" + //
                "\r\n" + //
                "    public static boolean determineBondType(int atomicNumber1, int atomicNumber2, String userBondType) {\r\n" + //
                "        // Determine if the user's bond type matches the expected bond type based on the\r\n" + //
                "        // atomic numbers\r\n" + //
                "\r\n" + //
                "        // Modify this method based on your specific rules for determining the bond type\r\n" + //
                "\r\n" + //
                "        if (userBondType.equalsIgnoreCase(\"ionic\")) {\r\n" + //
                "            // Example rule: If one atomic number is less than 10 and the other is greater\r\n" + //
                "            // than or equal to 10,\r\n" + //
                "            // it is an ionic bond\r\n" + //
                "            return (atomicNumber1 < 10 && atomicNumber2 >= 10) || (atomicNumber1 >= 10 && atomicNumber2 < 10);\r\n" + //
                "        } else if (userBondType.equalsIgnoreCase(\"covalent\")) {\r\n" + //
                "            // Example rule: If both atomic numbers are less than 10 or both are greater\r\n" + //
                "            // than or equal to 10,\r\n" + //
                "            // it is a covalent bond\r\n" + //
                "            return (atomicNumber1 < 10 && atomicNumber2 < 10) || (atomicNumber1 >= 10 && atomicNumber2 >= 10);\r\n" + //
                "        } else {\r\n" + //
                "            return false; // Invalid bond type entered by the user\r\n" + //
                "        }\r\n" + //
                "    } // determineBondType()\r\n" + //
                "\r\n" + //
                "} // class";

        System.out.println(str.length());
    }
}
