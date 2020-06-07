import java.util.Scanner;

public class TriviaLab {
	public static void main(String[] args) {
		
		System.out.println("IMPORTANT: enter all answers in one-word, lowercase strings or as an integer unless told otherwise.");
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.print("Math or Geography(geo/math):: ");
		String answer = input.next();
		int score = 0;
	
		double random = Math.random();
		double rounded = Math.round(random * 100.0);
		double rounded2 = Math.round(random * 100.0);
		double rounded3 = Math.round(random * 100.0);
		double x = Math.round(rounded / 10.0);
		double y = Math.round(rounded2 / 10.0);
		double z = Math.round(rounded3 / 10.0);

		if(answer.equals("geo")) {
			System.out.println("__________Geography__________");
		  
		  System.out.println("Question 1: What is el capital of Spain?");
		  System.out.print("Answer:: ");
		  answer = input.next();
		  
		  if (answer.equals("madrid")) {
			System.out.println("GG m8");
			score++;
			System.out.println("Score = " + score);
		  } else {
			System.out.println("No");
			System.out.println("Score = " + score);
		  }
		  
		  System.out.println();
		  
		  System.out.println("Question 2: What is el capital of France?");
		  System.out.print("Answer:: ");
		  answer = input.next();
		  
		  if (answer.equals("paris")) {
			System.out.println("GG m8");
			score++;
			System.out.println("Score = " + score);
		  } else {
			System.out.println("No");
			System.out.println("Score = " + score);
		  }
		  
		  System.out.println();
		  
		  System.out.println("Question 3: What IS el capital of the Soviet Union");
		  System.out.print("Answer:: ");
		  answer = input.next();

		  if (answer.equals("moscow")) {
			System.out.println("GG m8");
			score++;
			System.out.println("Score = " + score);
		  } else {
			System.out.println("No");
		  }
		  
		  System.out.println();
		  
		  System.out.println("Question 4: What is el capital of Syria?");
		  System.out.print("Answer:: ");
		  answer = input.next();
		  
		  if (answer.equals("damascus")) {
			System.out.println("GG m8");
			score++;
			System.out.println("Score = " + score);
		  } else {
			System.out.println("no");
			System.out.println("Score = " + score);
		  }
		  
		  System.out.println();
		  
		  System.out.println("Question 5: What is el capital of el Peoples Republic of China?");
		  System.out.print("Answer:: ");
		  answer = input.next();
		  
		  if (answer.equals("beijing")) {
			System.out.println("GG m8");
			score++;
			System.out.println("Score = " + score);
		  } else {
			System.out.println("no");
			System.out.println("Score = " + score);
		  }
		  
		  System.out.println();
		  
		  System.out.println("Question 6: Does Australia exist?(y/n)");
		  System.out.print("Answer:: ");
		  answer = input.next();
		  
		  if (answer.equals("no")) {
			System.out.println("GG m8");
			score++;
			System.out.println("Score = " + score);
		  } else {
			System.out.println("no, bruh australia doesn\'t exist");
			System.out.println("Score = " + score);
		  }
		  
		  System.out.println();
		  
		  System.out.println("Question 7: What is el capital of canada");
		  System.out.print("Answer:: ");
		  answer = input.next();
		  
		  if (answer.equals("ottawa")) {
			System.out.println("GG m8");
			score++;
			System.out.println("Score = " + score);
		  } else {
			System.out.println("no");
			System.out.println("Score = " + score);
		  }
		  
		  System.out.println();
		  
		  System.out.println("Question 8: what continent is Japan in?");
		  System.out.print("Answer:: ");
		  answer = input.next();
		  
		  if (answer.equals("asia")) {
			System.out.println("GG m8");
			score++;
			System.out.println("Score = " + score);
		  } else {
			System.out.println("no");
			System.out.println("Score = " + score);
		  }
		  
		  System.out.println();
		  
		  System.out.println("Question 9: what is el capital of belgium?");
		  System.out.print("Answer:: ");
		  answer = input.next();
		  
		  if (answer.equals("brussels")) {
			System.out.println("GG m8");
			score++;
			System.out.println("Score = " + score);
		  } else {
			System.out.println("no");
			System.out.println("Score = " + score);
		  }
		  
		  System.out.println();
		  
		  System.out.println("Question 10: what is el capital of romania?");
		  System.out.print("Answer:: ");
		  answer = input.next();
		  
		  if (answer.equals("bucharest")) {
			System.out.println("GG m8");
			score++;
			System.out.println("Score = " + score);
		  } else {
			System.out.println("no");
			System.out.println("Score = " + score);
		  }
		  
		  System.out.println();
		  
		  if (score == 10) {
			System.out.println("GG m8 you got all of them 10 out of 10 right");
		  } else {
			System.out.println("You got " + score + " out of 10");
			
		  }
		  
			System.out.println();
			System.out.println();
			System.out.println();
				
			System.out.println("__________Math__________");
				
			random = Math.random();
			rounded = Math.round(random * 100.0);
			System.out.println("Question 1: What is the area of a square with length " + Math.round(rounded / 10.0));
			System.out.print("Answer:: ");
			int response = input.nextInt();
			if (response == (Math.pow(Math.round(rounded / 10.0), 2))) { 
				System.out.println("Correct");
				score++;
				System.out.println("Score = " + score);
			} else {
				System.out.println("Wrong");
				System.out.println((Math.pow(Math.round(rounded / 10.0), 2)));
				System.out.println("Score = " + score);
			}
			
			System.out.println();
			
			random = Math.random();
			rounded = Math.round(random * 100.0);
			System.out.println("Question 2: What is the area of a square with length " + Math.round(rounded / 10.0));
			System.out.print("Answer:: ");
			response = input.nextInt();
			if (response == (Math.pow(Math.round(rounded / 10.0), 2))) { 
				System.out.println("Correct");
				score++;
				System.out.println("Score = " + score);
			} else {
				System.out.println("Wrong");
				System.out.println((Math.pow(Math.round(rounded / 10.0), 2)));
				System.out.println("Score = " + score);
			}
			
			System.out.println();
			
			random = Math.random();
			rounded = Math.round(random * 100.0);
			System.out.println("Question 3: What is the area of a square with length " + Math.round(rounded / 10.0));
			System.out.print("Answer:: ");
			response = input.nextInt();
			if (response == (Math.pow(Math.round(rounded / 10.0), 2))) { 
				System.out.println("Correct");
				score++;
				System.out.println("Score = " + score);
			} else {
				System.out.println("Wrong");
				System.out.println((Math.pow(Math.round(rounded / 10.0), 2)));
				System.out.println("Score = " + score);
			}
			
			System.out.println();
			
			rounded = Math.round(random * 100.0);
			random = Math.random();
			rounded2 = Math.round(random * 100.0);
			x = Math.round(rounded / 10.0);
			y = Math.round(rounded2 / 10.0);
			System.out.println("Question 4: What is the area of a rectangle with length " + x + " and width " + y);
			System.out.print("Answer:: ");
			response = input.nextInt();
			if (response == (x * y)){ 
				System.out.println("Correct");
				score++;
				System.out.println("Score = " + score);
			} else {
				System.out.println("Wrong");
				System.out.println(x * y);
				System.out.println("Score = " + score);
			}
			
			System.out.println();
			
			rounded = Math.round(random * 100.0);
			random = Math.random();
			rounded2 = Math.round(random * 100.0);
			x = Math.round(rounded / 10.0);
			y = Math.round(rounded2 / 10.0);
			System.out.println("Question 5: What is the area of a rectangle with length " + x + " and width " + y);
			System.out.print("Answer:: ");
			response = input.nextInt();
			if (response == (x * y)){ 
				System.out.println("Correct");
				score++;
				System.out.println("Score = " + score);
			} else {
				System.out.println("Wrong");
				System.out.println(x * y);
				System.out.println("Score = " + score);
			}
			
			System.out.println();
			
			rounded = Math.round(random * 100.0);
			random = Math.random();
			rounded2 = Math.round(random * 100.0);
			x = Math.round(rounded / 10.0);
			y = Math.round(rounded2 / 10.0);
			System.out.println("Question 6: What is the area of a rectangle with length " + x + " and width " + y);
			System.out.print("Answer:: ");
			response = input.nextInt();
			if (response == (x * y)){ 
				System.out.println("Correct");
				score++;
				System.out.println("Score = " + score);
			} else {
				System.out.println("Wrong");
				System.out.println(x * y);
				System.out.println("Score = " + score);
			}
			
			System.out.println();
			
			rounded = Math.round(random * 100.0);
			random = Math.random();
			rounded2 = Math.round(random * 100.0);
			rounded3 = Math.round(random * 100.0);
			x = Math.round(rounded / 10.0);
			y = Math.round(rounded2 / 10.0);
			z = Math.round(rounded3 / 10.0);
			System.out.println("Question 7: What is the area of a cuboid with length " + x + " and width " + y + " and height " + z);
			System.out.print("Answer:: ");
			response = input.nextInt();
			if (response == (x * y * z)){ 
				System.out.println("Correct");
				score++;
				System.out.println("Score = " + score);
			} else {
				System.out.println("Wrong");
				System.out.println(x * y * z);
				System.out.println("Score = " + score);
			}
			
			System.out.println();
			
			rounded = Math.round(random * 100.0);
			random = Math.random();
			rounded2 = Math.round(random * 100.0);
			rounded3 = Math.round(random * 100.0);
			x = Math.round(rounded / 10.0);
			y = Math.round(rounded2 / 10.0);
			z = Math.round(rounded3 / 10.0);
			System.out.println("Question 8: What is the area of a cuboid with length " + x + " and width " + y + " and height " + z);
			System.out.print("Answer:: ");
			response = input.nextInt();
			if (response == (x * y * z)){ 
				System.out.println("Correct");
				score++;
				System.out.println("Score = " + score);
			} else {
				System.out.println("Wrong");
				System.out.println(x * y * z);
				System.out.println("Score = " + score);
			}
			
			System.out.println();
			
			rounded = Math.round(random * 100.0);
			random = Math.random();
			rounded2 = Math.round(random * 100.0);
			rounded3 = Math.round(random * 100.0);
			x = Math.round(rounded / 10.0);
			y = Math.round(rounded2 / 10.0);
			z = Math.round(rounded3 / 10.0);
			System.out.println("Question 9: What is the area of a cuboid with length " + x + " and width " + y + " and height " + z);
			System.out.print("Answer:: ");
			response = input.nextInt();
			if (response == (x * y * z)){ 
				System.out.println("Correct");
				score++;
				System.out.println("Score = " + score);
			} else {
				System.out.println("Wrong");
				System.out.println(x * y * z);
				System.out.println("Score = " + score);
			}
			
			System.out.println();
			
			rounded = Math.round(random * 100.0);
			random = Math.random();
			rounded2 = Math.round(random * 100.0);
			rounded3 = Math.round(random * 100.0);
			x = Math.round(rounded / 10.0);
			y = Math.round(rounded2 / 10.0);
			z = Math.round(rounded3 / 10.0);
			System.out.println("Question 10: What is the area of a cuboid with length " + x + " and width " + y + " and height " + z);
			System.out.print("Answer:: ");
			response = input.nextInt();
			if (response == (x * y * z)){ 
				System.out.println("Correct");
				score++;
				System.out.println("Score = " + score);
			} else {
				System.out.println("Wrong");
				System.out.println(x * y * z);
				System.out.println("Score = " + score);
				
			}

			if (score == 20) {
				System.out.println("Good job you got all right");
			} else {
				System.out.println("You got " + score + " out of 20");
			}
				
		} else if(answer.equals("math")) {
				System.out.println("__________Math__________");
				
				random = Math.random();
				rounded = Math.round(random * 100.0);
				System.out.println("Question 1: What is the area of a square with length " + Math.round(rounded / 10.0));
				System.out.print("Answer:: ");
				int response = input.nextInt();
				if (response == (Math.pow(Math.round(rounded / 10.0), 2))) { 
					System.out.println("Correct");
					score++;
					System.out.println("Score = " + score);
				} else {
					System.out.println("Wrong");
					System.out.println((Math.pow(Math.round(rounded / 10.0), 2)));
					System.out.println("Score = " + score);
				}
				
				System.out.println();
				
				random = Math.random();
				rounded = Math.round(random * 100.0);
				System.out.println("Question 2: What is the area of a square with length " + Math.round(rounded / 10.0));
				System.out.print("Answer:: ");
				response = input.nextInt();
				if (response == (Math.pow(Math.round(rounded / 10.0), 2))) { 
					System.out.println("Correct");
					score++;
					System.out.println("Score = " + score);
				} else {
					System.out.println("Wrong");
					System.out.println((Math.pow(Math.round(rounded / 10.0), 2)));
					System.out.println("Score = " + score);
				}
				
				System.out.println();
				
				random = Math.random();
				rounded = Math.round(random * 100.0);
				System.out.println("Question 3: What is the area of a square with length " + Math.round(rounded / 10.0));
				System.out.print("Answer:: ");
				response = input.nextInt();
				if (response == (Math.pow(Math.round(rounded / 10.0), 2))) { 
					System.out.println("Correct");
					score++;
					System.out.println("Score = " + score);
				} else {
					System.out.println("Wrong");
					System.out.println((Math.pow(Math.round(rounded / 10.0), 2)));
					System.out.println("Score = " + score);
				}
				
				System.out.println();
				
				rounded = Math.round(random * 100.0);
				random = Math.random();
				rounded2 = Math.round(random * 100.0);
				x = Math.round(rounded / 10.0);
				y = Math.round(rounded2 / 10.0);
				System.out.println("Question 4: What is the area of a rectangle with length " + x + " and width " + y);
				System.out.print("Answer:: ");
				response = input.nextInt();
				if (response == (x * y)){ 
					System.out.println("Correct");
					score++;
					System.out.println("Score = " + score);
				} else {
					System.out.println("Wrong");
					System.out.println(x * y);
					System.out.println("Score = " + score);
				}
				
				System.out.println();
				
				rounded = Math.round(random * 100.0);
				random = Math.random();
				rounded2 = Math.round(random * 100.0);
				x = Math.round(rounded / 10.0);
				y = Math.round(rounded2 / 10.0);
				System.out.println("Question 5: What is the area of a rectangle with length " + x + " and width " + y);
				System.out.print("Answer:: ");
				response = input.nextInt();
				if (response == (x * y)){ 
					System.out.println("Correct");
					score++;
					System.out.println("Score = " + score);
				} else {
					System.out.println("Wrong");
					System.out.println(x * y);
					System.out.println("Score = " + score);
				}
				
				System.out.println();
				
				rounded = Math.round(random * 100.0);
				random = Math.random();
				rounded2 = Math.round(random * 100.0);
				x = Math.round(rounded / 10.0);
				y = Math.round(rounded2 / 10.0);
				System.out.println("Question 6: What is the area of a rectangle with length " + x + " and width " + y);
				System.out.print("Answer:: ");
				response = input.nextInt();
				if (response == (x * y)){ 
					System.out.println("Correct");
					score++;
					System.out.println("Score = " + score);
				} else {
					System.out.println("Wrong");
					System.out.println(x * y);
					System.out.println("Score = " + score);
				}
				
				System.out.println();
				
				rounded = Math.round(random * 100.0);
				random = Math.random();
				rounded2 = Math.round(random * 100.0);
				rounded3 = Math.round(random * 100.0);
				x = Math.round(rounded / 10.0);
				y = Math.round(rounded2 / 10.0);
				z = Math.round(rounded3 / 10.0);
				System.out.println("Question 7: What is the area of a cuboid with length " + x + " and width " + y + " and height " + z);
				System.out.print("Answer:: ");
				response = input.nextInt();
				if (response == (x * y * z)){ 
					System.out.println("Correct");
					score++;
					System.out.println("Score = " + score);
				} else {
					System.out.println("Wrong");
					System.out.println(x * y * z);
					System.out.println("Score = " + score);
				}
				
				System.out.println();
				
				rounded = Math.round(random * 100.0);
				random = Math.random();
				rounded2 = Math.round(random * 100.0);
				rounded3 = Math.round(random * 100.0);
				x = Math.round(rounded / 10.0);
				y = Math.round(rounded2 / 10.0);
				z = Math.round(rounded3 / 10.0);
				System.out.println("Question 8: What is the area of a cuboid with length " + x + " and width " + y + " and height " + z);
				System.out.print("Answer:: ");
				response = input.nextInt();
				if (response == (x * y * z)){ 
					System.out.println("Correct");
					score++;
					System.out.println("Score = " + score);
				} else {
					System.out.println("Wrong");
					System.out.println(x * y * z);
					System.out.println("Score = " + score);
				}
				
				System.out.println();
				
				rounded = Math.round(random * 100.0);
				random = Math.random();
				rounded2 = Math.round(random * 100.0);
				rounded3 = Math.round(random * 100.0);
				x = Math.round(rounded / 10.0);
				y = Math.round(rounded2 / 10.0);
				z = Math.round(rounded3 / 10.0);
				System.out.println("Question 9: What is the area of a cuboid with length " + x + " and width " + y + " and height " + z);
				System.out.print("Answer:: ");
				response = input.nextInt();
				if (response == (x * y * z)){ 
					System.out.println("Correct");
					score++;
					System.out.println("Score = " + score);
				} else {
					System.out.println("Wrong");
					System.out.println(x * y * z);
					System.out.println("Score = " + score);
				}
				
				System.out.println();
				
				rounded = Math.round(random * 100.0);
				random = Math.random();
				rounded2 = Math.round(random * 100.0);
				rounded3 = Math.round(random * 100.0);
				x = Math.round(rounded / 10.0);
				y = Math.round(rounded2 / 10.0);
				z = Math.round(rounded3 / 10.0);
				System.out.println("Question 10: What is the area of a cuboid with length " + x + " and width " + y + " and height " + z);
				System.out.print("Answer:: ");
				response = input.nextInt();
				if (response == (x * y * z)){ 
					System.out.println("Correct");
					score++;
					System.out.println("Score = " + score);
				} else {
					System.out.println("Wrong");
					System.out.println(x * y * z);
					System.out.println("Score = " + score);
				}
				
				if (score == 10) {
					System.out.println("Good job you got all right");
				} else {
					System.out.println("You got " + score + " out of 10");
				}
				
				System.out.println();
				System.out.println();
				
				System.out.println("__________Geography__________");
		  
			  System.out.println("Question 1: What is el capital of Spain?");
			  System.out.print("Answer:: ");
			  answer = input.next();
			  
			  if (answer.equals("madrid")) {
				System.out.println("GG m8");
				score++;
				System.out.println("Score = " + score);
			  } else {
				System.out.println("No");
				System.out.println("Score = " + score);
			  }
			  
			  System.out.println();
			  
			  System.out.println("Question 2: What is el capital of France?");
			  System.out.print("Answer:: ");
			  answer = input.next();
			  
			  if (answer.equals("paris")) {
				System.out.println("GG m8");
				score++;
				System.out.println("Score = " + score);
			  } else {
				System.out.println("No");
				System.out.println("Score = " + score);
			  }
			  
			  System.out.println();
			  
			  System.out.println("Question 3: What IS el capital of the Soviet Union");
			  System.out.print("Answer:: ");
			  answer = input.next();

			  if (answer.equals("moscow")) {
				System.out.println("GG m8");
				score++;
				System.out.println("Score = " + score);
			  } else {
				System.out.println("No");
			  }
			  
			  System.out.println();
			  
			  System.out.println("Question 4: What is el capital of Syria?");
			  System.out.print("Answer:: ");
			  answer = input.next();
			  
			  if (answer.equals("damascus")) {
				System.out.println("GG m8");
				score++;
				System.out.println("Score = " + score);
			  } else {
				System.out.println("no");
				System.out.println("Score = " + score);
			  }
			  
			  System.out.println();
			  
			  System.out.println("Question 5: What is el capital of el Peoples Republic of China?");
			  System.out.print("Answer:: ");
			  answer = input.next();
			  
			  if (answer.equals("beijing")) {
				System.out.println("GG m8");
				score++;
				System.out.println("Score = " + score);
			  } else {
				System.out.println("no");
				System.out.println("Score = " + score);
			  }
			  
			  System.out.println();
			  
			  System.out.println("Question 6: Does Australia exist?(y/n)");
			  System.out.print("Answer:: ");
			  answer = input.next();
			  
			  if (answer.equals("no")) {
				System.out.println("GG m8");
				score++;
				System.out.println("Score = " + score);
			  } else {
				System.out.println("no, bruh australia doesn\'t exist");
				System.out.println("Score = " + score);
			  }
			  
			  System.out.println();
			  
			  System.out.println("Question 7: What is el capital of canada");
			  System.out.print("Answer:: ");
			  answer = input.next();
			  
			  if (answer.equals("ottawa")) {
				System.out.println("GG m8");
				score++;
				System.out.println("Score = " + score);
			  } else {
				System.out.println("no");
				System.out.println("Score = " + score);
			  }
			  
			  System.out.println();
			  
			  System.out.println("Question 8: what continent is Japan in?");
			  System.out.print("Answer:: ");
			  answer = input.next();
			  
			  if (answer.equals("asia")) {
				System.out.println("GG m8");
				score++;
				System.out.println("Score = " + score);
			  } else {
				System.out.println("no");
				System.out.println("Score = " + score);
			  }
			  
			  System.out.println();
			  
			  System.out.println("Question 9: what is el capital of belgium?");
			  System.out.print("Answer:: ");
			  answer = input.next();
			  
			  if (answer.equals("brussels")) {
				System.out.println("GG m8");
				score++;
				System.out.println("Score = " + score);
			  } else {
				System.out.println("no");
				System.out.println("Score = " + score);
			  }
			  
			  System.out.println();
			  
			  System.out.println("Question 10: what is el capital of romania?");
			  System.out.print("Answer:: ");
			  answer = input.next();
			  
			  if (answer.equals("bucharest")) {
				System.out.println("GG m8");
				score++;
				System.out.println("Score = " + score);
			  } else {
				System.out.println("no");
				System.out.println("Score = " + score);
			  }
			  
			  System.out.println();
			  
			  if (score == 20) {
				System.out.println("GG m8 you got all of them 10 out of 10 right");
			  } else {
				System.out.println("You got " + score + " out of 20");
				
			  }

		} else {
		  System.out.println("Sorry, couldn\'t understand that.");
		}
	}
}