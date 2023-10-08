package classes;

import java.awt.Color;
import javax.swing.JOptionPane;

public class precoDaPassageFrame extends javax.swing.JFrame {
    
    double totToPay = 0;
    
    public precoDaPassageFrame() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblInstruction = new javax.swing.JLabel();
        lblKm = new javax.swing.JTextField();
        btnCalc = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        panelResult = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblTxtTotToPay = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotToPay = new javax.swing.JLabel();
        lblfare = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAbout = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Preço da Passage");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Calcule o Preço da Passage");

        lblInstruction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInstruction.setText("Informe Quantos Kilometros Você Deseja Percorrer:");

        lblKm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnCalc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCalc.setForeground(new java.awt.Color(0, 0, 255));
        btnCalc.setText("Calcular Passagem");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 0, 0));
        btnReset.setText("Reiniciar");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblTitle2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(0, 0, 255));
        lblTitle2.setText("Valores Cobrados");

        lblTxtTotToPay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTxtTotToPay.setText("Total a Pagar:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tarifa por K/M:");

        lblTotToPay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotToPay.setForeground(new java.awt.Color(0, 0, 255));
        lblTotToPay.setText("0");

        lblfare.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblfare.setForeground(new java.awt.Color(255, 0, 0));
        lblfare.setText("0");

        javax.swing.GroupLayout panelResultLayout = new javax.swing.GroupLayout(panelResult);
        panelResult.setLayout(panelResultLayout);
        panelResultLayout.setHorizontalGroup(
            panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle2)
                    .addGroup(panelResultLayout.createSequentialGroup()
                        .addComponent(lblTxtTotToPay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotToPay))
                    .addGroup(panelResultLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblfare)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelResultLayout.setVerticalGroup(
            panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle2)
                .addGap(18, 18, 18)
                .addGroup(panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTxtTotToPay)
                    .addComponent(lblTotToPay))
                .addGap(18, 18, 18)
                .addGroup(panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblfare))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuAbout.setText("Sobre");
        menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAbout);

        menuHelp.setText("Ajuda");
        menuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHelpMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuHelp);

        menuExit.setText("Sair");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInstruction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblKm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(panelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(panelResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        double KmTraveled = Integer.parseInt(lblKm.getText().toString());
        totToPay = 0;
        
        if(KmTraveled <= 100){
            totToPay = (KmTraveled * 0.55);
            lblTotToPay.setText((String.format("%.2f", totToPay) + " Reais"));
            lblfare.setText("0.55");
        }else{
            if(KmTraveled > 100 && KmTraveled < 201){
                totToPay = (totToPay * 0.50 );
                lblTotToPay.setText(String.format("%.2f", totToPay) + " Reais");
                lblfare.setText("0.50");
            }else  
                if (KmTraveled > 200){  
                    totToPay = (KmTraveled *  0.45);
                    lblTotToPay.setText(String.format("%.2f", KmTraveled) + " Reais");
                    lblfare.setText("0.45");
            }         
        }
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        totToPay = 0;
        lblKm.setText("");
        lblTotToPay.setText("");
        lblfare.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAboutMouseClicked
        JOptionPane.showMessageDialog(null, 
                "Sobre\n\n"
              + "Essa aplicação é resultado de uma\n"
              + "resolução de exercicio para fazer\n"
              + "calculo de passagem.\n"
              + "Especificações de Tarifa:\n"
              + "Até 100 KM: 0.55 Reais\n"
              + "Entre de 101 e 200 KM: 0.50 Reais\n"
              + "Acima de 200 KM: 0.45 Reais"
              , "Sobre", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_menuAboutMouseClicked

    private void menuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHelpMouseClicked
        JOptionPane.showMessageDialog(null, 
                "Ajuda\n\n"
              + "Para Usar é bem simples, basta informar\n"
              + "quantos [KM] Deseja percorrer abaixor,\n"
              + "Após isso basta clicar em Calcular Passagem,\n"
              + "em Seguida os Resultados Serão Listados\n"
              + "Abaixo!"
              , "Ajuda", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_menuHelpMouseClicked

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuExitMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new precoDaPassageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblInstruction;
    private javax.swing.JTextField lblKm;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTotToPay;
    private javax.swing.JLabel lblTxtTotToPay;
    private javax.swing.JLabel lblfare;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JPanel panelResult;
    // End of variables declaration//GEN-END:variables
}