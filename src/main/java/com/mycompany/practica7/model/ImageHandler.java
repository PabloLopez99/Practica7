/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica7.model;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class ImageHandler {
    public static Dimension openImage(File fichero){
        try{
            BufferedImage image= ImageIO.read(fichero);
      
            Lienzo.setImage(image);
            return new Dimension(image.getWidth(),image.getHeight());
        }catch(Exception e){
             return null;
        }
    }
    
}
