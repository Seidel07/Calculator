package com.despegar.hf.calculator.service;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

public class CCalculator {

    BigDecimal m = null;

    BigDecimal add(BigDecimal a, BigDecimal b) {
        return this.add(a, b);

    }

    BigDecimal substract(BigDecimal a, BigDecimal b) {
        return this.substract(a, b);
    }

    BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return this.multiply(a, b);
    }

    BigDecimal divide(BigDecimal a, BigDecimal b) {
        if (b.equals(new BigDecimal("0"))) {
            throw new InvalidParameterException("No se puede dividir por 0");
        }
        return this.divide(a, b);
    }

    void setMemory(Memory memory) {

    }

    void MemoryStore(BigDecimal a) {
        this.m = a;
    }

    BigDecimal memoryRead() {
        return this.m;
    }

    void memoryClear() {
        this.m = null;
    }
}
