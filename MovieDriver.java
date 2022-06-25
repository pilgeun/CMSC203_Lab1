import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Movie myMovie = new Movie();	
		char another;
		
		//	Task #2
		do {
			
			// Ask and get name of movie
			System.out.println("Enter the name of a movie");
			myMovie.setTitle(keyboard.nextLine());
			
			// Ask and get rating of movie
			System.out.println("Enter the rating of the movie");
			myMovie.setRating(keyboard.nextLine());
			
			// Ask and get number of tickets sold
			System.out.println("Enter the number of tickets sold for this movie");
			myMovie.setSoldTickets(keyboard.nextInt());
			
			// prints out the above movie information
			System.out.println(myMovie.toString());
			
			// user input beginning with Y or y restarts the loop; any other input will end the loop
			System.out.println("Do you want to enter another? (y or n)");
			another = Character.toLowerCase(keyboard.next().charAt(0));	
			keyboard.nextLine(); 
			
		} while(another == 'y');
			
		System.out.println("Goodbye");
			
		keyboard.close(); 
	}
}
