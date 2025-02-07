class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }

    public static void main(String[] args) {
        Course course = new Course("Mathematics", 10);
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Data Science", 12, "Coursera", true, 5000, 10);

        course.displayCourseDetails();
        onlineCourse.displayCourseDetails();
        paidCourse.displayCourseDetails();
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayCourseDetails() {
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No") + ", Fee: " + fee + ", Discount: " + discount + "%, Final Price: " + finalPrice);
    }
}
