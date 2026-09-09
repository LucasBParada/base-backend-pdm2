package com.example.base_backend_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.base_backend_kotlin.ui.theme.BasebackendkotlinTheme


/**
 * ============================================================
 * MAIN ACTIVITY
 * ============================================================
 *
 * A MainActivity é uma CLASSE Kotlin.
 *
 * Ela é responsável por iniciar o aplicativo Android.
 */
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            BasebackendkotlinTheme {

                MainScreen()
            }
        }
    }
}


/**
 * ============================================================
 * TELA PRINCIPAL
 * ============================================================
 */
@Composable
fun MainScreen() {

    /*
     * Controla qual aula está aberta.
     *
     * 0 = Menu
     * 1 = Composable
     * 2 = Text
     * 3 = Parâmetros
     * 4 = Modifier
     */
    var aulaSelecionada by remember {
        mutableIntStateOf(0)
    }

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Text(
                text = "Fundamentos de Kotlin + Compose",
                style = MaterialTheme.typography.headlineSmall
            )

            if (aulaSelecionada == 0) {

                MenuAulas(
                    onAulaSelecionada = { aula ->
                        aulaSelecionada = aula
                    }
                )

            } else {

                AulaSelecionada(
                    aula = aulaSelecionada
                )

                Button(
                    onClick = {
                        aulaSelecionada = 0
                    }
                ) {
                    Text("Voltar ao menu")
                }
            }
        }
    }
}


/**
 * ============================================================
 * MENU
 * ============================================================
 */
@Composable
fun MenuAulas(
    onAulaSelecionada: (Int) -> Unit
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Text(
            text = "Selecione uma aula",
            style = MaterialTheme.typography.titleLarge
        )

        Button(
            onClick = {
                onAulaSelecionada(1)
            }
        ) {
            Text("Aula 01 - Composable")
        }

        Button(
            onClick = {
                onAulaSelecionada(2)
            }
        ) {
            Text("Aula 02 - Text")
        }

        Button(
            onClick = {
                onAulaSelecionada(3)
            }
        ) {
            Text("Aula 03 - Parâmetros")
        }

        Button(
            onClick = {
                onAulaSelecionada(4)
            }
        ) {
            Text("Aula 04 - Modifier")
        }
    }
}


/**
 * ============================================================
 * CONTROLE DAS AULAS
 * ============================================================
 *
 * O when é uma estrutura de decisão do Kotlin.
 */
@Composable
fun AulaSelecionada(aula: Int) {

    when (aula) {

        1 -> Aula01Composable()

        2 -> Aula02Text()

        3 -> Aula03Parametros()

        4 -> Aula04Modifier()
    }
}