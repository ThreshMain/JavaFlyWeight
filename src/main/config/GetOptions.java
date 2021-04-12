package config;

import java.awt.*;
import javax.swing.*;

public class GetOptions extends JFrame {

    private JLabel labelWidth;
    private JLabel labelHeight;
    private JIntegerTextField fieldWidth;
    private JIntegerTextField fieldHeight;
    private JButton doneButton;
    private Runnable after;


    public GetOptions() {
        super("Test");
        labelWidth = new JLabel("Width");
        labelHeight = new JLabel("Height");
        fieldWidth = new JIntegerTextField();
        fieldHeight = new JIntegerTextField();
        doneButton = new JButton("Done");
        doneButton.addActionListener(e -> {
            setVisible(false);
            dispose();
            if(after!=null){
                after.run();
            }
        });

        fieldWidth.setColumns(10);
        fieldHeight.setColumns(10);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(labelWidth);
        container.add(fieldWidth);
        container.add(labelHeight);
        container.add(fieldHeight);
        container.add(doneButton);
        fieldWidth.setText("10");
        fieldHeight.setText("10");
        invalidate();
        revalidate();
        repaint();
    }

    public int getWidth() {
        return fieldWidth.getValue();
    }

    public int getHeight() {
        return fieldHeight.getValue();
    }

    public void runAfter(Runnable runnable) {
        after = runnable;
    }

}