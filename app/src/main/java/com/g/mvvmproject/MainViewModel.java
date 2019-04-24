package com.g.mvvmproject;

import androidx.lifecycle.ViewModel;


public class MainViewModel extends ViewModel {

    public MainViewModel() {
    }

    public String getText() {
        return new DataModel().getText();
    }
}
