
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Declare and initialize a HashMap
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Add elements to the HashMap
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 92);

        // Print the HashMap
        System.out.println("Student Scores: " + studentScores);
    }
}
