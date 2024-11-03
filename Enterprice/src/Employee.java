import java.util.ArrayList;
import java.util.List;

public class Employee {

    private Long id;
    private String name;
    private Position currentPosition;
    private List<Position> previousPositions;
    private Pass pass;
    private List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Position> getPreviousPositions() {
        return previousPositions;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public Pass getPass() {
        return pass;
    }

    public void setPass(Pass pass) {
        this.pass = pass;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Employee(Long id, String name, Position currentPosition, Pass pass) {
        this.id = id;
        this.name = name;
        this.currentPosition = currentPosition;
        this.pass = pass;
        this.previousPositions = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public void addPreviousPosition(Position position){
        previousPositions.add(position);
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
