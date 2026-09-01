import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class ShootingAnimation extends JFrame implements ActionListener, KeyListener {

    private List<Projectile> projectiles = new ArrayList<>();
    private Player player;

    public ShootingAnimation() {
        setTitle("Shooting Game");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        player = new Player(400, 400);

        Timer timer = new Timer(5, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShootingAnimation game = new ShootingAnimation();
            game.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateGame();
        repaint();
    }

    private void updateGame() {
        player.update();
        for (Projectile projectile : projectiles) {
            projectile.update();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        player.draw(g);
        for (Projectile projectile : projectiles) 
        {
            projectile.draw(g);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            projectiles.add(new Projectile(player.getX() + 20, player.getY()));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    private static class Player {
        private int x;
        private int y;

        public Player(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void update() {
            // Add player movement logic here
        }

        public void draw(Graphics g) {
            g.setColor(Color.BLACK);
            g.fillRect(x, y, 50, 25);
        }
    }

    private static class Projectile {
        private int x;
        private int y;

        public Projectile(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void update() {
            // Add projectile movement logic here
            y -= 6; // Example: Projectile moves upward
        }

        public void draw(Graphics g) {
            g.setColor(Color.GREEN);
            g.fillRect(x, y, 10, 15);
        }
    }
}