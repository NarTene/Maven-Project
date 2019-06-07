package com.junit.example;

import com.JunitClasse.example.StringOfUntils;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class JunitWithExceptions {

    @Test
    public void testNumberException(){
        String str = "test";

        Assertions.assertThrows(NumberFormatException.class, ()->
              StringOfUntils.convertToDouble(str)
                    );
    }
}
