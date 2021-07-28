package com.common.app.dto.rs;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class CredencialesUsuarioRS implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idUsuario;

	private String nombreUsuario;

	private String tipoIdentificacion;

	private String localPort;
	
	private String remotePort;

	private List<Map<String, String>> credenciales;


}
