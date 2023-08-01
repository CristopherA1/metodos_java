
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int c= suma(159, 753);
		    System.out.println(c);
		     c= resta(159, 753);
		    System.out.println(c);
		    c= multiplicacion(159, 753);
		    System.out.println(c);
		    c= division(159, 753);
		    System.out.println(c);

			}//Main
			public static int suma(int a, int b) {
				return (a+b);
			}//suma
			public static int resta(int a, int b) {
				return (a-b);
			}//resta
			public static int multiplicacion(int a, int b) {
				return (a*b);
			}//mult
			public static int division(int a, int b) {
				return (a/b);
			}//div
			
	}


