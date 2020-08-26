package br.com.pom.pageObject;

public class BookApiCorreio {

    private Integer status;
    private Boolean ok;
    private String code;
    private String state;
    private String city;
    private String district;
    private String address;
    private String statusText;

    public BookApiCorreio(Integer status, Boolean ok, String code, String state, String city, String district, String address, String statusText) {
        this.status = status;
        this.ok = ok;
        this.code = code;
        this.state = state;
        this.city = city;
        this.district = district;
        this.address = address;
        this.statusText = statusText;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

}


