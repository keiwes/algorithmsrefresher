package com.signmavisions.stringcomparison;

public class StringMatcher {
    
    public static void main(String[] args) {
        
        String s1 = "";
        String s2 = "";
        if (args.length != 2) {
            int length = 10000;
            s1 = createString(length);
            s2 = createString(length);
        } else {
            s1 = args[0];
            s2 = args[1];
        }
        

        long start = System.currentTimeMillis();
        
        int best_n = 0;
        int best_i = 0;
        int best_j = 0;
        
        System.out.println("Matching:\n(" + s1 + ")\nand\n(" + s2 + ")");
        
        int l1 = s1.length();
        int l2 = s2.length();

        int[][] m = new int[l1][l2];
        
        for(int i = 0; i< l1; i++) {
            for(int j = 0; j < l2; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i > 0 && j > 0) {
                        int c = m[i-1][j-1];
                        if (c > 0) {
                            m[i-1][j-1] = c+1;
                            if (c+1 > best_n) {
                                best_n = c+1;
                                best_i = i-best_n + 1;
                                best_j = j-best_n + 1;
                            }
                        } 
                        m[i][j] = c+1;
                    } else {
                        m[i][j] = 1;
                        best_n = 1;
                        best_i = i-best_n + 1;
                        best_j = j-best_n + 1;
                    }
                }
            }
        }
        
        long end = System.currentTimeMillis();
        System.out.println("The best string was found at (" + best_i + ", " + best_j + ") "
                + "and was " + best_n + " characters long. ");
        System.out.println("(" + s1.substring(best_i, best_i + best_n) + ")");
        System.out.println("Total run time was: " + (end - start) + " milliseconds");
        
        boolean debug = false;
        if (debug) {
            for(int i = 0; i< l1; i++) {
                for(int j = 0; j < l2; j++) {
                    System.out.print(m[i][j] + " ") ;
                }
                System.out.println();
            }        
        }
    }

    private static String createString(int length) {

        String s1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) (65 + (int) (Math.random()*26)));
        }
        s1 = sb.toString();
        return s1;
    }
}
