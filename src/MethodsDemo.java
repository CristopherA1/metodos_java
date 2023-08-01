
public class MethodsDemo {

	public static void main(String[] args) {
    int c= suma(159, 753);
    System.out.println(c);
     c= suma(159, 753, 468);
    System.out.println(c);

	}//Main
	public static int suma(int a, int b) {
		return (a+b);
	}//suma
	public static int suma(int a, int b,int c) {
		return (a+b+c);
	}//suma3
}//MethodsDemo
