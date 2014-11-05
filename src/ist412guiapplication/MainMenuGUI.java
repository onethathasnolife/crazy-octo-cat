﻿/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412guiproject;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;


/**
 *
 * @author Jeralyn Tseng
 */
public class MainMenuGUI extends javax.swing.JFrame {
  //  JFrame frame = new JFrame();
    
    


    /**
     * Creates new form Management
     */
    public MainMenuGUI() {
       
        initComponents();
        this.setVisible(true);
    }
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {


        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTree = new javax.swing.JTree();
        runsSeparator = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        prevRunPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        currentRunPane = new javax.swing.JTextPane();
        projectsComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        runBtn = new javax.swing.JButton();
        pauseBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        addCourseBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        projectTemplatesBtn = new javax.swing.JButton();
        addStudentBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();


        jLabel1.setText("jLabel1");


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Courses");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("IST 412");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Student A");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Project 1");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Project 2");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Student B");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Project 1");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Project 2");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("IST 297D");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Student C");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Project 23");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("IST 311");
        treeNode1.add(treeNode2);
        courseTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(courseTree);


        prevRunPane.setText("This area will contain a *table* outling the previously ran projects associated with either a course or student.\n\n\t-Selecting a *course and project* will show all of the run results for that *project* in that course\n\n\t-Selecting a *student* will show the run results of *all projects* of that particular student.");
        jScrollPane2.setViewportView(prevRunPane);


        currentRunPane.setText("This area will contain the progress and results of the current run.\n\tInfo like:\n\t- Current Project/Test Run\n\t-  Final Tally of Run Results:\n\t\t- # of projects compiled\n\t\t- # failed to compile\n\t\t- time running\n\t\t- etc.");
        jScrollPane3.setViewportView(currentRunPane);
        currentRunPane.getAccessibleContext().setAccessibleName("");


        projectsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Project 1", "Project 2", "Project 3", "Project 4" }));
        projectsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectsComboBoxActionPerformed(evt);
            }
        });


        jButton1.setText("Apply Project To Selected");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projectsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(runsSeparator)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(runsSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(projectsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        runBtn.setText("Run");
        runBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runBtnActionPerformed(evt);
            }
        });


        pauseBtn.setText("Pause");
        pauseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBtnActionPerformed(evt);
            }
        });


        stopBtn.setText("Stop");


        addCourseBtn.setText("Add Course");
        addCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseBtnActionPerformed(evt);
            }
        });


        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });


        projectTemplatesBtn.setText("Project Templates");
        projectTemplatesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectTemplatesBtnActionPerformed(evt);
            }
        });


        addStudentBtn.setText("Add Student");
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });


        fileMenu.setText("File");
        menuBar.add(fileMenu);


        editMenu.setText("Edit");
        menuBar.add(editMenu);


        setJMenuBar(menuBar);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addCourseBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addStudentBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(projectTemplatesBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(runBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pauseBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCourseBtn)
                    .addComponent(deleteBtn)
                    .addComponent(runBtn)
                    .addComponent(pauseBtn)
                    .addComponent(stopBtn)
                    .addComponent(projectTemplatesBtn)
                    .addComponent(addStudentBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );


        pack();
    }// </editor-fold>                        


    private void addCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new CourseCreationUI(this);
    }                                            


    private void pauseBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         


    }                                        


    private void runBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        new RunSetupGUI();
    }                                      


    private void projectTemplatesBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        new ProjectTemplateManager();
    }                                                   


    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        new StudentGUI();
    }                                             


    private void projectsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
                                          
        DefaultTreeModel model = (DefaultTreeModel) courseTree.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) courseTree.getLastSelectedPathComponent();
        String value = projectsComboBox.getSelectedItem().toString();
        DefaultMutableTreeNode newProject = new DefaultMutableTreeNode(value);
        model.insertNodeInto(newProject, selectedNode, WIDTH); 
    }                                        


    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
//        JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?", 
//                "Delete This File? ",
//                JOptionPane.YES_NO_OPTION);
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?", 
                "Delete This File? ",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION ){
            
            DefaultTreeModel model = (DefaultTreeModel) courseTree.getModel();
            DefaultMutableTreeNode node;
            TreePath path = courseTree.getSelectionPath();
            node = (DefaultMutableTreeNode) path.getLastPathComponent();
            model.removeNodeFromParent(node);
        }
        else{
            
        }
    }                                         


    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton addCourseBtn;
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JTree courseTree;
    private javax.swing.JTextPane currentRunPane;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JTextPane prevRunPane;
    private javax.swing.JButton projectTemplatesBtn;
    private javax.swing.JComboBox projectsComboBox;
    private javax.swing.JButton runBtn;
    private javax.swing.JSeparator runsSeparator;
    private javax.swing.JButton stopBtn;
    // End of variables declaration                   
}