package task2;

import task2.Company;
import task2.Group;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group("Java17",LocalDate.of(2025,2,3),"Aizat");
        Group group2 = new Group("Js17",LocalDate.of(2025,2,3),"Alihan");
        Group [] groups = {group1,group2};

        Company company = new Company("Peaksoft","KG",
                LocalDate.of(2019,11,16),"Esen Niazov",groups);

        System.out.println(company);

    }
}