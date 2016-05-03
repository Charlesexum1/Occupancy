public class Occupancy {
		
	private static int total = 0;
	
	private static int getTotal() {
		return total;
		}
	
	private int numberInRoom;
	
	private int getNumber() {
		return numberInRoom;
		}
	
	public Occupancy() {
		numberInRoom = 0;
		}
	
	private void changeOccupancy(int x) {
		if (numberInRoom + x >= 0) {
			numberInRoom += x;
			total += x;
			}
		else {
			System.out.println("Occupancy cannot go below 0.");
			}	
		}	 
	
	
	public static void main (String[] args) {
		
		Occupancy room1 = new Occupancy();
		room1.changeOccupancy(-10);
		room1.changeOccupancy(5);
		System.out.println(getTotal());
		System.out.println(room1.getNumber());
		Occupancy room2 = new Occupancy();
		room2.changeOccupancy(3);
		System.out.println(getTotal());
		
		}
	
	}
