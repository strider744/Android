package com.strider.android.secondtask;

import androidx.annotation.IntRange;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Data {

    public @Nullable int[] decryptData(@NotNull int[] price,
                                       @IntRange(from = 1) int discount,
                                       @IntRange(from = 0) int offset,
                                       @IntRange(from = 1) int readLength) {
        int[] newPrice = new int[readLength];

        for (int i = 0; i < newPrice.length; i++) {
            newPrice[i] = price[offset+i] - (int) (price[offset+i] * discount * 0.01);
        }
        return newPrice;
    }
}
