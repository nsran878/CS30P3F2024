package Skillbuilders;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LatinPlantNames extends JFrame {

    // GUI Components
    private JComboBox<String> plantComboBox;
    private JLabel latinNameLabel;

    public LatinPlantNames() {
        // Set up the frame
        setTitle("Latin Plant Names");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a combo box for plant selection
        String[] plantNames = {"basil", "lavender", "parsley", "peppermint", "saffron", "sage"};
        plantComboBox = new JComboBox<>(plantNames);
        plantComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handlePlantSelection();
            }
        });

        // Label to display the Latin name
        latinNameLabel = new JLabel("Select a plant to see its Latin name");

        // Add components to the frame
        add(new JLabel("Select a plant name:"));
        add(plantComboBox);
        add(latinNameLabel);

        setVisible(true);
    }

    // Method to handle plant selection
    private void handlePlantSelection() {
        String plantName = (String) plantComboBox.getSelectedItem();
        switch (plantName) {
            case "basil":
                latinNameLabel.setText("Ocimum");
                break;
            case "lavender":
                latinNameLabel.setText("Lavandula spica");
                break;
            case "parsley":
                latinNameLabel.setText("Apium");
                break;
            case "peppermint":
                latinNameLabel.setText("Mentha piperita");
                break;
            case "saffron":
                latinNameLabel.setText("Crocus");
                break;
            case "sage":
                latinNameLabel.setText("Salvia");
                break;
            default:
                latinNameLabel.setText("Unknown plant");
        }
    }

    public static void main(String[] args) {
        new LatinPlantNames();
    }
}
