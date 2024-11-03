import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Enterprice SoftServe = new Enterprice("SoftServe");

        Department ITdepartment = new Department(1L, "IT Department");
        SoftServe.addDepartments(ITdepartment);

        Pass itPass = new Pass(14L, "00014", Date.from(LocalDate.of(2024, 11, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()));;

        Position traineeJavaDev = new Position(1L, "Trainee Java Developer", Date.from(LocalDate.of(2024, 2, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        Position junJavaDev = new Position(12L, "Junior Java Developer",  Date.from(LocalDate.of(2024, 4, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        Position midJavaDev = new Position(13L, "Middle Java Developer", Date.from(LocalDate.of(2024, 7, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        Position senJavaDev = new Position(14L, "Senior Java Developer", Date.from(LocalDate.of(2024, 11, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()));

        Employee javaDev = new Employee(1L, "Anrii Korotchuk", senJavaDev, itPass);

        javaDev.addPreviousPosition(traineeJavaDev);
        javaDev.addPreviousPosition(junJavaDev);
        javaDev.addPreviousPosition(midJavaDev);

        Room meetingRoom = new Room(1L, "Meeting room");
        Room officeRoom = new Room(1L, "Office 101 room");

        javaDev.addRoom(meetingRoom);
        javaDev.addRoom(officeRoom);

        ITdepartment.addEmployee(javaDev);


        System.out.println("Enterprise: " + SoftServe.getName());
        for (Department department : SoftServe.getDepartments()) {
            System.out.println(" Department: " + department.getName());
            for (Employee emp : department.getEmployees()) {
                System.out.println("  Employee: " + emp.getName());
                System.out.println("   Current Position: " + emp.getCurrentPosition().getTitle());
                System.out.println("   Pass Card Number: " + emp.getPass().getCardNumber());

                System.out.println("   Previous Positions:");
                for (Position pos : emp.getPreviousPositions()) {
                    System.out.println("    - " + pos.getTitle() + ", Start Date: " + pos.getStartDate());
                }

                System.out.println("   Rooms Access:");
                for (Room room : emp.getRooms()) {
                    System.out.println("    - Room Number: " + room.getRoomNumber());
                }
            }
        }

    }
}