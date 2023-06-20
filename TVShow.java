//Sophia Hostetler
//U27264415
//Extra credit: TV Series List

import java.util.ArrayList;
import java.util.Scanner;

public class TVShow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many TV shows do you hope to watch this week? ");
        int showCount = scanner.nextInt();scanner.nextLine();
// arraylist object to store the collection of the string
        ArrayList<String> shows = new ArrayList<String>();
        String alreadyWatched = "";
        for (int show = 1; show <= showCount; show++) {
            System.out.print("Enter show " + show + ": ");
            String showName = scanner.nextLine();
            shows.add(showName);
        }

        do {
            System.out.print("Have you caught up to any shows (answer yes or no): ");
            alreadyWatched = scanner.nextLine();
            if (alreadyWatched.equals("yes")) {
                System.out.print("Which show? ");
                String watchedShowName = scanner.nextLine();
                if (shows.contains(watchedShowName)) {
                    shows.remove(watchedShowName);
                } else {
                    System.out.println("That show is not on original list!");
                }
            }
            
        } while (alreadyWatched.equals("yes"));
        // display all the items in our collection left over to user, without loop

        System.out.println("Here\'s what you still have to watch this week:");
        System.out.println(shows);
    }
}