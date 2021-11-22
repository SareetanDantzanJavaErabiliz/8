/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */

public class AstekoTenp {
    public static void main ( String[ ] parametroak ) {
        
        FloatArraya astekoTenp = new FloatArraya( 7 );
        astekoTenp.arrayaBete( );
        astekoTenp.arrayaBistaratu( );                
        System.out.println( "Aste honetako batez besteko tenperatura: " + astekoTenp.batezBestekoa ( ) );
    
    }
    
}
