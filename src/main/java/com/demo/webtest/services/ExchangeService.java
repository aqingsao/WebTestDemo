package com.demo.webtest.services;

import com.demo.webtest.domain.Currency;
import com.demo.webtest.utils.MathUtils;
import org.springframework.stereotype.Service;

@Service
public class ExchangeService {
    public double exchange(Currency from, Currency to, double fromAmount) {
        return MathUtils.round(fromAmount * from.getRate(to));
    }

}
