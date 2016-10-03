package com.pacific.lollipop.feature.auth;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pacific.lollipop.R;
import com.pacific.mvc.Fragment;

public class LoginFragment extends Fragment<LoginModel> {

    private Action action;

    public LoginFragment() {
    }

    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
        model = new LoginModel(new LoginView(this));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Action) {
            action = (Action) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement Action");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        action = null;
    }

    public interface Action {
    }
}