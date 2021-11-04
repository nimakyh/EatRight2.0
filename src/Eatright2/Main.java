package Eatright2;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.sampled.*;


public class Main extends Personinfo {


    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        ArrayList<String> foodgain = new ArrayList<String>();
        foodgain.add("Eat five to six smaller meals during the day rather than two or three larger meals. \n" +
                "Do not drink soda and other drinks with few calories and little nutritional value. Replace it with healthy shakes or smoothies. In some cases, a liquid meal replacement may be recommended. ");
        foodgain.add("Do more cardio, running exercises helps you lose a lot of weight. \nStart counting calories, most important rule to losing weight is to have more calories going out than in");

        System.out.println("                            Welcome to EatRight 2.0 - 30 day meal plan");
        System.out.println("                        Calculate your calorie intake to achieve your goals !");
        System.out.println("               We dont advice for people to lose or gain more than 4 kg per month due to health issues");
        System.out.println("           Do you want to enjoy music while changing your life ? Press P otherwise press any keyboard button");

        Scanner input = new Scanner(System.in);
        Main a = new Main();

        new Music("Time to Spare - An Jone.wav");


        //initialisering

        System.out.println("                                    Press Enter button to start");

        
        boolean running = true;
        while (running) {

            try {
                System.out.println(input.nextLine() + " \nFor Weight Gain press Gain. For weight Loss press Loss: " );
                a.setWeightgain(input.nextLine());
                System.out.println("Gender: ");
                a.setGender(input.nextLine());
                System.out.println("Age: ");
                a.setAge(input.nextInt());
                System.out.println("Weight(kg): ");
                a.setWeight(input.nextInt());
                System.out.println("Height(cm): ");
                a.setHeight(input.nextInt());
                System.out.println("How much kg are you thinking about Gaining or Losing? ");
                a.setUserGain(input.nextInt());

            } catch (Exception e) {
                System.out.println("Pls type numbers");
                continue;
            }


            //BMR Gain weight
            double BMRMG = (67.47 + (13.75 * a.getWeight()) + (5.003 * a.getHeight()) - (6.755 * a.getAge()) + (233 * a.getUserGain()));
            double BMRFG = (655.1 + (9.563 * a.getWeight()) + (1.850 * a.getHeight()) - (4.674 * a.getAge()) + (233 * a.getUserGain()));
            //BMR Lose weight
            double BMRML = (67.47 + (13.75 * a.getWeight()) + (5.003 * a.getHeight()) - (6.755 * a.getAge()) - (233 * a.getUserGain()));
            double BMRFL = (655.1 + (9.563 * a.getWeight()) + (1.850 * a.getHeight()) - (4.674 * a.getAge()) - (233 * a.getUserGain()));

            int i = a.getUserGain();


            while (running) {


                if (a.getWeightgain().equalsIgnoreCase("Gain") && a.getGender().equalsIgnoreCase("Male") && a.getUserGain().equals(i)) {
                    System.out.println("Weight Gain - \nYou need " + BMRMG + " calories each day to achieve " + a.getUserGain() + " Kg weight gain per month ");

                }
                if (a.getWeightgain().equalsIgnoreCase("Gain") && a.getGender().equalsIgnoreCase("Female") && a.getUserGain().equals(i)) {
                    System.out.println("Weight Gain - \nYou need " + BMRFG + " calories each day to achieve " + a.getUserGain() + " Kg weight gain per month");

                }
                if (a.getWeightgain().equalsIgnoreCase("Loss") && a.getGender().equalsIgnoreCase("Male") && a.getUserGain().equals(i)) {
                    System.out.println("Weight Gain - \nYou need " + BMRML + " calories each day to achieve " + a.getUserGain() + " Kg Weight Loss per month ");
                }
                if (a.getWeightgain().equalsIgnoreCase("Loss") && a.getGender().equalsIgnoreCase("Female") && a.getUserGain().equals(i)) {
                    System.out.println("Weight Gain - \nYou need " + BMRFL + " calories each day to achieve " + a.getUserGain() + " Kg Weight Loss per month ");
                }

                if (a.getWeightgain().equalsIgnoreCase("Gain")) {
                    System.out.println(foodgain.get(0));
                    continue;
                } else if (a.getWeightgain().equalsIgnoreCase("Loss")) {
                    System.out.println(foodgain.get(1));
                    continue;
                }

            }



        }

    }

}