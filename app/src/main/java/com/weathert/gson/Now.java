package com.weathert.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Thinking on 2017/5/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }





}
