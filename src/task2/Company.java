package task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Company {
    String companyName;
    String country;
    LocalDate foundationDate;
    String founder;
    Group[] groups;

    public Company(String companyName, String country, LocalDate foundationDate, String founder, Group[] groups) {
        this.companyName = companyName;
        this.country = country;
        this.foundationDate = foundationDate;
        this.founder = founder;
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "task2.Company{" +
                "companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", foundationDate=" + foundationDate +
                ", founder='" + founder + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
