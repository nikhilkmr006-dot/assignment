// Question 2: AWT & Event Handling

import java.awt.*;
import java.awt.event.*;

public class Q2_AWTExample_NikhilKumar extends Frame implements ActionListener {

    TextField nikhilkumar_tf;
    Button nikhilkumar_btn;
    Label nikhilkumar_lbl;

    Q2_AWTExample_NikhilKumar() {
        // Set layout
        setLayout(new FlowLayout());

        // Create components
        nikhilkumar_lbl = new Label("Enter your name:");
        nikhilkumar_tf = new TextField(20);
        nikhilkumar_btn = new Button("Click Me");

        // Add components to frame
        add(nikhilkumar_lbl);
        add(nikhilkumar_tf);
        add(nikhilkumar_btn);

        // Add ActionListener
        nikhilkumar_btn.addActionListener(this);

        // Frame properties
        setTitle("AWT Event Handling - Nikhil Kumar");
        setSize(300, 200);
        setVisible(true);

        // Close button action
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        String name = nikhilkumar_tf.getText();
        System.out.println("Hello, " + name + "! - From Nikhil Kumar");
    }

    public static void main(String[] args) {
        new Q2_AWTExample_NikhilKumar();
    }
}
