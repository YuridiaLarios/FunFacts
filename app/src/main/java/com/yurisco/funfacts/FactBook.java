package com.yurisco.funfacts;

import java.util.Random;

public class FactBook {
    // Fields (Member Variables) - Properties about the project

    private String[] mfactsArray= {"Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses, Olympic gold medals are actually made of silver",
            "You are born with 300 bones; by the time you are an adult you will have 206.", "It takes about 8 minutes for the light from the Sun to reach Earth",
            "Some bamboo plants can grow almost a meter in just one day.", "The state of Florida is bigger than England.", "Some penguins can leap 2-3 meters out of the water.",
            "Mammoths still walked the earth when the Great Pyramd was being built", "Horses and cows can sleep standing up."
    };

    // Methods - Actions the object can take

    public String getFact() {
        String fact = "";
        // Randomely select a new line
        Random genetator = new Random();
        int randomNumber = genetator.nextInt(mfactsArray.length);
        fact = mfactsArray[genetator.nextInt(mfactsArray.length)];
        return fact;
    }
}
