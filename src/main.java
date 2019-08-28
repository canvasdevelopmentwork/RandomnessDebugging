import java.util.Random;

public class main {
    public static void main(String[] args)
    {
        System.out.println("Generate 10 random integers between 0 and 6");
        Random rnd = new Random();

        for (int i = 0; i <= 9; ++i)
        {
            int randomInt = 1 + rnd.nextInt(6);
            System.out.println("Generated number "+ (i+1) + ": " + randomInt);
        }

        System.out.println("Done.");
    }
}
