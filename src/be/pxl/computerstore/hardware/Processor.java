package be.pxl.computerstore.hardware;

import be.pxl.computerstore.hardware.builder.ProcessorBuilder;

public class Processor extends BasicComponent {

	private double clock_speed;
	
	
	public Processor(String vendor, String name, double price, double clockspeed) {
		super(vendor,name,price);
		setClockspeed(clockspeed);
	}

	public double getClockspeed() {
		return clock_speed;
	}

	public void setClockspeed(double clockspeed) {
		if(clockspeed < 0.7) {
			this.clock_speed = 0.7;
		}else {
			this.clock_speed = clockspeed;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\\nClock speed = " + clock_speed + "GHz";
	}
	
	
	
	
	
}
