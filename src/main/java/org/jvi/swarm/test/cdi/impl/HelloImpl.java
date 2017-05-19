// -----------------------------------------------------------------------------
// Project : Swarm
// -----------------------------------------------------------------------------

package org.jvi.swarm.test.cdi.impl;

import javax.enterprise.context.RequestScoped;

import org.jvi.swarm.test.cdi.api.Hello;

@RequestScoped
public class HelloImpl implements Hello{

	/**
	 */
	@Override
	public String sayHello(final String p_name) {
		return "Hello " + p_name;
	}

}
