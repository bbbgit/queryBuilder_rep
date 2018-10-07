package send;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class gui {

	private JFrame frmUserNameCreator;
	public static JTextField txtRoot;
	public static JComboBox<String> comboChoice = new JComboBox<String>();
	public static JTextField textDaysActive;
	public static JTextField textMin;
	public static JTextField textMax;
	public static JTextField textPercent;
	public static JCheckBox chckbxExpireOld = new JCheckBox("Declare old conditions expired");
	public static JCheckBox chckbxSaveTxt  = new JCheckBox("Save txt");
	public static JTextArea textResult = new JTextArea();
	
	//Git proba
	int test = 0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frmUserNameCreator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
					
		frmUserNameCreator = new JFrame();
		frmUserNameCreator.setTitle("Derogacije query");
		frmUserNameCreator.setResizable(false);
		frmUserNameCreator.setBounds(350, 200, 980, 500);
		frmUserNameCreator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUserNameCreator.getContentPane().setLayout(null);
		//frmUserNameCreator.getContentPane().setBackground(Color.WHITE);

    		
		txtRoot = new JTextField();
		txtRoot.setFont(new Font("Calibri", Font.BOLD, 24));
		txtRoot.setHorizontalAlignment(SwingConstants.CENTER);
		txtRoot.setText("");
		txtRoot.setBounds(497, 28, 136, 30);
		frmUserNameCreator.getContentPane().add(txtRoot);
		txtRoot.setColumns(8);
		txtRoot.selectAll();
		
		JLabel labelRoot = new JLabel("Root:");
		labelRoot.setBounds(417, 36, 70, 15);
		frmUserNameCreator.getContentPane().add(labelRoot);
		
		
		chckbxExpireOld.setBounds(640, 400, 202, 23);
		frmUserNameCreator.getContentPane().add(chckbxExpireOld);
			
		
		
		//Ovo nam ne treba jer imamo scroll!!
		//textResult.setBounds(36, 170, 421, 137);
		//textResult.setLineWrap(true);
		
		//Ovo imamo da user ne moze da kopira sam text, vec da koristi dugme ili txt fajl
		textResult.setEditable(false);
		textResult.setEnabled(false);
		textResult.setDisabledTextColor(Color.BLACK);

		//Pravimo scrollPane
		JScrollPane scroll = new JScrollPane(textResult);
		//Ovo je bitno jer se inace ne vidi
		scroll.setBounds(36, 170, 900, 210);
		//Ovde palimo horizontalni i vertikalni scroll po potrebi
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		//Na kraju ubacujemo ga u JFrame koji se zove frmUserNameCreator
		frmUserNameCreator.getContentPane().add(scroll);
		
		
		
		textDaysActive = new JTextField();
		textDaysActive.setText("365");
		textDaysActive.setHorizontalAlignment(SwingConstants.CENTER);
		textDaysActive.setFont(new Font("Calibri", Font.BOLD, 24));
		textDaysActive.setColumns(8);
		textDaysActive.setBounds(497, 69, 136, 30);
		textDaysActive.setVisible(false);
		frmUserNameCreator.getContentPane().add(textDaysActive);
		
		final JLabel labelDaysActive = new JLabel("Days active:");
		labelDaysActive.setBounds(417, 76, 70, 15);
		labelDaysActive.setVisible(false);
		frmUserNameCreator.getContentPane().add(labelDaysActive);
				
		textMin = new JTextField();
		textMin.setText("0");
		textMin.setHorizontalAlignment(SwingConstants.CENTER);
		textMin.setFont(new Font("Calibri", Font.BOLD, 24));
		textMin.setColumns(8);
		textMin.setBounds(800, 28, 136, 30);
		textMin.setVisible(false);
		//Tooltip
		textMin.setToolTipText("Minimum u rsd");
		frmUserNameCreator.getContentPane().add(textMin);
		
		final JLabel labelMin = new JLabel("Minimum:");
		labelMin.setBounds(720, 36, 68, 15);
		labelMin.setVisible(false);
		frmUserNameCreator.getContentPane().add(labelMin);
		
		textMax = new JTextField();
		textMax.setText("0");
		textMax.setHorizontalAlignment(SwingConstants.CENTER);
		textMax.setFont(new Font("Calibri", Font.BOLD, 24));
		textMax.setColumns(8);
		textMax.setBounds(800, 69, 136, 30);
		textMax.setVisible(false);
		//Tooltip
		textMax.setToolTipText("Maksimum u rsd");
		frmUserNameCreator.getContentPane().add(textMax);
		
		final JLabel labelMax = new JLabel("Maximum:");
		labelMax.setBounds(720, 76, 68, 15);
		labelMax.setVisible(false);
		frmUserNameCreator.getContentPane().add(labelMax);
		
		
		textPercent = new JTextField();
		textPercent.setText("0");
		textPercent.setHorizontalAlignment(SwingConstants.CENTER);
		textPercent.setFont(new Font("Calibri", Font.BOLD, 24));
		textPercent.setColumns(8);
		textPercent.setBounds(800, 110, 136, 30);
		textPercent.setVisible(false);
		//Tooltip
		textPercent.setToolTipText("Provizija u procentima sa 2 decimale");
		frmUserNameCreator.getContentPane().add(textPercent);
		
		final JLabel labelPercent = new JLabel("Commision:");
		labelPercent.setBounds(720, 116, 68, 15);
		labelPercent.setVisible(false);
		frmUserNameCreator.getContentPane().add(labelPercent);
				
		
		//JCheckBox chckbxSaveTxt = new JCheckBox("Save txt");
		chckbxSaveTxt.setBounds(640, 426, 202, 23);
		//Tooltip
		chckbxSaveTxt.setToolTipText("c:\\derogacije_bb");
		frmUserNameCreator.getContentPane().add(chckbxSaveTxt);
		
		comboChoice.setModel(new DefaultComboBoxModel<String>(new String[] {"Skroz oslobodjeni bez datuma trajanja", "Skroz oslobodjeni sa datumom trajanja", "Nova tarifa bez datuma trajanja", "Nova tarifa sa datumom trajanja"}));
		comboChoice.setBounds(36, 33, 249, 30);
		frmUserNameCreator.getContentPane().add(comboChoice);
	    comboChoice.setSelectedIndex(0);
	    
	    
	    
	    comboChoice.addActionListener(new ActionListener() {
	    	 
	        @Override
	        public void actionPerformed(ActionEvent event) {
	            JComboBox<String> combo = (JComboBox<String>) event.getSource();
	            String selectedChoice = (String) combo.getSelectedItem();
	     
	            if (selectedChoice.equals("Skroz oslobodjeni bez datuma trajanja")) {
	            	textDaysActive.setVisible(false);
	            	textMin.setVisible(false);
	            	textMax.setVisible(false);
	            	textPercent.setVisible(false);
	            	labelPercent.setVisible(false);
	            	labelMin.setVisible(false);
	            	labelMax.setVisible(false);  
	            	labelDaysActive.setVisible(false);
	            	} 
	            else if (selectedChoice.equals("Skroz oslobodjeni sa datumom trajanja")) {
	            	textDaysActive.setVisible(true);
	            	textMin.setVisible(false);
	            	textMax.setVisible(false);
	            	textPercent.setVisible(false);
	            	labelPercent.setVisible(false);
	            	labelMin.setVisible(false);
	            	labelMax.setVisible(false);
	            	labelDaysActive.setVisible(true);
	            	}
	            else if (selectedChoice.equals("Nova tarifa bez datuma trajanja")) {
	            	textDaysActive.setVisible(false);
	            	textMin.setVisible(true);
	            	textMax.setVisible(true);
	            	textPercent.setVisible(true);
	            	labelPercent.setVisible(true);
	            	labelMin.setVisible(true);
	            	labelMax.setVisible(true);
	            	labelDaysActive.setVisible(false);
	            	}
	            else if (selectedChoice.equals("Nova tarifa sa datumom trajanja")) {
	            	textDaysActive.setVisible(true);
	            	textMin.setVisible(true);
	            	textMax.setVisible(true);
	            	textPercent.setVisible(true);
	            	labelPercent.setVisible(true);
	            	labelMin.setVisible(true);
	            	labelMax.setVisible(true);
	            	labelDaysActive.setVisible(true);
	            	}
	        }
	    });
	    
		
		
		
		
		JButton btnMakeQuery = new JButton("Make query");
		btnMakeQuery.setBounds(433, 400, 114, 23);
		btnMakeQuery.setBackground(Color.ORANGE);
		btnMakeQuery.setForeground(Color.BLACK);
		frmUserNameCreator.getContentPane().add(btnMakeQuery);
				
		btnMakeQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println( "Dugme!" );
				
				//Dugme pokrece sledece
				
				//Stampa folder gde je jar
//				try {
//					System.out.println(new File(gui.class.getProtectionDomain().getCodeSource().getLocation().toURI()));
//				} catch (URISyntaxException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				//Brise sve na prikazu
				textResult.setText("");
				
				work.main();

			}
		});
		
		
		
		
		JButton btnCopy = new JButton("Copy result");
		btnCopy.setBounds(36, 140, 114, 23);
		frmUserNameCreator.getContentPane().add(btnCopy);
		
		btnCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println( "Dugme1!" );
				
				//Dugme kopira sadrzaj textResult polja u clipboard
				
				String clipboardString = textResult.getText();
				StringSelection stringSelection = new StringSelection(clipboardString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);

			}
		});
		
		
		
		JButton btnTestQuery = new JButton("Test Query");
		btnTestQuery.setBounds(36, 400, 114, 23);
		frmUserNameCreator.getContentPane().add(btnTestQuery);
		
		btnTestQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println( "DugmeTestQuery!" );
				
				//Dugme kopira query za test postojecih uslova
				
				String clipboardString = "select * from bank.bkcond where ope in ('024','025') and nat in ('COMVER','MACVER','MAVDEP','MICVER','MIVDEP') and cli='"+txtRoot.getText()+"';";
				StringSelection stringSelection = new StringSelection(clipboardString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);

			}
		});
		
		
		
	}
}
