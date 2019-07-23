package com.game.space2D;

import com.game.space2D.classes.EntityA;
import com.game.space2D.classes.EntityB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;

public class Game extends Canvas implements Runnable {

    public static final int WIDTH = 320;
    public static final int HEIGHT = WIDTH / 12 * 9;
    public static final int SCALE = 2;
    public final String TITLE = "2D Space Game";

    private boolean running = false;
    private Thread thread;

    private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    private BufferedImage spriteSheet = null;
    private BufferedImage background = null;

    private Player player;
    private Controller controller;
    private Textures textures;
    private Menu menu;
    private Gameover gameover;

    private boolean is_shooting = false;

    private int enemy_count = 1;
    private int enemy_killed = 0;

    public LinkedList<EntityA> entityA;
    public LinkedList<EntityB> entityB;

    public static int HEALTH = 100 * 2;

    public int score = 0;

    public enum STATE{
        MENU, GAME, GAMEOVER
    }

    public static STATE State = STATE.MENU;

    public void init(){
        requestFocus();
        BufferedImageLoader loader = new BufferedImageLoader();
        try {
            spriteSheet = loader.loadImage("/sprite_sheet.png");
            background = loader.loadImage("/background.png");
        }catch (IOException e){
            e.printStackTrace();
        }

        textures = new Textures(this);
        controller = new Controller(this, textures);
        player = new Player(200,200, textures, this, controller);
        menu = new Menu();
        gameover = new Gameover();
        score = 0;

        entityA = controller.getEntitiesA();
        entityB = controller.getEntitiesB();

        this.addKeyListener(new KeyInput(this));
        this.addMouseListener(new MouseInput());

        controller.createEnemy(enemy_count);
    }

    private synchronized void start(){
        if (running)
            return;

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    private synchronized void stop(){
        if (!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.exit(1);
    }

    @Override
    public void run() {
        init();
        long lastTime = System.nanoTime();
        final double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();


        while (running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1){
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.println(updates + " Ticks, FPS " + frames);
                updates = 0;
                frames = 0;
            }

        }
        stop();
    }

    private void tick(){
        if (State == STATE.GAME){
            player.tick();
            controller.tick();
        }

        if (enemy_killed >= enemy_count){
            enemy_count += 2;
            enemy_killed = 0;
            controller.createEnemy(enemy_count);
        }
    }

    private void render(){

        BufferStrategy bs = this.getBufferStrategy();

        if (bs == null){
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        g.drawImage(image, 0,0, getWidth(), getHeight(), this);
        g.drawImage(background,0,0,null);


        if (State == STATE.GAME) {
            player.render(g);
            controller.render(g);

            g.setColor(Color.GRAY);
            g.fillRect(5, 5,200, 10);

            g.setColor(Color.GREEN);
            g.fillRect(5, 5, HEALTH, 10);

            g.setColor(Color.WHITE);
            g.drawRect(5, 5,200, 10);

            g.setColor(Color.GREEN);
            g.drawString("Score: " + score, Game.WIDTH + 250, Game.HEIGHT - 215);
//            g.drawString("High Score: " + getHighScore(), GameForm.WIDTH - 100, GameForm.HEIGHT - 40);

        } else if (State == STATE.MENU ){
            menu.render(g);
        }

        if (HEALTH <= 0){
            State = STATE.GAMEOVER;
            gameover.render(g);
        }

        g.dispose();
        bs.show();
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_R){
            State = STATE.GAME;
            HEALTH = 100 * 2;
            init();
            render();
        }

        if (State == STATE.GAME) {
            if (key == KeyEvent.VK_RIGHT) {
                player.setVelX(5);
            } else if (key == KeyEvent.VK_LEFT) {
                player.setVelX(-5);
            } else if (key == KeyEvent.VK_DOWN) {
                player.setVelY(5);
            } else if (key == KeyEvent.VK_UP) {
                player.setVelY(-5);
            } else if (key == KeyEvent.VK_SPACE && !is_shooting) {
                is_shooting = true;
                controller.addEntity(new Bullet(player.getX(), player.getY() + 90, textures, this));
            }
        }
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT){
            player.setVelX(0);
        } else if (key == KeyEvent.VK_LEFT){
            player.setVelX(0);
        } else if (key == KeyEvent.VK_DOWN){
            player.setVelY(0);
        } else if (key == KeyEvent.VK_UP){
            player.setVelY(0);
        } else if (key == KeyEvent.VK_SPACE) {
            is_shooting = false;
        }
    }

    public static void main(String[] args) {
        Game game = new Game();

        game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));

        JFrame frame = new JFrame(game.TITLE);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        game.start();
    }

    public BufferedImage getSpriteSheet(){
        return spriteSheet;
    }

    public int getEnemy_count() {
        return enemy_count;
    }

    public void setEnemy_count(int enemy_count) {
        this.enemy_count = enemy_count;
    }

    public int getEnemy_killed() {
        return enemy_killed;
    }

    public void setEnemy_killed(int enemy_killed) {
        this.enemy_killed = enemy_killed;
    }
}

