package classeATester;

public interface IRoomManagement {

	public boolean isRoomAvailable(String roomNumber);
	public void reserveRoom(String roomNumber);
	public void getRoom();
}
