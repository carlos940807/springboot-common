package com.common.app.dto.rs;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public class CredencialesRS implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idUsuario;

	private String nombreUsuario;

	private String tipoIdentificacion;

	private String username;

	private String password;

}
