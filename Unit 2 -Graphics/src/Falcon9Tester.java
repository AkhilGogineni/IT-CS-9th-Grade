// Falcon9Tester.java
// This class is designed to test your Falcon 9 calculations for
// time, mass, net Force, y-acceleration, y-velocity, altitude
// It will also be used to output your data in a format that can be imported to Google sheets for analysis
// Please follow the format carefully!

public class Falcon9Tester {

	public static void main(String[] args) {
	
		// Step 1: 
		// Using your Falcon9 constructor, declare and instantiate a Falcon9 rocket object
		// Using your setter, set deltaTime to 0.5 sec
		
		Falcon9 falcon9 = new Falcon9(50,50, 100, 200);
		falcon9.setDeltaTime(.5);
		
		// Step 2: 
		// Using a while loop, print out your rocket data until time <= burnTime. 
		// Use your getters to access your data.  Don't forget to move your rocket in the loop as well!
		// To make the data usable in google sheets, each time step should be printed on a single line, with the data separated by commas
		// time, mass, net Force, y-Acceleration, y-velocity, altitude
		// For example:
		// 0.5,540068.8271604938,1513325.4938271604,2.8020974692868936,1.4010487346434468,0.7005243673217234
		falcon9.setRateOfMassLoss((falcon9.getFuelConsumption()/falcon9.getBurnTime()));
		
		while(falcon9.getTime() <= falcon9.getBurnTime()) {
			System.out.println(falcon9.getTime()+","+falcon9.getInitialMass()+","+falcon9.getNetForce()+","+falcon9.getAcceleration()+","+falcon9.getVelocity()+","+falcon9.getAltitude());

			falcon9.setTime(falcon9.getTime()+falcon9.getDeltaTime());
			
			falcon9.setInitialMass(falcon9.getInitialMass() - falcon9.getRateOfMassLoss()*falcon9.getDeltaTime());
			
			falcon9.setAcceleration(falcon9.getNetForce()/falcon9.getInitialMass());
			
			falcon9.setAltitude(falcon9.getAltitude()+falcon9.getVelocity()*falcon9.getDeltaTime());
			
			falcon9.setVelocity(falcon9.getVelocity()+falcon9.getDeltaTime()*falcon9.getAcceleration());
			
			falcon9.setGravity((long)(falcon9.getGravitationalConstant()*(falcon9.getEarthMass()*falcon9.getInitialMass())/Math.pow(falcon9.getEarthRadius()+falcon9.getAltitude(), 2)));
			
			falcon9.setNetForce(falcon9.getThrust()-falcon9.getGravity());
			
			falcon9.setYFinal(falcon9.getYFinal()+falcon9.getVelocity()*falcon9.getDeltaTime());
		}




	}

}
