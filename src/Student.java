public class Student extends Person implements Studyable {

    protected String major;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String firstName, String lastName, int age, String major) {
        super(firstName, lastName, age);
        this.major = major;
    }


    @Override
    public void displayDetails() {
//        Name: Alice Johnson
//Age: 20
//Major: Computer Science
//Alice Johnson is studying Computer Science
        System.out.println("Name: "+ firstName + " " + lastName);
        System.out.println("Age: "+ age);
        System.out.println("Major: "+ major);
        describeMajor();
        System.out.println();
//        System.out.println(firstName + " " + lastName + " is studying " + major + ".");
    }

    @Override
    public void describeMajor() {
        System.out.println(firstName + " " + lastName + " is studying " + major + ".");
    }
}
