package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Hamming implements strategieCalculDistance{

    @Override
    public int calculDistance(String fstString, String sndStr) {
        return fstString.compareTo(sndStr);
    }

}
