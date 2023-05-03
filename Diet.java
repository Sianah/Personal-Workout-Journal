import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Diet implements ActionListener {
    private ArrayList<dietInfo>dietInformation;

    private JLabel Food;
    private JLabel description;
    private JLabel calories;
    private JLabel fat;
    private JLabel cholesterol;
    private JLabel sodium;
    private JLabel carbs;
    private JLabel protein;
    private JLabel empty;
    private JLabel result;

//    private JLabel mSunday;
//    private JLabel mMonday;
//    private JLabel mTuesday;
//    private JLabel mWednesday;
//    private JLabel mThursday;
//    private JLabel mFriday;
//    private JLabel mSaturday;

    private JPanel FoodandRec;
    private JPanel foodDescription;
    private JPanel thatOneButton;
    private JPanel weekdays;

    private JButton recommendation;
    private JButton mDone;

    private JTextField mDesc;
    private JTextField mCal;
    private JTextField mFat;
    private JTextField mChol;
    private JTextField mSod;
    private JTextField mCarb;
    private JTextField mPro;
    private JTextField mRes;
    JFrame dietFrame = new JFrame();
//    JLabel label = new JLabel("Congrats! You figured out how to open another window from a button bruh!!");

    Diet() {
        dietInformation = new ArrayList<>();
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagConstraints wkGBC = new GridBagConstraints();
        gbc.insets = new Insets(55,55,55,55);
//        wkGBC.insets = new Insets(55,55,55,55);
//        label.setBounds(0,0,100,50);
//        label.setFont(new Font(null,Font.PLAIN,25));
        dietFrame.setPreferredSize(new Dimension(600,600));
        Food = new JLabel("Food: ");
        description = new JLabel("Description");
        calories = new JLabel("Calories");
        fat = new JLabel("Fat");
        cholesterol = new JLabel("Cholesterol");
        sodium = new JLabel("Sodium");
        carbs = new JLabel("Carbs");
        protein = new JLabel("Protein");
        result = new JLabel("Result");
        recommendation = new JButton("Recommendation");
        recommendation.addActionListener(this);
        mDone = new JButton("Enter");
        mDone.addActionListener(this);
//        mSunday = new JLabel("Sunday");
//        mMonday = new JLabel("Monday");
//        mTuesday = new JLabel("Tuesday");
//        mWednesday = new JLabel("Wednesday");
//        mThursday = new JLabel("Thursday");
//        mFriday = new JLabel("Friday");
//        mSaturday = new JLabel("Saturday");


        FoodandRec = new JPanel();
        foodDescription = new JPanel();
        thatOneButton = new JPanel();
//        weekdays = new JPanel();

        mDesc = new JTextField();
        mDesc.setPreferredSize(new Dimension(20,20));
        mCal = new JTextField();
        mCal.setPreferredSize(new Dimension(20,20));
        mFat = new JTextField();
        mFat.setPreferredSize(new Dimension(20,20));
        mChol = new JTextField();
        mChol.setPreferredSize(new Dimension(20,20));
        mSod = new JTextField();
        mSod.setPreferredSize(new Dimension(20,20));
        mCarb = new JTextField();
        mCarb.setPreferredSize(new Dimension(20,20));
        mPro = new JTextField();
        mPro.setPreferredSize(new Dimension(20,20));
        mRes = new JTextField();
        mRes.setPreferredSize(new Dimension(20,20));


        FoodandRec.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        foodDescription.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        foodDescription.setLayout(new GridLayout());
        thatOneButton.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        thatOneButton.setLayout(new GridLayout());
//        weekdays.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
//        weekdays.setLayout(new GridLayout());

       FoodandRec.setLayout(new GridBagLayout());
        gbc.gridx = 4;
       gbc.gridy = 0;
       FoodandRec.add(Food,gbc);

       gbc.gridx = 5;
       gbc.gridy = 0;
       FoodandRec.add(recommendation,gbc);

       gbc.gridx = 1;
       gbc.gridy = 2;
        FoodandRec.add(description,gbc);

       gbc.gridx = 2;
       gbc.gridy = 2;
        FoodandRec.add(calories,gbc);

       gbc.gridx = 3;
       gbc.gridy = 2;
        FoodandRec.add(fat,gbc);
        gbc.gridx = 4;
        gbc.gridy = 2;
        FoodandRec.add(cholesterol,gbc);
        gbc.gridx = 5;
        gbc.gridy = 2;
        FoodandRec.add(sodium,gbc);
        gbc.gridx = 6;
        gbc.gridy = 2;
        FoodandRec.add(carbs,gbc);
        gbc.gridx = 7;
        gbc.gridy = 2;
        FoodandRec.add(protein,gbc);
//        gbc.gridx = 8;
//        gbc.gridy = 2;
//        FoodandRec.add(result,gbc);


        foodDescription.add(mDesc);
        foodDescription.add(mCal);
        foodDescription.add(mFat);
        foodDescription.add(mChol);
        foodDescription.add(mSod);
        foodDescription.add(mCarb);
        foodDescription.add(mPro);
//        foodDescription.add(mRes);

        thatOneButton.add(mDone);

//        wkGBC.gridx = 0;
//        wkGBC.gridy = 0;
//        weekdays.add(mSunday,wkGBC);
//        wkGBC.gridx = 1;
//        wkGBC.gridy = 1;
//        weekdays.add(mMonday,wkGBC);
//        wkGBC.gridx = 0;
//        wkGBC.gridy = 2;
//        weekdays.add(mTuesday,wkGBC);
//        wkGBC.gridx = 0;
//        wkGBC.gridy = 3;
//        weekdays.add(mWednesday,wkGBC);
//        wkGBC.gridx = 0;
//        wkGBC.gridy = 4;
//        weekdays.add(mThursday,wkGBC);
//        wkGBC.gridx = 0;
//        wkGBC.gridy = 5;
//        weekdays.add(mFriday,wkGBC);
//        wkGBC.gridx = 0;
//        wkGBC.gridy = 6;
//        weekdays.add(mSaturday,wkGBC);


        dietFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dietFrame.setTitle("Diet");
        dietFrame.pack();
        dietFrame.setVisible(true);
        dietFrame.add(FoodandRec,BorderLayout.NORTH);
        dietFrame.add(foodDescription,BorderLayout.CENTER);
        dietFrame.add(thatOneButton,BorderLayout.SOUTH);
//        dietFrame.add(weekdays,BorderLayout.WEST);
//        dietFrame.add(foodDescription);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mDone){
        dietInfo dieInfo = new dietInfo(mDesc.getText(), mCal.getText(), mFat.getText(), mChol.getText(), mSod.getText(), mCarb.getText(), mPro.getText(), mRes.getText());
        dietInformation.add(dieInfo);
            System.out.println(dietInformation);
        }
        else if(e.getSource() == recommendation){
            String things[] = {"Food: Let's try oatmeal with almond butter!","Food: Why not try some tasty veggie burger?", "Food: Try a fruit salad for today!"};
            Random rand = new Random();
            Food.setText(things[rand.nextInt(things.length)]);
        }
    }
}
