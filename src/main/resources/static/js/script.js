$(document).ready(function() {
    $('input[type="radio"]').click(function() {
        var inputValue = $(this).attr("value");
        var targetDiv = $("." + inputValue);
        $(".optionTrip").not(targetDiv).hide();
        $(targetDiv).show();
    });
});


let w_100_divs = document.querySelectorAll('.w-100');

w_100_divs.forEach(w_100_div => {
    const selected = w_100_div.querySelector(".selected");

    const optionsContainer = w_100_div.querySelector(".select-options");

    const optionsList = optionsContainer.querySelectorAll(".option");

    selected.addEventListener("click", () => {
        optionsContainer.classList.toggle("active");
        console.log(selected)
    });

    optionsList.forEach(o => {
        o.addEventListener("click", () => {
            console.log(o);
            selected.value = o.innerHTML;
            optionsContainer.classList.remove("active");
        });
    });
})

let classes = document.querySelectorAll('.class');

classes.forEach(classe => {
    const selected = classe.querySelector(".selected");

    const optionsContainer = classe.querySelector(".class-options");

    const optionsList = optionsContainer.querySelectorAll(".option");

    selected.addEventListener("click", () => {
        optionsContainer.classList.toggle("active");
        console.log(selected)
    });

    optionsList.forEach(o => {
        o.addEventListener("click", () => {
            console.log(o);
            selected.value = o.innerHTML;
            optionsContainer.classList.remove("active");
        });
    });
})


//address, countries, phone number visa card number and name, sex, marital status, no more password for simple users.
/* he should not be able to enter your application through the browser
    he want to print the session number to verify if session has been implemented in the pages
*/