package org.whb.test.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ConfigurationProperties (prefix="whb.database")
public class Student {
	
	private String druid;
	
	
	

	public String getDruid() {
		return druid;
	}

	public void setDruid(String druid) {
		this.druid = druid;
	}

}
