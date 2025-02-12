function getCurrentDate() {
    let now = new Date();
    let dd = now.getDate();
    let mm = now.getMonth() + 1;
    let yyyy = now.getFullYear();

    console.log(`${dd}-${mm}-${yyyy}, ${dd}/${mm}/${yyyy}`);
}

getCurrentDate();
