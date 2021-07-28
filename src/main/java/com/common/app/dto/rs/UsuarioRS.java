package com.common.app.dto.rs;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public class UsuarioRS implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idUsuario;

	private String nombre;

	private String tipoIdentificacion;

	private String localPort;

	private String remotePort;

	public UsuarioRS(final Long idUsuario, final String nombre, final String tipoIdentificacion) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.tipoIdentificacion = tipoIdentificacion;
	}

}
