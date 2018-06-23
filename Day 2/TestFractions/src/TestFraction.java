import java.util.Scanner;

public class TestFraction {
    public static void main(String[] args) {
        // Reading a 3*3 Matrix of Fractions using hardcoded values with Scanner class
        Scanner scan = new Scanner("8/3 4/9 5/7 6/3 5/7 6/2 2/3 8/9 5/4");

        //Created a 2D Array of Fractions
        Fraction fractions[][] = new Fraction[3][3];

        //Reading from Scanner, creating a new Fraction out of it, and storing it inside fractions array
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                fractions[i][j] = new Fraction(scan.next());
            }
        }
        int N=3;
        //Calculating the value of Determinant, and storing it to a variable
        double ans = computeValue(fractions,N);

        System.out.println(ans);
        scan.close();
    }

    public static double computeValue(Fraction[][] fractions,int N) {
        double ans = 0.0;
        /* Calculate the value of the Determinant of the matrix (using multiplication of Fractions, after getting the value of each fraction using getValue()) Here and return it to the main function */
        if(N == 1)
        {
            ans = fractions[0][0].getValue();
        }
        else if (N == 2)
        {
            ans = fractions[0][0].getValue()*fractions[1][1].getValue() - fractions[1][0].getValue()*fractions[0][1].getValue();
        }
        else
        {
            ans=0.0;
            for(int j1=0;j1<N;j1++)
            {
                Fraction[][] m = new Fraction[N-1][];
                for(int k=0;k<(N-1);k++)
                {
                    m[k] = new Fraction[N-1];
                }
                for(int i=1;i<N;i++)
                {
                    int j2=0;
                    for(int j=0;j<N;j++)
                    {
                        if(j == j1)
                            continue;
                        m[i-1][j2] = fractions[i][j];
                        j2++;
                    }
                }
                ans += Math.pow(-1.0,1.0+j1+1.0)* fractions[0][j1].getValue() * computeValue(m,N-1);
            }
        }
        return ans;
    }
}