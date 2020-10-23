/*
 * Elizabeth Wood
 * Data Structures and Algorithms I
 * KNode class definition - project Lab4
 * 4/28/20
 */

public class KNode {

    //attributes:
    public String subString; //string of four characters
    public int Frequency; //frequency of occurence of subString
    static int shingLen; //static class variable that will be set from main

    //methods:
    //constructor:
    public KNode(String a, int b) {
        Frequency = b;
        subString = a;
    }

    //increment frequency value (setter)
    public void incrementFrequency() { Frequency++; }

    //set shingLen - static shinglelength to be set from main
    static void setShingLen(int length) {
        shingLen = length;
    }

    //getters
    public int getFrequency() {
        return Frequency;
    }

    public String getSubString() {
        return subString;
    }

    static int getShingLen() {
        return shingLen;
    }

}
