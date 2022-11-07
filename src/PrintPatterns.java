public class PrintPatterns {
    public static void main(String[] args) {
        printPatternA(8);
        System.out.println();
        printPatternB(8);
        System.out.println();
        printPatternC(8);
        System.out.println();
        printPatternD(8);
        System.out.println();
        printPatternE(8);
        System.out.println();
        printPatternF(8);
        System.out.println();
        printPatternG(8);
        System.out.println();
        printPatternH(7);
        System.out.println();
        printPatternI(7);
        System.out.println();
        printPatternJ(11);
        System.out.println();
    }

    private static void printPatternA(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternB(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternC(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternD(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternE(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }

    private static void printPatternF(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || i == size || i == j) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();
        }
    }

    private static void printPatternG(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || i == size - j + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternH(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || i == size || i == j || i == size - j + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    private static void printPatternI(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || i == size || i == j || i == size - j + 1 || j == 1 || j == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternJ(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                 {

                }
            }
        }

    }
}

