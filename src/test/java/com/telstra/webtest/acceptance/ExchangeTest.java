package com.telstra.webtest.acceptance;

import com.telstra.webtest.acceptance.pages.ExchangePage;
import com.telstra.webtest.domain.Currency;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ExchangeTest extends BaseTest {

    @Test
    public void should_exchange_1_AUD_to_6_RMB() {
        ExchangePage exchangePage = pageFactory.toExchangePage();
        exchangePage.exchange(Currency.USD, Currency.RMB, 1.0);

        double toAmount = exchangePage.getToAmount();
        assertThat(toAmount, is(6.0));
    }

    @Test
    public void should_exchange_6_RMB_to_1_AUD() {

    }
}
