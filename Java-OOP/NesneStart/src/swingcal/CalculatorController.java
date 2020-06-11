package swingcal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView view;
    private CalculatorModel model;
    private Double sayi1;
    private Double sayi2;
    private char islem = ' ';
    private String temp = "";

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        view.getSumButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                baks('+');
            }
        });

        view.getCikButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                baks('-');
            }
        });

        view.getCarpButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                baks('*');
            }
        });

        view.getBolButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                baks('/');
            }
        });

        view.getEqualButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (islem != ' ') {
                    sayi2 = Double.valueOf(view.getIslemLabel().getText());
                    view.getIslemLabel().setText(model.islem(sayi1, islem, sayi2));
                    view.getWelcomeLabel().setText(sayi1 + " " + islem + " " + sayi2);
                    view.getWelcomeLabel().setForeground(Color.GRAY);
                    sayi1 = 0.0;
                    islem = '0';
                    sayi2 = 0.0;
                }
            }
        });

        view.getClearButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //view.getIslemLabel().setText("0");
                temp = view.getIslemLabel().getText();
                temp += ".";
                view.getIslemLabel().setText(temp);
            }
        });

        view.getZeroButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bak("0");
            }
        });
        view.getOneButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bak("1");
            }
        });
        view.getTwoButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bak("2");
            }
        });
        view.getThreeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bak("3");
            }
        });
        view.getFourButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bak("4");
            }
        });
        view.getFiveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bak("5");
            }
        });
        view.getSixButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bak("6");
            }
        });
        view.getSevenButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bak("7");
            }
        });
        view.getEightButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bak("8");
            }
        });
        view.getNineButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bak("9");
            }
        });

    }

    public void bak(String num) {
        temp = view.getIslemLabel().getText();
        if (view.getIslemLabel().getText() != "0") {
            temp += num;
        } else {
            temp = num;
        }
        view.getIslemLabel().setText(temp);
    }

    public void baks(char mathIslem) {
        sayi1 = Double.valueOf(view.getIslemLabel().getText());
        view.getIslemLabel().setText("0");
        temp = "";
        islem = mathIslem;
    }
}
