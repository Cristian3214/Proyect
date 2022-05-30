/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz_login;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Cristian
 */
public class Post_it {
    StyledDocument docu;
    Style estilo;
     private void AjusteImagen(JLabel LabelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(LabelName.getWidth(), LabelName.getHeight(), Image.SCALE_DEFAULT));
        LabelName.setIcon(icon);
        

    }//F
     
    
    
    
    
}
