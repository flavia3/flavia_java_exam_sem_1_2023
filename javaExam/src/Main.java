import Model_1.MenuItem;
import Model_1.Restaurant;
import Model_2.Course;
import Model_2.Student;

public class Main {
    public static void main(String[] args) {
//        question 2(ii)
//        restaurant collection
        Restaurant restaurant = new Restaurant();
//        Adding menu items in a restaurant
        MenuItem item1 = new MenuItem("mashed rice", 25000, 2);
        MenuItem item2 = new MenuItem("Vegetable salad", 15000, 3);
        MenuItem item3 = new MenuItem("Pizza", 35000, 1);

        restaurant.addMenuItems(item1);
        restaurant.addMenuItems(item2);
        restaurant.addMenuItems(item3);

        System.out.println("Menu items in a restaurant");
        System.out.println("Before removing an item "+ restaurant.getMenuItems().size());
        System.out.println("Item 1"+ item1.getFoodItems() + " "+ item1.getPrice()+ " "+ item1.getRatings());
        System.out.println("Item 2"+ item2.getFoodItems() + " "+ item2.getPrice()+ " "+ item2.getRatings());
        System.out.println("Item 3"+ item3.getFoodItems() + " "+ item3.getPrice()+ " "+ item3.getRatings());
//        removing menu items in a restaurant
        restaurant.removeMenuItems(item3);

        System.out.println("Menu items in a restaurant");
        System.out.println("After removing an item "+ restaurant.getMenuItems().size());
        System.out.println("Item 1"+ item1.getFoodItems() + " "+ item1.getPrice()+ " "+ item1.getRatings());
        System.out.println("Item 2"+ item2.getFoodItems() + " "+ item2.getPrice()+ " "+ item2.getRatings());

        System.out.println("-----------------------------");
//        question 2(iii)
//        student collection
        Student student = new Student("Prisca", 12);
//       Adding courses
        Course course1 = new Course("CSD11", "Python");
        Course course2 = new Course("CSD10", "Javascript");
        Course course3 = new Course("CSD12", "Java");
        student.addCourse(course1);
        student.addCourse(course2);
        student.addCourse(course3);

        System.out.println("Students information");
        System.out.println("Before removing a course"+ student.getCourses().size());
        System.out.println("course 1 "+ course1.getCourseCode() + " "+ course1.getCourseUnit());
        System.out.println("course 2 "+ course2.getCourseCode() + " "+ course2.getCourseUnit());
        System.out.println("course 3 "+ course3.getCourseCode() + " "+ course3.getCourseUnit());
//        removing courses
        student.removeCourse(course2);
        System.out.println("Students information");
        System.out.println("After removing a course"+ student.getCourses().size());
        System.out.println("course 1 "+ course1.getCourseCode() + " "+ course1.getCourseUnit());
        System.out.println("course 3 "+ course3.getCourseCode() + " "+ course3.getCourseUnit());

        System.out.println("-----------------------------");

    }
}