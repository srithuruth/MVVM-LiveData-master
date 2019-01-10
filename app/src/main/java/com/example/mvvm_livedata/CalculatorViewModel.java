package com.example.mvvm_livedata;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

public class CalculatorViewModel {
    private int result = 0;
    private int numberOne = 0;
    private int numberTwo = 0;

    private MutableLiveData<String> results = new MutableLiveData<>();

    public LiveData<String> getResult() {
        return results;
    }

    public void add(String a, String b) {
        getNumbersFromInput(a, b);
        result = numberOne + numberTwo;
        results.setValue(String.valueOf(result));
    }

    public void subtract(String a, String b) {
        getNumbersFromInput(a, b);
        result = numberOne - numberTwo;
        results.setValue(String.valueOf(result));
    }

    public void multiply(String a, String b) {
        getNumbersFromInput(a, b);
        result = numberOne * numberTwo;
        results.setValue(String.valueOf(result));
    }

    public void divide(String a, String b) {
        getNumbersFromInput(a, b);
        result = numberOne / numberTwo;
        results.setValue(String.valueOf(result));
    }

    private void getNumbersFromInput(String a, String b) {
        try {
            numberOne = Integer.valueOf(a);
            numberTwo = Integer.valueOf(b);
        } catch (NumberFormatException e) {
            e.printStackTrace();

        }
    }
}
