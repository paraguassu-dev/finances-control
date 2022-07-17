package com.api.financescontrol.dtos;

import javax.validation.constraints.NotBlank;

public class ExpenseDTO {

    @NotBlank
    private double value;
    @NotBlank
    private String type;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
