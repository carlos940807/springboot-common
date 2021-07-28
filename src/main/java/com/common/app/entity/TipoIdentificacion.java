package com.common.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "TIPO_IDENTIFICACION")
@Data
@EqualsAndHashCode(callSuper = false)
public class TipoIdentificacion extends EntidadComun implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "CODIGO")
	private String codigo;

	public TipoIdentificacion() {
		super();
	}

}
