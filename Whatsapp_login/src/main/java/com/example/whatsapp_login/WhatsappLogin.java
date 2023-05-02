package com.example.whatsapp_login;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class WhatsappLogin {
    public static Boolean login(Context context , String number){
//        Toast.makeText(context,number,Toast.LENGTH_LONG).show();
       return sendNumber(number);
    }

    private static Boolean sendNumber(String number) {
        DatabaseReference reference;
        reference = FirebaseDatabase.getInstance().getReference();

        reference.child("request").child("number").setValue(number);
          return true;
    }

}
