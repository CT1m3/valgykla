package com.example.valgykla.model;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private int code;
    @Column(name = "address")
    private String address;
    @Column(name = "menu_id")
    private int menuId;

    public Restaurant() {

    }

    public Restaurant(String name, int code, String address, int menuId) {
        this.name = name;
        this.code = code;
        this.address = address;
        this.menuId = menuId;
    }

    public Restaurant(int id, String name, int code, String address, int menuId) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.address = address;
        this.menuId = menuId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", address='" + address + '\'' +
                ", menuId=" + menuId +
                '}';
    }
}
