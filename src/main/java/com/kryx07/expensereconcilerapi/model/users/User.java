package com.kryx07.expensereconcilerapi.model.users;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {

    private long serialVersionUID = 53877953648246l;
    private String userName;

    @ApiModelProperty(hidden = true)
    //@JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Map<String, BigDecimal> amountPayable;//=new HashMap<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, BigDecimal> getAmountPayable() {
        return amountPayable;
    }

    public void setAmountPayable(Map<String, BigDecimal> amountPayable) {
        this.amountPayable = amountPayable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userName != null ? userName.equals(user.userName) : user.userName == null;
    }

    @Override
    public int hashCode() {
        return userName != null ? userName.hashCode() : 0;
    }

}