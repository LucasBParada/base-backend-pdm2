package com.example.base_backend_kotlin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * ============================================================
 * AULA 04 - MODIFIER
 * ============================================================
 *
 * Modifier permite configurar características de um
 * Composable.
 *
 * Exemplos:
 *
 * - padding
 * - background
 * - tamanho
 * - alinhamento
 * - clique
 * - bordas
 */
@Composable
fun Aula04Modifier() {

    /*
     * Row organiza os elementos horizontalmente.
     */
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {

        /*
         * ====================================================
         * PRIMEIRO EXEMPLO
         * ====================================================
         *
         * padding -> background
         */
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "padding → background"
            )

            Text(
                text = "Caixa",

                modifier = Modifier
                    .padding(16.dp)
                    .background(
                        MaterialTheme.colorScheme.primaryContainer
                    )
            )
        }


        /*
         * ====================================================
         * SEGUNDO EXEMPLO
         * ====================================================
         *
         * background -> padding
         */
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "background → padding"
            )

            Text(
                text = "Caixa",

                modifier = Modifier
                    .background(
                        MaterialTheme.colorScheme.primaryContainer
                    )
                    .padding(16.dp)
            )
        }
    }
}


/**
 * Preview.
 */
@Preview(showBackground = true)
@Composable
fun Aula04Preview() {

    Aula04Modifier()
}