package com.example.sura_yaseen.Activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Adapter.Adapter_Asma;
import com.example.sura_yaseen.Adapter.Adapter_Quran;
import com.example.sura_yaseen.Model.Asma_model;
import com.example.sura_yaseen.Model.Model_Quran;
import com.example.sura_yaseen.R;

import java.util.ArrayList;
import java.util.List;

public class Asma_activity extends AppCompatActivity {
    RecyclerView recyclerView;

    private Adapter_Asma adapterAsma;

    private List<Asma_model> list2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asma);

        recyclerView=findViewById(R.id.asma_recycle);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        list2 = new ArrayList<>();
        //add list as,a_ul_husna
        List<Asma_model> list2 = new ArrayList<>();

        list2.add(new Asma_model("الرحمن", "Ar-Rahman", "The Beneficent"));
        list2.add(new Asma_model("الرحيم", "Ar-Rahim", "The Merciful"));
        list2.add(new Asma_model("الملك", "Al-Malik", "The King"));
        list2.add(new Asma_model("القدوس", "Al-Quddus", "The Most Sacred"));
        list2.add(new Asma_model("السلام", "As-Salam", "The Source of Peace"));
        list2.add(new Asma_model("المؤمن", "Al-Mu’min", "The Guardian of Faith"));
        list2.add(new Asma_model("المهيمن", "Al-Muhaymin", "The Protector"));
        list2.add(new Asma_model("العزيز", "Al-Aziz", "The Mighty"));
        list2.add(new Asma_model("الجبار", "Al-Jabbar", "The Compeller"));
        list2.add(new Asma_model("المتكبر", "Al-Mutakabbir", "The Supreme"));
        list2.add(new Asma_model("الخالق", "Al-Khaliq", "The Creator"));
        list2.add(new Asma_model("البارئ", "Al-Bari", "The Evolver"));
        list2.add(new Asma_model("المصور", "Al-Musawwir", "The Fashioner"));
        list2.add(new Asma_model("الغفار", "Al-Ghaffar", "The Forgiver"));
        list2.add(new Asma_model("القهار", "Al-Qahhar", "The Subduer"));
        list2.add(new Asma_model("الوهاب", "Al-Wahhab", "The Bestower"));
        list2.add(new Asma_model("الرزاق", "Ar-Razzaq", "The Provider"));
        list2.add(new Asma_model("الفتاح", "Al-Fattah", "The Opener"));
        list2.add(new Asma_model("العليم", "Al-‘Alim", "The All-Knowing"));
        list2.add(new Asma_model("القابض", "Al-Qabid", "The Withholder"));
        list2.add(new Asma_model("الباسط", "Al-Basit", "The Extender"));
        list2.add(new Asma_model("الخافض", "Al-Khafid", "The Reducer"));
        list2.add(new Asma_model("الرافع", "Ar-Rafi", "The Exalter"));
        list2.add(new Asma_model("المعز", "Al-Mu’izz", "The Honorer"));
        list2.add(new Asma_model("المذل", "Al-Mudhill", "The Dishonorer"));
        list2.add(new Asma_model("السميع", "As-Sami", "The All-Hearing"));
        list2.add(new Asma_model("البصير", "Al-Basir", "The All-Seeing"));
        list2.add(new Asma_model("الحكم", "Al-Hakam", "The Judge"));
        list2.add(new Asma_model("العدل", "Al-‘Adl", "The Just"));
        list2.add(new Asma_model("اللطيف", "Al-Latif", "The Subtle One"));
        list2.add(new Asma_model("الخبير", "Al-Khabir", "The All-Aware"));
        list2.add(new Asma_model("الحليم", "Al-Halim", "The Forbearing"));
        list2.add(new Asma_model("العظيم", "Al-Azim", "The Magnificent"));
        list2.add(new Asma_model("الغفور", "Al-Ghafur", "The Forgiving"));
        list2.add(new Asma_model("الشكور", "Ash-Shakur", "The Appreciative"));
        list2.add(new Asma_model("العلي", "Al-Ali", "The Most High"));
        list2.add(new Asma_model("الكبير", "Al-Kabir", "The Most Great"));
        list2.add(new Asma_model("الحفيظ", "Al-Hafiz", "The Preserver"));
        list2.add(new Asma_model("المقيت", "Al-Muqit", "The Maintainer"));
        list2.add(new Asma_model("الحسيب", "Al-Hasib", "The Reckoner"));
        list2.add(new Asma_model("الجليل", "Al-Jalil", "The Majestic"));
        list2.add(new Asma_model("الكريم", "Al-Karim", "The Generous"));
        list2.add(new Asma_model("الرقيب", "Ar-Raqib", "The Watchful"));
        list2.add(new Asma_model("المجيب", "Al-Mujib", "The Responsive"));
        list2.add(new Asma_model("الواسع", "Al-Wasi", "The All-Encompassing"));
        list2.add(new Asma_model("الحكيم", "Al-Hakim", "The All-Wise"));
        list2.add(new Asma_model("الودود", "Al-Wadud", "The Loving"));
        list2.add(new Asma_model("المجيد", "Al-Majid", "The Glorious"));
        list2.add(new Asma_model("الباعث", "Al-Ba’ith", "The Resurrector"));
        list2.add(new Asma_model("الشهيد", "Ash-Shahid", "The Witness"));
        list2.add(new Asma_model("الحق", "Al-Haqq", "The Truth"));
        list2.add(new Asma_model("الوكيل", "Al-Wakil", "The Trustee"));
        list2.add(new Asma_model("القوي", "Al-Qawiyy", "The Strong"));
        list2.add(new Asma_model("المتين", "Al-Matin", "The Firm"));
        list2.add(new Asma_model("الولي", "Al-Waliyy", "The Protecting Friend"));
        list2.add(new Asma_model("الحميد", "Al-Hamid", "The Praiseworthy"));
        list2.add(new Asma_model("المحصي", "Al-Muhsi", "The Accounter"));
        list2.add(new Asma_model("المبدئ", "Al-Mubdi", "The Originator"));
        list2.add(new Asma_model("المعيد", "Al-Mu’id", "The Restorer"));
        list2.add(new Asma_model("المحيي", "Al-Muhyi", "The Giver of Life"));
        list2.add(new Asma_model("المميت", "Al-Mumit", "The Creator of Death"));
        list2.add(new Asma_model("الحي", "Al-Hayy", "The Ever-Living"));
        list2.add(new Asma_model("القيوم", "Al-Qayyum", "The Sustainer"));
        list2.add(new Asma_model("الواجد", "Al-Wajid", "The Finder"));
        list2.add(new Asma_model("الماجد", "Al-Majid", "The Glorious"));
        list2.add(new Asma_model("الواحد", "Al-Wahid", "The One"));
        list2.add(new Asma_model("الأحد", "Al-Ahad", "The Unique"));
        list2.add(new Asma_model("الصمد", "As-Samad", "The Eternal"));
        list2.add(new Asma_model("القادر", "Al-Qadir", "The All-Powerful"));
        list2.add(new Asma_model("المقتدر", "Al-Muqtadir", "The Creator of All Power"));
        list2.add(new Asma_model("المقدم", "Al-Muqaddim", "The Expediter"));
        list2.add(new Asma_model("المؤخر", "Al-Mu’akhkhir", "The Delayer"));
        list2.add(new Asma_model("الأول", "Al-Awwal", "The First"));
        list2.add(new Asma_model("الآخر", "Al-Akhir", "The Last"));
        list2.add(new Asma_model("الظاهر", "Az-Zahir", "The Manifest"));
        list2.add(new Asma_model("الباطن", "Al-Batin", "The Hidden"));
        list2.add(new Asma_model("الوالي", "Al-Wali", "The Sole Governor"));
        list2.add(new Asma_model("المتعالي", "Al-Muta’ali", "The Self Exalted"));
        list2.add(new Asma_model("البر", "Al-Barr", "The Source of All Goodness"));
        list2.add(new Asma_model("التواب", "At-Tawwab", "The Ever-Pardoning"));
        list2.add(new Asma_model("المنتقم", "Al-Muntaqim", "The Avenger"));
        list2.add(new Asma_model("العفو", "Al-Afuw", "The Pardoner"));
        list2.add(new Asma_model("الرؤوف", "Ar-Ra’uf", "The Most Kind"));
        list2.add(new Asma_model("مالك الملك", "Malik-ul-Mulk", "Master of the Kingdom"));
        list2.add(new Asma_model("ذو الجلال و الإكرام", "Dhul-Jalali wal-Ikram", "Lord of Glory and Honour"));
        list2.add(new Asma_model("المقسط", "Al-Muqsit", "The Just"));
        list2.add(new Asma_model("الجامع", "Al-Jami", "The Gatherer"));
        list2.add(new Asma_model("الغني", "Al-Ghani", "The Self-Sufficient"));
        list2.add(new Asma_model("المانع", "Al-Mani'", "The Withholder"));
        list2.add(new Asma_model("الضار", "Ad-Darr", "The Distresser"));
        list2.add(new Asma_model("النافع", "An-Nafi'", "The Propitious"));
        list2.add(new Asma_model("النور", "An-Nur", "The Light"));
        list2.add(new Asma_model("الهادي", "Al-Hadi", "The Guide"));
        list2.add(new Asma_model("البديع", "Al-Badi'", "The Incomparable"));
        list2.add(new Asma_model("الباقي", "Al-Baqi", "The Everlasting"));
        list2.add(new Asma_model("الوارث", "Al-Warith", "The Inheritor"));
        list2.add(new Asma_model("الرشيد", "Ar-Rashid", "The Righteous Teacher"));
        list2.add(new Asma_model("الصبور", "As-Sabur", "The Patient"));



        adapterAsma = new Adapter_Asma(this, list2);
        recyclerView.setAdapter(adapterAsma);

    }
}