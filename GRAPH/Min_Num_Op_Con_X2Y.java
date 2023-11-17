package GRAPH;

// import java.lang.annotation.Target;
// import java.util.*;

// class Abc {
//     int val;
//     int steps;

//     Abc(int v, int s) {
//         val = v;
//         steps = s;
//     }
// }

// public class Min_Num_Op_Con_X2Y {
//     static int minop(int scr, int des) {
//         Set<Integer> visited = new HashSet<>(1000);
//         LinkedList<Abc> queue = new LinkedList<Abc>();

//         Abc g = new Abc(scr, 0);
//         queue.offer(g);
//         while (!queue.isEmpty()) {
//             Abc temp = queue.poll();
//             if (visited.contains(temp.val)) {
//                 continue;
//             }
//             visited.add(temp.val);
//             if (temp.val == des) {
//                 return temp.steps;
//             }
//             int mul = temp.val * 2;
//             int sub = temp.val - 1;
//             if (mul > 0 && mul < 1000) {
//                 Abc tempmul = new Abc(mul, temp.steps + 1);
//                 queue.offer(tempmul);
//             }
//             if (sub > 0 && sub < 1000) {
//                 Abc tempsub = new Abc(sub, temp.steps + 1);
//                 queue.offer(tempsub);
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] jebf){
//         int x=4,y=7;
//         System.out.println(minop(x, y));
//     }
// }

// **************************************************************************************
//Optimized soloution\\\\\\\\\\\\

public class Min_Num_Op_Con_X2Y {
    static int minop(int scr, int des) {
        if (scr == des) {
            return 0;
        }
        if (scr < 0 && des > 0) {
            return -1;
        }
        if (scr > des) {
            return scr - des;
        }
        if (des % 2 != 0) {
            return 1 + minop(scr, des + 1);
        } else {
            return 1 + minop(scr, des / 2);
        }
    }

    public static void main(String[] db) {
        System.out.println(minop(4, 7));
    }
}

