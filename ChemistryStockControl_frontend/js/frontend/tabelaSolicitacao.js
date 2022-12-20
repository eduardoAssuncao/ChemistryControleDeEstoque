const api_url_solicitacao =
	"http://localhost:8080/api/v1/solicitations";

// Defining async function
async function getSolicitacao(url) {
	// Storing response
	const response = await fetch(url);
	
	// Storing data in form of JSON
	var data = await response.json();
    
	showSolicitacao (data);
}
// Calling that async function
getSolicitacao(api_url_solicitacao);

// Function to define innerHTML for HTML table
function showSolicitacao(data) {
	let tab =
		`<thead>
        <tr">
            <th scope="col">Cód</th>
            <th scope="col">Solicitante</th>
            <th scope="col">Finalidade</th>
            <th scope="col">Situação</th>
            <th scope="col">Ação</th>
        </tr>
    </thead>`;
	
	// Loop to access all rows
	for (let r of data) {
        //arrumar informações setadas
		tab += `<tbody>
        <tr scope="row">
            <td><a href="#" class="name">${r.nome}</a></td>
            <td>${r.quantidade}</td>
            <td>${r.justificativa}</td>
            <td>${r.destino}</td>
            <td><a href="#"class="more">Detalhes</a></td>
        </tr>
    </tbody>`;
	}
	// Setting innerHTML as tab variable
	document.getElementById("solicitacoes").innerHTML = tab;
}