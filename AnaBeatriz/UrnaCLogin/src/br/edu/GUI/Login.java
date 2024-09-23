/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.GUI;

import br.edu.entities.User;
import br.edu.entities.Mesario;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Login extends javax.swing.JFrame {
    private User eleitor;
    private Mesario mesario;
    private Timer tempo;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        Start();
        mesario = new Mesario("1234");
        eleitor = new User("123456789022");
        bloquearTecladoFisico(); 
    }

    public void Start() {
        Title.setVisible(true);
        PnlSenha.setVisible(false); 
        revalidate();
        repaint();
    }

    public void Digitar(String n) {
        if (PnlTitle.isVisible()) {
            if (Title.getText().length() < 12) {
                Title.setText(Title.getText() + n);
            }
            if (Title.getText().length() == 12) {
                // Inicia o Timer
                tempo = new Timer(3000, new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        PnlTitle.setVisible(false);
                        PnlSenha.setVisible(true);
                        tempo.stop(); 
                    }
                });
                tempo.setRepeats(false); 
                tempo.start();
            }
        } else if (PnlSenha.isVisible()) {
            if (Senha.getPassword().length < 4) {
                Senha.setText(new String(Senha.getPassword()) + n);
            }
        }
    }

    public void Corrigir() {
    Title.setText(""); // Limpa o campo de título
    Senha.setText(""); // Limpa o campo de senha
    ErrorSenha.setText(""); // Limpa a mensagem de erro de senha
    ErrorTitulo.setText(""); // Limpa a mensagem de erro de título

    // Mantém a visibilidade adequada
    PnlTitle.setVisible(true); // Exibe o painel de título
    Title.setVisible(true);
    PnlSenha.setVisible(false); // Oculta o painel de sen
    }

    private void bloquearTecladoFisico() {
        Senha.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume(); 
            }

            @Override
            public void keyPressed(KeyEvent e) {
                e.consume(); 
            }

            @Override
            public void keyReleased(KeyEvent e) {
                e.consume(); }
        });
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTitle = new javax.swing.JPanel();
        ErrorTitulo = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        PnlSenha = new javax.swing.JPanel();
        ErrorSenha = new javax.swing.JLabel();
        Senha = new javax.swing.JPasswordField();
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
        Corrige = new javax.swing.JButton();
        Confirma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlTitle.setBackground(new java.awt.Color(255, 255, 255));
        PnlTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        PnlTitle.setPreferredSize(new java.awt.Dimension(462, 90));
        PnlTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ErrorTitulo.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        ErrorTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PnlTitle.add(ErrorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 60));

        Title.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PnlTitle.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 264, 56));

        PnlSenha.setBackground(new java.awt.Color(255, 255, 255));
        PnlSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        PnlSenha.setPreferredSize(new java.awt.Dimension(462, 90));
        PnlSenha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ErrorSenha.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        ErrorSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PnlSenha.add(ErrorSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 40));

        Senha.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        Senha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        PnlSenha.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 40));

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
                .addGap(25, 25, 25)
                .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(TecladoLayout.createSequentialGroup()
                            .addComponent(Corrige, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TecladoLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Num9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Num6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Num3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Corrige, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(PnlSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(PnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
        // TODO add your handling code here:
        Digitar("1");
    }//GEN-LAST:event_Num1ActionPerformed

    private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num2ActionPerformed
        // TODO add your handling code here:
        Digitar("2");
    }//GEN-LAST:event_Num2ActionPerformed

    private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num3ActionPerformed
        // TODO add your handling code here:
        Digitar("3");
    }//GEN-LAST:event_Num3ActionPerformed

    private void Num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num6ActionPerformed
        // TODO add your handling code here:
        Digitar("6");
    }//GEN-LAST:event_Num6ActionPerformed

    private void Num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num5ActionPerformed
        // TODO add your handling code here:
        Digitar("5");
    }//GEN-LAST:event_Num5ActionPerformed

    private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num4ActionPerformed
        // TODO add your handling code here:
        Digitar("4");
    }//GEN-LAST:event_Num4ActionPerformed

    private void Num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num9ActionPerformed
        // TODO add your handling code here:
        Digitar("9");
    }//GEN-LAST:event_Num9ActionPerformed

    private void Num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num8ActionPerformed
        // TODO add your handling code here:
        Digitar("8");
    }//GEN-LAST:event_Num8ActionPerformed

    private void Num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num7ActionPerformed
        // TODO add your handling code here:
        Digitar("7");
    }//GEN-LAST:event_Num7ActionPerformed

    private void Num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num0ActionPerformed
        Digitar("0");
    }//GEN-LAST:event_Num0ActionPerformed

    private void CorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrigeActionPerformed
        Corrigir();
    }//GEN-LAST:event_CorrigeActionPerformed

    private void ConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaActionPerformed
        String tituloDigitado = Title.getText();
    String senhaDigitada = new String(Senha.getPassword());

    boolean tituloValido = tituloDigitado.equals(eleitor.getTitulo());
    boolean senhaValida = mesario.verificarSenha(senhaDigitada);

    if (!tituloValido) {
        ErrorTitulo.setText("Título inválido!"); 
        PnlTitle.setVisible(true); 
        Title.setVisible(false);
        PnlSenha.setVisible(false); 
        return;
    }

    if (!senhaValida) {
        ErrorSenha.setText("Senha inválida!");
        Senha.setText("");
        PnlSenha.setVisible(true); 
        return; 
    }

    // Se tudo estiver correto, prossegue para a tela de votação
    TelaVotacao newTelaVotacao = new TelaVotacao();
    newTelaVotacao.setVisible(true);
    dispose();
    }//GEN-LAST:event_ConfirmaActionPerformed

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirma;
    private javax.swing.JButton Corrige;
    private javax.swing.JLabel ErrorSenha;
    private javax.swing.JLabel ErrorTitulo;
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
    private javax.swing.JPanel PnlSenha;
    private javax.swing.JPanel PnlTitle;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JPanel Teclado;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
