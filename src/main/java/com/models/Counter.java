package com.models;

import javax.persistence.*;


@Entity
public class Counter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private long counter;

    public Counter(int id, long counter) {
        this.id = id;
        this.counter = counter;
    }

    public Counter(int id) {
        this.id = id;
    }

    public Counter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }
}
