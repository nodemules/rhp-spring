package com.nodemules.rhp.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author brent
 * @since 7/26/17.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.nodemules.rhp.orm"})
@EnableJpaRepositories(basePackages = {"com.nodemules.rhp.repository"})
@EnableTransactionManagement
@EnableJpaAuditing
public class RepositoryConfiguration {
}