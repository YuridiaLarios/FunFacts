package com.yurisco.funfacts;

import android.graphics.Color;

import java.util.Random;

public class BackgroundColor {
    // Fields (Member Variables) - Properties about the project

    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    // Methods - Actions the object can take

    public int getColor() {
        String color;
        // Randomely select a new color
        Random genetator = new Random();
        int randomNumber = genetator.nextInt(mColors.length);
        color = mColors[genetator.nextInt(mColors.length)];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }


}
