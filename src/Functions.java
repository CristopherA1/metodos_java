import java.util.Scanner;
public class Functions {
	 
		 public static void main( String[] args )
		    {
		        Scanner console = new Scanner( System.in );
		        System.out.println( "Ingresa tu nombre:  " );
		        String name = console.next();
		        printNameLength( name);
		        printNameCharacters( name );
		        System.out.println( "Ingresa tu apellido:  " );
		        String surname = console.next();
		        printNameLength( surname);
		        printNameCharacters( surname );
		        junto(name,surname);
		        
		        console.close();
		    }

		    private static void junto(String name, String surname) {
		    	System.out.println(name+" "+surname);
		    	
			
		}

			private static void printNameLength( String name )
		    {  
		    	System.out.println(name.length());
		    	
		    	
		    }

		    private static void printNameCharacters( String name )
		    {int cantidad = String.valueOf(name).length();
		    	for(int num=0;num<cantidad;num++) {
			    	System.out.println(name.charAt(num));
			    }//For
		    	
		    }//main


}//class
