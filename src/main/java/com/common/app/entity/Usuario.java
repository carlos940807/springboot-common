package com.common.app.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "USUARIO")
@Inheritance
@Data
@EqualsAndHashCode(exclude = "credencialesUsuario", callSuper = false)
public class Usuario extends EntidadComun implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NOMBRE")
	private String nombre;

	@JoinColumn(name = "TIPO_IDENTIFICACION_ID", referencedColumnName = "ID")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private TipoIdentificacion tipoIdentificacion;

	@Column(nullable = true)
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<CredencialesUsuario> credencialesUsuario;

	public Usuario(final String nombre, final TipoIdentificacion tipoIdentificacion) {
		this.nombre = nombre;
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public Usuario() {
		super();
	}

}
