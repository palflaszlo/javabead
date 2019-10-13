/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palfalvilaszlo_bead;

import java.io.IOException;
import java.io.RandomAccessFile;
import palfalvilaszlo_bead.toto_fordulo;
import palfalvilaszlo_bead.toto_talalat;
import palfalvilaszlo_bead.toto_eredmeny;

/**
 *
 * @author Rumpelstiltskin
 */
public class PalfalviLaszlo_bead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        RandomAccessFile raf;
        String sor;
        String[] adatok = null; // még nem tudjuk hány nevünk lesz

        try
        {
          raf = new RandomAccessFile("toto.csv","rw");

          int db = 0;
          for( sor = raf.readLine(); sor != null; sor = raf.readLine() )
          {
            db++;
          }
          adatok = new String[db];
          raf.seek(0);

          db = 0;
          for( sor = raf.readLine(); sor != null; sor = raf.readLine() )
          {  
            adatok[db] = sor;
            db++;
          }

          raf.close();
          }
          catch( IOException e )
          {
            System.out.println("HIBA");
          }

          // elemek kiírása, stb...
          for( String str : adatok )
          {
            System.out.println(str);
          }
        }
    
}
