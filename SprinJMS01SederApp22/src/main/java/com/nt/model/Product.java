package com.nt.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable{
	
	private int pno;
	
	private String pname;
	private String add;
	
	private int pqty;
	
	private double price;
	
	
}
