import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;

public class CourseTracker {
    public static void main(String[] args) {
        HashMap<String, Integer> courseMap = new HashMap<>();

        // Add 7 course name and its duration in hashmap
        courseMap.put("Java", 60);
        courseMap.put("Python", 40);
        courseMap.put("C++", 50);
        courseMap.put("JavaScript", 30);
        courseMap.put("Ruby", 45);
        courseMap.put("C#", 55);
        courseMap.put("Swift", 45);

        // Check course name doesnot exist, if it exists then add new duration in existing duration
        if (courseMap.containsKey("Java")) {
            courseMap.put("Java", courseMap.get("Java") + 10); // Add 10 days to Java course
        }

        // Store all course and duration as comma separated string in a file course.txt
        try (PrintWriter out = new PrintWriter(new FileWriter("course.txt"))) {
            for (String course : courseMap.keySet()) {
                out.println(course + "," + courseMap.get(course));
            }
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Print the contents of the hashmap
        System.out.println("Course durations:");
        for (String course : courseMap.keySet()) {
            System.out.println(course + ": " + courseMap.get(course) + " days");
        }
    }
}