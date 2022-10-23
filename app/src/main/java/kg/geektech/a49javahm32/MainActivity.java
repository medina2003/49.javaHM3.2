package kg.geektech.a49javahm32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String > countryList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryList.add("Кыргызстан");
        countryList.add("Китай");
        countryList.add(" Швеция");
        countryList.add("Япония");
        countryList.add("Турция");
        countryList.add("Польша");
        countryList.add("Румыния");
        countryList.add("Индия");
        countryList.add("Бельгия");
        countryList.add("Украина");
        countryList.add("Кипр");
        countryList.add("Литва");
        countryList.add("Россия");
        countryList.add("Литвия");
        countryList.add("Дания");
        countryList.add("Испаня");
        countryList.add("Чехия");
        countryList.add("Швеция");
        countryList.add("Ирландия");
        countryList.add("Франция");

        recyclerView=findViewById(R.id.recycler_view_cu);
        CountryAdapter adapter = new CountryAdapter(countryList);
        recyclerView.setAdapter(adapter);

    }
}