package com.inacioalves.web.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inacioalves.web.currencyexchangeservice.bean.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByFromAndTo(String from, String to);
}
