package com.bazaar.marketplace.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.bazaar.accounts.configs.AccountConfig;

@Configuration
@ComponentScan("com.bazaar")
@Import(value= {AccountConfig.class})
public class MarketplaceAppConfig {

}
