package com.example.base_backend_kotlin

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview

/**
 * ============================================================
 * AULA 02 - TEXT
 * ============================================================
 *
 * Text é utilizado para apresentar textos na interface.
 *
 * Nesta aula veremos:
 *
 * - Text
 * - MaterialTheme.typography
 * - maxLines
 * - TextOverflow.Ellipsis
 */
@Composable
fun Aula02Text() {

    Text(
        text = "Compose descreve a tela em vez de manipulá-la. " +
                "Este texto é propositalmente longo para " +
                "demonstrar o limite de linhas.",

        /*
         * Utiliza um estilo definido pelo tema.
         */
        style = MaterialTheme.typography.bodyLarge,

        /*
         * Permite no máximo duas linhas.
         */
        maxLines = 2,

        /*
         * Quando o texto ultrapassar o limite,
         * serão exibidas reticências.
         */
        overflow = TextOverflow.Ellipsis
    )
}


/**
 * ============================================================
 * EXEMPLO DE TIPOGRAFIA
 * ============================================================
 */
@Composable
fun TextStylesExample() {

    /*
     * Texto de corpo.
     */
    Text(
        text = "Texto do corpo",
        style = MaterialTheme.typography.bodyLarge
    )

    /*
     * Texto de título.
     */
    Text(
        text = "Título",
        style = MaterialTheme.typography.titleLarge
    )

    /*
     * Texto de destaque.
     */
    Text(
        text = "Headline",
        style = MaterialTheme.typography.headlineMedium
    )
}


/**
 * Preview da aula.
 */
@Preview(showBackground = true)
@Composable
fun Aula02Preview() {

    Aula02Text()
}