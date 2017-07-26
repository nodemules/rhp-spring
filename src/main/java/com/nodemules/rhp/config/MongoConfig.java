package com.nodemules.rhp.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.modelmapper.internal.util.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Component
@Configuration
@EnableMongoRepositories(basePackages = "com.nodemules.rhp.repository")
public class MongoConfig extends AbstractMongoConfiguration {

  private static final Logger LOG = LoggerFactory.getLogger(MongoConfig.class);

  @Autowired
  private Properties properties;

  @Override
  protected String getDatabaseName() {
    return this.properties.getMongo().getConnection().getName();
  }

  private Properties.Mongo.Connection getConnection() {
    Assert.notNull(properties, "Could not retrieve Application Properties");

    Properties.Mongo.Connection conn = properties.getMongo().getConnection();
    Assert.notNull(conn, "Could not retrieve Mongo Connection information from Application Properties");
    System.out.println(conn.toString());

    return conn;
  }

  @Override
  public Mongo mongo() throws Exception {
    LOG.info("Initializing Mongo Instance");
    Properties.Mongo.Connection connection = this.getConnection();
    List<MongoCredential> credentials = new ArrayList<>();
    MongoCredential cred = MongoCredential.createCredential(connection.getUser(), connection.getName(), connection.getKey());
    credentials.add(cred);
    ServerAddress serverAddress = new ServerAddress(connection.getHost(), connection.getPort());
    return new MongoClient(serverAddress, credentials);
  }
}
