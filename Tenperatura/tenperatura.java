/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.util.Scanner;

public class tenperatura {
    
    public static void main ( String[ ] parametroak) {
    
        int eguna;
        float ten_batuketa = 0;
        float batezbestekoTenperatura = 0;
        
        // tenperaturak gordetzeko arrayaren deklarazioa eta sorrera
        float astekoTenp[ ] = new float[ 7 ];
        
        Scanner irakur = new Scanner( System.in );
        
        for ( eguna = 0; eguna < astekoTenp.length; eguna ++ ) {
            System.out.print( eguna+". eguneko tenperatura sartu:" );
            astekoTenp[ eguna ] = irakur.nextFloat( );
           
	}

	for ( eguna = 0; eguna < astekoTenp.length; eguna ++ ) {
		ten_batuketa += astekoTenp [ eguna ];
	}
	batezbestekoTenperatura = ten_batuketa / astekoTenp.length;

        System.out.println( "Batez besteko tenperatura: " + batezbestekoTenperatura );
	
        // Scannerra itxi
        irakur.close();
    
    }
    
}
    

