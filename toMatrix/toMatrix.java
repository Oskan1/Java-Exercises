public class toMatrix {
    static int[][][] digits = new int[][][]{
            {
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 0, 1},
                    {1, 0, 1},
                    {1, 1, 1}
            },
            {
                    {0, 0, 1},
                    {0, 0, 1},
                    {0, 0, 1},
                    {0, 0, 1},
                    {0, 0, 1}
            },
            {
                    {1, 1, 1},
                    {0, 0, 1},
                    {1, 1, 1},
                    {1, 0, 0},
                    {1, 1, 1}
            },
            {
                    {1, 1, 1},
                    {0, 0, 1},
                    {1, 1, 1},
                    {0, 0, 1},
                    {1, 1, 1}
            },
            {
                    {1, 0, 0},
                    {1, 0, 0},
                    {1, 1, 1},
                    {0, 1, 0},
                    {0, 1, 0}
            },
            {
                    {1, 1, 1},
                    {1, 0, 0},
                    {1, 1, 1},
                    {0, 0, 1},
                    {1, 1, 1}
            },
                    {
                    {1, 0, 0},
                    {1, 0, 0},
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 1, 1}
            },
                    {
                    {1, 1, 1},
                    {0, 0, 1},
                    {0, 0, 1},
                    {0, 0, 1},
                    {0, 0, 1}
            },
                    {
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 1, 1}
            },
                    {
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 1, 1},
                    {0, 0, 1},
                    {0, 0, 1}
                    }
            };


    static void put(int[][] character , int[][] display , int offsetx , int offsety) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                display[i + offsetx ][j + offsety] = character [j][i];
            }
        }
    }

    public static void main(String[] args){
        int spalten = 3;
        while (! StdIn.isEmpty ()) {
            int[][] display = new int[spalten * 3][5];
            int input = StdIn.readInt ();
            if (input < 0) {
                System.err.println("Negative Zahlen nicht unterstuetzt !");
                System.exit (1);
            }
            if (input > 999) {
                System.err.println("Input zu gross!");
                System.exit (1);
            }
            for (int position = spalten - 1; position >= 0; position --) {
                int digit = input % 10;
                put(digits[digit], display , position * 3, 0);
                input = input / 10;
            // wenn keine Digits mehr folgen , brich ab
                if (input == 0) {
                    break;
                }
            }
// Ausgabe
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < spalten * 3; i++) {
                    StdOut.print(display[i][j]);
                }
                StdOut.println ();
            }
        }
    }
}
