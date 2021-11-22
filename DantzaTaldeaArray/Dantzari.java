/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.util.Scanner;

public class Dantzari {
    
    private String izena;
    private int adina;
    private String gustukoDantza;
    
    // Dantzari klasearen eraikitzailea
    public Dantzari (String izena, int adina, String gustukoDantza){
        this.izena = izena;
        this.adina = adina;
        this.gustukoDantza = gustukoDantza;
    }
    
    public Dantzari ( ) {
        Scanner irakur = new Scanner( System.in );
        System.out.print( " Sartu dantzariaren adina: " );
        adina = irakur.nextInt( );
        irakur.nextLine( ); // honela bufferean gelditzen den \n garbitzen dugu
        System.out.print( " Sartu dantzariaren izena: " );
        izena = irakur.nextLine( );
        System.out.print( " Sartu dantzariaren gustuko dantza: " );
        gustukoDantza = irakur.nextLine( );
        //System.out.print( " Sartu dantzariaren adina : " );
        //adina = irakur.nextInt( );
        System.out.println( "--------------------------------------" );
        irakur.close();
    }
    

    // Dantzaiaren adina zehaztu
    public void setAdina( int urteak ) {
        adina = urteak;
    }    
    // Dantzariaren gustuko dantza
    public void setGustukoDantza( String dantza ) {
        gustukoDantza = dantza;
    }    
    // Dantzarien informazioa bistaratu
    public void dantzariaBistaratu( ) {
        System.out.println( izena+ " dantzariak "+adina+" urte ditu eta " +gustukoDantza+" du gustukoa");
    }    
}


