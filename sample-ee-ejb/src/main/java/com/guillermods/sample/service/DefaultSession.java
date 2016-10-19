package com.guillermods.sample.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Esta clase solo fue hecha para que el proyecto pueda ser desplegado sin
 * mayor problemas en un was.
 * 
 * @author gdiazs
 * @since 1.0
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
public class DefaultSession {

	/**
	 * Default constructor.
	 */
	public DefaultSession() {

	}

}
