package calculator;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Inet6Address;

public class CalculatorController {

	private String[] maskEntries;
	private CalculatorView calcView;
	
	public CalculatorController(Container contentPane) {
		this.calcView = new CalculatorView(contentPane);
		setCalcListener();
	}
	
	private void setCalcListener() {
		calcView.getCalcBtn().addActionListener( new ActionListener() {

			public void actionPerformed( ActionEvent event ) {
			}
		});
	}

}
