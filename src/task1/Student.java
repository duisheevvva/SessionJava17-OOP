package task1;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name;
    LocalDate dateOfBirth;
    String phoneNumber;
    String nationality;

    public Student(){

    }

    public Student(String name,LocalDate dateOfBirth,String phoneNumber,String nationality){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }


//    public void getInfo(){
//        System.out.println("Name:" + name +
//                "\nDate of Birth: " +dateOfBirth+
//                "\n Phone Number: " + phoneNumber+
//                "\n Nationality: " + nationality);
//    }

    @Override
    public String toString() {
        return "task1.Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public int getAgeByDateOfBirth(){
      LocalDate currentDate= LocalDate.now();
      Period age = Period.between(dateOfBirth,currentDate);
      return age.getYears();
    }
}
