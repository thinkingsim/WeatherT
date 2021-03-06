package com.weathert.gson;

import com.google.gson.annotations.SerializedName;

import java.security.PublicKey;
import java.util.List;

/**
 * Created by Thinking on 2017/5/21.
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;


    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;




}
