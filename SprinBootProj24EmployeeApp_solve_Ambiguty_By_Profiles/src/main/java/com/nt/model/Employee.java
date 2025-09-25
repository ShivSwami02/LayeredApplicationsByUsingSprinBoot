package com.nt.model;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	
	private Integer eid;
	@lombok.NonNull
	private String ename;
	@lombok.NonNull
	private String desg;
	@lombok.NonNull
	private double salary;
	private double grossSalary;
	private double netSalary;

}
