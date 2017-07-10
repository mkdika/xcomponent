package com.mkdika.xcomponent;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class XNumericField extends javax.swing.JTextField {

    public XNumericField() {
        setHorizontalAlignment(RIGHT); // set default alignment is RIGHT
        setValue(0); // set default value to 0 as it instance        
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (!getText().isEmpty()) {
                    if (!((evt.getKeyChar() >= 48) && (evt.getKeyChar() <= 57))) {
                        setText(getText().replace(String.valueOf(evt.getKeyChar()), ""));
                    }
                }
            }
        });
    }

    // set integer value
    public void setValue(Integer value) {
        setText(String.valueOf(value));
    }

    // get integer value
    public Integer getIntegerValue() {
        if (getText().trim().isEmpty()) {
            return null;
        } else {
            return Integer.valueOf(getText().trim());
        }
    }
}
