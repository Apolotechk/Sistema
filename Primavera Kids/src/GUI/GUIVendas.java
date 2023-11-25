/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import model.*;

import controller.*;
import java.awt.Color;
import java.sql.Time;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class GUIVendas extends javax.swing.JInternalFrame {

    ControllerCliente controllerCliente = new ControllerCliente();
    ControllerProduto controllerProduto = new ControllerProduto();
    ControllerVendas controllerVendas = new ControllerVendas();
    ControllerVendaProduto controllerVendaProduto = new ControllerVendaProduto();
    ModelCliente modelCliente = new ModelCliente();
    ModelProduto modelProduto = new ModelProduto();
    ModelVendas modelVendas = new ModelVendas();
    ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
    ArrayList<ModelVendaProduto> listamodelVendaProduto = new ArrayList<>();
    ArrayList<ModelProduto> listamodelProduto = new ArrayList<>();
    

    double quantidade = 0;

    /**
     * Creates new form venda
     */
    public GUIVendas() {
        initComponents();
        Color minhaCor = new Color(255, 242, 190);
        getContentPane().setBackground(minhaCor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        finalizar = new javax.swing.JButton();
        jpProduto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        NomePro = new javax.swing.JTextField();
        Preco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        VTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        codiPro = new javax.swing.JTextField();
        quant = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        jpCliente = new javax.swing.JPanel();
        cpfCli = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        NomeCli = new componentes.UJTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TotalVenda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pagamento = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        valorRecebid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Troco = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Venda");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/basket.png"))); // NOI18N
        setInheritsPopupMenu(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Preço Unitario", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        finalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finalizar.setText("Finalizar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        jpProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Produto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Nome:");

        NomePro.setEnabled(false);

        Preco.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Preço Unitário");

        VTotal.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Valor Total");

        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setText("Adicionar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Código:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Quantidade:");

        codiPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codiProKeyPressed(evt);
            }
        });

        quant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("Desconto:");

        desc.setEnabled(false);

        javax.swing.GroupLayout jpProdutoLayout = new javax.swing.GroupLayout(jpProduto);
        jpProduto.setLayout(jpProdutoLayout);
        jpProdutoLayout.setHorizontalGroup(
            jpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(194, 194, 194))
                    .addGroup(jpProdutoLayout.createSequentialGroup()
                        .addGroup(jpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpProdutoLayout.createSequentialGroup()
                        .addGroup(jpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add)
                            .addGroup(jpProdutoLayout.createSequentialGroup()
                                .addGroup(jpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(codiPro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(quant)))
                            .addComponent(jLabel6)
                            .addComponent(NomePro)
                            .addComponent(Preco)
                            .addComponent(desc)
                            .addComponent(VTotal))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpProdutoLayout.setVerticalGroup(
            jpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codiPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add)
                .addContainerGap())
        );

        jpCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        try {
            cpfCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpfCliKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("CPF:");

        NomeCli.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Nome:");

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(NomeCli, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Total da Venda:");

        TotalVenda.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("Forma de Pagamento:");

        pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão", "Dinheiro", "Pix" }));
        pagamento.setSelectedIndex(-1);
        pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setText("Valor Recebido:");

        valorRecebid.setEnabled(false);
        valorRecebid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorRecebidKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setText("Troco:");

        Troco.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(finalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valorRecebid)
                                    .addComponent(Troco)
                                    .addComponent(jLabel8)
                                    .addComponent(TotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorRecebid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Troco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(finalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfCliKeyPressed
        modelCliente = controllerCliente.getClienteController(cpfCli.getText());
        NomeCli.setText(modelCliente.getClienNome());
    }//GEN-LAST:event_cpfCliKeyPressed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (quant.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            modelProduto = controllerProduto.getProdutoController(Integer.parseInt(codiPro.getText()));
            adicionarProdutoNaVenda();
            valorTotal();
        }
    }//GEN-LAST:event_addActionPerformed

    private void codiProKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codiProKeyPressed
        if (codiPro.getText().equals("")) {
            Preco.setText("");
            NomePro.setText("");
        } else {
            modelProduto = controllerProduto.getProdutoController(Integer.parseInt(codiPro.getText()));
            double preco = modelProduto.getProdPreco();
            double desconto = modelProduto.getProd_Desconto();
            /* Aplica desconto se existir
            if (desconto > 0) {
                preco -= (preco * (desconto / 100.0));
            }*/
            Preco.setText(String.valueOf(modelProduto.getProdPreco()));
            NomePro.setText(modelProduto.getProdNome());
            desc.setText(String.valueOf(modelProduto.getProd_Desconto()) + "%");
        }
    }//GEN-LAST:event_codiProKeyPressed

    private void quantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantKeyPressed
        if (quant.getText().equals("")) {
            VTotal.setText("");
        } else {
            quantidade = Double.parseDouble(quant.getText());
            double precoOriginal = Double.parseDouble(Preco.getText());
            // Aplica desconto se existir
            double desconto = modelProduto.getProd_Desconto();
            double precoComDesconto = precoOriginal;

            if (desconto > 0) {
                precoComDesconto -= (precoOriginal * (desconto / 100.0));
            }

            double resultado = quantidade * precoComDesconto;
            DecimalFormat formato = new DecimalFormat("#.##");
            String resultadoFormatado = formato.format(resultado);
            VTotal.setText(String.valueOf(resultadoFormatado));
        }
    }//GEN-LAST:event_quantKeyPressed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        int codigovenda = 0, codigoProduto;
        listamodelVendaProduto = new ArrayList<>();
        modelVendas.setCliente(cpfCli.getText());
        Date dataHoraAtual = new Date();
        String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        java.sql.Date dataSql = java.sql.Date.valueOf(LocalDate.parse(dataFormatada, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        modelVendas.setVenData(dataSql);
        LocalTime horatual = LocalTime.now();
        modelVendas.setVenHora(Time.valueOf(horatual));
        modelVendas.setVenValorBruto(Double.parseDouble(TotalVenda.getText()));
        double valorBruto = Double.parseDouble(TotalVenda.getText());
        String desco = desc.getText();
        String numerosApenas = desco.replaceAll("[^0-9.]", "");
        double desconto = Double.parseDouble(numerosApenas);
        double valorLiquido = valorBruto * (1 - (desconto / 100.0));
        modelVendas.setVenValorLiquido(valorLiquido);
        try {
            String trocoTexto = Troco.getText();
            trocoTexto = trocoTexto.replace(',', '.');
            double troco = Double.parseDouble(trocoTexto);
            modelVendas.setVenTroco(troco);
        } catch (NumberFormatException e) {
            // Trate o caso em que a conversão para Double não é possível
            e.printStackTrace(); // ou outra forma de lidar com o erro
        }
        modelVendas.setVenTipoPagamento(pagamento.getSelectedItem().toString());
        modelVendas.setVenNomeCliente(NomeCli.getText());

        codigovenda = controllerVendas.salvarVendasController(modelVendas);
        if (codigovenda > 0) {  JOptionPane.showMessageDialog(this, "Venda efetuada com sucesso!!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro na venda!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_finalizarActionPerformed

    private void pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentoActionPerformed
        String formaDePagamentoSelecionada = pagamento.getSelectedItem().toString();
        if ("Dinheiro".equals(formaDePagamentoSelecionada)) {
            // Ativar o campo troco
            valorRecebid.setEnabled(true);
        } else {
            // Desativar o campo troco se a forma de pagamento não for dinheiro
            valorRecebid.setEnabled(false);
            Troco.setText("0"); // Limpar o texto, se necessário
        }
    }//GEN-LAST:event_pagamentoActionPerformed

    private void valorRecebidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorRecebidKeyPressed
        // Obtém os valores
        try {
            String valorRecebidoTexto = valorRecebid.getText().replace(',', '.');
            double valorRecebido = Double.parseDouble(valorRecebidoTexto);

            // Restante do código para calcular o troco e exibir
            double valorTotal = Double.parseDouble(TotalVenda.getText());
            double troco = valorRecebido - valorTotal;
            DecimalFormat formato = new DecimalFormat("#.##");
            String trocoFormatado = formato.format(troco);
            Troco.setText(trocoFormatado);

        } catch (NumberFormatException e) {
            // Trate o caso em que a conversão para Double não é possível
            e.printStackTrace(); // ou outra forma de lidar com o erro
        }

    }//GEN-LAST:event_valorRecebidKeyPressed

    private void adicionarProdutoNaVenda() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        double preco = modelProduto.getProdPreco();
        double desconto = modelProduto.getProd_Desconto();
        // Aplica desconto se existir
        if (desconto > 0) {
            preco -= (preco * (desconto / 100.0));
        }
        double qua = Double.parseDouble(quant.getText());
        double total = qua * preco;
        modelo.addRow(new Object[]{
            modelProduto.getIdProduto(),
            modelProduto.getProdNome(),
            quant.getText(),
            preco, // Use o preço ajustado considerando o desconto, se aplicável
            total
        });
    }

    private void valorTotal() {
        double soma = 0;
        int cont = jTable1.getRowCount();
        for (int i = 0; i < cont; i++) {
            // Obtém o valor da célula como um objeto (pode ser Double ou String)
            Object valorObj = jTable1.getValueAt(i, 4);
            // Converte o valor para Double
            if (valorObj != null) {
                try {
                    String val = valorObj.toString().replaceAll("[^0-9.]", "");
                    double valor = Double.parseDouble(val);
                    soma += valor;
                } catch (NumberFormatException e) {
                    // Trate o caso em que a conversão para Double não é possível
                    e.printStackTrace(); // ou outra forma de lidar com o erro
                }
            }
        }
        DecimalFormat formato = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
        String somaFormatada = formato.format(soma);

        // Exibe o valor total no campo TotalVenda
        TotalVenda.setText(somaFormatada);
    }

    private void limparCampos() {

        cpfCli.setText("");
        NomeCli.setText("");
        codiPro.setText("");
        quant.setText("");
        NomePro.setText("");
        Preco.setText("");
        desc.setText("");
        VTotal.setText("");
        TotalVenda.setText("");
        valorRecebid.setText("");
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.UJTextField NomeCli;
    private javax.swing.JTextField NomePro;
    private javax.swing.JTextField Preco;
    private javax.swing.JTextField TotalVenda;
    private javax.swing.JTextField Troco;
    private javax.swing.JTextField VTotal;
    private javax.swing.JButton add;
    private javax.swing.JTextField codiPro;
    private javax.swing.JFormattedTextField cpfCli;
    private javax.swing.JTextField desc;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpProduto;
    private javax.swing.JComboBox<String> pagamento;
    private javax.swing.JTextField quant;
    private javax.swing.JTextField valorRecebid;
    // End of variables declaration//GEN-END:variables
}