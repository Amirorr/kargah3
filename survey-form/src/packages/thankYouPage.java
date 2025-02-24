package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        //creat class for font
        Font font = new Font("serif" , Font.BOLD, 15);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("با تشکر از مشارکت شما!");
        thankYouLabel.setFont(font);
        thankYouLabel.setBounds(10, 10, 500, 30);

        // Add components to the panel
        panel.add(thankYouLabel);

        // Add panel to the frame
        frame.add(panel);


    }


}
