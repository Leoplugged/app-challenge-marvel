package br.com.zup.marvel.ui.detalhe

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.marvel.MARVEL_KEY
import br.com.zup.marvel.R
import br.com.zup.marvel.data.model.Marvel
import br.com.zup.marvel.databinding.ActivityDetalheBinding

class DetalheActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(R.string.detalhe_name)

        getInfoMarvel()
    }

    private fun getInfoMarvel() {
        val marvel = intent.getParcelableExtra<Marvel>(MARVEL_KEY)

        if (marvel != null) {
            showInformations(marvel)
        }
    }

    private fun showInformations(marvel: Marvel) {
        binding.ivHeroiDetalhe.setImageResource(marvel.image)
        binding.tvNomeHeroiDetalhe.text = marvel.name
        binding.tvHeroiDetalhe.text = marvel.detail
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}