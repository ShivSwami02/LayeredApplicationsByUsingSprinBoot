package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix ="org.nit")
@Data
@Component("employee")
public class EmployeeData {
	
	private Integer eid;
	
	private String ename;
	private String eadd;
	private String contact;
	private String desg;

}
