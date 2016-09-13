package practice01;

public class Game369 {
	public static void main(String[] args) {
		
		for( int i = 1; i <= 99; i++ ) {
			String s = String.valueOf( i );
			
			int count = 0;
			int length = s.length();
			for( int j = 0; j < length; j++ ) {
				char c = s.charAt( j ); 
				if( c == '3' || c == '6' || c == '9' ) {
					count ++;
				}
			}
			
			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " ");
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );
		}
	}
}
