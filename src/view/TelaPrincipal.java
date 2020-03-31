package view;

/*
@author Diego Roberto <github.com/diego-roberto>
*/

import java.util.Arrays;
import javax.swing.JFrame;
import main.Gerador;

public class TelaPrincipal extends javax.swing.JFrame {
   
    Gerador chamaGerador = new Gerador();                
        
    public TelaPrincipal() {
        initComponents();
        this.setTitle("Gerador de Sorteio");        
        this.setResizable(false);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCenter = new javax.swing.JPanel();
        pnQuantidade = new javax.swing.JPanel();
        spnQuantidadeNum = new javax.swing.JSpinner();
        lblQtdAposta = new javax.swing.JLabel();
        pnResultado = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        pnButton = new javax.swing.JPanel();
        btnGerar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnCenter.setLayout(new java.awt.BorderLayout());

        spnQuantidadeNum.setModel(new javax.swing.SpinnerNumberModel(6, 6, 15, 1));
        pnQuantidade.add(spnQuantidadeNum);

        lblQtdAposta.setText("Quantidade de números");
        pnQuantidade.add(lblQtdAposta);

        pnCenter.add(pnQuantidade, java.awt.BorderLayout.NORTH);

        pnResultado.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnResultado.setLayout(new java.awt.BorderLayout());

        lblResultado.setText("Resultado");
        pnResultado.add(lblResultado, java.awt.BorderLayout.PAGE_START);

        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });
        pnResultado.add(txtResultado, java.awt.BorderLayout.PAGE_END);

        pnCenter.add(pnResultado, java.awt.BorderLayout.CENTER);

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });
        pnButton.add(btnGerar);

        pnCenter.add(pnButton, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnCenter, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        txtResultado.setText("");
        Integer numMax = (Integer) spnQuantidadeNum.getValue();        
        Integer[] aposta = chamaGerador.criaAposta(numMax);
                
        String resultadoTxt = Arrays.toString(aposta);
        txtResultado.setText(resultadoTxt); 
    }//GEN-LAST:event_btnGerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JLabel lblQtdAposta;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel pnButton;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnQuantidade;
    private javax.swing.JPanel pnResultado;
    private javax.swing.JSpinner spnQuantidadeNum;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
