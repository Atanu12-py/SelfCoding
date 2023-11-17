class Example {
    /**
     * @param data
     */
    void ALieN(String data) {
        int count1 = 0;
        int count2 = 0;
        int count = 0;
        if (data.charAt(0) != '{') {
            System.out.println("Invalid message missing '{' at first position");
            count++;
        }
        if (data.charAt(1) != '(') {
            System.out.println("Invalid message missing '(' at second position");
            count++;
        }
        if (data.charAt(data.length() - 1) != '!') {
            System.out.println("Invalid message missing '!' at last position");
            count++;
        }
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '{') {
                count1 += 1;
            } else if (data.charAt(i) == '}') {
                count1 -= 1;
            } else if (data.charAt(i) == '(') {
                count2 += 1;
            } else if (data.charAt(i) == ')') {
                count2 -= 1;
            }
            if (count1 > 1) {
                String ss = "";
                int p = i - 1;
                while (data.charAt(p) != '(') {
                    if (data.charAt(p) == ')') {
                    } else {
                        ss = data.charAt(p) + ss;
                    }
                    p--;
                }
                System.out.println("Invalid message missing } at " + ss);
                count1 -= 1;
                count++;
            }
            if (count1 < 0) {
                String s2 = "";
                int p2 = i - 1;
                while (data.charAt(p2) != '}') {
                    s2 = data.charAt(p2) + s2;
                    p2--;
                }
                System.out.println("Invalid message missing { at " + s2);
                count1 += 1;
                count++;
            }
            if (count2 > 1) {
                String s3 = "";
                int p3 = i - 1;
                while (data.charAt(p3) != '(') {
                    if (data.charAt(p3) == '{' || data.charAt(p3) == '}') {

                    } else {
                        s3 = data.charAt(p3) + s3;
                    }
                    p3--;
                }
                System.out.println("Invalid message missing ) at " + s3);
                count2 -= 1;
                count++;
            }
            if (count2 > 0 && count1 == 0) {
                String s3 = "";
                int p3 = i - 1;
                while (data.charAt(p3) != '(') {
                    if (data.charAt(p3) == '{' || data.charAt(p3) == '}') {
                    } else {
                        s3 = data.charAt(p3) + s3;
                    }
                    p3--;
                }
                System.out.println("Invalid message missing ) at " + s3);
                count2 -= 1;
                count++;
            }
            if (count2 < 0) {
                String s4 = "";
                String s40 = "";
                int p4 = i - 1;
                while (data.charAt(p4) != '{') {
                    if (data.charAt(p4) == ')') {
                        s40 += s4;
                    } else {
                        s4 = data.charAt(p4) + s4;
                    }
                    p4--;
                }
                if (s40.length() > 0) {
                    System.out.println("Invalid message missing '(' at word " + s40);
                } else {
                    System.out.println("Invalid message missing '(' at word " + s4);
                }
                count2 += 1;
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Valid message");
        }
    }

    public static void main(String[] args) {
        Example exp = new Example();
        String str = "{abcd)}{(xyz)(mnop)(love)(pqrs)}!";
        exp.ALieN(str);
        
    }
}
