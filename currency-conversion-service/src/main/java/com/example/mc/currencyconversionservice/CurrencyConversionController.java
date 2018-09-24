package com.example.mc.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean currencyConverter(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		
		
		return new CurrencyConversionBean(1L,from,to,BigDecimal.TEN,quantity,quantity,8100);
	}
}
