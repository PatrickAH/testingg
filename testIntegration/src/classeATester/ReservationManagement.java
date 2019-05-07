package classeATester;



import java.util.ArrayList;

public class ReservationManagement {

	private ArrayList<String> reservations;
	private IRoomManagement roomManagement;
	
	public ReservationManagement(IRoomManagement roomManagement){
		this.reservations = new ArrayList<String>();
		this.roomManagement = roomManagement;
	}
	
	public void reserveRoom(String roomNumber) throws Exception {
		if (!this.roomManagement.isRoomAvailable(roomNumber)){
			throw new Exception("Room " + roomNumber + "is not available");
		}
		
		this.roomManagement.reserveRoom(roomNumber);
		this.reservations.add(roomNumber);
	}
}
