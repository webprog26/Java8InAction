/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams.numeric_streams;

import com.sun.istack.internal.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import streams.practice.Transaction;

/**
 *
 * @author webpr
 */
public class NumericTransactionsManager {
    
    public static int getTransactionsValuesSum(@NotNull final List<Transaction> origin) {
           return origin.stream()
                   .mapToInt(t -> t.getValue())
                   .sum();
    }
    
    public static int getMaxTransactionValue(@NotNull final List<Transaction> origin) {
        final OptionalInt maxTransaction = origin.stream()
                .mapToInt(t -> t.getValue())
                .max();
        return maxTransaction.orElse(1);
    }
}
