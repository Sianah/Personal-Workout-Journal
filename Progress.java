import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Progress implements ListSelectionListener, ActionListener {
    JFrame progress = new JFrame();
    private JPanel progressLabelBox;
    private JPanel DayAndNotes;
    private JPanel notesDisplay;

    private JLabel progressLabel;
    private JLabel dayNumberNotes;
    private JLabel progressNotes;
    private JLabel notes;

    private JList list3;
    private DefaultListModel<String> mDay;

    private JTextField dayText;
    private JTextField progressText;

    private JButton enter;

    private JSplitPane splitter3;

    private HashMap<String, progressInfo>prog;
    Progress(){
        mDay = new DefaultListModel<>();
        prog = new HashMap<String, progressInfo>();
//        GridBagConstraints gbc = new GridBagConstraints();
//        GridBagConstraints wkPro = new GridBagConstraints();
//        gbc.insets = new Insets(100,100,100,100);
        progressLabelBox = new JPanel();
        DayAndNotes = new JPanel();
        notesDisplay = new JPanel();

        progressLabel = new JLabel("Progress");
        dayNumberNotes = new JLabel("Day #: ");
        progressNotes = new JLabel("Notes: ");
        notes = new JLabel("Progress Journal: ");

        dayText = new JTextField();
        progressText = new JTextField();
        dayText.setPreferredSize(new Dimension(20,40));
        progressText.setPreferredSize(new Dimension(20,40));

        enter = new JButton("Enter");
        enter.addActionListener(this);

        list3 = new JList();
        list3.setVisibleRowCount(3);
        list3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list3 = new JList<String>(mDay);
        list3.addListSelectionListener(this);

//        progressLabelBox.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
//        progressLabelBox.setLayout(new GridBagLayout());
       DayAndNotes.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        DayAndNotes.setLayout(new GridLayout(1,5));
        notesDisplay.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        notesDisplay.setLayout(new GridLayout(0, 7));
//        gbc.gridx = 10;
//        gbc.gridy = 0;
//        progressLabelBox.add(progressLabel);
//        gbc.gridx = 2;
//        gbc.gridy = 2;
        DayAndNotes.add(dayNumberNotes);
//        gbc.gridx = 9;
//        gbc.gridy = 2;
        DayAndNotes.add(dayText);
//        gbc.gridx = 5;
//        gbc.gridy = 2;
        DayAndNotes.add(progressNotes);
//        gbc.gridx = 6;
//        gbc.gridy = 2;
        DayAndNotes.add(progressText);
//        gbc.gridx = 8;
//        gbc.gridy = 2;
        DayAndNotes.add(enter);
        notesDisplay.add(notes);

        progress.setPreferredSize(new Dimension(600,600));
        progress.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        progress.setTitle("Progress");
        progress.pack();
        progress.setVisible(true);
//        progress.add(progressLabelBox,BorderLayout.NORTH);
          progress.add(DayAndNotes, BorderLayout.NORTH);
//        progress.add(notesDisplay, BorderLayout.CENTER);
        progress.add(new JScrollPane(list3),BorderLayout.WEST);
        splitter3 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, list3, notesDisplay);
       notesDisplay.setLayout(new GridLayout(0,2));
        splitter3.setDividerLocation(150);
        progress.add(splitter3,BorderLayout.CENTER);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            int lastidx = list3.getMaxSelectionIndex();
            String selected = (String) list3.getSelectedValue();
            int index = list3.getSelectedIndex();
//            if (e.getValueIsAdjusting())
//                return;
            if (index < 0 || index >= mDay.size())
                return;

            for (Object x : prog.keySet()) {
                if (list3.getSelectedValue().equals(x)) {
                    notes.setText("Progress Journal: " + (prog.get(x)));
                }

            }
            list3.ensureIndexIsVisible(index);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        progressInfo progInf = new progressInfo(dayText.getText(),progressText.getText());
        if(e.getSource() == enter){
            prog.put(progInf.getmDayNumba(),progInf);
            System.out.println(prog);
            for (Object x : prog.keySet()) {
                mDay.addElement(String.valueOf(x));
                list3.setSelectedIndex(mDay.getSize() - 1);

                System.out.println(prog);
                System.out.println(list3);
            }
        }

        }
}

