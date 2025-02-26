import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonObjects {
   public static void main(String[] args) {
       try {
           ObjectMapper objectMapper = new ObjectMapper();

           ObjectNode jsonObject1 = objectMapper.createObjectNode();
           jsonObject1.put("name", "Rahul");
           jsonObject1.put("email", "rahul1112@gmail.com");

           ObjectNode jsonObject2 = objectMapper.createObjectNode();
           jsonObject2.put("age", 21);
           jsonObject2.put("city", "Kalan");

           jsonObject1.setAll(jsonObject2);

           System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject1));

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}