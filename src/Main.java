import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        /*Zoo zoo = new Zoo();
        zoo.change(new Dog(), 2);
        System.out.println(zoo);

        System.out.println(" ");

        //задание 7.2.2.
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.start();*/

        System.out.println(" ");

        //задание 7.3.2.
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Human("Vasiliy"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new Tower("Big Ben"));

        battle.start();

        System.out.println(" ");

        //сортировка
        //import java.util.Arrays;
        //import java.util.Comparator;

        class ComparatorByLength implements Comparator<String> {

            @Override
            public int compare(String arg0, String arg1) {
                if (arg0 == null)
                    return 1;
                if (arg1 == null)
                    return -1;
                return arg0.length() - arg1.length();
            }
        }

        String[] array = {"арбузы", "баржа", "баркас", "тыква", "ёлка"};
        //String[] array = {"Apple", "Pineapple", "DragonFruit", "Orange", "Lime", "Cherry"};
        Arrays.sort(array, new ComparatorByLength());
        System.out.println(Arrays.toString(array));

        System.out.println(" ");

        //окна  Swing
        //import javax.swing.JFrame;

        // создаем окно
        //JFrame jf = new JFrame();
        // устанавливаем ему размеры
        //jf.setSize(400, 300);
        // и показываем его
        //jf.setVisible(true);


//        import java.awt.event.MouseEvent;
//        import java.awt.event.MouseListener;
//        import javax.swing.JFrame;

        class SimpleMouseListener implements MouseListener {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Щелчок на " + e.getX() + "," + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }

        class SimpleClickListener implements MouseListener {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked аt " + e.getX() + "," + e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        }

        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.addMouseListener(new SimpleClickListener());
        jf.setVisible(true);
        SimpleMouseListener mouseListener = new SimpleMouseListener();
        jf.addMouseListener(mouseListener);
    }
}