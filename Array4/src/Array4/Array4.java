package Array4;

import java.util.Scanner;

public class Array4 {
	public static void main( String [ ] args )
    {
        int SIZE = 5;
        Comparable [ ] a = new Integer [ SIZE ];
        for( int i = 0; i < SIZE; i++ )
            a[ i ] = new Integer( i * 2 );

        for( int i = 0; i < SIZE * 2; i++ )
            System.out.println( "Encontrado " + i + " em " +
                                 binarySearch( a, new Integer( i ) ) );

    }

	private static final int NOT_FOUND = -1;

	public static int binarySearch( Comparable [ ] a, Comparable x )
    {
        int low = 0;
        int high = a.length - 1;
        int mid = 0;

        while( low <= high )
        {
            mid = ( low + high ) / 2;

            if( a[ mid ].compareTo( x ) < 0 )
                low = mid + 1;
            else if( a[ mid ].compareTo( x ) > 0 )
                high = mid - 1;
            else
                return mid;
        }
        return NOT_FOUND;

    }
	
	
}
