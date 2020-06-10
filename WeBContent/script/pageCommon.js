document.addEventListener('DOMContentLoaded',function(){
    var a = document.querySelector('title').text;
    document.getElementById('Title').append(a);
    if(a == 'OA 部门设置'){
        document.getElementById('InputDetailBar').style.marginTop='304px';;
    }
})