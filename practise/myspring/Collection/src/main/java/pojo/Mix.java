package pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Mix {


    private List<String> myList;

    private Map<String ,String > myMap;

    private String[] myArray;

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyArray(String[] myArray) {
        this.myArray = myArray;
    }


    @Override
    public String toString() {
        return "Mix{" +
                "myList=" + myList +
                ", myMap=" + myMap +
                ", myArray=" + Arrays.toString(myArray) +
                '}';
    }
}
