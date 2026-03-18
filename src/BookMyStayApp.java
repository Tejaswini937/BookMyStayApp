import java.util.LinkedList;
import java.util.Queue;

<<<<<<< HEAD
class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
=======
class Reservation {

    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }
}

class BookingRequestQueue {

    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    public void addRequest(Reservation reservation) {
        requestQueue.offer(reservation);
    }

    public Reservation getNextRequest() {
        return requestQueue.poll();
    }

    public boolean hasPendingRequests() {
        return !requestQueue.isEmpty();
>>>>>>> feature/UC5
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        RoomInventory inventory = new RoomInventory();

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Hotel Room Inventory Status\n");

        System.out.println("Single Room:");
        System.out.println("Available Rooms: " + availability.get("Single") + "\n");

        System.out.println("Double Room:");
        System.out.println("Available Rooms: " + availability.get("Double") + "\n");

        System.out.println("Suite Room:");
        System.out.println("Available Rooms: " + availability.get("Suite"));
=======
        System.out.println("Booking Request Queue\n");

        BookingRequestQueue queue = new BookingRequestQueue();

        Reservation r1 = new Reservation("Abhi", "Single");
        Reservation r2 = new Reservation("Subha", "Double");
        Reservation r3 = new Reservation("Vannathi", "Suite");

        queue.addRequest(r1);
        queue.addRequest(r2);
        queue.addRequest(r3);

        while (queue.hasPendingRequests()) {
            Reservation r = queue.getNextRequest();
            System.out.println("Processing Booking:");
            System.out.println("Guest: " + r.getGuestName());
            System.out.println("Room Type: " + r.getRoomType() + "\n");
        }
>>>>>>> feature/UC5
    }
}