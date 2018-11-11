package com.example.rkddl.gmappractice.presenter;

import com.example.rkddl.gmappractice.communication.RetrofitCommunication;
import com.example.rkddl.gmappractice.model.Person;

import java.util.ArrayList;

public class RetrofitPresenter {
    private static RetrofitPresenter instance = new RetrofitPresenter();

    public static synchronized RetrofitPresenter getInstance() {return instance;}

    private RetrofitCommunication retrofit;

    private ArrayList<Person> persons;

    public RetrofitPresenter(){
        retrofit = new RetrofitCommunication(this);
    }

    public void setPersonList(ArrayList<Person> person){
        persons = person;
    }

    public ArrayList<String> sendPersonMessage(){
        return retrofit.sendPersonLocation(persons);
    }
}
