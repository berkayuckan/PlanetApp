package com.example.planetapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements planetAdapter.PlanetItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView planetRecyclerView=findViewById(R.id.planetRecyclerView);

        ArrayList<planetModel> planetModelArrayList=new ArrayList<>();
        planetModelArrayList.add(new planetModel("Mercury","Milkyway Galaxy",R.drawable.ic_mercury,"57M KM","Merkür, Güneş Sistemi'ndeki en küçük ve Güneş'e en yakın gezegen. Yaklaşık 88 Dünya gününe eşit yörünge süresi ile yörüngesinde Güneş Sistemi'ndeki diğer tüm gezegenlerden daha hızlı devinir. Kendi ekseni çevresindeki dönüşünü yaklaşık 59 günde tamamlar. Bilinen hiç doğal uydusu yoktur. Adını tanrıların habercisi Roma tanrısı Merkür'den alır.","Kütle : 3,3011 × 10^23 kg\n"+"Hacim : 6,083 × 10^10 km^3\n"+"Yüzey Kütle Çekimi : 3,7 m/sn^2"));
        planetModelArrayList.add(new planetModel("Venus","Milkyway Galaxy",R.drawable.ic_venus,"110M KM","Venüs, Güneş Sisteminde, Güneş'e uzaklık bakımından ikinci sıradaki, sıcaklık bakımından da birinci sıradaki gezegendir.\n" +
                "\n" +
                "Güneşe uzaklık bakımından ikinci sırada olmasına rağmen en sıcak gezegen olmasının nedeni de atmosferinin gelen güneş ışınlarının dışarı çıkmasına izin vermemesidir. Ayrıca Zühre, Çolpan veya Çoban Yıldızı olarak da bilinir. Bu gezegen adını Eski Roma tanrıçası Venüs (Eski Yunan Mitolojisi'nde Afrodit)'ten almıştır.","Kütle : \t" +
                "4,8675 × 10^24 kg\n"+"Hacim : 9,2843 × 10^11 km^3\n"+"Yüzey Kütle Çekimi : 8,87 m/sn^2"));
        planetModelArrayList.add(new planetModel("Earth","Milkyway Galaxy",R.drawable.ic_earth,"148M KM","Dünya, Güneş Sistemi'nde Güneş'e en yakın üçüncü gezegen olup şu an için üzerinde yaşam ve sıvı su barındırdığı kesin olarak bilinen tek astronomik cisimdir. Radyometrik tarihleme ve diğer kanıtlara göre 4,55 milyar yıldan fazla bir süre önce oluşmuştur. Dünya'nın yer çekimi, uzaydaki diğer nesnelerle, özellikle Güneş'le ve tek doğal uydusu Ay'la etkileşime girer. Dünya'nın Güneş'in etrafındaki yörüngesi, 365,256 güneş günü, yani bir yıldız yılı sürer","Kütle : 5,97237×10^24 kg\n"+"Hacim : \t1,08321×10^12 km3\n"+"Yüzey Kütle Çekimi : 9,80665 m/s^2"));
        planetModelArrayList.add(new planetModel("Mars","Milkyway Galaxy",R.drawable.ic_mars,"230M KM","Mars (eski Türkçe'de Bakır Sokım, Merih), Güneş Sistemi'nin Güneş'ten itibaren dördüncü gezegeni. Roma mitolojisindeki savaş tanrısı Mars'a ithafen adlandırılmıştır. Yüzeyindeki yaygın demir oksitten dolayı kızılımsı bir görünüme sahip olduğu için \"Kızıl Gezegen\" de denir.","Kütle : 6,4171 × 10^23 kg\n"+"Hacim : 1,6318 × 10^11 km^3\n"+"Yüzey Kütle Çekimi : \t3,72076 m/sn^2"));
        planetModelArrayList.add(new planetModel("Jupiter","Milkyway Galaxy",R.drawable.ic_jupiter,"780M KM","Jüpiter veya Erendiz (Müşteri), Güneş Sistemi'nin en büyük gezegenidir. Güneş'ten uzaklığa göre beşinci sırada yer alır. Adını Roma mitolojisindeki tanrıların en büyüğü olan Jüpiter'den alır. Büyük ölçüde hidrojen ve helyumdan oluşmakta ve gaz devi sınıfına girmektedir.","Kütle : 1,899 × 10^27 kg\n"+"Hacim : 1,431×10^15 km^3\n"+"Yüzey Kütle Çekimi : 23,12 m/s^2"));
        planetModelArrayList.add(new planetModel("Saturn","Milkyway Galaxy",R.drawable.ic_saturn,"1.438M KM","Satürn (eski Türkçede Sekentir(tiz), Arapçada Zühal), Güneş Sisteminin Güneş'e yakınlık sırasına göre 6. gezegenidir. Büyüklük açısından Jüpiter'den sonra ikinci sırada gelir. Adını Yunan mitolojisindeki Kronos'tan alır. Çıplak gözle izlenebilen 5 gezegenden biri (diğerleri, Merkür, Venüs, Mars ve Jüpiter) olarak eski çağlardan beri insanoğlunun dikkatini çekmiştir. Büyük ölçüde hidrojen ve helyumdan oluşmakta ve gaz devleri sınıfına girmektedir.","Kütle : 5,6834×10^26 kg\n"+"Hacim : 8,2713×10^14 km^3\n"+"Yüzey Kütle Çekimi : 10,44 m/sn^2"));
        planetModelArrayList.add(new planetModel("Uranus","Milkyway Galaxy",R.drawable.ic_uranus,"2.970M KM","Uranüs, Güneş Sisteminin Güneş'ten uzaklık sıralamasına göre 7. gezegenidir. Çap açısından Jüpiter ve Satürn'den sonra üçüncü, kütle açısındansa bu iki gezegen ve Neptün'ün ardından dördüncü sırada gelir. Adını Yunan mitolojisindeki gökyüzü tanrısı Uranos'tan (Yunanca'da Οὐρανός, Latinceleştirilmiş şekli ile Uranus) alır. 1781 yılında William Herschel tarafından keşfedilmiştir ve Buz devi sınıfına girer.","Kütle : (8,6810 ± 0,0013) × 10^25 kg\n"+"Hacim : 6,833 × 10^13 km^3\n"+"Yüzey Kütle Çekimi : 8,69 m/sn^2"));
        planetModelArrayList.add(new planetModel("Neptune","Milkyway Galaxy",R.drawable.ic_neptune,"4.568M KM","Neptün, Güneş Sistemi'nin sekizinci, Güneş'e en uzak ve katı yüzeyi bulunmayan gezegenidir. Gaz gezegenler sınıfında yer alan Neptün, Jüpiter ve Satürn'e kıyasla farklı yapısından ötürü buz devi olarak da sınıflandırılır. Güneş sisteminin Uranüs ile beraber en soğuk iki gezegeninden biridir. Adını Roma deniz tanrısı Neptunus'ten alan gezegen, Güneş Sistemi'nde çapına göre en büyük dördüncü, kütlesine göre ise en büyük üçüncü gezegendir.","Kütle : 1,02413×10^26 kg\n"+"Hacim : 6.254×10^13 km^3\n"+"Yüzey Kütle Çekimi : 11,15 m/s^2"));

        planetAdapter planetAdapter=new planetAdapter((Context) this,planetModelArrayList, this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        planetRecyclerView.setLayoutManager(linearLayoutManager);
        planetRecyclerView.setAdapter(planetAdapter);


    }
    @Override
    public void onItemClicked(planetModel planetModel){
        Intent intent=new Intent(MainActivity.this,PlanetDetail.class);
        intent.putExtra("model", planetModel);
        startActivity(intent);
    }


}