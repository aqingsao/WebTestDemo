package com.telstra.webtest.services;

import com.telstra.webtest.domain.Currency;
import org.springframework.stereotype.Service;

@Service
public class ExchangeService {
    public double exchange(Currency from, Currency to, double fromAmount) {
        return from.getRate() * fromAmount / to.getRate();
    }
}
