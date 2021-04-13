package config;

import java.awt.*;
import javax.swing.*;

public class ConfigFrame extends JFrame {

    private final JIntegerTextField fieldWidth;
    private final JIntegerTextField fieldHeight;
    private Runnable after;


    public ConfigFrame() {
        super("Test");
        JLabel labelWidth = new JLabel("Width");
        JLabel labelHeight = new JLabel("Height");
        fieldWidth = new JIntegerTextField();
        fieldHeight = new JIntegerTextField();
        JButton doneButton = new JButton("Done");
        doneButton.addActionListener(e -> {
            setVisible(false);
            dispose();
            if(after!=null){
                after.run();
            }
        });

        fieldWidth.setColumns(10);
        fieldHeight.setColumns(10);

        fieldWidth.setText("10");
        fieldHeight.setText("10");

        setLayout(new FlowLayout());
        JPanel panel=new JPanel(){
            @Override
            public Dimension getPreferredSize(){
                return new Dimension(450,50);
            }
        };
        panel.add(labelWidth);
        panel.add(fieldWidth);
        panel.add(labelHeight);
        panel.add(fieldHeight);
        panel.add(doneButton);
        add(panel);
        pack();
    }

    public int getSizeX() {
        return fieldWidth.getIntValue();
    }

    public int getSizeY() {
        return fieldHeight.getIntValue();
    }

    public void runAfter(Runnable runnable) {
        after = runnable;
    }

}