/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.util.Scanner;


public class FloatArraya {    
       
    protected float nireArraya[ ];

    // Eraikitzailea
    protected  FloatArraya( int edukiera ) {
        nireArraya = new float[ edukiera ];
    }
    
    protected void arrayaBistaratu( ) {
        for ( int indizea = 0; indizea < nireArraya.length; indizea++ ) {
            System.out.println( indizea+" elementua = "+nireArraya[ indizea ] );

        }        
                
    }
    
    protected void arrayaBete( ) {
        
        Scanner irakur = new Scanner( System.in );
        for ( int i = 0; i < nireArraya.length; i ++ ) {
            System.out.print( i+". elementua sartu:" );
            nireArraya[ i ] = irakur.nextFloat( );
        }
        irakur.close( );
        
    }

    protected float batezBestekoa( ) {
        float tenpBatuketa = 0;
        
        for ( int i = 0; i < nireArraya.length; i ++ ) {
            tenpBatuketa += nireArraya[ i ];
        }
        
        return ( tenpBatuketa / nireArraya.length );
    }    
 }
        
