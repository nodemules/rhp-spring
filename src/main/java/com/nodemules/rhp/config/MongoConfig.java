package com.nodemules.rhp.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
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

  @Autowired
  private Properties properties;

  @Override
  protected String getDatabaseName() {
    return this.properties.getMongo().getConnection().getName();
  }

  @Override
  public Mongo mongo() throws Exception {
    Properties.Mongo.Connection connection = properties.getMongo().getConnection();
    System.out.println(connection.toString());
    List<MongoCredential> credentials = new ArrayList<>();
    MongoCredential cred = MongoCredential.createCredential(connection.getUser(), connection.getName(), connection.getKey());
    credentials.add(cred);
    ServerAddress serverAddress = new ServerAddress(connection.getHost(), connection.getPort());
    return new MongoClient(serverAddress, credentials);
  }
}
