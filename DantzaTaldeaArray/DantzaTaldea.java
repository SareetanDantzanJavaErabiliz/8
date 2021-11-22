/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

public class DantzaTaldea {
    
    public static void main ( String [ ] parametroak ) {
    
    	// AmilotxDT arraya sortu
        Dantzari amilotxDT [] = new Dantzari [3];
        //Dantzari amilotxDT [ ] = {new Dantzari ("Maialen",25, "Banako"),new Dantzari ("Udane", 28, "Zuberoko Maskarada"), new Dantzari ("Manex", 18, "Launako")};

     
    	// Dantzari objektuak sortzeko eraikitzailea erabili eta arrayan gorde
        for (int i = 0; i < amilotxDT.length; i++) {
            
            amilotxDT [i] = new Dantzari ();            
        }
     
    	// AmilotxDT arrayaren osagai guztiak bistaratu    
        for (Dantzari dantzariBat : amilotxDT) {
            dantzariBat.dantzariaBistaratu();
        }
        
    }

    
}
    
    

    
