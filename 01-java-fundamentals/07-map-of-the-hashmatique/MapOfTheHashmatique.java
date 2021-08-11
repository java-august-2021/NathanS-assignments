import java.util.HashMap;
import java.util.Set;
public class MapOfTheHashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Rain On Me", "I didn't ask for a free ride, I only asked you to show me a real good time");
        trackList.put("Express Yourself", "Don't go for second best, put your love to the test");
        trackList.put("Smells Like Teen Spirit", "With the lights out, this is dangerous");
        trackList.put("Radioactive", "When you're around me I'm radioactive");
        System.out.println(trackList.get("Smells Like Teen Spirit")); // pull out one song by title

        Set<String> tracks = trackList.keySet(); //pull out all songs using format "Track: Lyric"
        for(String key : tracks) { //or for(String key : tracklist.keySet();)
            // System.out.println(key + ": " + trackList.get(key));
            System.out.println(String.format("Track: %s, Lyrics: %s", key, trackList.get(key)));
        }
    }

}
