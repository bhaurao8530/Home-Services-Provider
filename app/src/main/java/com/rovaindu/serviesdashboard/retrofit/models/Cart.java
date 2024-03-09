package com.rovaindu.serviesdashboard.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Cart {
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
    private List<Object> errors = null;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

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

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }
    public class Datum {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("agent")
        @Expose
        private ServiesAgent agent;
        @SerializedName("user")
        @Expose
        private ServiesUser user;
        @SerializedName("services")
        @Expose
        private List<Service> services = null;
        @SerializedName("category")
        @Expose
        private ServiesCategory category;
        @SerializedName("location")
        @Expose
        private String location;
        @SerializedName("location_notes")
        @Expose
        private String locationNotes;
        @SerializedName("notes")
        @Expose
        private String notes;
        @SerializedName("day")
        @Expose
        private String day;
        @SerializedName("hour")
        @Expose
        private String hour;
        @SerializedName("status")
        @Expose
        private Integer status;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public ServiesAgent getAgent() {
            return agent;
        }

        public void setAgent(ServiesAgent agent) {
            this.agent = agent;
        }

        public ServiesUser getUser() {
            return user;
        }

        public void setUser(ServiesUser user) {
            this.user = user;
        }

        public List<Service> getServices() {
            return services;
        }

        public void setServices(List<Service> services) {
            this.services = services;
        }

        public ServiesCategory getCategory() {
            return category;
        }

        public void setCategory(ServiesCategory category) {
            this.category = category;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getLocationNotes() {
            return locationNotes;
        }

        public void setLocationNotes(String locationNotes) {
            this.locationNotes = locationNotes;
        }

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getHour() {
            return hour;
        }

        public void setHour(String hour) {
            this.hour = hour;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

    }

}
