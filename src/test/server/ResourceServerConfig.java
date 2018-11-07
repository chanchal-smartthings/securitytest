package com.smartthings.security.server;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @author Joe Grandja
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    private static final String RESOURCE_ID = "messages-resource";

    @Override
    public void configure(ResourceServerSecurityConfigurer security) throws Exception {
        security.resourceId(RESOURCE_ID);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .antMatcher("/messages/**")
                .authorizeRequests()
                .antMatchers("/messages/**").access("#oauth2.hasScope('message.read') or hasRole('CLIENT') or hasRole('MESSAGING_CLIENT')");
        // @formatter:on
    }
}
