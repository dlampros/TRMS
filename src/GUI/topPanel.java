/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * topPanel.java
 *
 * Created on 5 Ξ‘Ο€Ο� 2011, 9:15:34 ΞΌΞΌ
 */

package GUI;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class topPanel extends javax.swing.JPanel {	
	private static final long serialVersionUID = 1L;
	
	/** Creates new form topPanel */
    public topPanel(Object[][] data, String[] col, String taxpayer, String afm, String income) {
        initComponents();
        InsertColumn(data, col, taxpayer, afm, income);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jSplitPane1 = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameOut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        VATOut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        incomeOut = new javax.swing.JTextField();
        bottomPanel = new javax.swing.JPanel();
        here = new javax.swing.JScrollPane();

        jSplitPane1.setDividerSize(10);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setResizeWeight(0.6);
        jSplitPane1.setOneTouchExpandable(true);

        topPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 2, 18))); // NOI18N
        topPanel.setDoubleBuffered(false);
        topPanel.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        nameOut.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameOut.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        nameOut.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel3.setText("VAT Registration Number");

        VATOut.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        VATOut.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        VATOut.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel4.setText("Income");

        incomeOut.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        incomeOut.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        incomeOut.setEnabled(false);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addComponent(nameOut, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addComponent(VATOut, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addComponent(incomeOut, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameOut, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VATOut, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incomeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(topPanel);

        bottomPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Optional Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 2, 18))); // NOI18N

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(here, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addComponent(here, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InsertColumn(Object[][] data, String[] col, String taxpayer, String afm, String income){
        nameOut.setText(taxpayer);
        VATOut.setText(afm);
        incomeOut.setText(income);
        
        DefaultTableModel model = new DefaultTableModel(data, col);
        JTable tabl = new JTable(model);
        tabl.setEnabled(false);
        JTableHeader header = tabl.getTableHeader();
        header.setBackground(Color.yellow);
        here.add(tabl);
        here.setViewportView(tabl);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VATOut;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JScrollPane here;
    private javax.swing.JTextField incomeOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField nameOut;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
