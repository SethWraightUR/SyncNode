package com.universalrobots.syncNode.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.universalrobots.syncNode.impl.program.SyncNodeProgramNodeService;
import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeService;

/**
 * Hello world activator for the OSGi bundle URCAPS contribution
 *
 */
public class Activator implements BundleActivator {
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		bundleContext.registerService(SwingProgramNodeService.class, new SyncNodeProgramNodeService(), null);
		System.out.println("Sync Node URCap registering");
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		
	}
}

