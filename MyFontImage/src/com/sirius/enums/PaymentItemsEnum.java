package com.sirius.enums;

/**
 * @author yanminghao
 * @deprecated 枚举如何使用
 */
public enum PaymentItemsEnum {

    WATER_FEE("WATER", "水费"), ELECTRICITY_FEE("ELECTRICITY", "电费"), PROPERTY_MANAGEMENT_FEES("PROPERTY_MANAGEMENT", "物业服务费");
    // 成员变量  
    private String name;
    private String value;

    PaymentItemsEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
