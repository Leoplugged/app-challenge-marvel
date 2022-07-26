package br.com.zup.marvel.ui.home.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.marvel.data.model.Marvel
import br.com.zup.marvel.databinding.MarvelItemBinding

class MarvelAdapter(
    private var marvelList: MutableList<Marvel>,
    private val clickMarvel: (marvel: Marvel) -> Unit
) : RecyclerView.Adapter<MarvelAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MarvelItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val marvel = marvelList[position]
        holder.showInformations(marvel)
        holder.binding.cvItem.setOnClickListener {
            clickMarvel(marvel)
        }
    }

    override fun getItemCount() = marvelList.size

    fun updateMarvelList(newList: MutableList<Marvel>) {
        marvelList = newList
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: MarvelItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun showInformations(marvel: Marvel) {
            binding.ivMarvel.setImageResource(marvel.image)
            binding.tvName.text = marvel.name
        }
    }
}