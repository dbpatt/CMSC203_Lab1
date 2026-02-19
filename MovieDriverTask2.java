import java.util.Scanner;

public class MovieDriverTask2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String continueChoice = "y";

        while (continueChoice.equalsIgnoreCase("y")) {
            Movie movie = new Movie();

            System.out.println("Enter the title of the movie:");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            System.out.println("Enter the rating of the movie:");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            System.out.println("Enter the number of tickets sold:");
            int tickets = Integer.parseInt(keyboard.nextLine());
            movie.setSoldTickets(tickets);

            System.out.println(movie.toString());

            System.out.println("Do you want to enter another? (y/n)");
            continueChoice = keyboard.nextLine();
        }

        System.out.println("Goodbye!");
        keyboard.close();
    }
}