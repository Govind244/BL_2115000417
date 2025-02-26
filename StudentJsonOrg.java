import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJsonOrg {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "Rahul Sharma");
        student.put("age", 20);

        JSONArray subjects = new JSONArray();
        subjects.put("Mathematics");
        subjects.put("Physics");
        subjects.put("Computer Science");

        student.put("subjects", subjects);

        System.out.println(student.toString());
    }
}


