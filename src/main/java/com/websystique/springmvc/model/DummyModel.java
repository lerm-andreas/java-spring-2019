package com.websystique.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name="Test")
public class DummyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dummy_col")
    private String dummyCol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDummyCol() {
        return dummyCol;
    }

    public void setDummyCol(String dummyCol) {
        this.dummyCol = dummyCol;
    }

    @Override
    public String toString() {
        return "DummyModel{" +
                "id=" + id +
                ", dummyCol='" + dummyCol + '\'' +
                '}';
    }
}
