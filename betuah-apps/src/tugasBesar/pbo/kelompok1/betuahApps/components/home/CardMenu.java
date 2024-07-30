package tugasBesar.pbo.kelompok1.betuahApps.components.home;

import java.awt.BorderLayout;

public class CardMenu extends javax.swing.JPanel {

    // manggil panel cardInfo dan cardButton
    private CardMenuInformation infoCard;
    private CardButton buttonCard;
    
    public CardMenu(String imagePath, String name, double price) {
        initComponents();
        
        // Buat dan tambahkan cardInfo dan cardButton
        infoCard = new CardMenuInformation(imagePath ,name, price);
        buttonCard = new CardButton(); 

        // Tambahkan cardInfo dan cardButton ke layout
        buttonPanel.setLayout(new BorderLayout());
        infoPanel.setLayout(new BorderLayout());
        buttonPanel.add(buttonCard, BorderLayout.CENTER);
        infoPanel.add(infoCard, BorderLayout.PAGE_END);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(200, 250));
        setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        add(buttonPanel, java.awt.BorderLayout.CENTER);

        infoPanel.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(infoPanel, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel infoPanel;
    // End of variables declaration//GEN-END:variables
}
