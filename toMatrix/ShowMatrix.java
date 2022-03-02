import java.awt.*;

public class ShowMatrix {
    public static void main(String[] args) {
        double scaleX = 1.0; // /11; // 9 nobs + spacing
        double scaleY = 1.0; // /5;
        double offsetX = 0.5; //scaleX/2;
        double offsetY = 0.5; //scaleY/2;
        double pointSize = scaleX/2;
        Color background = StdDraw.BLACK;
        Color digitColorOn = StdDraw.GREEN;
        Color digitColorOff = new Color(5, 20, 5);

        int relWindowSize = 32;

        StdDraw.setCanvasSize(11*relWindowSize, 5*relWindowSize);
        StdDraw.setXscale(0, 11);
        StdDraw.setYscale(0, 5);

        StdDraw.setPenColor(digitColorOn);
        StdDraw.clear(background);

        int position = 0;
        while (!StdIn.isEmpty()) {
            if (position % 45 == 0) {
                StdDraw.clear(background);
            }
            char in = StdIn.readChar();
            if (in == '0' || in == '1') {
                double positionX = scaleX * (position % 9);
                double spacingX = scaleX * ((position / 3) % 3); // 3 nobs pro Ziffer, 3 Ziffern pro Zeile
//                    double spacingX = 0;
                double positionY = scaleY * ((position / 9) % 5);
                if (in == '0') {
                    StdDraw.setPenColor(digitColorOff);
//                    System.out.print(' ');
                } else if (in == '1') {
                    StdDraw.setPenColor(digitColorOn);
//                    System.out.print('0');
                }
                StdDraw.filledCircle(offsetX + positionX + spacingX, 5 - (offsetY + positionY), pointSize);
                position++;
                if (position % 9 == 0) {
//                    System.out.println();
                } else if (position % 3 == 0) {
//                    System.out.print("  ");
                }
                if (position % 45 == 0) {
//                    while (!StdDraw.hasNextKeyTyped()) {
                    try {
                        Thread.sleep(400);
//                        System.out.println();
                    } catch (InterruptedException e) {
                        // ignore
                    }
//                    }
//                    StdDraw.nextKeyTyped();
                }
            }
        }
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            // ignore
        }
        System.exit(0);
    }
}