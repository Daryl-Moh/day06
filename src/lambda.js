const hello = function(name) {

    console.info('Hello ${name}')
}

const username = 'fred'
const hi = hello
const names = ['fred', 'betty', 'barney', 'wilma']



const sayHello = function(fn, name) {
    // if fn is a function, then I can call the function
    fn(args) 
}

console.info('>>> hello: ', hello)
hello(username)
hi('barney')

console.info('Say hello to these guys ', names)
for (let n of names)
    sayHello(hello, n)