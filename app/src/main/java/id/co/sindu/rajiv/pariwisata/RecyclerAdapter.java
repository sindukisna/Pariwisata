package id.co.sindu.rajiv.pariwisata;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;

public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

        //public TextView tv3;
    //deklarasi variable context

    private final Context context;
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name
    String [] name={"Wisata Baturaden","Ketep Pass","Kyai Langgeng","Pulau Panjang Jepara","Air Panas Guci","Candi Borobudur","Kawasan Dataran Tinggi Dieng","Candi Gedong 9",
            "Gereja Ayam","Karimun","Pantai Kartini","Pantai Nampu","Punthuk Setumbu","Rawa Pening","Umbul Sidomukti","Umbul Ponggok","Waduk Gajah Mungkur"};
    int thumb []= {R.drawable.baturaden,R.drawable.ketep,R.drawable.kyailanggeng,R.drawable.pulaupanjang,R.drawable.air_panas_guci,R.drawable.borbudur,R.drawable.diengg,R.drawable.gedong9,
            R.drawable.gerejaayam,R.drawable.karimun,R.drawable.pantaikartini,R.drawable.pantai_nampu,R.drawable.punthuk,R.drawable.rawa_pening,R.drawable.umbul,R.drawable.umbulponggok,R.drawable.gajahmungkur};
    String[] desk = {"Baturaden terletak di sebelah selatan Gunung Slamet memiliki udara sejuk dan cenderung bertambah dingin di malam hari. Selain memiliki panorama alam yang cantik, Baturaden juga memiliki banyak legenda rakyat, salah satunya cerita lutung kasarung yang terkenal. Dari Baturaden, Anda dapat melihat pemandangan Kota Purwokerto, Pulau Nusa Kambangan, juga beberapa pantai indah di daerah Cilacap. \n",

            "Obyek Wisata Ketep Pass kabupaten Magelang merupakan Obyek Wisata Alam Kegunungapian khususnya Gunung Merapi. Obyek Wisata Ketep Pass terletak pada ketingggian 1200 m dpl. Luas area sekitar 8000 m persegi, berjarak 17 km dari Blabak Magelang kearah timur, 30 km dari Kota Magelang dan 35 km dari Boyolalai.Dari kota Salatiga yang berjarak sekitar 32 km, dapat melalaui Kopeng dan Desa Kaponan dan 30 km dari Candi Borobudur." +
                    "Lokasi Obyek mudah dijangkau baik dengan Bus Besar,Mini bus,Sedan atau sejenisnya maupun sepeda motor.",

            "Taman Kyai Langgeng merupakan objek wisata yang terletak di Kota Magelang tepatnya di Jalan Cempaka no 6, kurang lebih 1 km arah selatan dari pusat kota. Taman ini mempunyai keindahan alam yang menakjubkan serta berbagai macam jenis flora dan fauna yang lengkap. Dinamakan Taman Kyai Langgeng sendiri karena di dalamnya terdapat makam seorang pejuang pada masa perang Diponegoro.\n" +
                    "\n" +
                    "Untuk mengenang jasa-jasa itulah maka taman ini dinamakan tersebut. Terdapat unsur pariwisata dengan pendidikan di dalamnya, perpaduan itu tampak pada perpustakaan yang berada di dalam area wisata yang indah dan bersih yang dibangun pada 17 Mei 2003.",

            "Di Kota Jepara terdapat pulau – pulau yang indah tak terkecuali Pulau Panjang. Pulau Panjang ini merupakan pulau – pulau kecil yang terletak di Kelurahan Ujung Batu, Jepara, Jawa Tengah. Pulau ini termasuk pulau yang masih perawan karena belum banyak dijamah oleh orang. \n" +
                    "\n" +
                    "Pulau ini juga masih terlihat begitu alami dan sepi sehingga mempunyai daya tarik tersendiri bagi para wisatawan." +
                    "  Keindahan Pulau Panjang tak juga kalah dengan keindahan pulau lain yang ada disekitarnya.\n",

            "Pemandian air panas Guci ini terdapat di lereng Gunung Slamet atau tepatnya beralamat di Desa Guci Kecamatan Bumijawa Kabupaten Tegal Provinsi Jawa Tengah." +
                    " Jika ditempuh dari Kota Slawi WIsata indah di Tegal ini berjarak sekitar 30 km sedangkan jika ditempuh dari Kota Tegal maka jaraknya adalah 40 km.",

            "Borobudur adalah candi atau kuil Buddha terbesar di dunia, sekaligus salah satu monumen Buddha terbesar di dunia. Monumen ini terdiri atas enam teras berbentuk bujur sangkar yang diatasnya terdapat tiga pelataran melingkar, pada dindingnya dihiasi dengan 2.672 panel relief dan aslinya terdapat 504 arca Buddha.\n",

            "Dataran Tinggi Dieng adalah kawasan vulkanik aktif di Jawa Tengah, yang masuk wilayah Kabupaten Banjarnegara dan Kabupaten Wonosobo. Letaknya berada di sebelah barat kompleks Gunung Sindoro dan Gunung Sumbing.\n",

            "Kawasan Candi yang berada di Bandungan, Semarang, Jawa Tengah ini banyak diminati oleh wisatawan terutama bagi pereka pecinta alam atau komunitas alam lainnya, hal ini dibuktikan dengan banyaknya para pelajar dari berbagai pelosok negeri yang melakukan kegiatan di kawasan tersebut, untuk lebih lengkapnya mari kita bahas tentang sejarah dan lokasi keunikan tempat wisata Gedong Songo Semarang Jawa Tengah.\n",

            "Bukit Rhema yang juga disebut Gereja Ayam, atau bahkan Punthuk Setumbu, merupakan salah satu pesona Wisata Magelang selain Borobudur, siapa sih yang tidak tahu dengan kabupaten Magelang? Sebuah kabupaten di provinsi Jawa Tengah dengan icon Candi Borobudur yang namanya sudah go internasional. \n" +
                    "\n" +
                    "Selain memiliki candi yang super megah, kabupaten Magelang juga ternyata memiliki banyak tempat wisata lainnya, baik wisata alam, wisata budaya dan wisata sejarah, salah satu nya Bukit Rhema ini.\n",

            "Karimunjawa termasuk kepulauan indah yang ada di Indonesia yang terdapat di daerah Jepara. Karimunjawa termasuk dalam Kabupaten Jepara, Jawa Tengah yaitu di pesisir pantai utara Pulau Jawa. Kepulauan ini juga telah ditetapkan sebagai Taman Nasional." +
                    " Hamparan pasir putih dan air yang jernih merupakan pemandangan yang akan Anda nikmati. Suasana alami, asri dan tenang masih sangat terasa dan akan membuat Anda merasa betah berlama-lama di sini.",

            "Obyek Wisata Pantai Kartini terletak kurang lebih 2 km ke arah barat dari Pendopo Kabupaten Jepara. Obyek wisata ini berada di kelurahan Bulu kecamatan Jepara dan merupakan obyek wisata alam yang menjadi dambaan wisatawan. \n" +
                    "\n" +
                    "Pantai Kartini juga memiliki potensi alam berupa pemandangan pantai yang indah, ombak yang kecil dengan pasir putihnya, serta topografi pantai yang landai. Disana ada sarana pendukung seperti dermaga, sebagian aquarium kura-kura, motel, permainan anak-anak , wisata kuliner dan lain-lain telah tersedia untuk para pengunjung yang datang disana." +
                    "  Suasana di sekitar pantai yang cukup sejuk memang memberikan kesan tersendiri buat para pengunjung.\n",

            "Obyek Wisata Pantai Nampu merupakan salah satu wisata pantai yang masih tergolong perawan, jika dibandingkan dengan Pantai Parangtritis, Krakal, Baron, ataupun pantai lainnya. Potensi wisata Pantai Nampu  sungguh luar biasa." +
                    " Walaupun berada di pelosok yang jauh dari perkotaan, namun akses menuju pantai ini sudah sangat baik dan nyaman untuk dilalui. Saat anda berkunjung ke Pantai ini, sebaiknya menggunakan kendaraan pribadi dikarenakan belum ada angkutan umum yang menuju ke kawasan wisata pantai ini.",

            "Punthuk Setumbu merupakan tempat yang wajib dikunjungi oleh kamu para pemburu sunrise. Di destinasi wisata ini kamu akan menemukan sunrise yang berbeda dari tempat lainnya." +
                    " Bagaimana tidak? Punthuk Setumbu menawarkan keindahan sunrisedengan landscape Gunung Merapi dan Gunung Merbabu sekaligus.",

            "Kata “pening” pada dasarnya berasal dari kata “bening”, hal ini tidak lain dan tidak bukan karena memang danau ini memiliki air yang sangat jernih.\n" +
                    "Danau rawa pening tersebut menempati 4 kecamatan, yaitu: Ambarawa, Bawen, Tuntang, dan Banyubiru yang berada di cekungan terendah lereng Gunung Merbabu, Gunung Telomoyo, dan Gunung Ungaran. \n" +
                    "\n" +
                    "Bagi sebagian masyarakat, danau rawa pening dimanfaatkan sebagai lahan mereka mencari ikan. Maka tak heran jika banyak perahu-perahu kecil berada di sekitar danau.\n",

            "Kawasan wisata umbul Sidomukti merupakan salah satu Wisata Alam Pegunungan di Semarang, berada di Desa Sidomukti Kecamatan Bandungan Kabupaten Semarang. Kawasan wisata ini dengan didukung fasiltas & Servis: Outbond Training, Adrenalin Games, Taman Renang Alam, Camping Ground, Pondok Wisata, Pondok Lesehan, serta Meeting Room.\n" +
                    "\n" +
                    "Ada empat buah kolam yang bertingkat dan dapat dipilih sesuai kedalaman yang diinginkan. Airnya sangat dingin, jernih dan menyegarkan. Selain itu ditambah pula dengan beberapa sarana olahraga menantang keberanian di sisi kolam. Terdapat lintasan flying fox dengan dua pilihan track, marine bridge di lembah, rapeling menuruni lembah sisi kolam, dan ATV, kolam renang alami dan jalur trekking.\n",

            "Umbul Ponggok adalah wisata air yang terletak di desa Ponggok, Klaten, Jawa Tengah. Umbul Ponggok merupakan mata air yang biasa dimanfaatkan sebagai pemandian dan snorkeling. Kolam Umbul Ponggok berukuran panjang 70 m dan lebar 40 m, mata airterletak pada dasar kolam dan terus mengalirkan air sehingga kolam Umbul Ponggok cenderung jernih." +
                    " Pada dasar kolam terdapat ikan dan batu-batuan sehingga kolam Umbul Ponggok kerap digunakan sebagai lokasi foto dibawah air.",

            "merupakan waduk PLTA yang digunakan untuk penerangan bagian Jawa Tengah, Waduk Gajah Mungkur berada di sebelah selatan dari kota Wonogiri, Jawa Tengah." +
                    " Waduk Gajah Mungkur merupakan waduk atau danau yang dibuat dengan membendung Sungai Bengawan Solo yang merupakan Sungai terpanjang di pulau jawa."};

    String [] gambar= {"baturaden.jpg","ketep.jpg","kyailanggeng.jpg","pulaupanjang.jpg","air_panas_guci.jpg","borbudur.jpg","diengg.jpg","gedong9.jpg",
            "gerejaayam.jpg","karimun.jpg","pantaikartini.jpg","pantai_nampu.jpg","punthuk.jpg","rawa_pening.jpg","umbul.jpg","umbulponggok.jpg","gajahmungkur.jpg"};

    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater= LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_list, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        // holder.tv3.setText(desk[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setImageResource(thumb[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv2.setText(gambar[position]);
        //holder.tv3.setTag(holder);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);

    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();




                Intent intent = new Intent(context, DetailWisata.class);
                intent.putExtra("judul", vholder.tv1.getText().toString());
                intent.putExtra("gambar", vholder.tv2.getText().toString());
                intent.putExtra("desk",desk[position]);

                context.startActivity(intent);



            Log.e(TAG,"kondisi bekerja");
        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
