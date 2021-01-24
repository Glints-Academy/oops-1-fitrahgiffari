package Task1;

public class Student extends Person {
   // private instance variables
   private int numCourses;   
   private String[] courses; 
   private int[] grades;     
   private static final int MAX_COURSES = 12; 
   
   /** Constructs a Student instance with the given name and address */
   public Student(String name, String address) {
      super(name, address);
      numCourses = 0;
      courses = new String[MAX_COURSES];
      grades = new int[MAX_COURSES];
   }
   
   /** Returns a self-descriptive string */
   public String toString() {
      return "Student: " + super.toString();
   }
   
   /** Adds a course and grade - No input validation */
   public void addCourseGrade(String course, int grade) {
      courses[numCourses] = course;
      grades[numCourses] = grade;
      ++numCourses;
   }
   
   /** Prints all courses taken and their grade */
   public void printGrades() {
      System.out.print(this);
      for (int i = 0; i < numCourses; ++i) {
         System.out.print(" " + courses[i] + ":" + grades[i]);
      }
      System.out.println();
   }
   
   /** Find the average grade */
   public double getAverageGrade() {
      int sum = 0;
      for (int i = 0; i < numCourses; i++ ) {
         sum += grades[i];
      }
      return (double)sum/numCourses;
   }
}