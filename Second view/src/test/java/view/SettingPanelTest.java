package view;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import junit.framework.TestCase;

public class SettingPanelTest extends TestCase {

	SettingPanel pn;
	GameDialog gm;
	
	protected void setUp() throws Exception {
		super.setUp();
		this.pn = new SettingPanel();
		this.gm = new GameDialog(pn);
	}

	public void testBuildContentPanelGameDialog() {

		assertTrue( this.pn.buildContentPanel(gm) instanceof JPanel);
	}

	public void testBuildContentPanelBoolean() {
		
		assertTrue( this.pn.buildContentPanel(true) instanceof JPanel);
	}

	public void testGetList() {
		assertTrue( this.pn.getList() instanceof JComboBox);
	}

}
