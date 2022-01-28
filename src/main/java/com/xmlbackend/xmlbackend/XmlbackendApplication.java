package com.xmlbackend.xmlbackend;

import com.xmlbackend.xmlbackend.connect.DataConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XmlbackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(XmlbackendApplication.class, args);
		DataConnection.getInstance();

	}

}
