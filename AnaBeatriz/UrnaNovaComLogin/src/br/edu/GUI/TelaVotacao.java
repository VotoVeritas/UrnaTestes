/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 *
 * @author Alunos
 */
public class TelaVotacao extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    
    Timer tempo;
    public TelaVotacao() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private boolean isActionPerformed = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaFixa = new javax.swing.JPanel();
        TitleGame = new javax.swing.JLabel();
        Teclado = new javax.swing.JPanel();
        Num1 = new javax.swing.JButton();
        Num2 = new javax.swing.JButton();
        Num3 = new javax.swing.JButton();
        Num6 = new javax.swing.JButton();
        Num5 = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        Num9 = new javax.swing.JButton();
        Num8 = new javax.swing.JButton();
        Num7 = new javax.swing.JButton();
        Num0 = new javax.swing.JButton();
        Branco = new javax.swing.JButton();
        Corrige = new javax.swing.JButton();
        Confirma = new javax.swing.JButton();
        TelaPrincipal = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        GameAwardsLogo = new javax.swing.JLabel();
        Game01 = new javax.swing.JLabel();
        Game02 = new javax.swing.JLabel();
        Competition = new javax.swing.JLabel();
        Start = new javax.swing.JLabel();
        Voto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TelaFixa.setBackground(new java.awt.Color(255, 255, 255));
        TelaFixa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TelaFixa.setPreferredSize(new java.awt.Dimension(462, 90));

        TitleGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/images/TitleGame.png"))); // NOI18N

        javax.swing.GroupLayout TelaFixaLayout = new javax.swing.GroupLayout(TelaFixa);
        TelaFixa.setLayout(TelaFixaLayout);
        TelaFixaLayout.setHorizontalGroup(
            TelaFixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaFixaLayout.createSequentialGroup()
                .addComponent(TitleGame)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        TelaFixaLayout.setVerticalGroup(
            TelaFixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaFixaLayout.createSequentialGroup()
                .addComponent(TitleGame)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(TelaFixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 6, 268, 60));

        Teclado.setBackground(new java.awt.Color(0, 0, 0));
        Teclado.setMaximumSize(new java.awt.Dimension(546, 598));
        Teclado.setPreferredSize(new java.awt.Dimension(546, 598));

        Num1.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        Num1.setText("1");
        Num1.setToolTipText("");
        Num1.setAlignmentY(0.0F);
        Num1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Num1.setMaximumSize(new java.awt.Dimension(40, 30));
        Num1.setMinimumSize(new java.awt.Dimension(40, 30));
        Num1.setPreferredSize(new java.awt.Dimension(40, 30));
        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });

        Num2.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        Num2.setText("2");
        Num2.setToolTipText("");
        Num2.setAlignmentY(0.0F);
        Num2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Num2.setMaximumSize(new java.awt.Dimension(40, 30));
        Num2.setMinimumSize(new java.awt.Dimension(40, 30));
        Num2.setPreferredSize(new java.awt.Dimension(40, 30));
        Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num2ActionPerformed(evt);
            }
        });

        Num3.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        Num3.setText("3");
        Num3.setToolTipText("");
        Num3.setAlignmentY(0.0F);
        Num3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Num3.setMaximumSize(new java.awt.Dimension(40, 30));
        Num3.setMinimumSize(new java.awt.Dimension(40, 30));
        Num3.setPreferredSize(new java.awt.Dimension(40, 30));
        Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num3ActionPerformed(evt);
            }
        });

        Num6.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        Num6.setText("6");
        Num6.setToolTipText("");
        Num6.setAlignmentY(0.0F);
        Num6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Num6.setMaximumSize(new java.awt.Dimension(40, 30));
        Num6.setMinimumSize(new java.awt.Dimension(40, 30));
        Num6.setPreferredSize(new java.awt.Dimension(40, 30));
        Num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num6ActionPerformed(evt);
            }
        });

        Num5.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        Num5.setText("5");
        Num5.setToolTipText("");
        Num5.setAlignmentY(0.0F);
        Num5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Num5.setMaximumSize(new java.awt.Dimension(40, 30));
        Num5.setMinimumSize(new java.awt.Dimension(40, 30));
        Num5.setPreferredSize(new java.awt.Dimension(40, 30));
        Num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num5ActionPerformed(evt);
            }
        });

        Num4.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        Num4.setText("4");
        Num4.setToolTipText("");
        Num4.setAlignmentY(0.0F);
        Num4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Num4.setMaximumSize(new java.awt.Dimension(40, 30));
        Num4.setMinimumSize(new java.awt.Dimension(40, 30));
        Num4.setPreferredSize(new java.awt.Dimension(40, 30));
        Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num4ActionPerformed(evt);
            }
        });

        Num9.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        Num9.setText("9");
        Num9.setToolTipText("");
        Num9.setAlignmentY(0.0F);
        Num9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Num9.setMaximumSize(new java.awt.Dimension(40, 30));
        Num9.setMinimumSize(new java.awt.Dimension(40, 30));
        Num9.setPreferredSize(new java.awt.Dimension(40, 30));
        Num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num9ActionPerformed(evt);
            }
        });

        Num8.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        Num8.setText("8");
        Num8.setToolTipText("");
        Num8.setAlignmentY(0.0F);
        Num8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Num8.setMaximumSize(new java.awt.Dimension(40, 30));
        Num8.setMinimumSize(new java.awt.Dimension(40, 30));
        Num8.setPreferredSize(new java.awt.Dimension(40, 30));
        Num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num8ActionPerformed(evt);
            }
        });

        Num7.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        Num7.setText("7");
        Num7.setToolTipText("");
        Num7.setAlignmentY(0.0F);
        Num7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Num7.setMaximumSize(new java.awt.Dimension(40, 30));
        Num7.setMinimumSize(new java.awt.Dimension(40, 30));
        Num7.setPreferredSize(new java.awt.Dimension(40, 30));
        Num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num7ActionPerformed(evt);
            }
        });

        Num0.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        Num0.setText("0");
        Num0.setToolTipText("");
        Num0.setAlignmentY(0.0F);
        Num0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Num0.setMaximumSize(new java.awt.Dimension(40, 30));
        Num0.setMinimumSize(new java.awt.Dimension(40, 30));
        Num0.setPreferredSize(new java.awt.Dimension(40, 30));
        Num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num0ActionPerformed(evt);
            }
        });

        Branco.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        Branco.setText("BRANCO");
        Branco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Branco.setPreferredSize(new java.awt.Dimension(60, 30));
        Branco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrancoActionPerformed(evt);
            }
        });

        Corrige.setBackground(new java.awt.Color(255, 0, 0));
        Corrige.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        Corrige.setText("CORRIGE");
        Corrige.setToolTipText("");
        Corrige.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Corrige.setPreferredSize(new java.awt.Dimension(60, 30));
        Corrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrigeActionPerformed(evt);
            }
        });

        Confirma.setBackground(new java.awt.Color(0, 153, 0));
        Confirma.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        Confirma.setText("CONFIRMA");
        Confirma.setToolTipText("");
        Confirma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirma.setPreferredSize(new java.awt.Dimension(60, 30));
        Confirma.setVerifyInputWhenFocusTarget(false);
        Confirma.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TecladoLayout = new javax.swing.GroupLayout(Teclado);
        Teclado.setLayout(TecladoLayout);
        TecladoLayout.setHorizontalGroup(
            TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TecladoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TecladoLayout.createSequentialGroup()
                        .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Num1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(Num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Num7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TecladoLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TecladoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Num8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Num5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(TecladoLayout.createSequentialGroup()
                        .addComponent(Branco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Corrige, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TecladoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Num9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TecladoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        TecladoLayout.setVerticalGroup(
            TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TecladoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Num1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(Num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Branco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Corrige, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Branco.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(Teclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 72, 268, 300));

        TelaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        TelaPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TelaPrincipal.setToolTipText("");
        TelaPrincipal.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        TelaPrincipal.setMaximumSize(new java.awt.Dimension(420, 265));
        TelaPrincipal.setPreferredSize(new java.awt.Dimension(420, 265));

        Title.setFont(new java.awt.Font("Bahnschrift", 1, 28)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("The Game Awards");
        Title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        GameAwardsLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/images/GameAwards.png"))); // NOI18N

        Game01.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Game01.setText("01 Marvel's Spider-Man 2 ");

        Game02.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Game02.setText("02 Resident Evil 4");

        Competition.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Competition.setText("Categoria Jogo do Ano");

        Start.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Start.setText("Aperte CONFIRMA para iniciar");

        Voto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/images/Voto.png"))); // NOI18N

        javax.swing.GroupLayout TelaPrincipalLayout = new javax.swing.GroupLayout(TelaPrincipal);
        TelaPrincipal.setLayout(TelaPrincipalLayout);
        TelaPrincipalLayout.setHorizontalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(TelaPrincipalLayout.createSequentialGroup()
                            .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Competition)
                                .addComponent(Start))
                            .addGap(95, 95, 95)
                            .addComponent(Voto))
                        .addGroup(TelaPrincipalLayout.createSequentialGroup()
                            .addComponent(GameAwardsLogo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Game01)
                                .addComponent(Game02)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        TelaPrincipalLayout.setVerticalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaPrincipalLayout.createSequentialGroup()
                        .addComponent(Title)
                        .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GameAwardsLogo))
                            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(Game01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Game02)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Competition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Start))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Voto)))
                .addContainerGap())
        );

        getContentPane().add(TelaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, -1, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num0ActionPerformed
        
    }//GEN-LAST:event_Num0ActionPerformed

    private void ConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaActionPerformed
        if (!isActionPerformed) {
        isActionPerformed = true; // Marca como já realizada

        tempo = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaVotacao2 Votar = new TelaVotacao2(100, 100);
                Votar.setVisible(true);
                dispose();
                tempo.stop();
            }
        });
        tempo.start();
    }
    }//GEN-LAST:event_ConfirmaActionPerformed

    private void CorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrigeActionPerformed
        
    }//GEN-LAST:event_CorrigeActionPerformed

    private void Num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num7ActionPerformed

    private void Num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num8ActionPerformed

    private void Num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num9ActionPerformed

    private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num4ActionPerformed

    private void Num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num5ActionPerformed

    private void Num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num6ActionPerformed

    private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num3ActionPerformed

    private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num2ActionPerformed

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num1ActionPerformed

    private void BrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrancoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BrancoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVotacao().setVisible(true);
            }
        });
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Branco;
    private javax.swing.JLabel Competition;
    private javax.swing.JButton Confirma;
    private javax.swing.JButton Corrige;
    private javax.swing.JLabel Game01;
    private javax.swing.JLabel Game02;
    private javax.swing.JLabel GameAwardsLogo;
    private javax.swing.JButton Num0;
    private javax.swing.JButton Num1;
    private javax.swing.JButton Num2;
    private javax.swing.JButton Num3;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Num5;
    private javax.swing.JButton Num6;
    private javax.swing.JButton Num7;
    private javax.swing.JButton Num8;
    private javax.swing.JButton Num9;
    private javax.swing.JLabel Start;
    private javax.swing.JPanel Teclado;
    private javax.swing.JPanel TelaFixa;
    private javax.swing.JPanel TelaPrincipal;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TitleGame;
    private javax.swing.JLabel Voto;
    // End of variables declaration//GEN-END:variables
}
