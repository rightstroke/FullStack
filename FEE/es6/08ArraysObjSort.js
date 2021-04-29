let employees = [
    {
        firstName: 'John',
        lastName: 'Doe',
        age: 27,
        joinedDate: 'December 15, 2017'
    },
    {
        firstName: 'Ana',
        lastName: 'Rosy',
        age: 25,
        joinedDate: 'January 15, 2019'
    },
    {
        firstName: 'Zion',
        lastName: 'Albert',
        age: 30,
        joinedDate: 'February 15, 2011'
    }
];

employees.sort((a, b) => {
    return a.age - b.age;
});

employees.forEach((e) => {
    console.log(`${e.firstName} ${e.lastName} ${e.age}`);
});

employees.sort((a, b) => {
    let fa = a.firstName.toLowerCase(),
        fb = b.firstName.toLowerCase();

    if (fa < fb) {
        return -1;
    }
    if (fa > fb) {
        return 1;
    }
    return 0;
});

employees.forEach((e) => {
    console.log(`${e.firstName} ${e.lastName}`);
});

employees.sort((a, b) => {
    let da = new Date(a.joinedDate),
        db = new Date(b.joinedDate);
    return da - db;
});

employees.forEach((e) => {
    console.log(`${e.firstName} ${e.lastName} ${e.joinedDate}`);
});