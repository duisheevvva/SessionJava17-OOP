
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Elnura";
        student1.age = 18;
        student1.group = "Java";

        Student student2 = new Student();
        student2.name = "Baitenir";
        student2.age = 18;
        student2.group = "Java";

        Student student3 = new Student();
        student3.name = "Sanjar";
        student3.age = 18;
        student3.group = "JS";

        Student student4 = new Student();
        student4.name = "Symbat";
        student4.age = 18;
        student4.group = "JS";

        Student student5 = new Student();
        student5.name = "Nurpazyl";
        student5.age = 18;
        student5.group = "Java";

        Student student6 = new Student();
        student6.name = "Luiza";
        student6.age = 18;
        student6.group = "JS";


        Student [] students = {student1,student2,student3,student4,student5,student6};

        int countJava =0;
        int countJS =0;
        for (Student student: students) {
            if (student.group.equals("Java")){
                countJava++;
            } else if (student.group.equals("JS")) {
                countJS++;
            }
        }

        System.out.println("Count Java:" + countJava);
        System.out.println("Count JS:" + countJS);


        System.out.println(student1.getName());


    }
}