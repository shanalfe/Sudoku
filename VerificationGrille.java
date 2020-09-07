import java.util.*;

public class VerificationGrille{
    public static int All(int[][] tableau, boolean bouleen){
        
        int e=0;

        if(bouleen==true){
            e = zeroExist(tableau);
            if(e!=0) {
                return 1;
            }
        }

        e = errorLigne(tableau);
        if (e==2){
            return 2;
        }

        e = errorColonne(tableau);
        if (e==3){
            return 3;
        }

        e = errorRegion(tableau);
        if (e==4){
            return 4;
        }
        
        return 0;
    }

    private static int zeroExist(int[][] tableau){

        int i;
        int j;

        for(i=0;i<=8;i++){

            for(j=0;j<=8;j++){

                if(tableau[i][j]==0){
                    return 1;
                }
            }
        }
        return 0;
    }
    
    private static int errorLigne(int[][] tableau){

        int i;
        int j;
        int k;
        Stack<Integer> STACK = new Stack<Integer>();

        for(i=0;i<=8;i++){

            for(j=0;j<=8;j++){

                STACK.push(tableau[i][j]);

                for(k=(STACK.size()-2) ; k >= 0; k--){

                    if ((tableau[i][j]==STACK.get(k))&&(tableau[i][j]!=0)){

                        return 2;
                    }
                }
            }
            STACK.removeAll(STACK);
        }
        return 0;
    }
    
    private static int errorColonne(int[][] tableau){

        int i;
        int j;
        int k;
        Stack<Integer> STACK = new Stack<Integer>();

        for(i=0;i<=8;i++){
            for(j=0;j<=8;j++){
              
                STACK.push(tableau[j][i]);
                for(k=(STACK.size()-2) ; k >= 0; k--){
                  
                    if ((tableau[j][i]==STACK.get(k))&&(tableau[j][i]!=0)){
                      
                        return 3;
                    }
                }
            }
            STACK.removeAll(STACK);
        }
        return 0;
    }


    private static int errorRegion(int[][] tableau){

        int i=0;
        int j=0;
        int k;
        int l;
        int m;
        Stack<Integer> STACK = new Stack<Integer>();

        for(m=0;m<=2;m++){

            for(l=0;l<=2;l++){

                for(i=3*m;i<=2+(3*m);i++){

                    for(j=3*l;j<=2+(3*l);j++){

                        STACK.push(tableau[i][j]);
                        for(k=(STACK.size()-2) ; k >= 0; k--){

                            if ((tableau[i][j]==STACK.get(k))&&(tableau[i][j]!=0)){
                                return 4;
                            }
                        }
                        
                    }
                    j=0;
                }
                i=0;
                STACK.removeAll(STACK);
            }
        }
        return 0;
    }
    
}
