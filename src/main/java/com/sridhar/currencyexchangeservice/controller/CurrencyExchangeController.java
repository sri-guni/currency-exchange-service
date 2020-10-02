package com.sridhar.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sridhar.currencyexchangeservice.ExchangeValueRepository;
import com.sridhar.currencyexchangeservice.bean.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private ExchangeValueRepository repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		return repository.findByFromAndTo(from, to);
	}
}
