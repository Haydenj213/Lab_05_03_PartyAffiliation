import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your party affiliation.\n D for Democratic.\n R for Republican.\n I for independent.\n Anything else for other.");

        String partyAffiliation = in.nextLine();

        if (Objects.equals(partyAffiliation, "D")) {
            System.out.println("You get a Democratic Donkey");
        } else if (Objects.equals(partyAffiliation, "R")) {
            System.out.println("You get a Republican Elephant");
        } else if (Objects.equals(partyAffiliation, "I")) {
            System.out.println("You get an Independent Man");
        } else {
            System.out.println("Thank you for your alternative answer. It will be recorded, so that we may review it and potentially add it to our next questioner.");
        }

    }
}