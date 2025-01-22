class SamAverage {
    public static void main(String[] args) {
        int math = 94; 
        int physics = 95; 
        int chemistry = 96;

        int totalMarks = math+physics+chemistry;
        double averageMarks = (double) totalMarks / 3;
        System.out.println("Sam's average mark in PCM is " + averageMarks);
    }
}