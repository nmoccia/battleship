
import java.awt.Color;
import javax.swing.border.EtchedBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class battleship_JFrame extends javax.swing.JFrame {

    int shipsNotPlacedCounter = 5;
    battleship battleLogic = new battleship();
    battleship_playGame_JFrame gameFrame = new battleship_playGame_JFrame();
    static battleship_JFrame placementFrame = new battleship_JFrame();
    
    /**
     * Creates new form battleship_JFrame
     */
    public battleship_JFrame() {
        initComponents();
        playerGridPlacementPage.setShowGrid(true);
        playerGridPlacementPage.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        playerGridPlacementPage.setGridColor(Color.BLACK);
        continueToGameButtonPlacementPage.setVisible(false);
        
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rowComboBoxPlacementPage = new javax.swing.JComboBox();
        columnComboBoxPlacementPage = new javax.swing.JComboBox();
        rowLabelPlacementPage = new javax.swing.JLabel();
        columnLabelPlacementPage = new javax.swing.JLabel();
        directionComboBoxPlacementPage = new javax.swing.JComboBox();
        directionLabelPlacementPage = new javax.swing.JLabel();
        submitButtonPlacementPage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        playerGridPlacementPage = new javax.swing.JTable();
        rowALabelPlacementPage = new javax.swing.JLabel();
        rowBLabelPlacementPage = new javax.swing.JLabel();
        rowCLabelPlacementPage = new javax.swing.JLabel();
        rowDLabelPlacementPage = new javax.swing.JLabel();
        rowELabelPlacementPage = new javax.swing.JLabel();
        rowFLabelPlacementPage = new javax.swing.JLabel();
        rowGLabelPlacementPage = new javax.swing.JLabel();
        rowHLabelPlacementPage = new javax.swing.JLabel();
        rowILabelPlacementPage = new javax.swing.JLabel();
        rowJLabelPlacementPage = new javax.swing.JLabel();
        shipSizeComboBoxPlacementPage = new javax.swing.JComboBox();
        shipSizeLabelPlacementPage = new javax.swing.JLabel();
        feedbackLabelPlacementPage = new javax.swing.JLabel();
        playerGridLabelPlacementPage = new javax.swing.JLabel();
        continueToGameButtonPlacementPage = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rowComboBoxPlacementPage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));

        columnComboBoxPlacementPage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        columnComboBoxPlacementPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnComboBoxPlacementPageActionPerformed(evt);
            }
        });

        rowLabelPlacementPage.setText("Row");

        columnLabelPlacementPage.setText("Column");

        directionComboBoxPlacementPage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Left", "Up", "Down", "Right" }));

        directionLabelPlacementPage.setText("Direction");

        submitButtonPlacementPage.setText("Submit");
        submitButtonPlacementPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonPlacementPageActionPerformed(evt);
            }
        });

        playerGridPlacementPage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        playerGridPlacementPage.setMinimumSize(new java.awt.Dimension(150, 180));
        playerGridPlacementPage.setSelectionBackground(new java.awt.Color(255, 255, 255));
        playerGridPlacementPage.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(playerGridPlacementPage);

        rowALabelPlacementPage.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rowALabelPlacementPage.setText("A");
        rowALabelPlacementPage.setToolTipText("");

        rowBLabelPlacementPage.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rowBLabelPlacementPage.setText("B");

        rowCLabelPlacementPage.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rowCLabelPlacementPage.setText("C");

        rowDLabelPlacementPage.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rowDLabelPlacementPage.setText("D");

        rowELabelPlacementPage.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rowELabelPlacementPage.setText("E");

        rowFLabelPlacementPage.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rowFLabelPlacementPage.setText("F");

        rowGLabelPlacementPage.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rowGLabelPlacementPage.setText("G");

        rowHLabelPlacementPage.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rowHLabelPlacementPage.setText("H");

        rowILabelPlacementPage.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rowILabelPlacementPage.setText("I");

        rowJLabelPlacementPage.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        rowJLabelPlacementPage.setText("J");

        shipSizeComboBoxPlacementPage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "4", "3", "3", "2" }));

        shipSizeLabelPlacementPage.setText("Ship Size");

        feedbackLabelPlacementPage.setText("Place your ships!");

        playerGridLabelPlacementPage.setText("Your Board");

        continueToGameButtonPlacementPage.setText("Play Battleship!");
        continueToGameButtonPlacementPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueToGameButtonPlacementPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rowBLabelPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowALabelPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowCLabelPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowDLabelPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowELabelPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowFLabelPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowGLabelPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowHLabelPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowILabelPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowJLabelPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(shipSizeLabelPlacementPage))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(shipSizeComboBoxPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rowLabelPlacementPage)
                            .addComponent(rowComboBoxPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(columnLabelPlacementPage)
                            .addComponent(columnComboBoxPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directionLabelPlacementPage)
                            .addComponent(directionComboBoxPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(continueToGameButtonPlacementPage)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(feedbackLabelPlacementPage)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(submitButtonPlacementPage)
                            .addGap(8, 8, 8)))
                    .addComponent(playerGridLabelPlacementPage))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(rowALabelPlacementPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowBLabelPlacementPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowCLabelPlacementPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowDLabelPlacementPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowELabelPlacementPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowFLabelPlacementPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowGLabelPlacementPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowHLabelPlacementPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowILabelPlacementPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowJLabelPlacementPage))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerGridLabelPlacementPage)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(columnLabelPlacementPage)
                    .addComponent(directionLabelPlacementPage)
                    .addComponent(rowLabelPlacementPage)
                    .addComponent(shipSizeLabelPlacementPage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directionComboBoxPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columnComboBoxPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rowComboBoxPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shipSizeComboBoxPlacementPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(submitButtonPlacementPage)
                .addGap(27, 27, 27)
                .addComponent(feedbackLabelPlacementPage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(continueToGameButtonPlacementPage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void columnComboBoxPlacementPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnComboBoxPlacementPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnComboBoxPlacementPageActionPerformed

    private void submitButtonPlacementPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonPlacementPageActionPerformed
        // TODO add your handling code here:
        //this.rowLabelPlacementPage.setText("I am testing this button");
        String selectedRowString = "a";
        String selectedColumnString = "null";
        String selectedDirectionString = "null";
        String selectedSizeString = "null";
        int selectedRowInt = 0;
        int selectedColumnInt = 0;
        int selectedDirectionInt = 0;
        int selectedSizeInt = 0;
        
        selectedSizeString = (String)shipSizeComboBoxPlacementPage.getSelectedItem();
        selectedRowString = (String)rowComboBoxPlacementPage.getSelectedItem();
        selectedColumnString = (String)columnComboBoxPlacementPage.getSelectedItem();
        selectedDirectionString = (String) directionComboBoxPlacementPage.getSelectedItem();
        
        switch(selectedRowString){
            case "A":
                selectedRowInt = 1;
                break;
            case "B":
                selectedRowInt = 2;
                break;
            case "C":
                selectedRowInt = 3;
                break;
            case "D":
                selectedRowInt = 4;
                break;
            case "E":
                selectedRowInt = 5;
                break;
            case "F":
                selectedRowInt = 6;
                break;
            case "G":
                selectedRowInt = 7;
                break;
            case "H":
                selectedRowInt = 8;
                break;
            case "I":
                selectedRowInt = 9;
                break;
            case "J":
                selectedRowInt = 10;
                break;    
        }
        
        switch(selectedColumnString){
            case "1":
                selectedColumnInt = 1;
                break;
            case "2":
                selectedColumnInt = 2;
                break;
            case "3":
                selectedColumnInt = 3;
                break;
            case "4":
                selectedColumnInt = 4;
                break;
            case "5":
                selectedColumnInt = 5;
                break;
            case "6":
                selectedColumnInt = 6;
                break;
            case "7":
                selectedColumnInt = 7;
                break;
            case "8":
                selectedColumnInt = 8;
                break;
            case "9":
                selectedColumnInt = 9;
                break;
            case "10":
                selectedColumnInt = 10;
                break;    
        }
        
        switch(selectedDirectionString){
            case "Left":
                selectedDirectionInt = 1;
                break;
            case "Up":
                selectedDirectionInt = 2;
                break;
            case "Down":
                selectedDirectionInt = 3;
                break;
            case "Right":
                selectedDirectionInt = 4;
                break;
        }
        
        switch(selectedSizeString){
            case "5":
                selectedSizeInt = 5;
                break;
            case "4":
                selectedSizeInt = 4;
                break;
            case "3":
                selectedSizeInt = 3;
                break;
            case "2":
                selectedSizeInt = 2;
                break;
        }
        
        feedbackLabelPlacementPage.setText("Ship cannot be placed there!");
        
        battleLogic.determine_valid_direction(selectedColumnInt, selectedRowInt, selectedSizeInt, battleLogic.player_grid);
        
        if(battleLogic.valid_direction_array[0] && (selectedDirectionInt == 1)){
            // accept placement for a left facing ship
            battleLogic.place_piece_on_board(selectedColumnInt, selectedRowInt, selectedSizeInt, selectedDirectionInt, battleLogic.player_grid);
            updatePlayerGridPlacementPage();
            removeItemFromShipSizeComboBox(selectedSizeString);
            shipsNotPlacedCounter--;
            feedbackLabelPlacementPage.setText("Ship placed!");
            
        }
        
        if(battleLogic.valid_direction_array[1] && (selectedDirectionInt == 2)){
            // accept placement for a left facing ship
            battleLogic.place_piece_on_board(selectedColumnInt, selectedRowInt, selectedSizeInt, selectedDirectionInt, battleLogic.player_grid);
            updatePlayerGridPlacementPage();
            removeItemFromShipSizeComboBox(selectedSizeString);
            shipsNotPlacedCounter--;
            feedbackLabelPlacementPage.setText("Ship placed!");
            
        }
      
        if(battleLogic.valid_direction_array[2] && (selectedDirectionInt == 3)){
            // accept placement for a left facing ship
            battleLogic.place_piece_on_board(selectedColumnInt, selectedRowInt, selectedSizeInt, selectedDirectionInt, battleLogic.player_grid);
            updatePlayerGridPlacementPage();
            removeItemFromShipSizeComboBox(selectedSizeString);
            shipsNotPlacedCounter--;
            feedbackLabelPlacementPage.setText("Ship placed!");
            
        }
        
        if(battleLogic.valid_direction_array[3] && (selectedDirectionInt == 4)){
            // accept placement for a left facing ship
            battleLogic.place_piece_on_board(selectedColumnInt, selectedRowInt, selectedSizeInt, selectedDirectionInt, battleLogic.player_grid);
            updatePlayerGridPlacementPage();
            removeItemFromShipSizeComboBox(selectedSizeString);
            shipsNotPlacedCounter--;
            feedbackLabelPlacementPage.setText("Ship placed!");
            
        }
        
        if(shipsNotPlacedCounter == 0){
            feedbackLabelPlacementPage.setText("All ships have been placed!");
            columnComboBoxPlacementPage.setVisible(false);
            columnLabelPlacementPage.setVisible(false);
            directionComboBoxPlacementPage.setVisible(false);
            directionLabelPlacementPage.setVisible(false);
            rowComboBoxPlacementPage.setVisible(false);
            rowLabelPlacementPage.setVisible(false);
            shipSizeComboBoxPlacementPage.setVisible(false);
            shipSizeLabelPlacementPage.setVisible(false);
            submitButtonPlacementPage.setVisible(false);
            continueToGameButtonPlacementPage.setVisible(true);
            
        }
        
            
    }//GEN-LAST:event_submitButtonPlacementPageActionPerformed

    private void continueToGameButtonPlacementPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueToGameButtonPlacementPageActionPerformed
        // TODO add your handling code here:
        // open the gameframe somehow
        placementFrame.setVisible(false);
        gameFrame.setVisible(true);
    }//GEN-LAST:event_continueToGameButtonPlacementPageActionPerformed

    
    private void updatePlayerGridPlacementPage(){
        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                if(battleLogic.player_grid[row][col] == 2){
                    playerGridPlacementPage.setValueAt("S", row, col);
                }
            }
        }
        playerGridPlacementPage.revalidate();
    }
    
    private void removeItemFromShipSizeComboBox(String sizeToRemove){
        if(sizeToRemove == "5"){ // this is how I remove stuff that needs removing
            shipSizeComboBoxPlacementPage.removeItem("5");
        }
        if(sizeToRemove == "4"){ // this is how I remove stuff that needs removing
            shipSizeComboBoxPlacementPage.removeItem("4");
        }
        if(sizeToRemove == "3"){ // this is how I remove stuff that needs removing
            shipSizeComboBoxPlacementPage.removeItem("3");
        }
        if(sizeToRemove == "2"){ // this is how I remove stuff that needs removing
            shipSizeComboBoxPlacementPage.removeItem("2");
        }
    }
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
            java.util.logging.Logger.getLogger(battleship_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(battleship_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(battleship_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(battleship_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                placementFrame.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox columnComboBoxPlacementPage;
    private javax.swing.JLabel columnLabelPlacementPage;
    private javax.swing.JButton continueToGameButtonPlacementPage;
    private javax.swing.JComboBox directionComboBoxPlacementPage;
    private javax.swing.JLabel directionLabelPlacementPage;
    private javax.swing.JLabel feedbackLabelPlacementPage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel playerGridLabelPlacementPage;
    private javax.swing.JTable playerGridPlacementPage;
    private javax.swing.JLabel rowALabelPlacementPage;
    private javax.swing.JLabel rowBLabelPlacementPage;
    private javax.swing.JLabel rowCLabelPlacementPage;
    private javax.swing.JComboBox rowComboBoxPlacementPage;
    private javax.swing.JLabel rowDLabelPlacementPage;
    private javax.swing.JLabel rowELabelPlacementPage;
    private javax.swing.JLabel rowFLabelPlacementPage;
    private javax.swing.JLabel rowGLabelPlacementPage;
    private javax.swing.JLabel rowHLabelPlacementPage;
    private javax.swing.JLabel rowILabelPlacementPage;
    private javax.swing.JLabel rowJLabelPlacementPage;
    private javax.swing.JLabel rowLabelPlacementPage;
    private javax.swing.JComboBox shipSizeComboBoxPlacementPage;
    private javax.swing.JLabel shipSizeLabelPlacementPage;
    private javax.swing.JButton submitButtonPlacementPage;
    // End of variables declaration//GEN-END:variables
}
