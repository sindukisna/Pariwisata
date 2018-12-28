package id.co.sindu.rajiv.pariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ViewPager viewPager;
    PagerAdapter adapter;
    String[]judul;
    String[]keterangan;

    int[]thumb;
    //Mendefinisikan variabel
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //array dari isi wisatanya
        judul = new String[]{"Wisata Baturaden","Ketep Pass","Kyai Langgeng","Pulau Panjang Jepara","Air Panas Guci","Candi Borobudur","Kawasan Dataran Tinggi Dieng","Candi Gedong 9",
                "Gereja Ayam","Karimun","Pantai Kartini","Pantai Nampu","Punthuk Setumbu","Rawa Pening","Umbul Sidomukti","Umbul Ponggok","Waduk Gajah Mungkur "};
        int thumb []= {R.drawable.baturaden,R.drawable.ketep,R.drawable.kyailanggeng,R.drawable.pulaupanjang,R.drawable.air_panas_guci,R.drawable.borbudur,R.drawable.diengg,R.drawable.gedong9,
                R.drawable.gerejaayam,R.drawable.karimun,R.drawable.pantaikartini,R.drawable.pantai_nampu,R.drawable.punthuk,R.drawable.rawa_pening,R.drawable.umbul,R.drawable.umbulponggok,R.drawable.gajahmungkur};
        keterangan = new String[]{" Geser Kiri "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "," 8 "," 9 "," 10 "," 11 "," 12 "," 13 "," 14 "," 15 "," 16 "," Geser Kanan "};

        viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(MainActivity.this, judul, keterangan, thumb);
        viewPager.setAdapter(adapter);
        // Menginisiasi Toolbar dan mensetting sebagai actionbar




        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Menginisiasi  NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        //Mengatur Navigasi View Item yang akan dipanggil untuk menangani item klik menu navigasi
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                //Memeriksa apakah item tersebut dalam keadaan dicek  atau tidak,
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                //Menutup  drawer item klik
                drawerLayout.closeDrawers();
                //Memeriksa untuk melihat item yang akan dilklik dan melalukan aksi
                switch (menuItem.getItemId()){
                    // pilihan menu item navigasi akan menampilkan pesan toast klik kalian bisa menggantinya
                    //dengan intent activity
                    case R.id.navigation1:
                        Toast.makeText(getApplicationContext(),"Daftar Wisata Dipilih",Toast.LENGTH_SHORT).show();
                        Intent i =new Intent(getApplicationContext(),Main3Activity.class);  startActivity(i);
                        return true;
                    case R.id.navigation2:
                        Toast.makeText(getApplicationContext(),"Peta Wisata Diplih",Toast.LENGTH_SHORT).show();
                        Intent ii =new Intent(getApplicationContext(),Profil.class);  startActivity(ii);
                        return true;

                    default:
                        moveTaskToBack(true);
                        Toast.makeText(getApplicationContext(),"Anda Telah Keluar",Toast.LENGTH_SHORT).show();
                        return false;
                }

            }
        });


        // Menginisasi Drawer Layout dan ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){
            @Override
            public void onDrawerClosed(View drawerView) {
                // Kode di sini akan merespons setelah drawer menutup disini kita biarkan kosong
                super.onDrawerClosed(drawerView);
            }
            @Override
            public void onDrawerOpened(View drawerView) {
                //  Kode di sini akan merespons setelah drawer terbuka disini kita biarkan kosong
                super.onDrawerOpened(drawerView);
            }
        };
        //Mensetting actionbarToggle untuk drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        //memanggil synstate
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onBackPressed() {


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home) {

            moveTaskToBack(false);
        }

        return super.onOptionsItemSelected(item);
    }


}