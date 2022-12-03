package tareaproclase;

import java.util.*;

public class p501 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int td, ta, dd, da, nO, lenD, lenA, len, p;
        Stack<Integer> dadosD;
        Stack<Integer> dadosA;
        String temp;
        char[] dados;

        while (s.hasNext()) {

            td = s.nextInt();
            ta = s.nextInt();
            dd = s.nextInt();
            da = s.nextInt();
            nO = s.nextInt();
            s.nextLine();

            dadosD = new Stack<>();
            dadosA = new Stack<>();
            temp = s.nextLine();
            temp = temp.replace(" ", "");
            dados = temp.toCharArray();

            p = 0;
            for (int i = 0; i < nO; i++) {

                lenD = Math.min(td, dd);
                lenA = Math.min(ta, da);

                for (int j = 0; j < lenD; j++) {
                    dadosD.push(Integer.parseInt(""+dados[p]));
                    p++;
                }
                for (int j = 0; j < lenA; j++) {
                    dadosA.push(Integer.parseInt(""+dados[p]));
                    p++;
                }
                Collections.sort(dadosD);
                Collections.sort(dadosA);

                len = Math.min(dadosD.size(), dadosA.size());
                for (int j = 0; j < len; j++) {
                    if (dadosD.pop() >= dadosA.pop()) ta--;
                    else td--;
                }

                dadosA.clear();
                dadosD.clear();
            }

            System.out.println(td + " " + ta);
        }

    }

}