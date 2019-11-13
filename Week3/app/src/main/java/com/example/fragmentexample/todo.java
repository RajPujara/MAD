package com.example.fragmentexample;
import java.util.Date;
public class todo {


    private Long mTodoid;
    private String mTodoTitle;
    private String mTodoDetail;
    private Date mTodoDate;

    public void setTodoid(Long mTodoid) {
        this.mTodoid = mTodoid;
    }

    public void setTodoTitle(String mTodoTitle) {
        this.mTodoTitle = mTodoTitle;
    }

    public void setTodoDetail(String mTodoDetail) {
        this.mTodoDetail = mTodoDetail;
    }

    public void setTodoDate(Date mTodoDate) {
        this.mTodoDate = mTodoDate;
    }

    public Long getTodoid() {
        return mTodoid;
    }

    public String getTodoTitle() {
        return mTodoTitle;
    }

    public String getTodoDetail() {
        return mTodoDetail;
    }

    public Date getTodoDate() {
        return mTodoDate;
    }

}


