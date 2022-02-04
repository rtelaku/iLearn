function showUserData() {
    var std = JSON.parse(localStorage.getItem('student'));
    console.log(std);
    var rows = createRows(std)
    console.log(rows);
    var index = 0;
    while (index < rows.length) {
        $('#tableBody').append(rows[index++]);
    }
}

function createRows(StudentTasks) {
    var index = 0;
    var rows = [];
    while (index < StudentTasks.studentID) {
        console.log(StudentTasks);
        var row = document.createElement('tr');

        var td1 = document.createElement('td');
        var td1text = document.createTextNode(StudentTasks[index].emri);
        td1.appendChild(td1text)

        var td2 = document.createElement('td');
        var td2text = document.createTextNode(StudentTasks[index].mbiemri);
        td2.appendChild(td2text)

        var td3 = document.createElement('td');
        var td3text = document.createTextNode(StudentTasks[index].datalindjes);
        td3.appendChild(td3text)

        var td4 = document.createElement('td');
        var td4text = document.createTextNode(StudentTasks[index].email);
        td4.appendChild(td4text)

        var td5 = document.createElement('td');
        var td5text = document.createTextNode(StudentTasks[index].nrPersonal);
        td5.appendChild(td5text)

        var td6 = document.createElement('td');
        var td6text = document.createTextNode(StudentTasks[index].username);
        td6.appendChild(td6text)

        var td7 = document.createElement('td');
        var td7text = document.createTextNode(StudentTasks[index].password);
        td7.appendChild(td7text)

        var td8 = document.createElement('td');
        var td8text = document.createTextNode(StudentTasks[index].direction);
        td8.appendChild(td8text)

        var td9 = document.createElement('td');
        var td9text = document.createTextNode(StudentTasks[index].academicGrade);
        td9.appendChild(td9text)

        var td10 = document.createElement('td');
        var td10text = document.createTextNode(StudentTasks[index].roleNr);
        td10.appendChild(td10text)
        

        row.appendChild(td1);
        row.appendChild(td2);
        row.appendChild(td3);
        row.appendChild(td4);
        row.appendChild(td5);
        row.appendChild(td6);
        row.appendChild(td7);
        row.appendChild(td8);
        row.appendChild(td9);
        row.appendChild(td10);
        rows.push(row);
        index++;
    }
    return rows;
}
