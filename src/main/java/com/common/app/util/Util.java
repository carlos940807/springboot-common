package com.common.app.util;

import java.util.HashMap;
import java.util.Map;

import com.common.app.dto.rs.CredencialesRS;

public final class Util {

	// DTO PACKAGE CONSTANTS
	public static final String DTO_PACKAGE = "new com.common.app.dto.rs.";

	// CONSTANT FOR ENTITY PACKAGE
	public static final String ENTITY_PACKAGE = "com.common.app.entity.";

	// EntityManager CONSTANTS
	public static final String LOAD_GRAPH = "javax.persistence.loadgraph";

	// MESSAGES CONSTANTS
	public static final String NO_RESULTS_FOUND = "No se encontraron resultados";
	public static final String SAVE_ERROR = "Ha ocurrido un error al guardar el ";
	public static final String UPDATE_ERROR = "Ha ocurrido un error al actualizar el ";
	public static final String UPDATE_SUCCESS = "Se actualizó el registro correctamente";
	public static final String DELETE_SUCCESS = "Se eliminó el registro correctamente";

	public static final String NO_CREDENCIAL_FOUND = "No se encontró la credencial con el usuario ";

	// MAGIC NUMBERS CONSTANTS
	public static final int ZERO = 0;
	public static final int ONE = 1;

	// PORT INFORMATION
	public static final String SERVER_PORT = "local.server.port";

	public static Map<String, String> createCredenciales(final CredencialesRS foo) {
		final Map<String, String> setCredenciales = new HashMap<>();
		setCredenciales.put("username", foo.getUsername());
		setCredenciales.put("pasword", foo.getPassword());
		return setCredenciales;
	}
}
