package oslomet.web.kundereg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class KundeController {

    List<Kunde> kunder = new ArrayList<>();

    @GetMapping("hentkunder")
    public List<Kunde> alleKunder(){
        return kunder;
    }
    @GetMapping("hentBiler")
    public List<Bil> hentBiler(){
        List<Bil> listBiler = new ArrayList<>();
        listBiler.add(new Bil("Audi", "A4"));
        listBiler.add(new Bil("Audi", "A8"));
        listBiler.add(new Bil("Volvo", "T8"));
        return listBiler;
    }
    @PostMapping("lagreKunde")
    public void leggTilKunde(Kunde innKunde){
        kunder.add(innKunde);
    }

    @GetMapping("slettAlleKunder")
    public void slettAlleKunder(){
        kunder.clear();
    }

    @Autowired
    private KundeRepository rep;

    @PostMapping("/lagre")
    public void regKunde(Kunde innKunde){
        rep.regKunde(innKunde);
    }

    @GetMapping("/hent")
    public List<Kunde> hentAlle(){
        return rep.hentAlleKunder();
    }

    @GetMapping("/slett")
    public void slettKunde(Kunde innKunde){
        rep.slettAlleKunder();
    }
}
