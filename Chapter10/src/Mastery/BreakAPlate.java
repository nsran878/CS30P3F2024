package Mastery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class BreakAPlate extends JFrame {
    private JLabel plate1, plate2, plate3, prizeLabel;
    private JButton playAgainButton;
    private ImageIcon placeholderIcon, brokenPlateIcon, tigerIcon, stickerIcon;

    public BreakAPlate() {
        setTitle("BreakAPlate");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Load the PNGs (update paths to match the actual location in your project)
        placeholderIcon = new ImageIcon("../Chapter10/src/Mastery/placeholder.png");  // Placeholder plate
        brokenPlateIcon = new ImageIcon("../Chapter10/src/Mastery/broken_plate.png");  // Broken plate
        tigerIcon = new ImageIcon("../Chapter10/src/Mastery/tiger_plush.png");  // Tiger plush prize
        stickerIcon = new ImageIcon("../Chapter10/src/Mastery/sticker_prize.png");  // Sticker prize

        // Set up the plates as placeholders initially
        plate1 = new JLabel(placeholderIcon);
        plate2 = new JLabel(placeholderIcon);
        plate3 = new JLabel(placeholderIcon);

        prizeLabel = new JLabel();  // Empty at the beginning

        // Play Again button
        playAgainButton = new JButton("Play Again");
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handlePlayAgain();
            }
        });

        // Add components to the frame
        add(plate1);
        add(plate2);
        add(plate3);
        add(playAgainButton);
        add(prizeLabel);

        setVisible(true);
    }

    private void handlePlayAgain() {
        // Simulate breaking the plates
        plate1.setIcon(brokenPlateIcon);
        plate2.setIcon(brokenPlateIcon);
        plate3.setIcon(brokenPlateIcon);

        // Randomly display a prize
        Random random = new Random();
        int prize = random.nextInt(2);  // 0 or 1 for two different prizes
        if (prize == 0) {
            prizeLabel.setIcon(tigerIcon);  // Tiger plush
        } else {
            prizeLabel.setIcon(stickerIcon);  // Sticker
        }
    }

    public static void main(String[] args) {
        new BreakAPlate();
    }
}




