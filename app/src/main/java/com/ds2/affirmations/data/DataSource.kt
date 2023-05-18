package com.ds2.affirmations.data

import com.ds2.affirmations.R
import com.ds2.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.imagem1),
            Affirmation(R.string.affirmation2, R.drawable.imagem2),
            Affirmation(R.string.affirmation3, R.drawable.imagem3),
            Affirmation(R.string.affirmation4, R.drawable.imagem4),
            Affirmation(R.string.affirmation5, R.drawable.imagem5),
            Affirmation(R.string.affirmation6, R.drawable.imagem6),
            Affirmation(R.string.affirmation7, R.drawable.imagem7),
            Affirmation(R.string.affirmation8, R.drawable.imagem8),
            Affirmation(R.string.affirmation9, R.drawable.imagem9),
            Affirmation(R.string.affirmation10, R.drawable.imagem10)
        )
    }
}