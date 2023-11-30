package com.demo.recyclerviewwithfragment.Model;

import com.demo.recyclerviewwithfragment.R;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public List<MyData> loadDataSourceForFragA() {
        List<MyData> myData = new ArrayList<>();

        myData.add(new MyData(R.string.affirmation1, R.drawable.images__1_));
        myData.add(new MyData(R.string.affirmation2, R.drawable.images__2_ ));
        myData.add(new MyData(R.string.affirmation3, R.drawable.images__3_));
        myData.add(new MyData(R.string.affirmation4, R.drawable.images__4_));
        myData.add(new MyData(R.string.affirmation5, R.drawable.images__5_));
        myData.add(new MyData(R.string.affirmation6, R.drawable.images__6_));
        myData.add(new MyData(R.string.affirmation7, R.drawable.images__7_));
        myData.add(new MyData(R.string.affirmation8, R.drawable.images__8_));
        myData.add(new MyData(R.string.affirmation9, R.drawable.images__9_));
        myData.add(new MyData(R.string.affirmation10, R.drawable.images__10_));

        return myData;
    }

    public List<MyData> loadDataSourceForFragB() {
        List<MyData> myData = new ArrayList<>();

        myData.add(new MyData(R.string.quotes1, R.drawable.quotes1));
        myData.add(new MyData(R.string.quotes2, R.drawable.quotes2));
        myData.add(new MyData(R.string.quotes3, R.drawable.quotes3));
        myData.add(new MyData(R.string.quotes4, R.drawable.quotes4));
        myData.add(new MyData(R.string.quotes5, R.drawable.quotes5));
        myData.add(new MyData(R.string.quotes6, R.drawable.quotes6));
        myData.add(new MyData(R.string.quotes7, R.drawable.quotes7));
        myData.add(new MyData(R.string.quotes8, R.drawable.quotes8));
        myData.add(new MyData(R.string.quotes9, R.drawable.quotes9));
        myData.add(new MyData(R.string.quotes10, R.drawable.quotes10));

        return myData;
    }

}
