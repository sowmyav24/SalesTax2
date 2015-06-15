package com.twu.salestax;

import java.util.ArrayList;

public class ExemptedItem {
    private ArrayList<String> exemptedList = new ArrayList<>();

    ExemptedItem(ArrayList<String> exemptedList) {
        this.exemptedList = exemptedList;
    }

    public boolean checkIfSalesTaxIsExempted(String itemName) {
        for (String s : exemptedList)
            if (itemName.contains(s)) {
                return true;
            }
        return false;
    }
}
