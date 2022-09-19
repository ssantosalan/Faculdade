"use strict";

// const getPersonData = function () {
//   fetch(`dados.json`)
//     .then(function (response) {
//       console.log(response);
//       return response.json();
//     })
//     .then(function (data) {
//       console.log(data);
//     });
// };

// getPersonData();

// function montarDados() {
//   //let elConteudo = document.getElementById('conteudo');
//   let elConteudo = document.querySelector('#nome');
//   elConteudo.classList.add('estilo1');
//   elConteudo.innerHTML = '<h1>Teste de Javascript</h1><h2>Exemplos diversos</h2>';

//   let elH1 = document.querySelector('h1');
//   elH1.style.backgroundColor = 'red';
// }

// document.addEventListener('DOMContentLoaded', montarDados);

// const teste = function () {
//   fetch("json.json")
//     .then((response) => response.json())
//     .then((data) => console.log(data));
// };

// teste();

// const dados = function() {
//   fetch(`dados.json`)
//   .then(data => data.json())
//   .then(data => console.log(data))
// }
// dados();

const xhr = new XMLHttpRequest();
xhr.open("GET", "dados.json");

xhr.onload = function () {
  if (xhr.status >= 200 && xhr.status < 400) {
    let dados = JSON.parse(xhr.responseText);
    document.getElementById("nome").innerHTML = dados.nome;
    document.getElementById("dataNascimento").innerHTML = dados.dataNascimento;
    document.getElementById("email").innerHTML = dados.email;

    for (const experiencia of dados.experienciasProfissionais) {
      document
        .getElementById("exp-prof")
        .insertAdjacentHTML(
          "beforeend",
          "<li>" + experiencia.empresa + "</li>"
        );

      document
        .getElementById("exp-prof")
        .insertAdjacentHTML("beforeend", "<li>" + experiencia.cargo + "</li>");

      document
        .getElementById("exp-prof")
        .insertAdjacentHTML(
          "beforeend",
          "<li>" + experiencia.dataInicio + "</li>"
        );

      document
        .getElementById("exp-prof")
        .insertAdjacentHTML(
          "beforeend",
          "<li>" + experiencia.dataTermino + "</li>"
        );
    }

    for (const conhecimento of dados.conhecimentos) {
      document
        .getElementById("conhecimentos")
        .insertAdjacentHTML("beforeend", "<li>" + conhecimento + "</li>");
    }

    for (const formacao of dados.formacaoAcademica) {
      document
        .getElementById("form-acad")
        .insertAdjacentHTML("beforeend", "<li>" + formacao.curso + "</li>");

      document
        .getElementById("form-acad")
        .insertAdjacentHTML(
          "beforeend",
          "<li>" + formacao.instituicao + "</li>"
        );
    }

    document.getElementById("idiomas").insertAdjacentHTML(
      "beforeend",
      `
    <table>
      <thead>
        <tr>
          <th>&nbsp;</th>
          <th>Leitura</th>
          <th>Escrita</th>
          <th>Conversação</th>
        </tr>
      </thead>
      <tbody id="tbody"></tbody>
    </table>
`
    );

    for (const idioma of dados.idiomas) {
      document.getElementById("tbody").insertAdjacentHTML(
        "beforeend",
        `
    <tbody>
    <tr>
    <th>${idioma.idioma}</th>
    <td>${idioma.leitura}</td>
    <td>${idioma.escrita}</td>
    <td>${idioma.conversacao}</td>
  </tr>`
      );
    }
  }
};


xhr.send();

console.log(xhr);
