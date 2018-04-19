/*Compile this project with commands like:
**javac algorithms/Welzl.java
**javac WelzlTest.java
**Run this test with a command like:
**java WelzlTest
**It should print the smallest circle (x,y,r).
**This test will display (2,2,2.2361).
**If you know of a way to clean up my code or make it run faster please let me know at dustin.morri@gmail.com
**Also, if you use this code let me know.*/
import algorithms.Welzl;
public class WelzlTest {
	public static void main(String args[]){
		double points[][] = {
			{0,1},
			{1,1},
			{2.5,2},
			{3,1.5},
			{3,2},
			{3,4},
			{4,1}
		};
		Welzl w = new Welzl(points);
		System.out.printf("Smallest circle (%.2f,%.2f,%.4f)",w.smallestCircle[0],w.smallestCircle[1],w.smallestCircle[2]);
	}
}