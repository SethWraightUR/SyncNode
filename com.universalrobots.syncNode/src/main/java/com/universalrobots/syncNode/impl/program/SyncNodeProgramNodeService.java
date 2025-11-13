package com.universalrobots.syncNode.impl.program;

import java.io.InputStream;
import java.util.Locale;

import com.ur.urcap.api.contribution.ProgramNodeContribution;
import com.ur.urcap.api.contribution.ProgramNodeService;
import com.ur.urcap.api.contribution.ViewAPIProvider;
import com.ur.urcap.api.contribution.program.ContributionConfiguration;
import com.ur.urcap.api.contribution.program.CreationContext;
import com.ur.urcap.api.contribution.program.ProgramAPIProvider;
import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeService;
import com.ur.urcap.api.domain.URCapAPI;
import com.ur.urcap.api.domain.data.DataModel;

public class SyncNodeProgramNodeService implements SwingProgramNodeService<SyncNodeProgramNodeContribution, SyncNodeProgramNodeView>{

	@Override
	public String getId() {
		return "SyncNode";
	}

	@Override
	public void configureContribution(ContributionConfiguration configuration) {
		// TODO Auto-generated method stub
		configuration.setChildrenAllowed(false);
	}

	@Override
	public String getTitle(Locale locale) {
		// TODO Auto-generated method stub
		return "Sync";
	}

	@Override
	public SyncNodeProgramNodeView createView(ViewAPIProvider apiProvider) {
		// TODO Auto-generated method stub
		return new SyncNodeProgramNodeView(apiProvider);
	}

	@Override
	public SyncNodeProgramNodeContribution createNode(ProgramAPIProvider apiProvider, SyncNodeProgramNodeView view,
			DataModel model, CreationContext context) {
		// TODO Auto-generated method stub
		return new SyncNodeProgramNodeContribution(apiProvider, view, model);
	}

}
