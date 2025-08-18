package com.nt.model;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private int sid;
	
	private String sname;
	
	private String sbranch;
	
	private double persentage;
	
	
	private double sub1;
	
	private double sub2;
	
	private double sub3;
	
	private double sub4;
	
	private double sub5;
}
