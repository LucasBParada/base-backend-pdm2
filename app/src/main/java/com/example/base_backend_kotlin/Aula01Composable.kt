package com.example.base_backend_kotlin

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/**
 * ============================================================
 * AULA 01 - SEU PRIMEIRO COMPOSABLE
 * ============================================================
 *
 * Um Composable é uma função Kotlin marcada com @Composable.
 *
 * Ela descreve o que deve aparecer na tela.
 *
 * Diferente de uma classe, aqui estamos trabalhando
 * principalmente com funções.
 */
@Composable
fun Aula01Composable() {

    /*
     * Text também é um Composable.
     *
     * Estamos declarando que queremos apresentar
     * um texto na tela.
     */
    Text(
        text = "Olá, Compose!",

        /*
         * Utilizamos a tipografia definida pelo tema.
         */
        style = MaterialTheme.typography.headlineMedium
    )
}


/**
 * ============================================================
 * PREVIEW
 * ============================================================
 *
 * Permite visualizar o Composable no Android Studio
 * sem precisar executar o aplicativo.
 */
@Preview(showBackground = true)
@Composable
fun Aula01Preview() {

    Aula01Composable()
}