package com.demo.recyclerviewwithfragment.Model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class MyData {

    @StringRes
    private final int stringResourceId;

    @DrawableRes
    private final int imageResourceId;

    public MyData(int stringResourceId, int imageResourceId) {
        this.stringResourceId = stringResourceId;
        this.imageResourceId = imageResourceId;
    }

    public int getStringResourceId() {
        return stringResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
