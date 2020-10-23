package ee.reneroost.springnaljarakendus.controllers;

import ee.reneroost.springnaljarakendus.services.NaljaTeenus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaljaKontroller {

    private NaljaTeenus naljaTeenus;

    @Autowired
    public NaljaKontroller(NaljaTeenus naljaTeenus) {
        this.naljaTeenus = naljaTeenus;
    }

    @RequestMapping({"/", ""})
    public String naitaNalja(Model mudel) {

        mudel.addAttribute("nali", naljaTeenus.saaNali());

        return "chucknorris";
    }
}
