package com.nodemules.rhp;

import com.nodemules.rhp.config.Properties;
import com.nodemules.rhp.util.PrintUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.sql.*;

@SpringBootApplication
public class Application {

  private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	@Autowired
	private Properties properties;

	public static void main(String[] args) {
	  
	  LOG.info("Starting application...");

		SpringApplication.run(Application.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
      printServerReady();
    };
	}

	private static void testDBConnection() throws SQLException {
	  LOG.info("Testing DB Connection");
    String url = "jdbc:mariadb://localhost:3306/runningheartsapp?useUnicode=true&characterEncoding=utf8";
    String user = "rhp-dev";
    String password = "g43hW9f23o4bXG";
    Connection connection = DriverManager.getConnection(url , user  , password);
    System.out.println(connection);
    Statement stat = connection.createStatement();
    ResultSet rs = stat.executeQuery("select version()");
    rs.next();
    System.out.println(rs.getString(1));
    connection.close();
  }

	private void printServerReady() {
    final String line = "==============================================";
    int bufferWidth = 3;
    int bufferLines = 2;

    StringBuilder sb = new StringBuilder();
    PrintUtil.bufferLines(sb, line, bufferWidth, bufferLines);
    PrintUtil.bufferWidth(sb, line, "================ SERVER READY ================", bufferWidth);
    PrintUtil.bufferLines(sb, line, bufferWidth, bufferLines);

    System.out.println(sb.toString());
  }

}
