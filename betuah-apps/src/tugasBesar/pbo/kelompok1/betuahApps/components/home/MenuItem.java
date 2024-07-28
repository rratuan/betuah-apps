package tugasBesar.pbo.kelompok1.betuahApps.components.home;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;

public class MenuItem extends javax.swing.JPanel {

    public MenuItem(Icon icon, String namaMenu, ActionListener act) {
        initComponents();
        
        // set icon dan nama menu ke dalam komponen
        iconLabel.setIcon(icon);
        menuLabel.setText(namaMenu);
        
        // menambahkan MouseListener untuk menangani klik mouse
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (act != null) {
                    act.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
                }
            }
        });
        
         // mengatur dimensi komponen
        this.setSize(new Dimension(Integer.MAX_VALUE, 100));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 100));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(100, 100));

        iconLabel.setBackground(new java.awt.Color(255, 255, 255));

        menuLabel.setBackground(new java.awt.Color(255, 255, 255));
        menuLabel.setText("nama item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel menuLabel;
    // End of variables declaration//GEN-END:variables
}
