package config;

import javax.swing.*;

public class JIntegerTextField extends JTextField {

    private String valueBefore = "";
    private int value = 0;

    public JIntegerTextField() {
        super();
        getDocument().addDocumentListener((InsertDocumentListener) event -> {
            try {
                int value = Integer.parseInt(getText());
                valueBefore = getText();
                this.value = value;
            } catch (NumberFormatException exception) {
                SwingUtilities.invokeLater(() -> setText(valueBefore));
            }
        });
    }

    public int getValue() {
        return value;
    }
}
