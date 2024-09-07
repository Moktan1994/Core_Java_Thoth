package String;

public class StringUsage {
    public static void main(String[] args) {
         String playerName = new String("Ronaldo");
         String clubName = new String("RealMadrid");

        String playerName1 = new String("Bale");
        String clubName1 = new String("RealMadrid");

        String playerName2 = new String("Messi");
        String clubName3 = new String("Barcelona");

        System.out.println("1 " + playerName);
        System.out.println("2 " +playerName1);
        System.out.println("3 " +playerName1+playerName2);
    }
}
