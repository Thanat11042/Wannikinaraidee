package com.csutcc.Wannikinraidee.A0_Layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.csutcc.Wannikinraidee.A010_Favorite.Favorite;
import com.csutcc.Wannikinraidee.A011_Notification.Notification;
import com.csutcc.Wannikinraidee.A012_Profile.ProfileActivity;
import com.csutcc.Wannikinraidee.A013_AllCategory.AllCategory;
import com.csutcc.Wannikinraidee.A014_Review.Reviews;
import com.csutcc.Wannikinraidee.A015_PaymentMethod.PaymentMethod;
import com.csutcc.Wannikinraidee.A01_SigninScreen.SigninScreen;
import com.csutcc.Wannikinraidee.A02_SignupScreen.SignupScreen;
import com.csutcc.Wannikinraidee.A03_TabMenu.TabMenu;
import com.csutcc.Wannikinraidee.A04_Home.HomeMenu;
import com.csutcc.Wannikinraidee.A05_HomeCategory.HomeCategory;
import com.csutcc.Wannikinraidee.A06_RestaurantList.RestaurantListview;
import com.csutcc.Wannikinraidee.A07_RestaurantDetail.RestaurantDetailView;
import com.csutcc.Wannikinraidee.A08_BookTable.BookTable;
import com.csutcc.Wannikinraidee.A09_OrderHistory.OrderHistory;
import com.csutcc.Wannikinraidee.R;

public class LayoutWise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a0_layout_wise);


        //SIGNIN

        Button signin=(Button)findViewById(R.id.signin_button);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), SigninScreen.class);
                startActivity(i);

            }
        });


        //SIGNUP

        Button signup=(Button)findViewById(R.id.signup_button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), SignupScreen.class);
                startActivity(i);

            }
        });


        //TABMENU

        Button tabmenu=(Button)findViewById(R.id.tab_button);
        tabmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), TabMenu.class);
                startActivity(i);

            }
        });

        //Home

        Button hometab=(Button)findViewById(R.id.home_button);
        hometab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), HomeMenu.class);
                startActivity(i);

            }
        });

        //HomeCategory

        Button homecat=(Button)findViewById(R.id.home_cat_button);
        homecat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), HomeCategory.class);
                startActivity(i);

            }
        });

        //RestaurantList

        Button reslist=(Button)findViewById(R.id.res_list_button);
        reslist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), RestaurantListview.class);
                startActivity(i);

            }
        });


        //RestaurantDetailView

        Button resdet=(Button)findViewById(R.id.res_detail_button);
        resdet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), RestaurantDetailView.class);
                startActivity(i);

            }
        });



        //BookTable

        Button booktable=(Button)findViewById(R.id.book_table_button);
        booktable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), BookTable.class);
                startActivity(i);

            }
        });


        //OrderHis

        Button orderhist=(Button)findViewById(R.id.order_his_button);
        orderhist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), OrderHistory.class);
                startActivity(i);

            }
        });

        //Favorite

        Button favorite=(Button)findViewById(R.id.fav_button);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Favorite.class);
                startActivity(i);

            }
        });


        //Notification

        Button notify=(Button)findViewById(R.id.notify_button);
        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Notification.class);
                startActivity(i);

            }
        });

        //Profile

        Button profile=(Button)findViewById(R.id.profile_button);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(i);

            }
        });


        //All Category

        Button allcat=(Button)findViewById(R.id.category_button);
        allcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), AllCategory.class);
                startActivity(i);

            }
        });


        //Reviews

        Button reviews=(Button)findViewById(R.id.review_button);
        reviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Reviews.class);
                startActivity(i);

            }
        });

        //Payment

        Button payment=(Button)findViewById(R.id.payment_button);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), PaymentMethod.class);
                startActivity(i);

            }
        });


    }
}
