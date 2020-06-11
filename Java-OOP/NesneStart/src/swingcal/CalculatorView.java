package swingcal;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.EAST;

public class CalculatorView extends JFrame {

    JLabel islemLabel;
    JLabel welcomeLabel;

    JButton zeroButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;

    JButton sumButton;
    JButton cikButton;
    JButton carpButton;
    JButton bolButton;
    JButton equalButton;
    JButton clearButton;

    JPanel sayi1Panel;
    JPanel sayi2Panel;

    public CalculatorView() {

        this.setTitle("Calculator");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        islemLabel = new JLabel("0");
        welcomeLabel = new JLabel("Welcome");

        zeroButton = new JButton("0");
        oneButton = new JButton("1");
        twoButton = new JButton("2");
        threeButton = new JButton("3");
        fourButton = new JButton("4");
        fiveButton = new JButton("5");
        sixButton = new JButton("6");
        sevenButton = new JButton("7");
        eightButton = new JButton("8");
        nineButton = new JButton("9");
        sumButton = new JButton("+");
        cikButton = new JButton("-");
        carpButton = new JButton("x");
        bolButton = new JButton("/");
        equalButton = new JButton("=");
        clearButton = new JButton(".");

        sayi1Panel = new JPanel();
        sayi1Panel.setLayout(new BorderLayout());
        //sayi1Panel.setBackground(Color.decode("#FF9A00"));
        Font fontI = new Font("Font.SERIF", Font.PLAIN, 35);
        Font fontW = new Font("Font.SANS_SERIF", Font.PLAIN, 18);
        sayi1Panel.add(welcomeLabel);
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); //yanlardan padding
        welcomeLabel.setFont(fontW);
        sayi1Panel.add(islemLabel, EAST);
        islemLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        islemLabel.setFont(fontI);

        sayi2Panel = new JPanel();
        sayi2Panel.setLayout(new GridLayout(4, 4, 10, 10)); // hgap ve vgap butonlar arasında boşluk için
        sayi2Panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        sayi2Panel.add(oneButton);
        sayi2Panel.add(twoButton);
        sayi2Panel.add(threeButton);
        sayi2Panel.add(sumButton).setFont(fontW);
        sayi2Panel.setBackground(Color.white);

        sayi2Panel.add(fourButton);
        sayi2Panel.add(fiveButton);
        sayi2Panel.add(sixButton);
        sayi2Panel.add(cikButton).setFont(fontW);

        sayi2Panel.add(sevenButton);
        sayi2Panel.add(eightButton);
        sayi2Panel.add(nineButton);
        sayi2Panel.add(carpButton).setFont(fontW);

        sayi2Panel.add(clearButton).setFont(fontW);
        sayi2Panel.add(zeroButton);
        sayi2Panel.add(equalButton).setFont(fontW);
        sayi2Panel.add(bolButton).setFont(fontW);

        this.add(sayi1Panel);
        this.add(sayi2Panel);
        this.pack();

    }

    public JLabel getIslemLabel() {
        return islemLabel;
    }

    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    public JButton getZeroButton() {
        return zeroButton;
    }

    public JButton getOneButton() {
        return oneButton;
    }

    public JButton getTwoButton() {
        return twoButton;
    }

    public JButton getThreeButton() {
        return threeButton;
    }

    public JButton getFourButton() {
        return fourButton;
    }

    public JButton getFiveButton() {
        return fiveButton;
    }

    public JButton getSixButton() {
        return sixButton;
    }

    public JButton getSevenButton() {
        return sevenButton;
    }

    public JButton getEightButton() {
        return eightButton;
    }

    public JButton getNineButton() {
        return nineButton;
    }

    public JButton getSumButton() {
        return sumButton;
    }

    public JButton getCikButton() {
        return cikButton;
    }

    public JButton getCarpButton() {
        return carpButton;
    }

    public JButton getBolButton() {
        return bolButton;
    }

    public JButton getEqualButton() {
        return equalButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JPanel getSayi1Panel() {
        return sayi1Panel;
    }

    public JPanel getSayi2Panel() {
        return sayi2Panel;
    }
}
