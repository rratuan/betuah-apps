package tugasBesar.pbo.kelompok1.betuahApps.components.home;

import javax.swing.ImageIcon;

public class CardMenuInformation extends javax.swing.JPanel {
    ImageIcon image;
            
    public CardMenuInformation(String imagePath, String name, double price) {
        initComponents();
        // set image
        setImage(imagePath);
        // set name
        setName(name);
        // set price
        setPrice(price);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(200, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageLabel.setText("Image");
        add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 120));

        nameLabel.setText("Nama Menu");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 30));

        priceLabel.setText("Harga Menu");
        add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    public void setImage(String imagePath) {
        this.image = new ImageIcon(getClass().getResource(imagePath));
        this.imageLabel.setIcon(image);
    }
    
    public void setName(String name) {
        this.nameLabel.setText(name);
    }
    
    public void setPrice(double price) {
        this.priceLabel.setText("Rp " + String.format("%,.0f", price));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables
}
