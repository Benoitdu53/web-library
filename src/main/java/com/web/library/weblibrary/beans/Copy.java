package com.web.library.weblibrary.beans;

public class Copy {

    private Long id;
    private int number;

    @Override
    public String toString() {
        return "Copy{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public Copy() {
    }
}
