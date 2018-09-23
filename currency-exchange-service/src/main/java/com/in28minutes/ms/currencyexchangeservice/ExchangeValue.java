package com.in28minutes.ms.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
    @Id
	private Long id ;
	//private String name;
    @Column(name="currency_from")
	private String from ;
    @Column(name="currency_to")
    private String to;
	private BigDecimal conversion;
	private int port;
	
	public ExchangeValue(){}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversion) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion = conversion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversion() {
		return conversion;
	}
	public void setConversion(BigDecimal conversion) {
		this.conversion = conversion;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
}
