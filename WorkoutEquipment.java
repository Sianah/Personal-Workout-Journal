import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class WorkoutEquipment implements ListSelectionListener, ActionListener {
    JFrame equipment = new JFrame();
    private JPanel equipmentEntry;
    private JPanel buttons;
    private JPanel equipInfo;
    private JPanel jList;

    private JLabel equipmentName;
    private JLabel descriptionBox;
    private JLabel equipmentInfoDisplay;

    private JTextField wantedEquipment;
    private JTextField description;

    private JButton add;
    private JButton remove;
    private JList list;
   private DefaultListModel<String> mEquipmentName;
    private HashMap<String, equipmentInfo> equip;

    private JSplitPane splitter;
    WorkoutEquipment(){
        equip = new HashMap<String, equipmentInfo>();
        mEquipmentName = new DefaultListModel<>();

        equipmentEntry = new JPanel();
        buttons = new JPanel();
        equipInfo = new JPanel();
//        jList = new JPanel();

        equipmentName = new JLabel("Equipment: ");
        descriptionBox = new JLabel("Description: ");
        equipmentInfoDisplay = new JLabel("Equipment Info: ");

        wantedEquipment = new JTextField();
        description = new JTextField();

        add = new JButton("+");
        add.addActionListener(this);
        remove = new JButton("-");
        remove.addActionListener(this);

        list = new JList<String>(mEquipmentName);

        list.setVisibleRowCount(3);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);

        equipmentEntry.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        equipmentEntry.setLayout(new GridLayout());
        buttons.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        buttons.setLayout(new GridLayout());
        equipInfo.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        equipInfo.setLayout(new GridLayout());
//        jList.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
//        jList.setLayout(new GridLayout());

        equipmentEntry.add(equipmentName);
        equipmentEntry.add(wantedEquipment);
        equipmentEntry.add(descriptionBox);
        equipmentEntry.add(description);
        buttons.add(add);
        buttons.add(remove);
        equipInfo.add(equipmentInfoDisplay);
//        jList.add(list);

        equipment.setPreferredSize(new Dimension(600,600));
        equipment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        equipment.setTitle("Workout Equipment");
        equipment.pack();
        equipment.setVisible(true);
        equipment.add(equipmentEntry,BorderLayout.NORTH);
        equipment.add(equipInfo,BorderLayout.CENTER);
        equipment.add(buttons,BorderLayout.SOUTH);
        equipment.add(new JScrollPane(list),BorderLayout.WEST);
        splitter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, list, equipInfo);
        equipInfo.setLayout(new GridLayout(0,2));
        splitter.setDividerLocation(150);
        equipment.add(splitter,BorderLayout.CENTER);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        equipmentInfo equipInf = new equipmentInfo(wantedEquipment.getText(), description.getText());
        if(e.getSource() == add){
        equip.put(equipInf.getmEquipName(),equipInf);
        for(Object x: equip.keySet()){
            mEquipmentName.addElement(String.valueOf(x));
            list.setModel(mEquipmentName);
//            list.setSelectedIndex(mEquipmentName.getSize()-1);
        }

//            Vector<Items>items = new Vector<>();
//            for(HashMap.Entry<String,equipmentInfo> entry : equip.entrySet()){
//                items.add(new Items(entry.getKey(), entry.getValue()));
//            }
//            list = new JList(items);
//            list.setSelectedIndex(items.size()-1);
        System.out.println(equip);
            System.out.println(list);

        }
        else if(e.getSource() == remove){
            equip.remove(equipInf.getmEquipName());
//            equip.remove(equipInf.getmEquipName(),equipInf);
            for(Object x: equip.keySet()){
                int index = list.getSelectedIndex();
                mEquipmentName.removeElementAt(index);
                list.setSelectedIndex(mEquipmentName.getSize()-1);
                equipmentInfoDisplay.setText("Equipment Info: ");

                System.out.println(equip);
                System.out.println(list);
            }
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
//        if(!e.getValueIsAdjusting()){
//           int lastidx =  list.getMaxSelectionIndex();
//           String selected = (String)list.getSelectedValue();
            int index = list.getSelectedIndex();
        if (e.getValueIsAdjusting())
            return;
        if (index < 0 || index >= mEquipmentName.size())
            return;

        list.ensureIndexIsVisible(index);
        //

            for(Object x: equip.keySet()){
                if(list.getSelectedValue().equals(x))
                {
                    equipmentInfoDisplay.setText("Equipment Info: "+ (equip.get(x)));
                }

            }
            list.ensureIndexIsVisible(index);
        }
    }

