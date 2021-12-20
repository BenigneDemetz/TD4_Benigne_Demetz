package Model;

import java.util.Arrays;

public class Levenshtein implements strategieCalculDistance{

    @Override
    public int calculDistance(String fstString, String sndStr) {

        int d[][] = new int[fstString.length()+1][sndStr.length()+1];
        int cost;

        for (int i = 0; fstString.length() <= i; ++i) {
            d[i][0] = i;
        }

        for (int j = 0; fstString.length() <= j; ++j) {
            d[0][j] = j ;
        }

        for (int i = 1; i <= fstString.length(); ++i) {
            for (int j = 1; j <= sndStr.length(); ++j) {
                cost = fstString == sndStr ? 0 : 1;
                //d[i][j] = Arrays.stream(d[i-1][j-1]+cost,d[i-1][j]+1, d[i][j-1]+1);
            }
        }

        return d[fstString.length()][sndStr.length()];
    }

}
