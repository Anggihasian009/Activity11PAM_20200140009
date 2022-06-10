package com.example.activity11pam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activity11pam.database.barang;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BarangEdit extends AppCompatActivity {
    TextView tv_Key;
    EditText ed_Nama;
    Button btnEdit;
    DatabaseReference databaseReference;
    String kode, nama, key;

    /**
     * Anggi Hasian Nugraha Munthe_20200140009
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang_edit);

        tv_Key = findViewById(R.id.tv_key);
        ed_Nama = findViewById(R.id.edNama);
        btnEdit = findViewById(R.id.btEdit);

        databaseReference = FirebaseDatabase.getInstance().getReference();

        Bundle bundle = this.getIntent().getExtras();
        kode = bundle.getString("Kunci1");
        nama = bundle.getString("Kunci2");
        key = bundle.getString("Kunci3");

        tv_Key.setText(key);
        ed_Nama.setText(nama);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editBarang(new barang(kode, ed_Nama.getText().toString()));
            }
        });
    }

    public void editBarang(barang barang) {
        databaseReference.child("Barang")
                .child(key)
                .setValue(barang)
                .addOnSuccessListener(this, new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(BarangEdit.this, "Data Berhasil diupdate", Toast.LENGTH_LONG).show();
                        finish();
                    }
                });
    }
}