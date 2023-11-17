package GRAPH;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Word_Ladder {
    static int shortestchainlen(String start, String target, Set<String> D) {
        if (start == target) {
            return 0;
        }
        if (!D.contains(target)) {
            return 0;
        }

        int level = 0, wordlength = start.length();
        Queue<String> qq = new LinkedList<String>();
        qq.add(start);
        while (!qq.isEmpty()) {
            level++;
            int Qsize = qq.size();
            for (int i = 0; i < Qsize; i++) {
                char[] word = qq.peek().toCharArray();
                qq.remove();
                for (int pos = 0; pos < wordlength; pos++) {
                    char origin_char = word[pos];
                    for (char c = 'A'; c < 'Z'; c++) {
                        word[pos] = c;
                        if (String.valueOf(word).equals(target)) {
                            return level + 1;
                        }
                        if (!D.contains(String.valueOf(word))) {
                            continue;
                        }
                        D.remove(String.valueOf(word));
                        qq.add(String.valueOf(word));
                    }
                    word[pos] = origin_char;
                }
            }
        }
        return 0;
    }

    public static void main(String[] jev) {
        Set<String> D = new HashSet<String>();
        // D.add("poon");
        // D.add("plee");
        // D.add("same");
        // D.add("poie");
        // D.add("plie");
        // D.add("poin");
        // D.add("plea");
        // String start = "toon";
        // String target = "plea";
        D.add("ABCD");
        D.add("EBAD");
        D.add("EBCD");
        D.add("XYZA");
        String start = "ABCV";
        String target = "EBAD";
        int n = shortestchainlen(start, target, D);
        System.out.println(n);
    }
}

