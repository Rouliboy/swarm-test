// -----------------------------------------------------------------------------
// Project : Swarm
// -----------------------------------------------------------------------------
package org.jvi.swarm.test.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.jvi.swarm.test.cdi.api.Hello;

/**
 * Rest Resource
 * 
 * @author viennej
 *
 */
@Path("swarm")
public class RESTResource {
	// -------------------- Constantes private --------------------

	/** Hello bean*/
	@Inject
	private Hello m_hello;

	@GET
	@Path("hello/{name}")
	public String test(@PathParam("name") final String p_name) {
		return m_hello.sayHello(p_name);
	}
}