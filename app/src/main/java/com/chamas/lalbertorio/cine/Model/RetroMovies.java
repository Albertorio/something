package com.chamas.lalbertorio.cine.Model;

import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;

/*
    POJO that ties the movie info the api brings into an object
    for easier management
 */
public class RetroMovies {

    @SerializedName("name")
    private String name;

    @SerializedName("img")
    private String[] poster;

    @SerializedName("4dx")
    private boolean _4dx;

    @SerializedName("imax")
    private boolean imax;

    @SerializedName("cxc")
    private boolean cxc;

    @SerializedName("language")
    private String language;

    @SerializedName("schedule")
    private JSONArray schedule;


    public RetroMovies (String name, String[] poster, boolean _4dx, boolean imax, boolean cxc, String language, JSONArray schedule){
        this.name = name;
        this.poster = poster;
        this._4dx = _4dx;
        this.imax = imax;
        this.cxc = cxc;
        this.language = language;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPoster() {
        return poster;
    }

    public void setPoster(String[] poster) {
        this.poster = poster;
    }

    public boolean is_4dx() {
        return _4dx;
    }

    public void set_4dx(boolean _4dx) {
        this._4dx = _4dx;
    }

    public boolean isImax() {
        return imax;
    }

    public void setImax(boolean imax) {
        this.imax = imax;
    }

    public boolean isCxc() {
        return cxc;
    }

    public void setCxc(boolean cxc) {
        this.cxc = cxc;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public JSONArray getSchedule() {
        return schedule;
    }

    public void setSchedule(JSONArray schedule) {
        this.schedule = schedule;
    }
}
