const api_reagente =
	"http://localhost:8080/api/v1/reagents";

getapiReag(api_reagente);
function getapiReag(url) {
	
	fetch(url)
    .then(res => res.json())
    .then((out) => {
        console.log(out)
        showReag(out);
    }).catch(err => console.error(err));

}
function showReag(data) {
	// Setting innerHTML as tab variable
	document.getElementById("qtdReagente").innerHTML = `${data.length}`;
}