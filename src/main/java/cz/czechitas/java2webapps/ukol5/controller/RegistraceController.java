package cz.czechitas.java2webapps.ukol5.controller;

import cz.czechitas.java2webapps.ukol5.entity.RegistraceForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Random;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
public class RegistraceController {
  private final Random random = new Random();

  @GetMapping("")
  public ModelAndView formular() {
    ModelAndView modelAndView = new ModelAndView("/formular");
    modelAndView.addObject("form", new RegistraceForm());
    return modelAndView;
  }

  @PostMapping("")
  public Object form(@Valid @ModelAttribute("form") RegistraceForm form, BindingResult bindingResult) {

    if (form.getVek() > 15) {
      return "/spatny-vek";
    }

    if (form.getVek() < 9) {
      return "/spatny-vek";
    }

    if (bindingResult.hasErrors()) {
      return "/formular";
    }

    return new ModelAndView("/odeslano")
            .addObject("jmeno", form.getJmeno())
            .addObject("prijmeni", form.getPrijmeni())
            .addObject("datumNarozeni", form.getFormatovaneDatum())
            .addObject("pohlavi", form.getPohlavi())
            .addObject("turnus", form.getTurnusDate())
            .addObject("email", form.getEmailRodicu())
            .addObject("telefon", form.getTelefonRodicu());
  }
}
