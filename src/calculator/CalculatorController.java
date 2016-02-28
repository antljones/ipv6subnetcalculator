package calculator;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ipv6.Address;

public class CalculatorController {

	private String[] maskEntries;
	private CalculatorView calcView;
	
	public CalculatorController(Container contentPane) {
		this.calcView = new CalculatorView(contentPane,createMaskEntries());
		setCalcListener();
	}
	
	private String[] createMaskEntries() {	
		maskEntries = new String[ 65 ];
		
		for ( int i = 0; i <= 64; i++ ) {
			maskEntries[ i ] = " /" + Integer.toString( i );
		}
		
		return maskEntries;
	}
	
	private void setCalcListener() {
		calcView.getCalcBtn().addActionListener( new ActionListener() {

			public void actionPerformed( ActionEvent event ) {
				if ( Address.isValid(calcView.getAddressField().getText()) ) {
					String[] mask = maskEntries[ calcView.getMaskBox().getSelectedIndex() ].split( "/" );
					long maskVal = Integer.parseInt(mask[1]);
					calcView.getNetworksAmountLabel().setText( "Num /64 networks:" + (Math.pow( 2,64-maskVal ) ) );
				}
			}
		});
	}

}
