package day3;

public class DemoShape {
	
	public static void main(String[] args) {
		
		Shape cylinder = new Cylinder();
		
		Cuboid cuboid = new Cuboid();
		
		
		System.out.println(cylinder.calculateVolume(10, 10));
		
		System.out.println(cuboid.calculateVolume(10, 10));
	}

}
