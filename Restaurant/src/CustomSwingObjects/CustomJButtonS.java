
package CustomSwingObjects;

import javax.swing.JButton;


public class CustomJButtonS extends JButton{
    
    public CustomJButtonS()
    {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Buttons/btnclearS.png"))); // NOI18N
        this.setText("Boton Pequeño");
        this.setSize(100,36);
        this.setContentAreaFilled(false);
        this.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        this.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Buttons/btnclearSP.png"))); // NOI18N
        this.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Buttons/btnclearSH.png"))); // NOI18N
    }

}
