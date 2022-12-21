const api_url = 
      "http://localhost:8080/api/v1/materials";

async function getapi(url) {
    const response = await fetch(url);
    var data = await response.json();
    show(data);
}

getapi(api_url);

const itemSelecionado = '';
let searchable = []
const searchInput = document.getElementById("inputMat")
const searchWrapper = document.querySelector(".search-wrapper")
const resultsWrapper = document.querySelector("#results")

function show(data) {
    
    for (let r of data) {
        searchable.push(r.name)
    }
    //document.getElementById("employees").innerHTML = tab;
}

searchInput.addEventListener('keyup', () => {
    let results = [];
    let input = searchInput.value;
    if (input.length) {
      results = searchable.filter((item) => {
        return item.toLowerCase().includes(input.toLowerCase());
      });
    }
    renderResults(results);
  });

  function renderResults(results) {
    if (!results.length) {
      return searchWrapper.classList.remove('show');
    }
  
    const content = results
      .map((item) => {
        return `<a href='#' onclick=(seleciona(${item}))><li>${item}</li></a>`;
      })
      .join('');
  
    searchWrapper.classList.add('show');
    resultsWrapper.innerHTML = `<ul>${content}</ul>`;
  }

function seleciona(item){
    console.log(item)
}