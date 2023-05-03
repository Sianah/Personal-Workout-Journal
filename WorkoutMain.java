import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WorkoutMain extends JFrame implements ActionListener {
//    static HashMap<String, workoutInformation> WorkoutInformation = new HashMap<String, workoutInformation>();//key-days value-user input

    private JLabel Journal;
    private JLabel Sunday;
    private JLabel Monday;
    private JLabel Tuesday;
    private JLabel Wednesday;
    private JLabel Thursday;
    private JLabel Friday;
    private JLabel Saturday;
    private JPanel WorkoutInfo;
    private JPanel WorkoutInfoDays;
    private JPanel Text;

    //    private JPanel info;
    private JTextField SunWorkout;
    private JTextField MonWorkout;
    private JTextField TueWorkout;
    private JTextField WedWorkout;
    private JTextField ThuWorkout;
    private JTextField FriWorkout;
    private JTextField SatWorkout;
    private JButton mDiet;
    private JButton workoutEquipment;
    private JButton workoutClothes;
    private JButton progress;
    private JButton done;
    private JFrame stateFrame;

    private ArrayList<workoutInformation>mWktInfo;

    //private textfield info

    public static void main(String[] args) throws FileNotFoundException {
        new WorkoutMain();
//           SaveWorkoutInfo();

    }

    public WorkoutMain() {
        mWktInfo = new ArrayList<>();

        stateFrame = new JFrame();
        stateFrame.setPreferredSize(new Dimension(600, 600));
        WorkoutInfo = new JPanel();
        WorkoutInfoDays = new JPanel();
        Text = new JPanel();
//        info = new JPanel();
        Journal = new JLabel("Journal Stuff: ");
        Sunday = new JLabel("Sunday");
        Monday = new JLabel("Monday");
        Tuesday = new JLabel("Tuesday");
        Wednesday = new JLabel("Wednesday");
        Thursday = new JLabel("Thursday");
        Friday = new JLabel("Friday");
        Saturday = new JLabel("Saturday");

        SunWorkout = new JTextField();
        SunWorkout.setPreferredSize(new Dimension(20, 20));
        MonWorkout = new JTextField();
        MonWorkout.setPreferredSize(new Dimension(3, 3));
        TueWorkout = new JTextField();
        TueWorkout.setPreferredSize(new Dimension(3, 3));
        WedWorkout = new JTextField();
        WedWorkout.setPreferredSize(new Dimension(3, 3));
        ThuWorkout = new JTextField();
        ThuWorkout.setPreferredSize(new Dimension(3, 3));
        FriWorkout = new JTextField();
        FriWorkout.setPreferredSize(new Dimension(3, 3));
        SatWorkout = new JTextField();
        SatWorkout.setPreferredSize(new Dimension(3, 3));

        mDiet = new JButton("Diet");
        mDiet.addActionListener(this);
        workoutEquipment = new JButton("Workout Equipment");
        workoutEquipment.addActionListener(this);
        workoutClothes = new JButton("Workout Clothes");
        workoutClothes.addActionListener(this);
        progress = new JButton("Progress");
        progress.addActionListener(this);
        done = new JButton("done");
        done.addActionListener(this);
//        StateName = new JLabel("State: ");
//        SAbbreviation = new JLabel("Abbreviation: ");
//        SName = new JLabel("State name: ");
//        SRate = new JLabel("Unemployment rate: ");
        WorkoutInfo.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        WorkoutInfo.setLayout(new GridLayout(0, 7));
//        StateBox.add(StateName);
        WorkoutInfo.add(Journal);
        WorkoutInfo.add(mDiet);
        WorkoutInfo.add(workoutEquipment);
        WorkoutInfo.add(workoutClothes);
        WorkoutInfo.add(progress);
        WorkoutInfo.add(done);
//        WorkoutInfo.add(SunWorkout);
        WorkoutInfoDays.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        WorkoutInfoDays.setLayout(new GridLayout(1, 7));
        WorkoutInfoDays.add(Sunday);
        WorkoutInfoDays.add(Monday);
        WorkoutInfoDays.add(Tuesday);
        WorkoutInfoDays.add(Wednesday);
        WorkoutInfoDays.add(Thursday);
        WorkoutInfoDays.add(Friday);
        WorkoutInfoDays.add(Saturday);
        Text.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        Text.setLayout(new GridLayout(0, 7));
        Text.add(SunWorkout);
        //String var = SunWorkout.getText();

        Text.add(MonWorkout);
        Text.add(TueWorkout);
        Text.add(WedWorkout);
        Text.add(ThuWorkout);
        Text.add(FriWorkout);
        Text.add(SatWorkout);
//        StateBox.add(SAbbreviation);
////        StateBox.add(SName);
////        StateBox.add(SRate);
        stateFrame.add(WorkoutInfo, BorderLayout.SOUTH);
        stateFrame.add(WorkoutInfoDays, BorderLayout.NORTH);
        stateFrame.add(Text, BorderLayout.CENTER);
//        stateFrame.add(info, BorderLayout.CENTER);
        stateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stateFrame.setTitle("Let's Get Pumped!");
        stateFrame.pack();
        stateFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mDiet) {
//            stateFrame.dispose();
            Diet dietWindow = new Diet();
            System.out.println("mDiet");
        } else if (e.getSource() == workoutEquipment) {
            WorkoutEquipment wkEquip = new WorkoutEquipment();
            System.out.println("wkEquip");
        } else if (e.getSource() == workoutClothes) {
            WorkoutClothes wkClothes = new WorkoutClothes();
            System.out.println("hello wordl");
        } else if (e.getSource() == progress) {
            Progress proGress = new Progress();
            System.out.println("hello wordl");
        } else {
            workoutInformation wkInfo = new workoutInformation(SunWorkout.getText(), MonWorkout.getText(), TueWorkout.getText(), WedWorkout.getText(), ThuWorkout.getText(), FriWorkout.getText(), SatWorkout.getText());
            mWktInfo.add(wkInfo);
            System.out.println("here");
            System.out.println(mWktInfo);
        }

    }


    public static void SaveWorkout(ArrayList<workoutInformation>mWktInfo) throws FileNotFoundException {
        File csvFile = new File("wkInfo.csv");
        PrintWriter out = new PrintWriter(csvFile);
        for(workoutInformation wkinf : mWktInfo){
            out.println(wkinf.getmSunday());
        }
        out.close();
    }
//        System.out.println(WorkoutInformation);
//        Scanner reader = null;
//        File gains = new File("wkInfo.csv");//once
//        PrintWriter out = new PrintWriter(gains);
//        try {
//            reader = new Scanner(gains);
//        } catch (FileNotFoundException e) {
//            System.out.println("ERROR! FILE CANNOT BE FOUND!");
//        }
//        if (reader == null) {
//            return null;
//        }
//        reader.nextLine();
//        while (reader.hasNext()) {
//            String line = reader.nextLine();
//            StringTokenizer tokenizer = new StringTokenizer(line, ",");
//
//            String wSunday = tokenizer.nextToken();
//            String wMonday = tokenizer.nextToken();
//            String wTuesday = tokenizer.nextToken();
//            String wWednesday = tokenizer.nextToken();
//            String wThursday = tokenizer.nextToken();
//            String wFriday = tokenizer.nextToken();
//            String wSaturday = tokenizer.nextToken();
//
//            workoutInformation s = new workoutInformation(wSunday, wMonday, wTuesday, wWednesday, wThursday, wFriday, wSaturday);
//
//            WorkoutInformation.put(s.getmSunday(), s);
//        }
//        return WorkoutInformation;
//    }
}
