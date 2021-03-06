package com.example.demo.board.domain;

import java.util.Date;

public class BoardVO {

    private Integer idBoard;
    private String subject;
    private String content;
    private String writer;
    private String name;
    private Date date;

    public Integer getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(Integer idBoard) {
        this.idBoard = idBoard;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "idBoard=" + idBoard +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
