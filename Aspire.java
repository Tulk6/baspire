/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author james
 */
public class Aspire {
    
    public static void create_gui(){
        JFrame frame = new JFrame();
		frame.pack();
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add_components_to_pane(frame.getContentPane());
        
        
        frame.setVisible(true);
    }
    
    public static void add_components_to_pane(Container pane){
        pane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
		
		String[] list_data = {"Hello", "Hi!"};
		
		JComboBox field_select = new JComboBox();
		field_select.setPreferredSize(new Dimension(100, 20));
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 0;
		pane.add(field_select, constraints);
        
        JList goal_select = new JList(list_data);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.weighty = 1;
        pane.add(goal_select, constraints);
        
        JTextField text = new JTextField();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.weightx = 1;
        constraints.weighty = 0;
		constraints.gridheight = 2;
        pane.add(text, constraints);
		
    }
	
	public static void load_data(){
		List<String> fields = new ArrayList<>();
		List<HashMap<String, List>> goals = new ArrayList<>();
	}

    public static void main(String[] args) {
        create_gui();
		
		load_data();
    }
}
