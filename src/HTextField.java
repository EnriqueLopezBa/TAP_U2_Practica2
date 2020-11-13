
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.io.Serializable;
import javax.swing.SwingConstants;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author Enrique
 */
public class HTextField extends javax.swing.JPanel implements Serializable{
  
  
    
    public HTextField() {
        initComponents(); 
        jTextField1.setBorder(null);
        
        jTextField1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
              if(jTextField1.getText().equals(texto))
            jTextField1.setText("");
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                 if(jTextField1.getText().equals(""))
            jTextField1.setText(texto);
            }
        });
        

    }

    String texto = "";
    public String getPHint(){
        return this.texto;
    }
    public void setPHint(String t){
        this.texto = t;
    }

    public String getText() {
        return jTextField1.getText();
    }

    public void setText(String text) {   
        jTextField1.setText(text);
    }
    
    
    public enum alineacion{
        IZQUIERDA, DERECHA, CENTRO;
    }
    
    alineacion ali;
    
    public void setHorizontalAlignment(alineacion c){
        this.ali = c;
        switch(this.ali){
            case IZQUIERDA:
                jTextField1.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case CENTRO:
                jTextField1.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case DERECHA:
                jTextField1.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
        }
        
    }
    
    public alineacion getHorizontalAlignment(){
        return this.ali;
    }
    
    
    
      @Override
    public void setBackground(Color c){
        try {
                 jTextField1.setBackground(c);
        } catch (Exception e) {
        }
   
    }
    @Override
    public Color getBackground(){
        try {
             return jTextField1.getBackground();
        } catch (Exception e) {
            return new Color(0,0,0);
        }
       
    }
    
    
    @Override
    public void setForeground(Color c){
         jTextField1.setForeground(c);
    }
    
    @Override
    public Color getForeground(){
        try {
             return jTextField1.getForeground(); 
        } catch (Exception e) {
            return new Color(109,109,109);
        }
      
    }
    @Override
    public void setFont(Font f){
        try {
            jTextField1.setFont(f);
        } catch (Exception e) {
        }
        
    }
    @Override
    public Font getFont(){
        try {
             return jTextField1.getFont();
        } catch (Exception e) {
             return new Font("Arial Narrow", 18, Font.PLAIN);
        }
       
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(109, 109, 109));
        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
