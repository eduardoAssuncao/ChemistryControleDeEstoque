const search_input = document.querySelector("#inputMat")

search_input.addEventListener("keyup", function (e){
    var search_item = e.target.value.toLowerCase()
    var span_reagents_items = document.querySelectorAll("#reagentes tr .name")
    
    span_reagents_items.forEach(function(item){
        console.log(item.textContent)
        if(item.textContent.toLowerCase().indexOf(search_item) != -1){
            item.closest("tr").style.display = "";
        }
        else{
            item.closest("tr").style.display = "none";
        }
    })

    var span_glassware_items = document.querySelectorAll("#vidrarias tr .name")

    span_glassware_items.forEach(function(item){
        console.log(item.textContent)
        if(item.textContent.toLowerCase().indexOf(search_item) != -1){
            item.closest("tr").style.display = "";
        }
        else{
            item.closest("tr").style.display = "none";
        }
    })
})