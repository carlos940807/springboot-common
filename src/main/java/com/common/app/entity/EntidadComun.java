package com.common.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@MappedSuperclass
@SuperBuilder
public class EntidadComun implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "FECHA_CREACION")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date fechaCreacion;

	@Column(name = "ESTADO")
	private Boolean estado;

	@Transient
	private String port;

	@PrePersist
	public void prePersist() {
		this.estado = true;
	}

	public EntidadComun() {
		// Default constructor
	}

}
