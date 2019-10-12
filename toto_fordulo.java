/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palfalvilaszlo_bead;

import java.time.LocalDate;
import java.util.List;
import palfalvilaszlo_bead.PalfalviLaszlo_bead;
import palfalvilaszlo_bead.toto_talalat;
import palfalvilaszlo_bead.toto_eredmeny;
/**
 *
 * @author Rumpelstiltskin
 */
public class toto_fordulo extends PalfalviLaszlo_bead{
    public int ev;
    public int het;
    public int forduloAHeten;
    public LocalDate datum;
    
   /* public List<Talalat> egyTalalat;
    public List<Eredmeny> egyEredmeny;*/

    public void setEv(int ev) {
        this.ev = ev;
    }

    public void setHet(int het) {
        this.het = het;
    }

    public void setForduloAHeten(int forduloAHeten) {
        this.forduloAHeten = forduloAHeten;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public int getEv() {
        return ev;
    }

    public int getHet() {
        return het;
    }

    public int getForduloAHeten() {
        return forduloAHeten;
    }

    public LocalDate getDatum() {
        return datum;
    }
   /* public List<Talalat> getTalalatok() {
        return this.egyTalalat;
    }
    public void setTalalatok(List<Talalat>) {
        
    }
    public List<Eredmeny> getEredmenyek() {
        return this.egyEredmeny;
    }
    public void setEredmenyek(List<Eredmeny>){
        
    }*/
}
