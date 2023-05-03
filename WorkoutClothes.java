import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class WorkoutClothes implements ListSelectionListener, ActionListener {
    JFrame clothes = new JFrame();
    private JPanel clothesEntry;
    private JPanel buttons;
    private JPanel clothesInfo;

    private JLabel clothesName;
    private JLabel CDescriptionBox;
    private JLabel clothesInfoDisplay;

    private JTextField wantedClothes;
    private JTextField CDescription;

    private JButton add;
    private JButton remove;
    private JList list2;

    private HashMap<String, clothesInfo>cloth;

    private DefaultListModel<String> mClothesName;

    private JSplitPane splitter2;
    WorkoutClothes(){
        cloth = new HashMap<String, clothesInfo>();
        mClothesName = new DefaultListModel<>();

        clothesEntry = new JPanel();
        buttons = new JPanel();
        clothesInfo = new JPanel();

        clothesName = new JLabel("Clothes: ");
        CDescriptionBox = new JLabel("Description: ");
        clothesInfoDisplay = new JLabel("Clothes Info: ");

        wantedClothes = new JTextField();
        CDescription = new JTextField();

        add = new JButton("+");
        add.addActionListener(this);
        remove = new JButton("-");
        remove.addActionListener(this);

        list2 = new JList();
        list2.setVisibleRowCount(3);
        list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list2 = new JList<String>(mClothesName);
        list2.addListSelectionListener(this);

        clothesEntry.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        clothesEntry.setLayout(new GridLayout());
        buttons.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        buttons.setLayout(new GridLayout());
        clothesInfo.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        clothesInfo.setLayout(new GridLayout());

        clothesEntry.add(clothesName);
        clothesEntry.add(wantedClothes);
        clothesEntry.add(CDescriptionBox);
        clothesEntry.add(CDescription);
        buttons.add(add);
        buttons.add(remove);
        clothesInfo.add(clothesInfoDisplay);

        clothes.setPreferredSize(new Dimension(600,600));
        clothes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clothes.setTitle("Workout Clothes");
        clothes.pack();
        clothes.setVisible(true);
        clothes.add(clothesEntry,BorderLayout.NORTH);
        clothes.add(clothesInfo,BorderLayout.CENTER);
        clothes.add(buttons,BorderLayout.SOUTH);
        clothes.add(new JScrollPane(list2),BorderLayout.WEST);
        splitter2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, list2, clothesInfo);
        clothesInfo.setLayout(new GridLayout(0,2));
        splitter2.setDividerLocation(150);
        clothes.add(splitter2,BorderLayout.CENTER);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            int lastidx = list2.getMaxSelectionIndex();
            String selected = (String) list2.getSelectedValue();
            int index = list2.getSelectedIndex();
//            if (e.getValueIsAdjusting())
//                return;
            if (index < 0 || index >= mClothesName.size())
                return;

            for (Object x : cloth.keySet()) {
                if (list2.getSelectedValue().equals(x)) {
                    clothesInfoDisplay.setText("Clothes Info: " + (cloth.get(x)));
                }

            }
            list2.ensureIndexIsVisible(index);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clothesInfo clothInf = new clothesInfo(wantedClothes.getText(), CDescription.getText());
    if(e.getSource() == add) {
        cloth.put(clothInf.getmClothesName(), clothInf);
        for (Object x : cloth.keySet()) {
            mClothesName.addElement(String.valueOf(x));
            list2.setSelectedIndex(mClothesName.getSize() - 1);

            System.out.println(cloth);
            System.out.println(list2);
        }
    }
        else if(e.getSource() == remove){
            cloth.remove(clothInf.getmClothesName());
//            equip.remove(equipInf.getmEquipName(),equipInf);
            for(Object x: cloth.keySet()) {
                int index = list2.getSelectedIndex();
                mClothesName.removeElementAt(index);
                list2.setSelectedIndex(mClothesName.getSize() - 1);
                clothesInfoDisplay.setText("Clothes Info: ");

                System.out.println(cloth);
                System.out.println(list2);
            }

    }
    }
}
