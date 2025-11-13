package com.universalrobots.syncNode.impl.program;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ur.urcap.api.contribution.ContributionProvider;
import com.ur.urcap.api.contribution.ViewAPIProvider;
import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeView;

public class SyncNodeProgramNodeView implements SwingProgramNodeView<SyncNodeProgramNodeContribution>{

	private final ViewAPIProvider apiProvider;
	
	public SyncNodeProgramNodeView(ViewAPIProvider apiProvider) {
		this.apiProvider = apiProvider;
	}
	
	@Override
	public void buildUI(JPanel panel, ContributionProvider<SyncNodeProgramNodeContribution> provider) {
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		Box content = Box.createVerticalBox();
		content.add(createTextSection("<html>This node inserts the <b>sync()</b> script command into your program. "
				+ "This will command your program to wait until the beginning of the next real time clock cycle.</html>"));
		content.add(createVerticalSpacing());
		content.add(createTextSection("<html>See the script manual for more information.</html>"));
		
		panel.add(content);
	}

	private Box createTextSection(String textInput) {
		Box section = Box.createHorizontalBox();
		JLabel descriptionLabel = new JLabel(textInput);
		section.add(descriptionLabel);
		return section;
	}
	
	private Component createVerticalSpacing() {
		return Box.createRigidArea(new Dimension(0, 10));
	}
	
}
