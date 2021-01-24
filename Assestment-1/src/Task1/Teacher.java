package Task1;

public class Teacher extends Person {
   
   private int numCourses;   
   private String[] courses; 
   private static final int MAX_COURSES = 5; 
   
   /** Constructs a Teacher instance with the given name and address */
   public Teacher(String name, String address) {
      super(name, address);
      numCourses = 0;
      courses = new String[MAX_COURSES];
   }
   
   /** Returns a self-descriptive string */
  
   public String toString() {
      return "Teacher: " + super.toString();
   }
   
   /** Adds a course. Returns false if the course has already existed */
   public boolean addCourse(String course) {
      // Check if the course already in the course list
      for (int i = 0; i < numCourses; i++) {
         if (courses[i].equals(course)) return false;
      }
      courses[numCourses] = course;
      numCourses++;
      return true;
   }
   
   /** Removes a course. Returns false if the course cannot be found in the course list */
   public boolean removeCourse(String course) {
      boolean found = false;
      int courseIndex = -1; 
      for (int i = 0; i < numCourses; i++) {
         if (courses[i].equals(course)) {
            courseIndex = i;
            found = true;
            break;
         }
      }
      if (found) {
         // Remove the course and re-arrange for courses array
         for (int i = courseIndex; i < numCourses-1; i++) {
            courses[i] = courses[i+1];
         }
         numCourses--;
         return true;
      } else {
         return false;
      }
   }
}