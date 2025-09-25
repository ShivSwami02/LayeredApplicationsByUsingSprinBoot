package com.nt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Table(name = "JPA_JS_TAB")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class JobSeeker {
	@Id
	@Column(length = 100,name = "JS_ID")
	@SequenceGenerator(name = "gen1",sequenceName = "SEQ_GEN1",initialValue = 200,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.AUTO)
	private Integer id;
	
	@NonNull
	@Column(length = 100,name = "JS_NAME")
	private String name;
	@NonNull
	@Column(length = 100,name = "JS_ADD")
	private String add;
	
	@NonNull
	@Column(length = 100,name = "JS_QLFY")
	private String qulyfy;
	
	@NonNull
	@Column(name = "JS_EXPSAL")
	private Float expectedSalary;
}
