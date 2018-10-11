package com.example.admin.myapplication.presenter;

import com.example.admin.myapplication.model.User;

public class MainActivityPresenter {

    private User user;
    private View view;

    public MainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;

    }
    public void updateName(String name){
        user.setFullName(name);
        view.updateUserInfo(user.toString());
    }
    public void updateEmail(String email){
        user.setEmail(email);
        view.updateUserInfo(user.toString());
    }
    public interface View{
        void updateUserInfo(String info);
        void showProgressBar();
        void hideProgressBar();
    }
}
