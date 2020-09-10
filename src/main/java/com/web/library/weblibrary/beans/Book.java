package com.web.library.weblibrary.beans;

import java.util.Date;

public class Book {

    private Long id;
    private String title;
    private Date pubDate;
    private int page;
    private String synopsis;
    // TODO image à traiter
    private String cover;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pubDate=" + pubDate +
                ", page=" + page +
                ", synopsis='" + synopsis + '\'' +
                ", cover='" + cover + '\'' +
                '}';
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(final Date pubDate) {
        this.pubDate = pubDate;
    }

    public int getPage() {
        return page;
    }

    public void setPage(final int page) {
        this.page = page;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(final String synopsis) {
        this.synopsis = synopsis;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(final String cover) {
        this.cover = cover;
    }
}
