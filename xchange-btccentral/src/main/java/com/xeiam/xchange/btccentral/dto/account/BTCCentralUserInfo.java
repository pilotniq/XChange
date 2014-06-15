package com.xeiam.xchange.btccentral.dto.account;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xeiam.xchange.btccentral.dto.BTCCentralBaseResponse;

/**
 * @author Erland Lewin <erland@lewin.nu>
 */

public class BTCCentralUserInfo extends BTCCentralBaseResponse {

	private final String name;
	private final String locale;
	private final BigDecimal balance_btc;
	private final BigDecimal locked_btc;
	private final BigDecimal balance_eur;
	private final BigDecimal locked_eur;

	protected BTCCentralUserInfo( @JsonProperty("name") String name, 
			                      @JsonProperty("locale") String locale, 
			                      @JsonProperty("balance_btc") BigDecimal balance_btc,
		                          @JsonProperty("locked_btc") BigDecimal locked_btc, 
		                          @JsonProperty("balance_eur") BigDecimal balance_eur, 
		                          @JsonProperty("locked_eur") BigDecimal locked_eur,
		                          @JsonProperty("error") String error) {
		super(error);
		
		this.name = name;
		this.locale = locale;
		this.balance_btc = balance_btc;
		this.locked_btc = locked_btc;
		this.balance_eur = balance_eur;
		this.locked_eur = locked_eur;	
	}

	public String getName() { return name; }
	public String getLocale() { return locale; }
	public BigDecimal getBTCBalance() { return balance_btc; }
	public BigDecimal getBTCLocked() { return locked_btc; }
	public BigDecimal getEURBalance() { return balance_eur; }
	public BigDecimal getEURLocked() { return locked_eur; }
}
