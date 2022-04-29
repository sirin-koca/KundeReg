package oslomet.web.kundereg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class KundeController {

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
