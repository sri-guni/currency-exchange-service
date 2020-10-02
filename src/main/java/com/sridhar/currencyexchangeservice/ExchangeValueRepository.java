package com.sridhar.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sridhar.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	public ExchangeValue findByFromAndTo(String from, String to);

}
