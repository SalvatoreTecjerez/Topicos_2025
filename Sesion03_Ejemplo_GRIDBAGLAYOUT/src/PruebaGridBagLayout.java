import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.*;

class VentanaInicio extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public VentanaInicio() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GridBagLayout");
		//setSize(400, 400);
		
		setVisible(true);
		
		//widgets
		JTextArea area1 = new JTextArea("TextArea1");
		//gbc.gridx = 0;
		//gbc.gridy = 0;
		//gbc.gridwidth = 1;
		//gbc.gridheight = 3;
		gbc.fill = GridBagConstraints.VERTICAL;
		//gbl.setConstraints(area1, gbc);
		//add(area1);
		agregarComponente(area1, 0, 0, 1, 3);
		
		JButton btn1 = new JButton("Button 1");
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		
		//gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(btn1, gbc);
		add(btn1);
		
		JButton btn2 = new JButton("Button 2");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbl.setConstraints(btn2, gbc);
		add(btn2);
		
		JButton btn3 = new JButton("Button3");
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbl.setConstraints(btn3, gbc);
		add(btn3);
		
		JComboBox<String> combo1 = new JComboBox<String>();
		combo1.addItem("Iron");
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbl.setConstraints(combo1, gbc);
		add(combo1);
		
		JTextField caja = new JTextField("TextField");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbl.setConstraints(caja, gbc);
		add(caja);
		
		JTextArea area2 = new JTextArea("TextArea2");
		/*gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;\
		gbl.setConstraints(area2, gbc);*/
		agregarComponente(area2, 2, 3, 1, 1);
		//add(area2);
		
		pack();
		setLocationRelativeTo(null);
	}
	public void agregarComponente(JComponent componente, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(componente, gbc);
		add(componente);
	}
}

public class PruebaGridBagLayout {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});

	}

}
