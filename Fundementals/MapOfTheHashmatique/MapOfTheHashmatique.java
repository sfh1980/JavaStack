import java.util.HashMap;


public class MapOfTheHashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Super Rad!", "I got a small friend Who has a fat friend");
        trackList.put("Red Sweater!", "You're my girl, I'm your man, I don't care if we live in a garbage can");
        trackList.put("Magic Chicken!", "Ooh ooh, ooh ooh, Chicken makes me feel so good");
        trackList.put("The Cat With Two Heads!", "I kept it in a box, I watched it grow a lot");

        System.out.println(trackList);
        System.out.println(trackList.containsKey("Magic Chicken!"));
        



    }
}


