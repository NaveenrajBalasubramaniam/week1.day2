package week1.day2;

import org.apache.commons.math3.geometry.spherical.twod.Edge;

public class Firefox {
	public static void main(String[] args) {
		float version =100.2f;
		String name="firefox";
		boolean visible=true;
		int year=1998;
		char logo='m'; 
		System.out.println("this is my first script");
		Firefox firefox = new Firefox();
		firefox.edge();
		firefox.chrome();
		
	}

	public void edge() {
		float version = 2.2f;
		String name = "edge";
		System.out.println("Browser name is "+name+" and version is "+version);
		

	}
	public void chrome() {
		float speed = 500.5f;
		System.out.println("Speed  is "+speed);
		

	}

	
}
