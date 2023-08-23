package com.gmail.wjdrhkddud2.prototype;

public class Paper implements Cloneable {

    private String content;

    public Paper() {

    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


    public Object clone() {
        try {
            Paper copy = (Paper) super.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
