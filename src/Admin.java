

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Admin extends javax.swing.JFrame {

    private static List<String> UserIDs; //List of ids for quick reference
    private static List<String> GroupIDs;
    private static Admin instance;
    private static List<UserGroup> groups;//actualy list of corresponding objects 
    private static List<User> users;
    UserGroup group = new UserGroup();
    private DefaultMutableTreeNode root = new DefaultMutableTreeNode(group.getRoot());
    private DefaultTreeModel model = new DefaultTreeModel(root);
    
    //Admin class based on Singleton
    //constructor
     private Admin() {
        GroupIDs = new <String> ArrayList();
        UserIDs = new <String> ArrayList();
        groups = new <UserGroup> ArrayList();
        users = new <User> ArrayList();
        groups.add(new UserGroup("Root"));
        initComponents();
    }

    public static Admin getInstance() {
        if (instance == null) {
            synchronized (Admin.class) {
                if (instance == null) {
                    instance = new Admin();
                }
            }
        }
        return instance;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree3 = new javax.swing.JTree();
        InputGroupId = new javax.swing.JTextField();
        InputId = new javax.swing.JTextField();
        AddGroup = new javax.swing.JButton();
        AddUser = new javax.swing.JButton();
        OpenUserView = new javax.swing.JButton();
        ShowUserTotal = new javax.swing.JButton();
        ShowGroupTotal = new javax.swing.JButton();
        ShowMessageTotal = new javax.swing.JButton();
        ShowPositivePercentage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree(model);
        Verify = new javax.swing.JButton();
        LastUpdate = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTree2);

        jScrollPane3.setViewportView(jTree3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InputGroupId.setText("Group ID");
        InputGroupId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputGroupIdActionPerformed(evt);
            }
        });

        InputId.setText("User ID");
        InputId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIdActionPerformed(evt);
            }
        });

        AddGroup.setText("Add Group");
        AddGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGroupActionPerformed(evt);
            }
        });

        AddUser.setText("Add User");
        AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserActionPerformed(evt);
            }
        });

        OpenUserView.setText("Open User View");
        OpenUserView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenUserViewActionPerformed(evt);
            }
        });

        ShowUserTotal.setText("Show User Total");
        ShowUserTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowUserTotalActionPerformed(evt);
            }
        });

        ShowGroupTotal.setText("Show Group Total");
        ShowGroupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowGroupTotalActionPerformed(evt);
            }
        });

        ShowMessageTotal.setText("Show Messages Total");
        ShowMessageTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMessageTotalActionPerformed(evt);
            }
        });

        ShowPositivePercentage.setText("Show Positive Percentage");
        ShowPositivePercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPositivePercentageActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTree1);

        Verify.setText("Verify IDs");
        Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyActionPerformed(evt);
            }
        });

        LastUpdate.setText("Last Updated User");
        LastUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(InputId)
                                    .addComponent(InputGroupId, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AddGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(AddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(OpenUserView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ShowMessageTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ShowUserTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ShowGroupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ShowPositivePercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Verify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LastUpdate)
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddUser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddGroup))
                .addGap(18, 18, 18)
                .addComponent(OpenUserView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Verify)
                    .addComponent(LastUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowUserTotal)
                    .addComponent(ShowGroupTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowMessageTotal)
                    .addComponent(ShowPositivePercentage))
                .addGap(13, 13, 13))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //add user
    private void AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserActionPerformed
        //empty input error
        if (InputId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please type a user.", "Add Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!UserIDs.contains(InputId.getText())) {//check if not unique id
                    User user = new User(InputId.getText());
                    DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user.getID(), false);
                    UserIDs.add(InputId.getText());
                    users.add(user);
                    model.insertNodeInto(userNode, root, 0);    
                    //root.add(userNode);
            } else {
                JOptionPane.showMessageDialog(null, "Already exists.", "Add Error", JOptionPane.INFORMATION_MESSAGE); //nonunique id error
            }
        }
        
        model.reload(root);
        expandTree(jTree1, 0, jTree1.getRowCount());
        InputId.setText("");
    }//GEN-LAST:event_AddUserActionPerformed

    private void OpenUserViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenUserViewActionPerformed
        //empty input error, reads from text Area for User ID
        if (InputId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Type a user.", "View Error", JOptionPane.INFORMATION_MESSAGE); 
        } else {
                String selectedUser = InputId.getText();
                User user = new User(selectedUser);
                UserView userView = new UserView(user, users, UserIDs); //opens UserView and passes in list of user objs and ids
                userView.setVisible(true);
                userView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
    }//GEN-LAST:event_OpenUserViewActionPerformed

    private void ShowGroupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowGroupTotalActionPerformed
         int numGroups = groups.size();
        JOptionPane.showMessageDialog(null, "Total Groups: " + numGroups, "Show Group Total", JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_ShowGroupTotalActionPerformed

    //cannot delete, but empty
    private void InputIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputIdActionPerformed

    //cannot delete, but empty
    private void InputGroupIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputGroupIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputGroupIdActionPerformed

    private void ShowUserTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowUserTotalActionPerformed
        JOptionPane.showMessageDialog(null, "Total Users: " + users.size(), "Show User Total", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_ShowUserTotalActionPerformed

    private void ShowMessageTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowMessageTotalActionPerformed
       int totalMessages = 0;
       //adds all individual users total messages
       for(User use : users){
           totalMessages += use.getMessageTotal();
       }
        JOptionPane.showMessageDialog(null, "Message total: " + totalMessages, "Show Message Total", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ShowMessageTotalActionPerformed

    private void ShowPositivePercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPositivePercentageActionPerformed
      int positiveCount= 0;
      int totalMessages = 0;
      double positivePercentage = 0.0;
      //adds indiv users fields   
      for(User use : users){
           positiveCount += use.getPositiveWord();
           totalMessages += use.getMessageTotal();
       }
      //calculate percentage
      positivePercentage = (positiveCount / totalMessages) * 100;
      JOptionPane.showMessageDialog(null, "Percentage of Positive Words: " + positivePercentage + "%", "Show Positive Percentage", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ShowPositivePercentageActionPerformed

    private void AddGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGroupActionPerformed
        //empty input error
        if (InputGroupId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please type a group .", "Add Group Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!GroupIDs.contains(InputGroupId.getText())) {//check of group id is unique
                    UserGroup group = new UserGroup(InputGroupId.getText());
                    DefaultMutableTreeNode groupNode = new DefaultMutableTreeNode(group.getID(), false);
                    UserIDs.add(InputGroupId.getText());
                    groups.add(group);
                    root.add(groupNode);
            } else {
                JOptionPane.showMessageDialog(null, "Already exists.", "Add Error", JOptionPane.INFORMATION_MESSAGE); //non unique id error
            }
        }
        
        model.reload(root);
        expandTree(jTree1, 0, jTree1.getRowCount());
        InputGroupId.setText("");
    }//GEN-LAST:event_AddGroupActionPerformed

    private void VerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyActionPerformed
    Set <String> seenValues = new HashSet();
    Pattern pattern = Pattern.compile("\\s"); //white space checker
    Matcher matcher;
    //iterate through List to see if duplicates or contains whitespace
    for(String value : UserIDs){
        matcher = pattern.matcher(value);
        if(seenValues.contains(value) || matcher.find()){
            JOptionPane.showMessageDialog(null, "Verify Error in User IDs.", "ID Verify Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else{
            seenValues.add(value);
        }
    }
    for(String value : GroupIDs){
        matcher = pattern.matcher(value);
        if(seenValues.contains(value) || matcher.find()){
            JOptionPane.showMessageDialog(null, "Verify Error in Group IDs.", "ID Verify Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else{
            seenValues.add(value);
        }
        
    }  
       JOptionPane.showMessageDialog(null, "All IDs are OK.", "ID Verify No Error", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_VerifyActionPerformed

    private void LastUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastUpdateActionPerformed
        long latest = users.get(0).getLastUpDateTime(); // earliest time updated
        User display = users.get(0); //last updated user
        for(User user: users){
            if(latest < user.getLastUpDateTime()){
                latest = user.getLastUpDateTime();
                display = user;
            }
        }
        JOptionPane.showMessageDialog(null, "Last Up Dated User ID: " + display.getID(), "ID Verify No Error", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_LastUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddGroup;
    private javax.swing.JButton AddUser;
    private javax.swing.JTextField InputGroupId;
    private javax.swing.JTextField InputId;
    private javax.swing.JButton LastUpdate;
    private javax.swing.JButton OpenUserView;
    private javax.swing.JButton ShowGroupTotal;
    private javax.swing.JButton ShowMessageTotal;
    private javax.swing.JButton ShowPositivePercentage;
    private javax.swing.JButton ShowUserTotal;
    private javax.swing.JButton Verify;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JTree jTree2;
    private javax.swing.JTree jTree3;
    // End of variables declaration//GEN-END:variables
   
 
    private void expandTree(JTree tree, int start, int rows) {
        for (int i = start; i < rows; ++i) {
            tree.expandRow(i);
        }

        if (tree.getRowCount() != rows) {
            expandTree(tree, rows, tree.getRowCount());

        }
    }

}
