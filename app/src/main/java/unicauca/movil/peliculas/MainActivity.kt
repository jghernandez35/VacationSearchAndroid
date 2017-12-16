package unicauca.movil.peliculas

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.async
import org.jetbrains.anko.coroutines.experimental.bg
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import unicauca.movil.peliculas.adapters.PeliculaAdapter
import unicauca.movil.peliculas.adapters.PaqueteAdapter
import unicauca.movil.peliculas.db.AppDB
import unicauca.movil.peliculas.db.PaqueteDao
import unicauca.movil.peliculas.fragments.MainFragment
import unicauca.movil.peliculas.models.Paquetes
import unicauca.movil.peliculas.models.Pelicula
import unicauca.movil.peliculas.net.AppClient
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity(), DrawerLayout.DrawerListener, Callback<List<Paquetes>> {


    val toggle: ActionBarDrawerToggle by lazy {
        ActionBarDrawerToggle(this, drawer,
                R.string.open_menu, R.string.close_menu)
    }

    //private val adapter: PeliculaAdapter = PeliculaAdapter()
    private val adapterp: PaqueteAdapter = PaqueteAdapter()
    val dao:PaqueteDao = AppDB.db.paqueteDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        drawer.addDrawerListener(this)

        nav.setNavigationItemSelectedListener { setContent(it) }

        putFragment(R.id.container, MainFragment.instance())

    }

    fun test(pos:Int){}

    override fun onResume() {
        super.onResume()
        async(UI){
            adapterp.datap = bg{dao.all()}.await()
        }
    }

    private fun LoadP() {
        AppClient.paqApi.all().enqueue(this)
    }

    override fun onResponse(call: Call<List<Paquetes>>?, response: Response<List<Paquetes>>) {
        if(response.isSuccessful){
            adapterp.datap = response.body()!!
        }
    }

    override fun onFailure(call: Call<List<Paquetes>>?, t: Throwable?) {
        //toast("Error al consultar")
    }

    fun putFragment(container: Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(container, fragment)
                .commit()
    }

    fun setContent(item: MenuItem?): Boolean {
        drawer.closeDrawers()
        when(item?.itemId){
            R.id.nav_home -> putFragment(R.id.container, MainFragment.instance())
            //...
            R.id.nav_logut -> {
                getSharedPreferences("preferencias", Context.MODE_PRIVATE).edit()
                        .putBoolean("logged", false)
                        .apply()
                //startActivity<LoginActivity>()
                val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    finish()
            }
        }
        return true
    }

    //region Toggle
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }






    override fun onDrawerStateChanged(newState: Int) {
        toggle.onDrawerStateChanged(newState)
    }

    override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
        toggle.onDrawerSlide(drawerView, slideOffset)
    }

    override fun onDrawerClosed(drawerView: View) {
        toggle.onDrawerClosed(drawerView)
    }

    override fun onDrawerOpened(drawerView: View) {
        toggle.onDrawerOpened(drawerView)
    }
    //endregion

}
