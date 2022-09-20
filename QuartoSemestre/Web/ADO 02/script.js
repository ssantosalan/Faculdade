"use strict";

const xhr = new XMLHttpRequest();
xhr.open("GET", "base.json");

xhr.onload = function () {
  if (xhr.status >= 200 && xhr.status < 400) {
    let base = JSON.parse(xhr.responseText);

    document.getElementById("dados-contato").insertAdjacentHTML(
      "beforeend",
      `
    <div>
    <img id="imgPerfil" src="${base.imagem}" alt="Foto do perfil" />
  </div>
  <h1 id="nome">${base.nome}</h1>
  <p>Telefone: <span id="telefone">${base.telefone}</span></p>
  <p>E-mail: <span id="email">${base.email}</span></p>
  <p>Data de nascimento: <span id="dataNascimento">${base.dataNascimento}</span></p>
  <p>
    LinkedIn:
    <a id="linkedin" href="${base.linkedin}">
      gab
    </a>
  </p>
  <p>
    Github:
    <a id="github" href="${base.github}">
      gab
    </a>
  </p> 
    `
    );

    for (const experiencia of base.experienciasProfissionais) {
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

    for (const conhecimento of base.conhecimentos) {
      document
        .getElementById("conhecimentos")
        .insertAdjacentHTML("beforeend", "<li>" + conhecimento + "</li>");
    }

    for (const formacao of base.formacaoAcademica) {
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

    for (const idioma of base.idiomas) {
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
