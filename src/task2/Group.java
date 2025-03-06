package task2;

import java.time.LocalDate;

public class Group {
    String groupName;
    LocalDate startDate;
    String mentor;

    public Group(String groupName, LocalDate startDate, String mentor) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "task2.Group{" +
                "groupName='" + groupName + '\'' +
                ", startDate=" + startDate +
                ", mentor='" + mentor + '\'' +
                '}';
    }
}
