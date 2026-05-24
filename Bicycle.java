package rambozambo;

public class Bicycle extends Vehicle{
	private int gear;
	
	public Bicycle(String owner, int gear) {
		super(owner);
		if(gear>=0) {
			if(gear>21) {
				this.gear=21;
			}
			else if(gear<=21 && gear>=1) {
				this.gear=gear;
			}
			else if(gear<1) {
				this.gear=1;
			}
		}
	}
	
	public int getGear() {
		return gear;
	}
	
	@Override
	public void accelerate(int deltaSpeed) {
		int newSpeed=getSpeed()+deltaSpeed;
		
		if(newSpeed>=0) {
			super.accelerate(deltaSpeed);;
		}
		else if(newSpeed<0) {
			super.accelerate(-getSpeed());;
		}
	}
	
	public void shiftGearUp() {
		if(gear+1<=21) {
			gear=gear+1;
		}
		else {
			gear=21;
		}
	}
	
	public void shiftGearDown() {
		if(gear-1>=1) {
			gear=gear-1;
		}
		else {
			gear=1;
		}
	}
}
