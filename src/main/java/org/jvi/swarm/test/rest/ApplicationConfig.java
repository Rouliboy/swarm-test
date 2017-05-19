// -----------------------------------------------------------------------------
// Project : Swarm
// -----------------------------------------------------------------------------

package org.jvi.swarm.test.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * JAX-RS resources activation.
 * 
 * @author viennej
 */
@ApplicationPath("rs")
public class ApplicationConfig extends Application {

	/**
	 * {@inheritDoc}
	 * 
	 * @see javax.ws.rs.core.Application#getClasses()
	 */
	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(RESTResource.class);
		return classes;
	}

}
