package tugasBesar.pbo.kelompok1.betuahApps.components.home;

public class CardButton extends javax.swing.JPanel {
    
    private int quantity = 1;
    
    public CardButton() {
        initComponents();
        IncrementPanel.setVisible(false);
        decrementPanel.setVisible(false);
        quantityLabel.setText("Tambah");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IncrementPanel = new javax.swing.JPanel();
        incrementLabel = new javax.swing.JLabel();
        quantityPanel = new javax.swing.JPanel();
        quantityLabel = new javax.swing.JLabel();
        decrementPanel = new javax.swing.JPanel();
        decrementLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(200, 50));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IncrementPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        IncrementPanel.setPreferredSize(new java.awt.Dimension(60, 50));
        IncrementPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IncrementPanelMouseClicked(evt);
            }
        });

        incrementLabel.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        incrementLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        incrementLabel.setText("+");
        incrementLabel.setPreferredSize(new java.awt.Dimension(60, 50));
        incrementLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incrementLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout IncrementPanelLayout = new javax.swing.GroupLayout(IncrementPanel);
        IncrementPanel.setLayout(IncrementPanelLayout);
        IncrementPanelLayout.setHorizontalGroup(
            IncrementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(incrementLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        IncrementPanelLayout.setVerticalGroup(
            IncrementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IncrementPanelLayout.createSequentialGroup()
                .addComponent(incrementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(IncrementPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 50, 50));

        quantityPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        quantityPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quantityPanelMouseClicked(evt);
            }
        });

        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityLabel.setText("Tambah");
        quantityLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quantityLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout quantityPanelLayout = new javax.swing.GroupLayout(quantityPanel);
        quantityPanel.setLayout(quantityPanelLayout);
        quantityPanelLayout.setHorizontalGroup(
            quantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        quantityPanelLayout.setVerticalGroup(
            quantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quantityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(quantityPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 50));

        decrementPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        decrementPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decrementPanelMouseClicked(evt);
            }
        });

        decrementLabel.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        decrementLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decrementLabel.setText("-");
        decrementLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decrementLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout decrementPanelLayout = new javax.swing.GroupLayout(decrementPanel);
        decrementPanel.setLayout(decrementPanelLayout);
        decrementPanelLayout.setHorizontalGroup(
            decrementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(decrementLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        decrementPanelLayout.setVerticalGroup(
            decrementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decrementPanelLayout.createSequentialGroup()
                .addComponent(decrementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(decrementPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void quantityPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantityPanelMouseClicked
        togglePanels();
    }//GEN-LAST:event_quantityPanelMouseClicked

    private void IncrementPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncrementPanelMouseClicked
        incrementQuantity();
    }//GEN-LAST:event_IncrementPanelMouseClicked

    private void decrementPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decrementPanelMouseClicked
        decrementQuantity();
    }//GEN-LAST:event_decrementPanelMouseClicked

    private void quantityLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantityLabelMouseClicked
        togglePanels();
    }//GEN-LAST:event_quantityLabelMouseClicked

    private void decrementLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decrementLabelMouseClicked
        decrementQuantity();
    }//GEN-LAST:event_decrementLabelMouseClicked

    private void incrementLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incrementLabelMouseClicked
        incrementQuantity();
    }//GEN-LAST:event_incrementLabelMouseClicked

    // Method untuk toggle panel visibility
    private void togglePanels() {
        quantityLabel.setText(String.valueOf(quantity));
        IncrementPanel.setVisible(true);
        decrementPanel.setVisible(true);
    }
    
    private void incrementQuantity() {
        quantity++;
        quantityLabel.setText(String.valueOf(quantity));
    }

    private void decrementQuantity() {
        if (quantity > 1) {
            quantity--;
            quantityLabel.setText(String.valueOf(quantity));
        } else{
            quantityLabel.setText("Tambah");
            IncrementPanel.setVisible(false);
            decrementPanel.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IncrementPanel;
    private javax.swing.JLabel decrementLabel;
    private javax.swing.JPanel decrementPanel;
    private javax.swing.JLabel incrementLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JPanel quantityPanel;
    // End of variables declaration//GEN-END:variables
}
