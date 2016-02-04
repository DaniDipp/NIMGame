package at.danidipp.nim.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NIMFrame extends JFrame {

	private JPanel contentPane;
	private JButton btn30;
	private JButton btn31;
	private JButton btn32;
	private JButton btn33;
	private JButton btn34;
	private JButton btn35;
	private JButton btn36;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	private JButton btn23;
	private JButton btn24;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn00;
	private JButton btnEndRound;
	
	private boolean[][] buttonStates = {{true}, {true, true, true}, {true, true, true, true, true}, {true, true, true, true, true, true, true}};
	private boolean[] changedLines = {false, false, false, false};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NIMFrame frame = new NIMFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NIMFrame() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn30 = new JButton("|");
		btn30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn30ActionPerformed(e);
			}
		});
		btn30.setBounds(10, 201, 50, 50);
		contentPane.add(btn30);
		
		btn31 = new JButton("|");
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn31ActionPerformed(e);
			}
		});
		btn31.setBounds(70, 201, 50, 50);
		contentPane.add(btn31);
		
		btn32 = new JButton("|");
		btn32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn32ActionPerformed(e);
			}
		});
		btn32.setBounds(130, 201, 50, 50);
		contentPane.add(btn32);
		
		btn33 = new JButton("|");
		btn33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn33ActionPerformed(e);
			}
		});
		btn33.setBounds(190, 201, 50, 50);
		contentPane.add(btn33);
		
		btn34 = new JButton("|");
		btn34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn34ActionPerformed(e);
			}
		});
		btn34.setBounds(250, 201, 50, 50);
		contentPane.add(btn34);
		
		btn35 = new JButton("|");
		btn35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn35ActionPerformed(e);
			}
		});
		btn35.setBounds(310, 201, 50, 50);
		contentPane.add(btn35);
		
		btn36 = new JButton("|");
		btn36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn36ActionPerformed(e);
			}
		});
		btn36.setBounds(370, 201, 50, 50);
		contentPane.add(btn36);
		
		btn20 = new JButton("|");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn20ActionPerformed(e);
			}
		});
		btn20.setBounds(70, 140, 50, 50);
		contentPane.add(btn20);
		
		btn21 = new JButton("|");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn21ActionPerformed(e);
			}
		});
		btn21.setBounds(130, 140, 50, 50);
		contentPane.add(btn21);
		
		btn22 = new JButton("|");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn22ActionPerformed(e);
			}
		});
		btn22.setBounds(190, 140, 50, 50);
		contentPane.add(btn22);
		
		btn23 = new JButton("|");
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn23ActionPerformed(e);
			}
		});
		btn23.setBounds(250, 140, 50, 50);
		contentPane.add(btn23);
		
		btn24 = new JButton("|");
		btn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn24ActionPerformed(e);
			}
		});
		btn24.setBounds(310, 140, 50, 50);
		contentPane.add(btn24);
		
		btn10 = new JButton("|");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn10ActionPerformed(e);
			}
		});
		btn10.setBounds(130, 79, 50, 50);
		contentPane.add(btn10);
		
		btn11 = new JButton("|");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn11ActionPerformed(e);
			}
		});
		btn11.setBounds(190, 79, 50, 50);
		contentPane.add(btn11);
		
		btn12 = new JButton("|");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn12ActionPerformed(e);
			}
		});
		btn12.setBounds(250, 79, 50, 50);
		contentPane.add(btn12);
		
		btn00 = new JButton("|");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn00ActionPerformed(e);
			}
		});
		btn00.setBounds(190, 18, 50, 50);
		contentPane.add(btn00);
		
		btnEndRound = new JButton("End Round");
		btnEndRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEndRoundActionPerformed(e);
			}
		});
		btnEndRound.setBounds(310, 18, 110, 23);
		contentPane.add(btnEndRound);
	}
	
	
	protected void btn00ActionPerformed(ActionEvent e) {
		buttonStates[0][0] = !buttonStates[0][0];
		btn00.setText(buttonStates[0][0] ? "|" : "");
		changedLines[0] = true;
	}
	
	protected void btn10ActionPerformed(ActionEvent e) {
		buttonStates[1][0] = !buttonStates[1][0];
		btn10.setText(buttonStates[1][0] ? "|" : "");
		changedLines[1] = true;
	}
	
	protected void btn11ActionPerformed(ActionEvent e) {
		buttonStates[1][1] = !buttonStates[1][1];
		btn11.setText(buttonStates[1][1] ? "|" : "");
		changedLines[1] = true;
	}
	
	protected void btn12ActionPerformed(ActionEvent e) {
		buttonStates[1][2] = !buttonStates[1][2];
		btn12.setText(buttonStates[1][2] ? "|" : "");
		changedLines[1] = true;
	}
	
	protected void btn20ActionPerformed(ActionEvent e) {
		buttonStates[2][0] = !buttonStates[2][0];
		btn20.setText(buttonStates[2][0] ? "|" : "");
		changedLines[2] = true;
	}
	
	protected void btn21ActionPerformed(ActionEvent e) {
		buttonStates[2][1] = !buttonStates[2][1];
		btn21.setText(buttonStates[2][1] ? "|" : "");
		changedLines[2] = true;
	}
	
	protected void btn22ActionPerformed(ActionEvent e) {
		buttonStates[2][2] = !buttonStates[2][2];
		btn22.setText(buttonStates[2][2] ? "|" : "");
		changedLines[2] = true;
	}
	
	protected void btn23ActionPerformed(ActionEvent e) {
		buttonStates[2][3] = !buttonStates[2][3];
		btn23.setText(buttonStates[2][3] ? "|" : "");
		changedLines[2] = true;
	}
	
	protected void btn24ActionPerformed(ActionEvent e) {
		buttonStates[2][4] = !buttonStates[2][4];
		btn24.setText(buttonStates[2][4] ? "|" : "");
		changedLines[2] = true;
	}
	
	protected void btn30ActionPerformed(ActionEvent e) {
		buttonStates[3][0] = !buttonStates[3][0];
		btn30.setText(buttonStates[3][0] ? "|" : "");
		changedLines[3] = true;
	}
	
	protected void btn31ActionPerformed(ActionEvent e) {
		buttonStates[3][1] = !buttonStates[3][1];
		btn31.setText(buttonStates[3][1] ? "|" : "");
		changedLines[3] = true;
	}
	
	protected void btn32ActionPerformed(ActionEvent e) {
		buttonStates[3][2] = !buttonStates[3][2];
		btn32.setText(buttonStates[3][2] ? "|" : "");
		changedLines[3] = true;
	}
	
	protected void btn33ActionPerformed(ActionEvent e) {
		buttonStates[3][3] = !buttonStates[3][3];
		btn33.setText(buttonStates[3][3] ? "|" : "");
		changedLines[3] = true;
	}
	
	protected void btn34ActionPerformed(ActionEvent e) {
		buttonStates[3][4] = !buttonStates[3][4];
		btn34.setText(buttonStates[3][4] ? "|" : "");
		changedLines[3] = true;
	}
	
	protected void btn35ActionPerformed(ActionEvent e) {
		buttonStates[3][5] = !buttonStates[3][5];
		btn35.setText(buttonStates[3][5] ? "|" : "");
		changedLines[3] = true;
	}
	
	protected void btn36ActionPerformed(ActionEvent e) {
		buttonStates[3][6] = !buttonStates[3][6];
		btn36.setText(buttonStates[3][6] ? "|" : "");
		changedLines[3] = true;
	}
	
	
	protected void btnEndRoundActionPerformed(ActionEvent e) {
		if(changedlines() == 0){
			JOptionPane.showMessageDialog(null,"No moves selected");
			return;
		}
		
		if(changedlines() > 1){
			JOptionPane.showMessageDialog(null, "Don't select strikes in more then one row!");
			return;
		}
		
		
		btn00.setEnabled(buttonStates[0][0]);
		
		btn10.setEnabled(buttonStates[1][0]);
		btn11.setEnabled(buttonStates[1][1]);
		btn12.setEnabled(buttonStates[1][2]);
		
		btn20.setEnabled(buttonStates[2][0]);
		btn21.setEnabled(buttonStates[2][1]);
		btn22.setEnabled(buttonStates[2][2]);
		btn23.setEnabled(buttonStates[2][3]);
		btn24.setEnabled(buttonStates[2][4]);
		
		btn30.setEnabled(buttonStates[3][0]);
		btn31.setEnabled(buttonStates[3][1]);
		btn32.setEnabled(buttonStates[3][2]);
		btn33.setEnabled(buttonStates[3][3]);
		btn34.setEnabled(buttonStates[3][4]);
		btn35.setEnabled(buttonStates[3][5]);
		btn36.setEnabled(buttonStates[3][6]);
		
		resetChangedLinesArray();
	}

	private void resetChangedLinesArray() {
		for (int i = 0; i < changedLines.length; i++) {
			changedLines[i] = false;
		}
		
	}

	private int changedlines() {
		int i = 0;
		for (boolean cl : changedLines) {	//iterates through changedLines[] array
			if(cl){							//checks for "true" in changedLines[]
				i++;						//adds 1 if changedLines[x] == true
			}
		}
		return i;							//returns the number of 'true's in changedLines[]
	}
}
