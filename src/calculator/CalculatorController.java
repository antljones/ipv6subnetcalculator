package calculator;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Inet6Address;

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
			maskEntries[ i ] = " /" + Integer.toString( 64 + i );
		}
		
		return maskEntries;
	}
	
	private void setCalcListener() {
		calcView.getCalcBtn().addActionListener( new ActionListener() {

			public void actionPerformed( ActionEvent event ) {
			}
		});
	}

}
