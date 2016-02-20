package test;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Splashtest extends JFrame {

	private JPanel contentPane;
	private Icon icon = new ImageIcon(Splashtest.class.getResource("mainimg.gif"));
	JLabel lblNewLabel = new JLabel("game-2016");
	int x =0;
	int y=11;
	
	
	public static void main(String[] args) {
		
					Splashtest frame = new Splashtest();
					frame.setVisible(true);
					frame.setTitle("game-2016");
	}

	public Splashtest() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 427);
		contentPane = new JPanel();
		contentPane.setBorder(UIManager.getBorder("ToolTip.border"));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel label = new JLabel();
		
		label.setIcon(icon);
		
		label.setBounds(40, 59, 612, 280);
		contentPane.add(label);
		
		
		lblNewLabel.setBackground(SystemColor.textHighlight);
		if(x<10000)
		{
		for(x=50;x<99;x=x+100)
		{
			x++;
		}
		}
		else{
			 x=0;
			return;
					}
		lblNewLabel.setBounds(x,y, 164, 14);
		
		
		contentPane.add(lblNewLabel);
		
	}
}
