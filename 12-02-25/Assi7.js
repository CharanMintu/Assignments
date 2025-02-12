daysUntilChristmas = () => {
    let today = new Date(), christmas = new Date(today.getFullYear(), 11, 25);
    if (today > christmas) christmas.setFullYear(today.getFullYear() + 1);
    console.log(`Days until Christmas: ${Math.ceil((christmas - today) / (1000 * 60 * 60 * 24))}`);
};

printWindow = () => window.print();