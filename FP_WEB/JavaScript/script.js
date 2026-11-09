// Exercicio 1 ---------------------------------
const nome = "Day"
const idade = 35
const curso = "Software Developer"
const inscrita = true;

console.log(`${nome},  ${idade} anos, ${curso}. Inscrita? ${inscrita}`);

// Exercicio 2 ---------------------------------
const num1 = 20
const num2 = 6

const soma = num1 + num2
const subtracao = num1 - num2
const multiplicação = num1 * num2
const divisão = num1 * num2

console.log (`${num1} + ${num2} = ${soma}`)
console.log (`${num1} - ${num2} = ${subtracao}`)
console.log (`${num1} * ${num2} = ${multiplicação}`)
console.log (`${num1} / ${num2} = ${divisão}`)

console.log (`Soma: ${num1 + num2}`)
console.log (`Subtração: ${num1 - num2}`)
console.log (`Multiplicação: ${num1 - num2}`)
console.log (`Divisão: ${num1 - num2}`)
console.log (`Resto: ${num1 % num2}`)

if (num1 > num2) {
    console.log (`${num1} é maior que ${num2}`)
}
else {
     console.log (`${num2} é maior que ${num1}`)
}

// Exercicio 3 ---------------------------------
const nota = 20

if (nota < 0 ) {
    console.log ("Valor inválido")
}

if (nota >= 0 && nota <= 9) {
    console.log ("Não aprovado")
}

if (nota >= 10 && nota <= 13) {
    console.log ("Suficiente")
}

if (nota >= 14 && nota <= 17) {
    console.log ("Bom")
}

if (nota >= 18 && nota <= 20) {
    console.log ("Muito bom!")
}

if (nota > 20) {
    console.log ("Valor inválido")
}

// Exercicio 4 ---------------------------------

console.log("Imprime os números pares num intervalo de [0,10]");
for (let numF = 0; numF <= 10 ; numF++) {
    if (numF%2==0)  {
        console.log (`${numF}`)
    }
}

// somatorio -------------------- xxxx
somatorio = 0
for (let numF = 0; numF <= 10 ; numF++) {
    somatorio += numF
}
console.log (`O somatório de 10 = ${somatorio}`)


// Exercicio 5 ---------------------------------
function ehPar (num5)  {
      if (num5 % 2==0)  {
        return true
    }
    else {
        return false
    }
}

console.log(`8 é par? (true ou false): ${ehPar(8)}`)

console.log(`7 é par? (true ou false): ${ehPar(7)}`)



// deconto -------------------- xxxx

function calcularDesconto (preço, desconto)  {
        desconto = preço * (desconto/100)
        preço = preço - desconto
        return preço 
}

console.log("Para um produto de 100 e um desconto de 10%, temos um preço final de:")
console.log(calcularDesconto(100, 10)); // (preço X, desconto Y));

// Exercicio 6 ---------------------------------
function calculaMedia (notaTeste, notaProjeto)  {
        media = (notaTeste + notaProjeto) / 2
        return media
}

console.log(`Para o(a) aluno(a) ${nome}, a média é ${calculaMedia(20, 19)}`)

// aprovação ------------------------ xxxx
if (media < 0 ) {
    console.log ("Valor inválido")
}

if (media >= 0 && nota <= 9) {
    console.log ("Não aprovado")
}

if (media >= 10 && nota <= 13) {
    console.log ("Suficiente")
}

if (media >= 14 && nota <= 17) {
    console.log ("Bom")
}

if (media >= 18 && nota <= 20) {
    console.log ("Muito bom! Aprovado (a)!")
}

if (media > 20) {
    console.log ("Valor inválido")
}

// tabuada da media ----------------- xxxx
mediaArredondada = (Math.floor(media)) // arredonda a media

console.log ("Tabuada da média: ")
for (i = 1 ; i <= 10 ; i++) {
    tabuada = mediaArredondada * i
    console.log (`${mediaArredondada} x ${i} = ${tabuada}`)
}
