//Ceo work pokrece dugme!!!
package send;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class work {

	
	public static void main() {

		
		try {
			String root = "";
			//deodeljujemo vrednosti i brisemo razmake ako se pojave...
			root = gui.txtRoot.getText().replaceAll("\\s+","");
			String choice = gui.comboChoice.getSelectedItem().toString();
			Boolean ExpireOld = gui.chckbxExpireOld.isSelected();
			Boolean SaveTxt = gui.chckbxSaveTxt.isSelected();
			
			int DaysActive = Integer.parseInt(gui.textDaysActive.getText().replaceAll("\\s+",""));
			int Min = Integer.parseInt(gui.textMin.getText().replaceAll("\\s+",""));
			int Max = Integer.parseInt(gui.textMax.getText().replaceAll("\\s+",""));
			double Percent = Double.parseDouble(gui.textPercent.getText().replaceAll(",",".").replaceAll("\\s+",""));

			constructQuery.main(root,choice,DaysActive,ExpireOld,SaveTxt,Min,Max,Percent);

			} 
		catch (FileNotFoundException e) {					
			e.printStackTrace();
			}
		
		catch (NumberFormatException e) {					
			System.out.println( "Greska" );
			JOptionPane.showMessageDialog(null, "Proverite da li ste ispravno uneli parametre!\nDays active - ceo broj\nMinimum - ceo broj\nMaximum - ceo broj\nCommision - 2 decimale", "Greska:" , JOptionPane.WARNING_MESSAGE);
			}

		
		
	}

}
