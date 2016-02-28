package calculator;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView {
	
	private JTextField addressField;
	private JComboBox<String> maskBox;
	private JLabel availableNetworksAmountLabel;
	private JButton calcBtn;
	
	public CalculatorView(Container contentPane, String[] maskEntries) {
		JPanel subnetPanel = new JPanel();
		
		Dimension d = new Dimension( 40 , 20 );
		
		subnetPanel = new JPanel( new GridLayout( 0 , 1 ) );
		addressField = new JTextField( 20 );
		maskBox = new JComboBox<String>( maskEntries );
		availableNetworksAmountLabel = new JLabel("Available /64 Networks:");
		calcBtn = new JButton( "Calculate" );
		
		subnetPanel.add( addressField );
		subnetPanel.add( maskBox );
		subnetPanel.add( availableNetworksAmountLabel );
		subnetPanel.add( calcBtn );

		contentPane.add( subnetPanel );
		contentPane.setVisible( true );
	}
	
	public JButton getCalcBtn() {
		return calcBtn;
	}
	
	public JTextField getAddressField() {
		return addressField;
	}
	
	public JLabel getNetworksAmountLabel() {
		return availableNetworksAmountLabel;
	}
	
	public JComboBox<String> getMaskBox() {
		return maskBox;
	}
}