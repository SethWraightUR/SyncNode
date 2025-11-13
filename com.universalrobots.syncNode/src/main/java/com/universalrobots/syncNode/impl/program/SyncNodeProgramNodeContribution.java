package com.universalrobots.syncNode.impl.program;


import com.ur.urcap.api.contribution.ProgramNodeContribution;
import com.ur.urcap.api.contribution.program.ProgramAPIProvider;
import com.ur.urcap.api.domain.ProgramAPI;
import com.ur.urcap.api.domain.data.DataModel;
import com.ur.urcap.api.domain.script.ScriptWriter;

public class SyncNodeProgramNodeContribution implements ProgramNodeContribution{
	

	private final DataModel model;
	private final ProgramAPIProvider apiProvider;
	private SyncNodeProgramNodeView view;


	public SyncNodeProgramNodeContribution(ProgramAPIProvider apiProvider, SyncNodeProgramNodeView view, DataModel model) {
		this.apiProvider = apiProvider;
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void openView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Sync";
	}

	@Override
	public boolean isDefined() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void generateScript(ScriptWriter writer) {	
		writer.sync();
	}

}
