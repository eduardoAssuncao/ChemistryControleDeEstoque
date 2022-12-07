const api_reagente =
	"http://localhost:8080/api/v1/reagents";

getapi(api_reagente);

function getapi(url) {
	
	fetch(url)
    .then(res => res.json())
    .then((out) => {
        console.log(out)
        show(out);
    }).catch(err => console.error(err));

}
function show(data) {
	// Setting innerHTML as tab variable
	document.getElementById("qtdReagente").innerHTML = `${data.length}`;
}