package edu.kh.poly.ex1.medel.dto;

public class Tesla extends Car { // 전기차를 나타내는 클래스
	
	private int batteryCapacity; // 베터리 용량
	
	public Tesla() {
	}

	
	// 매개변수생성자 + 상속받은것도 포함
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel); // 수퍼생성자(super : 바로 위의 부모를 뜻한다)
		this.batteryCapacity = batteryCapacity;
	}

	
	
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
			// super. : car의 객체를 의미(return engine + " / " + fuel + " / " + wheel;)
	}
	
	
}
