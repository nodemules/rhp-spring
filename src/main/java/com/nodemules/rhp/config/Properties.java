package com.nodemules.rhp.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@Configuration
@ConfigurationProperties
public class Properties {

  private static final String INDENT = "  ";
  private static final String NEW_LINE = "\n";

  private String name;
  private int version;

  private final Mongo mongo = new Mongo();

  @Data
  @AllArgsConstructor
  @Component
  public class Mongo {

    private final Connection connection = new Connection();

    @Override
    public String toString() {
      return this.connection.toString();
    }

    @Data
    @Component
    public class Connection {
      private String name;

      private String user;
      private String key;

      private String host;
      private int port;

      public char[] getKey() {
        char[] key = new char[]{};
        if (this.key != null) {
          key = this.key.toCharArray();
        }
        return key;
      }

      @Override
      public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MongoConnection information:").append(NEW_LINE);
        sb.append("name: ").append(this.name).append(NEW_LINE);
        sb.append("user: ").append(this.user).append(NEW_LINE);
        sb.append("key: ").append(this.key).append(NEW_LINE);
        sb.append("host: ").append(this.host).append(NEW_LINE);
        sb.append("port: ").append(this.port).append(NEW_LINE);
        return sb.toString();
      }
    }
  }

}
