package assignment;

public class ShapeTransform implements Drawable,Resizable{

//	Create two interfaces, Drawable and Resizable,
// each with a single method. Implement both interfaces 
// in a class called ShapeTransformer and provide implementations 
//	for the methods.

	@Override
	public void method2() {
		System.out.println("Resizable Interface method");
		
	}

	@Override
	public void method1() {
		System.out.println("Drawable Interface method");
		
	}
	public static void main(String [] args) {
		System.out.println("Methods called");
		ShapeTransform st = new ShapeTransform();
		st.method1();
		st.method2();
	}

}
