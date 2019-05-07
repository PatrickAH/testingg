package classeATester;

import java.util.ArrayList;

public class RoomManagementStub implements IRoomManagement{

	ArrayList reservedRooms = new ArrayList<>();
	
	@Override
	public boolean isRoomAvailable(String roomNumber) {
		// TODO Auto-generated method stub
		if (reservedRooms.contains(roomNumber)) {
			return false;
		}
		else {
			return true;
		}
	
	}

	@Override
	public void reserveRoom(String roomNumber) {
		// TODO Auto-generated method stub
		reservedRooms.add(roomNumber);
	}

	@Override
	public void getRoom() {
		// TODO Auto-generated method stub
		
		
	}

}
