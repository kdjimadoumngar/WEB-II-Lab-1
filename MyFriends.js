function getGithubInfo(user) {
    //1. Create an instance of XMLHttpRequest class and send a GET request using it. The function should finally return the object(it now contains the response!)
    var xhttp=new XMLHttpRequest();
    var url ='https://api.github.com/users/'+user;
    xhttp.open('GET', url, false);
    xhttp.send();
    var json = xhttp.responseText;
    var myObject = json;
    document.getElementById('avatar').innerHTML = myObject

    console.log(xhttp.response);

    return xhttp.responseText;




}

function showUser(user) {
    console.log(user);

    //2. set the contents of the h2 and the two div elements in the div '#profile' with the user content

}

function noSuchUser(username) {
    //3. set the elements such that a suitable message is displayed


}


$(document).ready(function(){
    $(document).on('keypress', '#username', function(e){
        //check if the enter(i.e return) key is pressed
        if (e.which == 13) {
            //get what the user enters
            username = $(this).val();
            //reset the text typed in the input
            $(this).val("");
            //get the user's information and store the respsonse
            var response = getGithubInfo(username);
            console.log(response.status);

            //if the response is successful show the user's details
            if (response.status == 200) {
                showUser(JSON.parse(response.responseText));
                //else display suitable message
            } else {
                noSuchUser(username);
            }
        }
    })
});
