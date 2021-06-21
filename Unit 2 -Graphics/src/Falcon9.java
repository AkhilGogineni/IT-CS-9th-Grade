
public class Falcon9 extends rocket {
	//variables
		private double earthMass = 5.98*Math.pow(10, 24);
		private double earthRadius = 6.37*Math.pow(10, 6);
		private double gravitationalConstant = 6.67*Math.pow(10, -11);
		
		private double initialMass = 541300;
		private double burnTime = 162;
		private double fuelConsumption = 398900;
		private double thrust = 6806000;
		
		private double deltaTime = 0;
		private double netForce = 0;
		private double gravity = 9.8;
		private double acceleration = 0;
		private double rateOfMassLoss = 0;
		private double velocity = 0;
		private double initialVelocity = 0;
		private double time = 0;
		private double yFinal = 0;
		private double yInitial = 0;
		private double altitude = 0;
		//gravitationalConstant
		public void setGravitationalConstant(double gravitationalConstant) {
			this.gravitationalConstant = gravitationalConstant;
		}
		public double getGravitationalConstant() {
			return gravitationalConstant;
		}
		//earth Radius
		public void setEarthRadius(double earthRadius) {
			this.earthRadius = earthRadius;
		}
		public double getEarthRadius() {
			return earthRadius;
		}
		//earth mass
		public void setEarthMass(double earthMass) {
			this.earthMass = earthMass;
		}
		public double getEarthMass() {
			return earthMass;
		}
		//netforce
		public void setNetForce(double netForce) {
			this.netForce = netForce;
		}
		public double getNetForce(){
			return netForce;
		}
		//acceleration
		public void setAcceleration(double acceleration) {
			this.acceleration = acceleration;
		}
		public double getAcceleration() {
			return acceleration;
		}
		//mass loss
		public void setRateOfMassLoss(double rateOfMassLoss) {
			this.rateOfMassLoss = rateOfMassLoss;
		}
		public double getRateOfMassLoss() {
			return rateOfMassLoss;
		}
		//final velocity
		public void setVelocity(double velocity) {
			this.velocity = velocity;
		}
		public double getVelocity() {
			return velocity;
		}
		//yFinal
		public void setYFinal(double yFinal) {
			this.yFinal = yFinal;
		}
		public double getYFinal() {
			return yFinal;
		}
		//burnTime
		public void setBurnTime(double burnTime) {
			this.burnTime = burnTime;
		}
		public double getBurnTime() {
			return burnTime;
		}
		//Time
		public void setTime(double time) {
			this.time = time;
		}
		public double getTime() {
			return time;
		}
		//Initial Mass
		public void setInitialMass(double initialMass) {
			this.initialMass = initialMass;
		}
		public double getInitialMass() {
			return initialMass;
		}
		//Thrust
		public void setThrust(double thrust) {
			this.thrust = thrust;
		}
		public double getThrust() {
			return thrust;
		}
		//Gravity
		public void setGravity(double gravity) {
			this.gravity = gravity;
		}
		public double getGravity() {
			return gravity;
		}
		//yInitial
		public void setYInitial(double yInitial) {
			this.yInitial = yInitial;
		}
		public double getYInitial() {
			return yInitial;
		}
		//fuelConsumption
		public void setFuelConsumption(double fuelConsumption) {
			this.fuelConsumption = fuelConsumption;
		}
		public double getFuelConsumption() {
			return fuelConsumption;
		}
		//deltaTime
		public void setDeltaTime(double Time) {
			this.deltaTime = Time;
		}
		public double getDeltaTime() {
			return deltaTime;
		}
		//altitude
		public void setAltitude(double altitude) {
			this.altitude = altitude;
		}
		public double getAltitude() {
			return altitude;
		}
		public Falcon9(int x, int y, int width, int height) {
			super(x, y, width, height);
		}
	
	public void move(double deltaTime) {
			//while(!(this.getTime() == 162)) {
				initialMass -= (fuelConsumption/burnTime)*deltaTime;
				gravity = (long)(gravitationalConstant*(earthMass*initialMass)/Math.pow(earthRadius+altitude, 2));
				netForce = thrust - gravity;
				acceleration = netForce/initialMass;
				velocity += acceleration*deltaTime;
				this.setY((int)(this.getY()-velocity*deltaTime));
				altitude += velocity*deltaTime;
				this.setY((int)((1000 * (1 - this.getAltitude() / 105000))));
			
				this.setDeltaTime(this.getDeltaTime() + deltaTime);
				
				
			//}	
		}
	}
