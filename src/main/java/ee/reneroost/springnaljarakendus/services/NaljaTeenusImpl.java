package ee.reneroost.springnaljarakendus.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class NaljaTeenusImpl implements NaljaTeenus {

    private final ChuckNorrisQuotes chuckNorrisTsitaadid;

    public NaljaTeenusImpl() {
        this.chuckNorrisTsitaadid = new ChuckNorrisQuotes();
    }

    @Override
    public String saaNali() {
        return chuckNorrisTsitaadid.getRandomQuote();
    }

}
