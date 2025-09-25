package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="JPA_JS_TAB")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class JobSeeker {
	@Column(name = "JS_ID")
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "SEQ_GEN1",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1" ,strategy =GenerationType.AUTO)
	private Integer id;
	@NonNull
	@Column(length = 50,name="JS_NAME")
	private String name;
	@NonNull
	@Column(length=50,name="JS_ADD")
	private String addrs;
	@NonNull
	@Column(length=50,name="JS_QLFY")
	@Transient
	private String qlfy;
	@NonNull
	@Column(name="JS_EXPSAL")
	private float expectedsalary;

}
