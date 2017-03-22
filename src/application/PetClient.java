package application;

public class PetClient implements Comparable<PetClient>{
	private String ownerName;
	private String petName;
	private int days;
	public PetClient(String owner, String pet, int days) {
		this.ownerName=owner;
		this.petName=pet;
		this.days= days;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getDays() {
		return days;
	}
	
	public void setDays(int days) {
		this.days = days;
	}

	public String toString() {
		return "ownerName=" + ownerName + ", petName=" + petName + ", days=" + days ;
	}
	@Override
	public int compareTo(PetClient o) {
		
		return days-o.getDays();
	}
}
