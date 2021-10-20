
package karakterekateak1;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class KaraktereKateak1 {
 
   public static void main( String parametroak[ ] ) {
       
       char [] Karak = {'O','n','g','i',' ','e','t','o','r','r','i'};
       
       System.out.println( Karak );
       String Karak1 = new String( Karak );
       System.out.println( Karak1 );
       
       //Karaktere kateak batzeko modu bat
       Karak1 = Karak1.concat( " karaktere kateekin" );
       Karak1 = Karak1.concat( " jolastera " );
       System.out.println( Karak1 );

       //Karaktere kateak batzeko beste modu bat
       String Karak2 = "Hau";
       Karak2 = Karak2.concat( " karaktere").concat( " katea" ).concat( " da" );
       System.out.println( Karak2 );
       
       //Beste modu bat
       Karak1 = Karak1.concat( Karak2 );
       System.out.println( Karak1 );
   }
}


