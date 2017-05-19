// -----------------------------------------------------------------------------
// Project : Swarm
// -----------------------------------------------------------------------------
package org.jvi.swarm.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


/**
 * Ressource REST de test
 * 
 * @author utilisateur
 */
@Path("swarm")
public class RessourceREST {
	// -------------------- Constantes private --------------------

	@GET
	@Path("test")
	public String test()
	{
		return "OK";
	}
}