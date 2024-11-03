public class Room {
    private Long id;
    private String roomNumber;

    public Room(Long id, String roomName) {
        this.id = id;
        this.roomNumber = roomName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
