package edu.colostate.cs.cs414.skynet_gym.ui.swing.start;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.colostate.cs.cs414.skynet_gym.domain.control.CustomerCtrl;
import edu.colostate.cs.cs414.skynet_gym.domain.control.EquipmentCtrl;
import edu.colostate.cs.cs414.skynet_gym.domain.control.ExerciseCtrl;
import edu.colostate.cs.cs414.skynet_gym.domain.control.ManagerCtrl;
import edu.colostate.cs.cs414.skynet_gym.domain.control.RoutineCtrl;
import edu.colostate.cs.cs414.skynet_gym.domain.control.TrainerCtrl;

/**
 * This is the main UI launcher that contains the panels
 * 
 * @author Mike Allan
 *
 */
public class Launcher {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Launcher() {
		initialize();
	}
	
	public void setBounds(Dimension dimension) {
		int offset = 100;
		frame.setBounds(
				offset,
				offset,
				dimension.width+offset,
				dimension.height+offset);
	}
	
	protected void setPanel(JPanel panel) {
		frame.getContentPane().removeAll();
		frame.getContentPane().repaint();
		frame.getContentPane().revalidate();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().repaint();
		frame.getContentPane().revalidate();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ManagerCtrl.initialize();
		TrainerCtrl.initialize();
		CustomerCtrl.initialize();
		EquipmentCtrl.initialize();
		ExerciseCtrl.initialize();
		RoutineCtrl.initialize();
		
		if (!ManagerCtrl.managerExists()) {
			setPanel(new CreateManager(this));
		} else {
			setPanel(new Login(this));
		}
		
	}
	
}