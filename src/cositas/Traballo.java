package cositas;

import java.util.ArrayList;
import java.util.List;


public class Traballo {
    public static List<Integer> tree = new ArrayList<>();

    public static Integer root(){
        int root=0;
        for (int i=0;i<tree.size()-1;i++){
            if (tree.get(i)>tree.get(i+1)){
                root=tree.get(i);
            }else{
                root= tree.get(i+1);
            }
        }
        return root;
    }

    public static Integer whereisROOT() {
        int i;
        int pepe=root();
        for ( i=0;i<tree.size();i++){
            if (tree.get(i)==pepe){
                return i;
            }
        }
       return 0;
    }

    public static Integer leftChild(int i){
        if (tree.get(i+1)>0){
        return tree.get(i+1);
        }else{
            return null;
        }
    }

    public static Integer rightChild(int i){
        if (tree.get(i-1)>0){
            return tree.get(i-1);
        }else{
            return null;
        }
    }

    public static void addChild(int i){
        int pipo=whereisROOT();
        int popi=root();
        if (i<popi){
            if (tree.get(pipo-1)>0){
                addChild(pipo-2);

            }else{
                addChild(pipo-1);
            }
        }else{
            if (tree.get(pipo+1)>0){
                addChild(pipo+2);
            }else{
                addChild(pipo+1);
            }
        }
    }


    public static void main(String[] args) {

        addChild(4);
        addChild(5);
        addChild(9);
        addChild(7);
        addChild(3);
        System.out.println(tree);
    }


}
