package com.nt.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee implements Serializable{

	private int eid;

	private String ename;

	private double salary;
}
