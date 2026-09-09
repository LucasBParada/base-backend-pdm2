package com.exemplo.kotlinfundamentos

/**
 * ============================================================
 * FUNDAMENTOS DE KOTLIN
 * ============================================================
 *
 * Antes de trabalhar com Compose, é importante entender
 * que os Composables continuam sendo funções Kotlin.
 */


/**
 * ------------------------------------------------------------
 * FUNÇÃO SIMPLES
 * ------------------------------------------------------------
 */
fun saudacao(): String {

    return "Olá, Kotlin!"
}


/**
 * ------------------------------------------------------------
 * FUNÇÃO COM PARÂMETRO
 * ------------------------------------------------------------
 */
fun saudacaoPessoa(nome: String): String {

    return "Olá, $nome!"
}


/**
 * ------------------------------------------------------------
 * FUNÇÃO COM EXPRESSÃO
 * ------------------------------------------------------------
 *
 * Quando a função possui apenas uma expressão,
 * podemos utilizar "=".
 */
fun somar(a: Int, b: Int): Int = a + b


/**
 * ------------------------------------------------------------
 * STRING TEMPLATE
 * ------------------------------------------------------------
 */
fun apresentar(nome: String, idade: Int): String {

    return "Meu nome é $nome e tenho $idade anos."
}