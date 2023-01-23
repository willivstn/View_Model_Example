package com.willi_vstn.view_modal_example;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int counter = 0;



    //when the app first launched
    public int getInitialCounter(){
        return counter;
    }





    //When user clicks the button
    public int getCounter(){
        counter++;
        return counter;
    }

}
