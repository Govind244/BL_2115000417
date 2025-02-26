import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class FilterByAgeTwo {
   public static void main(String[] args) {
       String jsonArray = """
       [
           {"name": "gappu", "email": "gappu3365@gmail.com", "age": 21},
           {"name": "Radhi", "email": "radhi1215@gmail.com", "age": 11},
           {"name": "Pranjal ", "email": "pranjal16@gmail.com", "age": 48}

       ]
       """;

       try {
           ObjectMapper objectMapper = new ObjectMapper();
           JsonNode rootNode = objectMapper.readTree(jsonArray);

           List<JsonNode> filteredList = new ArrayList<>();

           for (JsonNode node : rootNode) {
               if (node.get("age").asInt() > 25) {
                   filteredList.add(node);
               }
           }

           String filteredJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredList);

           System.out.println(filteredJson);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
