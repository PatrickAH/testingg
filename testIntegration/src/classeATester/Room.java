package classeATester;

import java.util.ArrayList;

public class Room {

	private String number;
	private ArrayList<String>amenities;
	
	public Room(String number){
		this.number = number; 
		this.amenities = new ArrayList<String>();
	}
	
	public void addAmenity(String amenity){
		this.amenities.add(amenity);
	}
	
	public ArrayList<String> listAmenities() {
		return new ArrayList<String>(this.amenities);
	}
}
