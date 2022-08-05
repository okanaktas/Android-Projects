package com.okanaktas.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.sql.SQLData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            SQLiteDatabase database = this.openOrCreateDatabase("Cars", MODE_PRIVATE, null);
            database.execSQL("CREATE TABLE IF NOT EXISTS cars (id INTEGER PRIMARY KEY,name VARCHAR , model INTEGER)");

           // database.execSQL("INSERT INTO cars(name, model) VALUES ('Okan',26)");
            //database.execSQL("INSERT INTO cars(name, model) VALUES ('Bugra',15)");
            //database.execSQL("INSERT INTO cars(name, model) VALUES ('Aktas',87)");

           // database.execSQL("UPDATE cars SET model=30 WHERE name='Okan'");

            database.execSQL("DELETE FROM cars WHERE id=3");

            // O ile başlayan eğer %o olsaydı o ile biten olacaktı
           // Cursor cursor = database.rawQuery("SELECT * FROM cars WHERE name LIKE 'O%'",null);


           Cursor cursor = database.rawQuery("SELECT * FROM cars",null);

            int nameIX = cursor.getColumnIndex("name");
            int modelIX = cursor.getColumnIndex("model");
            int idIX = cursor.getColumnIndex("id");

            while(cursor.moveToNext()){
                System.out.println("Name: " + cursor.getString(nameIX));
                System.out.println("Model: " + cursor.getInt(modelIX));
                System.out.println("Id: " + cursor.getInt(idIX));
            }

            cursor.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}