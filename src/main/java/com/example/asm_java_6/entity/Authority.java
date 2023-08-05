package com.example.asm_java_6.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Authorities", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "Username", "Roleid" })
})
public class Authority implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "Username")
	private Account account;
	@ManyToOne
	@JoinColumn(name = "Roleid")
	private Role role;
}