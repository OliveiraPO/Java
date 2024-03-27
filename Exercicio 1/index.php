<?php

//Função Básica

function hello(){
    echo "Hello World!<br>";
}

hello();

function meuNome($nome){
    echo "Meu nome é $nome<br>";
}

meuNome("Pedro");

function soma($a,$b):float{
    return($a+$b);
}

$resultado=soma(10,5);
echo "A soma é $resultado<br>";
var_dump($resultado);

//Funções com argumento padrão

function apresentar($nome="Não informado"){
    return "<br>Meu nome é $nome<br>";
}

echo apresentar("Pedro");

//Escopo de variáveis

//$teste = 20;
function teste(){
    $teste=10;
    //global $teste;
    echo "A variável existe aqui e o valor é $teste<br>";    
}

teste();

echo "A variável não existe aqui ".((isset($teste))?"a variável existe<br>":"a variavel não existe<br>");

//Trabalhando com Constantes

$pi = 3.14;
const _NPI = 3;
define("N_PI",3.1);

function constantes(){
    global $pi;
    echo "Variável comum $pi <br>";
    echo "Variável const ". _NPI."<br>";
    echo "Variável define ".N_PI."<br>";

}

constantes();


//Funções Anônimas

$funcao = function($valor){
    echo "<br> $valor <br>";
};
$funcao("TESTE");

$numeros = "1,2,3,4,5";

$valores = explode(",",$numeros);

//var_dump($valores);

function listar($valor){
    return "<li> V = $valor </li>";
}

$final = array_map("Listar", $valores);

echo "<ul>".implode($final)."</ul>";
echo "<pre>";
var_dump($final);
echo "</pre>";
?>