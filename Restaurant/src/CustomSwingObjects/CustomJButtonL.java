
package CustomSwingObjects;

import javax.swing.JButton;


public class CustomJButtonL extends JButton{
    
    public CustomJButtonL()
    {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Buttons/btnclearL.png"))); // NOI18N
        this.setText("Boton Grande");
        this.setSize(100,36);
        this.setContentAreaFilled(false);
        this.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        this.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Buttons/btnclearLP.png"))); // NOI18N
        this.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Buttons/btnclearLH.png"))); // NOI18N
    }

}
