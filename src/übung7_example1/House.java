package übung7_example1;

import java.util.ArrayList;
import java.util.List;

public class House {
    final List<Room> rooms;

    public House() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public static void main(String[] args) {
        House house = new House();
        house.addRoom(new LivingRoom());
        house.addRoom(new Bathroom());
        house.addRoom(new Kitchen());
        house.addRoom(new Bedroom());
        house.addRoom(new Bedroom());
        house.rooms.forEach(Room::switchLights);
    }
}
