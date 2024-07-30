package tugasBesar.pbo.kelompok1.betuahApps.components.home;

import tugasBesar.pbo.kelompok1.betuahApps.components.home.CardMenu;

public class Pemesanan extends javax.swing.JFrame {

    public Pemesanan() {
        initComponents();
        // jalankan loop card menu
        execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane1.setViewportView(mainPanel);

        getContentPane().add(jScrollPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

// method buat nambahin item ke card
private void execute() {
    CardMenu mie = new CardMenu("/tugasBesar/pbo/kelompok1/betuahApps/assets/home/contoh.jpg", "Mie", 15000);
    CardMenu nasiGoreng = new CardMenu("/tugasBesar/pbo/kelompok1/betuahApps/assets/home/contoh.jpg", "Nasi Goreng", 15000);
    CardMenu ayamGoreng = new CardMenu("/tugasBesar/pbo/kelompok1/betuahApps/assets/home/contoh.jpg", "Ayam Goreng", 15000);
    CardMenu kebab = new CardMenu("/tugasBesar/pbo/kelompok1/betuahApps/assets/home/contoh.jpg", "Kebab", 15000);
    
    // tambahkan
    addCard(mie, nasiGoreng, ayamGoreng, kebab);
}

// method untuk menambahkan banyak item ke card dengan argumen ditampung di array
private void addCard(CardMenu... menu){
    for (int i = 0; i < menu.length; i++){
        mainPanel.add(menu[i]);
    }
    mainPanel.revalidate();
}

}

