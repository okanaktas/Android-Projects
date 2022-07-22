package com.okanaktas.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Eğer bir sınıfta birden fazla obje oluşturulamıyorsa o sınıfa SİNGLETON denir.
    //super --> extends ettiği sınıfa referans verir.
    //Genellikle soyut sınıflar(abstract)i obje oluşturmaktan öte başka sınıflara extend edile bilsin diye yapılan sınıflardır.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person("Okan", "Developer", 26);

        System.out.println(person.money);


        //Statik Polymorhism
        Math math = new Math();

        System.out.println(math.sum(5));
        System.out.println(math.sum(1,3));
        System.out.println(math.sum(2,6,7));

        //Dynamic Polymorhism

        Animal animal = new Animal();
        animal.sing();

        Dog dog = new Dog();
        dog.test();
        dog.sing();

        //abstract (man class) - Ders 91

        System.out.println(math.information());


        //interface - Ders 91
        Piano myPiano = new Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();
    }
}