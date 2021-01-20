package Task1;

public class Main {
   public static void main(String[] args) {
      
      Student s1 = new Student("Bang Mamat", "Jl.Cimpedak NO.8");
      s1.addCourseGrade("Matematika", 85);
      s1.addCourseGrade("Teknologi dan Informasi", 98);
      s1.printGrades();
      
      System.out.println("Average is " + s1.getAverageGrade());
      

      /** Test Teacher class */
      Teacher t1 = new Teacher("Pak Mahmud", "Jl. Citareul");
      System.out.println(t1);
      
      String[] courses = {"Matematika", "Bahasa Inggris", "Matematika"};
      for (String course: courses) {
         if (t1.addCourse(course)) {
            System.out.println(course + " added");
         } else {
            System.out.println(course + " has already in your course list");
         }
      }
   
      
      for (String course: courses) {
         if (t1.removeCourse(course)) {
            System.out.println(course + " already deleted");
         } else {
            System.out.println(course + " cannot be deleted");
         }
      }
    
   }
}