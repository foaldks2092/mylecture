package ex.java.input;

public class InputPameter {

	public static void main(String[] args) {
		System.out.println("Length: " + args.length);
		//
		System.out.println( args[0] );
		System.out.println( args[1] );
		System.out.println( args[2] );
		
		System.out.println( args[0] instanceof String);
		System.out.println( args[1] instanceof String);
		System.out.println( args[2] instanceof String);
				
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		int sum = a+b+c;
		int avg = sum / 3;
		System.out.println("sum: "+ sum);
		System.out.println("avg: "+ avg);
		
		
		/*System.out.println( );
		System.out.println( args[1] );
		System.out.println( args[2] ); */
		

	}

}
