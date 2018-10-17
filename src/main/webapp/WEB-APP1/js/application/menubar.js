function getMenu(idMenue) {
    if (idMenue != ''){
        $("#indexHeader").show;
    } else $("#indexHeader").hide();

    var c = document.getElementById("divMenu").childNodes;
    var child;
    if(c!= null && c.length > 0){
        for(i=0;i<c.length;i++){
            child = c[i];
            if(child.nodeName == 'DIV'){
                if(idMenu != ''){
                    if(child.id == idMenu){
                        child.style.display = 'block';
                    }else child.style.display = 'none';
                }else child.style.display = 'none';
            }
        }
    }

    var s = document.getElementById("divMenuSidebar").childNodes;
    var sChild;
    if(s!= null && s.length > 0){
        for(i=0;i<s.length;i++){
            sChild = s[i];
            if(sChild.nodeName == 'DIV'){
                if(idMenu != ''){
                    let sidebar = idMenu+'Sidebar'
                    if(sChild.id == sidebar){
                        sChild.style.display = 'block';
                    }else sChild.style.display = 'none';
                }else sChild.style.display = 'none';
            }
        }
    }
}