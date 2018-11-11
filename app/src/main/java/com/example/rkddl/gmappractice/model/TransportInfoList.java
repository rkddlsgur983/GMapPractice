package com.example.rkddl.gmappractice.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TransportInfoList {

    @SerializedName("userArr")
    private List<Data> userArr;

    public List<Data> getUserArr() {
        return userArr;
    }

    public class Data{

        @SerializedName("subPathArr")
        private ArrayList<Transport> transportInfo;
        @SerializedName("totalTime")
        private int totalTime;
        @SerializedName("timeBySubway")
        private int timeBySubway;
        @SerializedName("timeByBus")
        private int timeByBus;
        @SerializedName("timeByWalk")
        private int timeByWalk;


        public ArrayList<Transport> getTransportInfo() {
            return transportInfo;
        }

        public int getTotalTime() {
            return totalTime;
        }

        public int getTimeBySubway() {
            return timeBySubway;
        }

        public int getTimeByBus() {
            return timeByBus;
        }

        public int getTimeByWalk() {
            return timeByWalk;
        }

    }
}