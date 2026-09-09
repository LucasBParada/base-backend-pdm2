package com.example.base_backend_kotlin

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/**
 * ============================================================
 * AULA 03 - PARÂMETROS
 * ============================================================
 *
 * Nesta aula aprendemos a passar informações para
 * uma função através de parâmetros.
 *
 * Isso permite criar componentes reutilizáveis.
 */
@Composable
fun Aula03Parametros() {

    /*
     * O mesmo componente é utilizado várias vezes,
     * mas recebe valores diferentes.
     */
    ReusableTitle(
        text = "Tela de Login"
    )

    ReusableTitle(
        text = "Tela de Cadastro"
    )

    ReusableTitle(
        text = "Tela de Perfil"
    )
}


/**
 * ============================================================
 * COMPONENTE RÍGIDO
 * ============================================================
 *
 * O texto está definido dentro da própria função.
 *
 * Portanto, sempre teremos o mesmo texto.
 */
@Composable
fun RigidTitle() {

    Text(
        text = "Tela de Login"
    )
}


/**
 * ============================================================
 * COMPONENTE REUTILIZÁVEL
 * ============================================================
 *
 * Agora o texto é recebido através de um parâmetro.
 *
 * text: String
 *
 * significa:
 *
 * text -> nome do parâmetro
 * String -> tipo do parâmetro
 */
@Composable
fun ReusableTitle(text: String) {

    Text(
        text = text
    )
}


/**
 * ============================================================
 * EXEMPLO DE UTILIZAÇÃO DE PARÂMETROS
 * ============================================================
 */
@Composable
fun ParametersExample(text: String) {

    /*
     * Texto original.
     */
    ReusableTitle(text)

    /*
     * Adicionando outro conteúdo.
     */
    ReusableTitle("$text (de novo)")

    /*
     * Convertendo para letras maiúsculas.
     */
    ReusableTitle(text.uppercase())
}


/**
 * Preview.
 */
@Preview(showBackground = true)
@Composable
fun Aula03Preview() {

    Aula03Parametros()
}