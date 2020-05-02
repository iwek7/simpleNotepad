/**
 *
 *  @author Daszkiewicz Jakub PD3130
 *
 */

package zad2.copy;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
			new RandomColors();	
				
			}
		}); 
}
}
