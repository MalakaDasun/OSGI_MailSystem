package com.mtit.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {
	
	ServiceRegistration PublishServiceRegistration;

	
	public void start(BundleContext context) throws Exception {
		System.out.println("publisher start");
		//ServicePublish publisherService = new ServicePublishimpl();
		ServicePublish publisherService = new ServicePublishimpl();
		
		PublishServiceRegistration = context.registerService(ServicePublish.class.getName(), publisherService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("publisher stop");
		PublishServiceRegistration.unregister();
	}

}
