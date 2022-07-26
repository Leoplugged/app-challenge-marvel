package br.com.zup.marvel.data.repository

import br.com.zup.marvel.*
import br.com.zup.marvel.data.model.Marvel

class MarvelRepository {
    fun getMarvelList(): List<Marvel> {
        val marvelList = mutableListOf<Marvel>()

        marvelList.add(
            Marvel(
                R.drawable.gamora,
                GAMORRA_NOME,
                GAMORRA_DESCRICAO
            )
        )

        marvelList.add(
            Marvel(
                R.drawable.homem_ferro,
                HOMEM_FERRO_NOME,
                HOMEM_FERRO_DESCRICAO
            )
        )

        marvelList.add(
            Marvel(
                R.drawable.mulher_invisivel,
                MULHER_INIVISVEL_NOME,
                MULHER_INVISVEL_DESCRICAO
            )
        )

        return marvelList
    }
}