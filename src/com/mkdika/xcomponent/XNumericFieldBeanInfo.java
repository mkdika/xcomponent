package com.mkdika.xcomponent;

import java.awt.Image;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class XNumericFieldBeanInfo extends java.beans.SimpleBeanInfo {
    @Override
    public Image getIcon(int iconKind) {
        return loadImage("/com/mkdika/xcomponent/images/numfield.png");
    } 
}
