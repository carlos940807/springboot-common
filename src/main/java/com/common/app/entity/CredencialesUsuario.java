package com.common.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "CREDENCIALES_USUARIO")
@Inheritance
@Data
@EqualsAndHashCode(callSuper = false)
public class CredencialesUsuario extends EntidadComun implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@JoinColumn(name = "USUARIO_ID", referencedColumnName = "ID")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JsonIgnore
	private Usuario usuario;

	public CredencialesUsuario() {
		super();
	}
}
