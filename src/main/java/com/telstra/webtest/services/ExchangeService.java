package com.telstra.webtest.services;

import com.telstra.webtest.domain.Currency;
import com.telstra.webtest.utils.MathUtils;
import org.springframework.stereotype.Service;

@Service
public class ExchangeService {
    public double exchange(Currency from, Currency to, double fromAmount) {
        return MathUtils.round(fromAmount * from.getRate(to));
    }

}
