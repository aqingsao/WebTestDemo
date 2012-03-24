package com.telstra.webtest.controller;

import com.telstra.webtest.domain.Currency;
import com.telstra.webtest.form.ExchangeForm;
import com.telstra.webtest.form.ExchangeFormBuilder;
import com.telstra.webtest.services.ExchangeService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exchange")
public class ExchangeController {

    private ExchangeService exchangeService;

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("exchange/index");
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView exchange(@ModelAttribute("exchange") ExchangeForm exchangeForm, BindingResult result) {
        System.out.println("form: " + exchangeForm);
        if (result.hasErrors()) {
            throw new RuntimeException("Binding result error " + result.getAllErrors());
        }
        exchangeForm.setToAmount(1000.0);
        return new ModelAndView("exchange/index");
    }

    @ModelAttribute("exchange")
    public ExchangeForm setUpForm(ExchangeForm exchangeForm) {
        if (exchangeForm == null) {
            return new ExchangeFormBuilder().build();
        }
        return exchangeForm;
    }

    @ModelAttribute("currencies")
    public Currency[] setUpCurrencies() {
        return Currency.values();
    }
}