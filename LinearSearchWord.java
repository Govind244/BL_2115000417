public class LinearSearchWord {
    public static void main(String[] args) {
        String[] sentences = {"Java is great", "I love programming", "Hello world", "Learn Java"};
        System.out.println(findSentenceContainingWord(sentences, "Java"));
    }

    public static String findSentenceContainingWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            String[] a=sentence.split(" ");
         for(int i=0;i<a.length;i++){
            if(a[i].equals(word)){
                return sentence;
         }
        }
    }
        return "Not Found";
    
}
}