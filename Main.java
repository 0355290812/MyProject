package MyProject;
import javax.swing.*;
import javax.swing.UIDefaults.LazyValue;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

        public static void main(String args[]) {
                MyFrame frame = new MyFrame();
                MyFrame frame2 = new MyFrame();
                frame2.setTitle("Frame 2");
                frame.setVisible(true);


                JButton button = new JButton("Ok");
                button.setBounds(100,100,100,100);

                frame.add(button);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == button){
                                // frame.setVisible(false);
                                frame2.setVisible(true);
                        }

                }});
        }

}
