   
package View;

import Controller.Controller;
import Model.Aluno;
import Service.MainFrameService;
import helper.Validations;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela extends javax.swing.JFrame {
        // declaracano no cabeçalho 
    // Creating an object of controller class
    // final -> constante -> nunca será sobrescrito
    private final Controller control;
    public Tela() {

        initComponents();
         this.control = new Controller(); // delimitador
        this.updateList();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextContrato = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextObs = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextNascimento = new javax.swing.JTextField();
        jTextRg = new javax.swing.JTextField();
        jTextCPF = new javax.swing.JTextField();
        jTextCurso = new javax.swing.JTextField();
        jTextAno = new javax.swing.JTextField();
        jTextTurma = new javax.swing.JTextField();
        jTextDataMatricula = new javax.swing.JTextField();
        jTextDataValidade = new javax.swing.JTextField();
        jTextSexo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_result = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonTodos = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonBuscarAluno = new javax.swing.JButton();
        jTextBuscaAluno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextBuscaContrato = new javax.swing.JTextField();
        jTextBuscaCpf = new javax.swing.JTextField();
        jButtonBuscarAlunoCpf = new javax.swing.JButton();
        jButtonBuscarAlunocontrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Contrato");

        jTextContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContratoActionPerformed(evt);
            }
        });

        jLabel2.setText("Aluno");

        jLabel3.setText("Nascimento");

        jLabel4.setText("RG");

        jLabel5.setText("CPF");

        jLabel6.setText("Obs:");

        jTextObs.setColumns(20);
        jTextObs.setRows(5);
        jScrollPane1.setViewportView(jTextObs);

        jLabel7.setText("Curso");

        jLabel8.setText("ano");

        jLabel9.setText("Turno");

        jLabel10.setText("Data Matricula");

        jLabel11.setText("Data Validade");

        jLabel12.setText("Sexo");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jTextNascimento.setText("01/01/2014");
        jTextNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNascimentoActionPerformed(evt);
            }
        });

        jTextCPF.setText("000.000.000-00");
        jTextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCPFActionPerformed(evt);
            }
        });

        jTextAno.setText("0");
        jTextAno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAnoActionPerformed(evt);
            }
        });

        jTextDataMatricula.setText("01/01/2014");

        jTextDataValidade.setText("01/01/2014");

        jTextSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextSexo))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jTextNome)
                                    .addComponent(jTextContrato))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextTurma)
                                    .addComponent(jTextAno)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextRg, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jTextCPF))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextDataMatricula)
                                    .addComponent(jTextDataValidade, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jTextNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jTextRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 570, 270);

        table_result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Aluno", "Contrato", "Nascimento", "CPF", "Curso", "Ano", "Turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(table_result);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 270, 590, 250);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonTodos.setText("Todos");
        jButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTodosActionPerformed(evt);
            }
        });

        btn_remove.setText("Excluir");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btn_remove, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(600, 270, 100, 240);

        jButton1.setText("Foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(570, 10, 130, 250);

        jButtonBuscarAluno.setText("Buscar");
        jButtonBuscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAlunoActionPerformed(evt);
            }
        });

        jTextBuscaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscaAlunoActionPerformed(evt);
            }
        });

        jLabel16.setText("Nome");

        jLabel17.setText("Cpf");

        jLabel18.setText("Contrato");

        jTextBuscaContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscaContratoActionPerformed(evt);
            }
        });

        jTextBuscaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscaCpfActionPerformed(evt);
            }
        });

        jButtonBuscarAlunoCpf.setText("Buscar");
        jButtonBuscarAlunoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAlunoCpfActionPerformed(evt);
            }
        });

        jButtonBuscarAlunocontrato.setText("Buscar");
        jButtonBuscarAlunocontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAlunocontratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextBuscaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextBuscaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscarAlunoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextBuscaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscarAlunocontrato, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBuscaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarAluno)
                    .addComponent(jTextBuscaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextBuscaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarAlunoCpf)
                    .addComponent(jButtonBuscarAlunocontrato))
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 520, 690, 90);

        setBounds(0, 0, 722, 660);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextContratoActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextBuscaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscaAlunoActionPerformed

    private void jButtonBuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAlunoActionPerformed
        String valor = this.jTextBuscaAluno.getText();
        this.updateListBusca("Nome", valor);       
    }//GEN-LAST:event_jButtonBuscarAlunoActionPerformed

    private void jTextBuscaContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscaContratoActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscaContratoActionPerformed

    private void jTextBuscaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscaCpfActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscaCpfActionPerformed

    private void jButtonBuscarAlunoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAlunoCpfActionPerformed
        String valor = this.jTextBuscaCpf.getText();
        this.updateListBusca("CPF", valor);      
    }//GEN-LAST:event_jButtonBuscarAlunoCpfActionPerformed

    private void jButtonBuscarAlunocontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAlunocontratoActionPerformed
        String valor = this.jTextBuscaContrato.getText();
        this.updateListBusca("Contrato", valor);
    }//GEN-LAST:event_jButtonBuscarAlunocontratoActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
           // todo componete terá as funçoes GET p/ valores - getText() // setText("string qualquer")
            // this -> referência de escopo e conterá todos os campos da classe (extends)
            // Camelcase - Toda Palavra começa com letra maiuscula
            Aluno aluno;
            boolean isDone;
            String inContrato  = this.jTextContrato.getText();
            String inNome  = this.jTextNome.getText();
            String inNascimento  = this.jTextNascimento.getText();
            String inRg  = this.jTextRg.getText();
            String inCPF  = this.jTextCPF.getText();
            String inObs  = this.jTextObs.getText();
            String inCurso  = this.jTextCurso.getText();
            int inAno  = Integer.parseInt(this.jTextAno.getText());
            String inTurno  = this.jTextTurma.getText();
            String inMatricula  = this.jTextDataMatricula.getText();
            String inValidade  = this.jTextDataValidade.getText();
            String inSexo = this.jTextSexo.getText();

            // Validating name
            // Class.metodo() ?-> 
            // email -> yyy@hhh.kk 
            /**
             * Padrão de programação - Condicional - verdade - negação Use
             * apenas um padrão.
             *
             * - operadores condicionais !Validations.isValidName(inName) ->
             * negando a função
             *
             * inName = "João" Validations.isValidName(inName) -> valido (True)
             * !Validations.isValidName(inName) -> False
             *
             * inName = "Jo" Validations.isValidName(inName) -> False
             * !Validations.isValidName(inName) -> True
             *
             * 
             * 
             */
            // negação
            if (!Validations.isValidName(inNome) || 
                !Validations.isValidName(inContrato)) {
                JOptionPane.showMessageDialog(this, "Requisitos: Todos campos obrigatorios preenchidos, data no formato dd/mm/aaaa e Cpf no formato 000.000.000-00");
            } else {
                // Creating a new Aluno
                aluno = new Aluno(inContrato,inNome,inRg,inCPF,inObs,inCurso,inAno,inTurno,inMatricula,inValidade,inNascimento,inSexo);
                isDone = this.control.addAluno(aluno);
                if (!isDone) {
                    JOptionPane.showMessageDialog(this, "Contrato já existente!");
                } else {
                    //this.clear();
                    this.updateList();

                }
            }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAnoActionPerformed
       
    }//GEN-LAST:event_jTextAnoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
     // todo componete terá as funçoes GET p/ valores - getText() // setText("string qualquer")
            // this -> referência de escopo e conterá todos os campos da classe (extends)
            // Camelcase - Toda Palavra começa com letra maiuscula
            Aluno aluno;
            boolean isDone;
            String inContrato  = this.jTextContrato.getText();
            String inNome  = this.jTextNome.getText();
            String inNascimento  = this.jTextNascimento.getText();
            String inRg  = this.jTextRg.getText();
            String inCPF  = this.jTextCPF.getText();
            String inObs  = this.jTextObs.getText();
            String inCurso  = this.jTextCurso.getText();
            int inAno  = Integer.parseInt(this.jTextAno.getText());
            String inTurno  = this.jTextTurma.getText();
            String inMatricula  = this.jTextDataMatricula.getText();
            String inValidade  = this.jTextDataValidade.getText();
            String inSexo = this.jTextSexo.getText();

            // Validating name
            // Class.metodo() ?-> 
            // email -> yyy@hhh.kk 
            /**
             * Padrão de programação - Condicional - verdade - negação Use
             * apenas um padrão.
             *
             * - operadores condicionais !Validations.isValidName(inName) ->
             * negando a função
             *
             * inName = "João" Validations.isValidName(inName) -> valido (True)
             * !Validations.isValidName(inName) -> False
             *
             * inName = "Jo" Validations.isValidName(inName) -> False
             * !Validations.isValidName(inName) -> True
             *
             * 
             * 
             */
            // negação
            if (!Validations.isValidName(inNome) || 
                !Validations.isValidContrato(inContrato)||
                !Validations.isData(inNascimento)||
                !Validations.isValidName(inRg)||
                !Validations.isCpf(inCPF)||    
                !Validations.isData(inValidade)||    
                !Validations.isValidName(inCurso)||    
                !Validations.isValidName(inTurno)||    
                !Validations.isData(inMatricula)    ) {
                JOptionPane.showMessageDialog(this, "Esta faltando preecher campo!");
            } else {
                // Creating a new Aluno
                aluno = new Aluno(inContrato,inNome,inRg,inCPF,inObs,inCurso,inAno,inTurno,inMatricula,inValidade,inNascimento,inSexo);
                this.control.upAluno(aluno);
                    //this.clear();
                    this.updateList();

                
            }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
       String inContrato  = this.jTextContrato.getText();
       this.control.Delete(inContrato);
       this.updateList();
        
    }//GEN-LAST:event_btn_removeActionPerformed

    private void jTextSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSexoActionPerformed

    private void jButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTodosActionPerformed
        updateList();
    }//GEN-LAST:event_jButtonTodosActionPerformed

    private void jTextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCPFActionPerformed

    private void jTextNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNascimentoActionPerformed
    
    
     private void updateList() {
        ArrayList<Aluno> alunos = this.control.getAlunos();
        UpdateTabela(alunos);
    }
    
    
    private void updateListBusca(String busca, String valor) {
        ArrayList<Aluno> alunos = this.control.getAlunosBusca(busca, valor);
        UpdateTabela(alunos);
    }
    
    private void UpdateTabela( ArrayList<Aluno> alunos){
    // percorrer cada item
        // obtendo o i (elemento) da lista de clientes
        // adicionando o name na linha i e na coluna 0
        // adicionando o email na linha i e na coluna 1
        // reset table
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setNumRows(alunos.size());
        tableModel.setColumnIdentifiers(new String[]{
            "Aluno", "Contrato" ,"Nascimento", "CPF", "Curso", "Ano","Turno"
        });
        this.table_result.setModel(tableModel);
        //adicionar.. 
        for (int i = 0; i < alunos.size(); i++) {
            Aluno c = alunos.get(i);
            this.table_result.setValueAt(c.getNome(), i, 0);
            this.table_result.setValueAt(c.getContrato(), i, 1);
            this.table_result.setValueAt(c.getNascimento(), i, 2);
            this.table_result.setValueAt(c.getCpf(), i, 3);
            this.table_result.setValueAt(c.getCurso(), i, 4);
            this.table_result.setValueAt(c.getAno(), i, 5);
            this.table_result.setValueAt(c.getTurno(), i, 6);
            
        }
        // atualiza a tela 
        this.table_result.updateUI();
        // clientes.size() > 0 - true - habilita
        // clientes.size() > 0 - false - desabilita
        this.btn_remove.setEnabled((alunos.size() > 0));
    }
  //  private void clear() {
  //      this.input_email.setText("");
  //      this.input_name.setText("");
  //  }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscarAluno;
    private javax.swing.JButton jButtonBuscarAlunoCpf;
    private javax.swing.JButton jButtonBuscarAlunocontrato;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextAno;
    private javax.swing.JTextField jTextBuscaAluno;
    private javax.swing.JTextField jTextBuscaContrato;
    private javax.swing.JTextField jTextBuscaCpf;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JTextField jTextContrato;
    private javax.swing.JTextField jTextCurso;
    private javax.swing.JTextField jTextDataMatricula;
    private javax.swing.JTextField jTextDataValidade;
    private javax.swing.JTextField jTextNascimento;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextArea jTextObs;
    private javax.swing.JTextField jTextRg;
    private javax.swing.JTextField jTextSexo;
    private javax.swing.JTextField jTextTurma;
    private javax.swing.JTable table_result;
    // End of variables declaration//GEN-END:variables

}
