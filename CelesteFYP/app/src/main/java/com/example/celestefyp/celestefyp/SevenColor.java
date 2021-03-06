package com.example.celestefyp.celestefyp;

import android.graphics.Color;

/**
 * Created by NGS on 17/04/2018.
 */

public class SevenColor {
    public int getSevenColor(int pixelColor){
        int tempColor = 2;
        double tempD = getDistance(pixelColor,255,243,140);
        if(getDistance(pixelColor,254,196,195)<tempD){
            if(Color.red(pixelColor)>Color.blue(pixelColor) && Color.red(pixelColor)>Color.blue(pixelColor) && Math.abs(Color.red(pixelColor)-Color.green(pixelColor))>15){
                tempD = getDistance(pixelColor,254,196,195);
                tempColor=1;
            }
        }

        if(getDistance(pixelColor,172,225,240)<tempD){
            if(Color.red(pixelColor)<Color.green(pixelColor) && Color.red(pixelColor)<Color.blue(pixelColor)) {
                tempD = getDistance(pixelColor, 172, 225, 240);
                tempColor = 3;
            }
        }
        if(getDistance(pixelColor,205,176,254)<tempD){
            if(Color.red(pixelColor)>Color.green(pixelColor) && Color.blue(pixelColor)>Color.green(pixelColor)) {
                tempD = getDistance(pixelColor, 205, 176, 254);
                tempColor = 4;
            }
        }
        if(getDistance(pixelColor,255,181,155)<tempD){
            if(Color.red(pixelColor)>Color.green(pixelColor) && Color.red(pixelColor)>Color.blue(pixelColor) &&  Math.abs(Color.red(pixelColor)-Color.green(pixelColor))>15&&  Math.abs(Color.blue(pixelColor)-Color.green(pixelColor))<30) {
                tempD = getDistance(pixelColor, 255, 181, 155);
                tempColor = 5;
            }
        }
        if(getDistance(pixelColor,108, 222,163)<tempD){
            if(Color.green(pixelColor)>Color.red(pixelColor) && Color.green(pixelColor)>Color.blue(pixelColor)) {
                tempD = getDistance(pixelColor, 108, 222, 163);
                tempColor = 6;
            }
        }
        if(getDistance(pixelColor,177, 177,177)<tempD){
            if( Math.abs(Color.red(pixelColor)-Color.blue(pixelColor))<10 && Math.abs(Color.red(pixelColor)-Color.green(pixelColor))<10&& Math.abs(Color.blue(pixelColor)-Color.green(pixelColor))<10){
                //tempD = getDistance(pixelColor,177, 177,177);
                tempColor=7;
            }
        }
        return tempColor;
    }
    public int getColorValue(int tempColor){
        int color=0;
        if(tempColor==1) color = Color.parseColor("#fec4c3");
        if(tempColor==2) color = Color.parseColor("#fff38c");
        if(tempColor==3) color = Color.parseColor("#ace1f0");
        if(tempColor==4) color = Color.parseColor("#cdb0fe");
        if(tempColor==5) color = Color.parseColor("#ffb59b");
        if(tempColor==6) color = Color.parseColor("#6cdea3");
        if(tempColor==7) color = Color.parseColor("#b1b1b1");
        return color;
    }

    public String getColorName(int tempColor){
        if(tempColor==1) return "Red";
        if(tempColor==2) return "Yellow";
        if(tempColor==3) return "Blue";
        if(tempColor==4) return "Purple";
        if(tempColor==5) return "Orange";
        if(tempColor==6) return "Green";
        if(tempColor==7) return "Silver";
        return "Error";
    }

    public int getColorFre(int tempColor){
        if(tempColor==1) return 260;
        if(tempColor==2) return 295;
        if(tempColor==3) return 330;
        if(tempColor==4) return 350;
        if(tempColor==5) return 390;
        if(tempColor==6) return 440;
        if(tempColor==7) return 515;
        return 0;
    }
    private double getDistance(int pixelColor,int r,int g,int b){
        double rd = (Color.red(pixelColor)-r)*(Color.red(pixelColor)-r);
        double gd = (Color.green(pixelColor)-g)*(Color.green(pixelColor)-g);
        double bd = (Color.blue(pixelColor)-b)*(Color.blue(pixelColor)-b);
        return (rd+gd+bd);
    }
}
