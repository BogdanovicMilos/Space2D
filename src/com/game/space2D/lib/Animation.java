package com.game.space2D.lib;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Animation {

    private int speed;
    private int frames;
    private int index = 0;
    private int count = 0;

    private BufferedImage img1;
    private BufferedImage img2;
    private BufferedImage img3;
    private BufferedImage img4;
    private BufferedImage img5;
    private BufferedImage img6;
    private BufferedImage img7;
    private BufferedImage img8;
    private BufferedImage img9;
    private BufferedImage img10;
    private BufferedImage img11;
    private BufferedImage img12;
    private BufferedImage img13;
    private BufferedImage img14;

    private BufferedImage currentImg;

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4, BufferedImage img5, BufferedImage img6, BufferedImage img7, BufferedImage img8, BufferedImage img9, BufferedImage img10, BufferedImage img11, BufferedImage img12, BufferedImage img13, BufferedImage img14) {
        this.speed = speed;
        frames = 14;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
        this.img9 = img9;
        this.img10 = img10;
        this.img11 = img11;
        this.img12 = img12;
        this.img13 = img13;
        this.img14 = img14;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4, BufferedImage img5, BufferedImage img6, BufferedImage img7, BufferedImage img8, BufferedImage img9, BufferedImage img10, BufferedImage img11, BufferedImage img12, BufferedImage img13) {
        this.speed = speed;
        frames = 13;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
        this.img9 = img9;
        this.img10 = img10;
        this.img11 = img11;
        this.img12 = img12;
        this.img13 = img13;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4, BufferedImage img5, BufferedImage img6, BufferedImage img7, BufferedImage img8, BufferedImage img9, BufferedImage img10, BufferedImage img11, BufferedImage img12) {
        this.speed = speed;
        frames = 12;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
        this.img9 = img9;
        this.img10 = img10;
        this.img11 = img11;
        this.img12 = img12;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4, BufferedImage img5, BufferedImage img6, BufferedImage img7, BufferedImage img8, BufferedImage img9, BufferedImage img10, BufferedImage img11) {
        this.speed = speed;
        frames = 11;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
        this.img9 = img9;
        this.img10 = img10;
        this.img11 = img11;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4, BufferedImage img5, BufferedImage img6, BufferedImage img7, BufferedImage img8, BufferedImage img9, BufferedImage img10) {
        this.speed = speed;
        frames = 10;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
        this.img9 = img9;
        this.img10 = img10;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4, BufferedImage img5, BufferedImage img6, BufferedImage img7, BufferedImage img8, BufferedImage img9) {
        this.speed = speed;
        frames = 9;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
        this.img9 = img9;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4, BufferedImage img5, BufferedImage img6, BufferedImage img7, BufferedImage img8) {
        this.speed = speed;
        frames = 8;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4, BufferedImage img5, BufferedImage img6, BufferedImage img7) {
        this.speed = speed;
        frames = 7;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4, BufferedImage img5, BufferedImage img6) {
        this.speed = speed;
        frames = 6;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4, BufferedImage img5) {
        this.speed = speed;
        frames = 5;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3, BufferedImage img4) {
        this.speed = speed;
        frames = 4;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2, BufferedImage img3) {
        this.speed = speed;
        frames = 3;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
    }

    public Animation(int speed, BufferedImage img1, BufferedImage img2) {
        this.speed = speed;
        frames = 2;
        this.img1 = img1;
        this.img2 = img2;
    }

    public void runAnimation(){
        index++;
        if (index > speed){
            index = 0;
            nextFrame();
        }
    }

    private void nextFrame() {

        switch (frames){
            case 2:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;

                count++;

                if (count > frames)
                    count = 0;

                break;
            case 3:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;

                count++;

                if (count > frames)
                    count = 0;

                break;
            case 4:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 3)
                    currentImg = img4;

                count++;

                if (count > frames)
                    count = 0;

                break;

            case 5:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 3)
                    currentImg = img4;
                if (count == 4)
                    currentImg = img5;

                count++;

                if (count > frames)
                    count = 0;

                break;

            case 6:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 3)
                    currentImg = img4;
                if (count == 4)
                    currentImg = img5;
                if (count == 5)
                    currentImg = img6;

                count++;

                if (count > frames)
                    count = 0;

                break;
            case 7:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 2)
                    currentImg = img3;
                if (count == 2)
                    currentImg = img3;
                if (count == 2)
                    currentImg = img3;


                count++;

                if (count > frames)
                    count = 0;

                break;
            case 8:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 3)
                    currentImg = img4;
                if (count == 4)
                    currentImg = img5;
                if (count == 5)
                    currentImg = img6;
                if (count == 6)
                    currentImg = img7;
                if (count == 7)
                    currentImg = img8;

                count++;

                if (count > frames)
                    count = 0;

                break;

            case 9:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 3)
                    currentImg = img4;
                if (count == 4)
                    currentImg = img5;
                if (count == 5)
                    currentImg = img6;
                if (count == 6)
                    currentImg = img7;
                if (count == 7)
                    currentImg = img8;
                if (count == 8)
                    currentImg = img9;

                count++;

                if (count > frames)
                    count = 0;

                break;

            case 10:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 3)
                    currentImg = img4;
                if (count == 4)
                    currentImg = img5;
                if (count == 5)
                    currentImg = img6;
                if (count == 6)
                    currentImg = img7;
                if (count == 7)
                    currentImg = img8;
                if (count == 8)
                    currentImg = img9;
                if (count == 9)
                    currentImg = img10;

                count++;

                if (count > frames)
                    count = 0;

                break;

            case 11:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 3)
                    currentImg = img4;
                if (count == 4)
                    currentImg = img5;
                if (count == 5)
                    currentImg = img6;
                if (count == 6)
                    currentImg = img7;
                if (count == 7)
                    currentImg = img8;
                if (count == 8)
                    currentImg = img9;
                if (count == 9)
                    currentImg = img10;
                if (count == 10)
                    currentImg = img11;


                count++;

                if (count > frames)
                    count = 0;

                break;

            case 12:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 3)
                    currentImg = img4;
                if (count == 4)
                    currentImg = img5;
                if (count == 5)
                    currentImg = img6;
                if (count == 6)
                    currentImg = img7;
                if (count == 7)
                    currentImg = img8;
                if (count == 8)
                    currentImg = img9;
                if (count == 9)
                    currentImg = img10;
                if (count == 10)
                    currentImg = img11;
                if (count == 11)
                    currentImg = img12;

                count++;

                if (count > frames)
                    count = 0;

                break;

            case 13:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 3)
                    currentImg = img4;
                if (count == 4)
                    currentImg = img5;
                if (count == 5)
                    currentImg = img6;
                if (count == 6)
                    currentImg = img7;
                if (count == 7)
                    currentImg = img8;
                if (count == 8)
                    currentImg = img9;
                if (count == 9)
                    currentImg = img10;
                if (count == 10)
                    currentImg = img11;
                if (count == 11)
                    currentImg = img12;
                if (count == 12)
                    currentImg = img13;


                count++;

                if (count > frames)
                    count = 0;

                break;

            case 14:
                if (count == 0)
                    currentImg = img1;
                if (count == 1)
                    currentImg = img2;
                if (count == 2)
                    currentImg = img3;
                if (count == 3)
                    currentImg = img4;
                if (count == 4)
                    currentImg = img5;
                if (count == 5)
                    currentImg = img6;
                if (count == 6)
                    currentImg = img7;
                if (count == 7)
                    currentImg = img8;
                if (count == 8)
                    currentImg = img9;
                if (count == 9)
                    currentImg = img10;
                if (count == 10)
                    currentImg = img11;
                if (count == 11)
                    currentImg = img12;
                if (count == 12)
                    currentImg = img13;
                if (count == 13)
                    currentImg = img14;

                count++;

                if (count > frames)
                    count = 0;

                break;
        }
    }

    public void drawAnimation(Graphics g, double x, double y, int offset){
        g.drawImage(currentImg, (int)x - offset, (int)y, null);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
