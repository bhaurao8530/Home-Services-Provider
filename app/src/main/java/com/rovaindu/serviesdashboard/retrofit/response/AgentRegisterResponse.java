package com.rovaindu.serviesdashboard.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.rovaindu.serviesdashboard.retrofit.models.ServiesAgent;


import java.util.List;

public class AgentRegisterResponse {
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("cart_items_count")
    @Expose
    private Integer cartItemsCount;
    @SerializedName("errors")
    @Expose
    private List<java.lang.Object> errors = null;
    @SerializedName("data")
    @Expose
    private Data data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCartItemsCount() {
        return cartItemsCount;
    }

    public void setCartItemsCount(Integer cartItemsCount) {
        this.cartItemsCount = cartItemsCount;
    }

    public List<java.lang.Object> getErrors() {
        return errors;
    }

    public void setErrors(List<java.lang.Object> errors) {
        this.errors = errors;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("object")
        @Expose
        private ServiesAgent object;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public ServiesAgent getObject() {
            return object;
        }

        public void setObject(ServiesAgent object) {
            this.object = object;
        }

    }

}

