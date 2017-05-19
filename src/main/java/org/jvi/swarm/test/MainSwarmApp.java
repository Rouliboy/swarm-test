// -----------------------------------------------------------------------------
// Project : Swarm
// -----------------------------------------------------------------------------

package org.jvi.swarm.test;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jvi.swarm.test.cdi.api.Hello;
import org.jvi.swarm.test.cdi.impl.HelloImpl;
import org.jvi.swarm.test.rest.ApplicationConfig;
import org.jvi.swarm.test.rest.RESTResource;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

/**
 * Main class
 * 
 * @author viennej
 */
public class MainSwarmApp {

	public static void main(String[] args) throws Exception {
		// Instantiate the container
		Swarm swarm = new Swarm();

		// Create one or more deployments
		JAXRSArchive jaxrsDeployment = ShrinkWrap.create(JAXRSArchive.class);

		jaxrsDeployment.addPackages(true, MainSwarmApp.class.getPackage());

		// Add resource to deployment
		jaxrsDeployment.addResource(RESTResource.class);

		// Add classes (can't add a package???)
		jaxrsDeployment.addClass(Hello.class);
		jaxrsDeployment.addClass(HelloImpl.class);
		jaxrsDeployment.addClass(ApplicationConfig.class);

		jaxrsDeployment.addAllDependencies();

		swarm.start();
		swarm.deploy(jaxrsDeployment);
	}

}
