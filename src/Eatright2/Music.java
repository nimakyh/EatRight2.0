package Eatright2;


import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Music   {

    public Music(String s) throws UnsupportedAudioFileException, IOException, LineUnavailableException {


                File file = new File("Time to Spare - An Jone.wav");
                AudioInputStream music = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(music);


        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
        if (type.equalsIgnoreCase("P")) {
            clip.start();
        }
                if (type.equalsIgnoreCase("S")) {
                    clip.close();
                }
    }


}


