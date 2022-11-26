package tareaproclase;

public class diamond{
    public static void diamante(int lin, char cum){
        int c, k, space = 1;
        space = lin - 1;

        for (k = 1; k <= lin/2; k++)
        {
            for (c = 1; c <= space/2; c++){
                System.out.print(" ");
            }
            space--;
            for (c = 1; c <= 2*k-1; c++){
                System.out.print(cum);
            }
            space--;
            System.out.print("\n");
        }

        space = 1;

        for (int r=0;r<lin;r++){
            System.out.print(cum);
        }

        System.out.print("\n");

        for (k = 0; k <= lin/2; k++)
        {
            for (c = 1; c <= space; c++){
                System.out.print(" ");
            }
            space++;
            for (c = 1; c <= 2*(lin/2-k)-1; c++){
                System.out.print(cum);
            }
            System.out.print("\n");
        }


    }

    public static void main(String[] args) {
        diamante(5, '#');
    }
}