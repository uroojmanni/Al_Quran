package com.example.sura_yaseen.Activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.sura_yaseen.Database_Repository.Quran_data_repository;
import com.example.sura_yaseen.R;

public class All_prayers_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_prayers);

        TextView arabic,urdu, english;

        arabic=findViewById(R.id.arabic_dua);
        urdu=findViewById(R.id.urdu_dua);
        english=findViewById(R.id.english_dua);

        String value = getIntent().getStringExtra("key");

       if ("After waking up".equals(value))
        {
            arabic.setText("الحمد لله الذي أحيانا بعد ما أماتنا وإليه النشور");
            urdu.setText("تمام تعریفیں اللہ کے لیے ہیں جس نے ہمیں موت کے بعد زندگی دی اور اسی کی طرف دوبارہ اٹھنا ہے");
            english.setText("All praise is due to Allah, Who has given us life after He caused us to die, and to Him is the resurrection");
        }
       else if ("Dua for Walking up a night".equals(value)) {

           arabic.setText("لَا إِلٰهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ، سُبْحَانَ اللَّهِ، وَالْحَمْدُ لِلَّهِ، وَلَا إِلٰهَ إِلَّا اللَّهُ، وَاللَّهُ أَكْبَرُ، وَلَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللَّهِ الْعَلِيِّ الْعَظِيمِ، رَبِّ اغْفِرْ لِي");
           urdu.setText("اللہ کے سوا کوئی معبود نہیں، وہ اکیلا ہے، اس کا کوئی شریک نہیں، بادشاہت اسی کی ہے اور تمام تعریفیں اسی کے لیے ہیں، اور وہ ہر چیز پر قادر ہے۔ اللہ پاک ہے، اللہ کی تعریف ہے، اللہ کے سوا کوئی معبود نہیں، اللہ سب سے بڑا ہے، اور اللہ کی مدد کے بغیر نہ کوئی طاقت ہے اور نہ ہی قوت۔ اے میرے رب، مجھے معاف فرما دے۔");
         english.setText("There is no deity except Allah, alone without any partner. To Him belongs the sovereignty and praise, and He is over all things omnipotent. Glory be to Allah, praise be to Allah, there is no deity except Allah, Allah is the Greatest, and there is no power and no strength except with Allah, the Most High, the Most Great. O my Lord, forgive me.");
       }
       else if ("Before sleeping".equals(value)){

           arabic.setText("اللَّهُمَّ بِاسْمِكَ أَمُوتُ وَأَحْيَا");
           urdu.setText("اے اللہ! تیرے نام کے ساتھ میں مرتا اور زندہ ہوتا ہوں۔");
           english.setText("O Allah, in Your name I die and I live.");

       }
       else if ("Dua during restless sleep".equals(value)){

           arabic.setText("أَعُوذُ بِكَلِمَاتِ اللَّهِ التَّامَّاتِ مِنْ غَضَبِهِ وَعِقَابِهِ، وَمِنْ شَرِّ عِبَادِهِ، وَمِنْ هَمَزَاتِ الشَّيَاطِينِ وَأَنْ يَحْضُرُونِ");
           urdu.setText("میں اللہ کے کامل کلمات کے ذریعے اس کے غضب اور سزا سے، اور اس کے بندوں کی شر سے، اور شیطانوں کےوسوسوں اور ان کی موجودگی سے پناہ مانگتا ہوں۔");
           english.setText("I seek refuge in the perfect words of Allah from His anger and His punishment, and from the evil of His servants, and from the evil suggestions of the devils and from their presence.");

       }
       else if ("Dua for morning and evening".equals(value)) {

           arabic.setText("قُلْ هُوَ اللَّهُ أَحَدٌ" +
                   "اللَّهُ الصَّمَدُ" +
                   "لَمْ يَلِدْ وَلَمْ يُولَدْ" +
                   "وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ");
           urdu.setText("کہو، وہ اللہ ایک ہے۔اللہ سب سے بے نیاز، سب کی پناہ ہےنہ اس کی کوئی اولاد ہے اور نہ وہ کسی کی اولاد ہے۔اور نہ ہی کوئی اس کا ہمسر ہے۔۔");
           english.setText("In the name of Allah, the Most Gracious, the Most Merciful. Say,He is Allah, [Who is] One, Allah, the Eternal Refuge. He neither begets nor is born, Nor is there to Him any equivalent.");
       }

       else if ("Entering Restroom".equals(value)){

           arabic.setText("اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْخُبُثِ وَالْخَبَائِثِ");
           urdu.setText("اے اللہ! میں تیری پناہ مانگتا ہوں ناپاک جنوں اور شیطانوں سے");
           english.setText("Reciting this dua before entering the restroom is a way to seek protection from harmful entities..");

       }
       else if ("Leaving Restroom".equals(value)){

           arabic.setText("غُفْرَانَكَ");
           urdu.setText("اے اللہ! میں تجھ سے معافی مانگتا ہوں۔");
           english.setText("I seek Your forgiveness.");

       }


       else {

       }


    }
}