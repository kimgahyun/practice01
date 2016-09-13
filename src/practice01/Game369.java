package practice01;
public class Game369 {
	
	public static void main(String[] args) {
	
		int number = 36942;
		String s = String.valueOf( number );
		
		System.out.println( s.length() );
		
		char c = s.charAt( 2 );
		System.out.println( c );
		
		int clapCount = 0;
		if( c == '3' || c == '6' || c == '9' ){
			clapCount++;
		}
	
	}
}
