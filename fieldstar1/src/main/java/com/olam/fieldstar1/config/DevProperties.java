package com.olam.fieldstar1.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value="dev")
public class DevProperties implements EnvConfig {

	@Override
	public void setup() {
		
		System.out.println(" i am from devproperties");
		
	}

}
