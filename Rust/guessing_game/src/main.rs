extern crate rand;

use std::io; /*Calling the io library - library comes from the std lib */
use std::cmp::Ordering;
use rand::Rng;

fn fib(n: u64) -> u64 {
	if n <= 2 {
		1
	} else {
		fib(n - 1) + fib(n - 2)
	}
}

fn main() {
    //println!("Guess the number!");

    //let secret_number = rand::thread_rng().gen_range(1, 101);
    /* thread_rng function gives us a particular random num gen that we're going to use - 
    one that is local to the current thread of execution and seeded by the os */

    //println!("The secret number is: {}", secret_number);

    //loop {
    	//println!("Please input your guess");
	    /* Create a place to store user input */
	    /* Let statement is used to create variables */
	    /* In Rust variables are immutable by default - mut before variable makes it mutable */
	    //let mut guess = String::new();
	    /* String::new() calls a new instance of a String - UTF-8 encoded text */
	    /* created a mutable variable that is currently bound to a new, empty instance of String */
	   // io::stdin().read_line(&mut guess)
	    //	.expect("Failed to read line");
	    /* .read_line(&mut guess), calls the read_line method on the stdio handle to get input from the user */
	    /* read_line takes the input and places it into a string. String arg needs to be mutable, so it can change */
	    /* The & indicated that this argument is a regerence, lets mutliple parts of code access one piece of data without copying into memory multiple times */
	    /* read_line() returns an io::Result type enums */
	    /* Enums is a type that can have a fixed set of values and those are called enum variants */
	    
	    /* Shadowing lets us reuse the guess variable name rather than create two unique vars */
	    //let guess: u32 = match guess.trim().parse() {
	    //	Ok(num)	=> num,
	    //	Err(_)	=> continue,
	   // };

	    //println!("You guessed: {}", guess);

	   // match guess.cmp(&secret_number) {
	   // 	Ordering::Less		=>	println!("Too small!"),
	   // 	Ordering::Greater	=>	println!("Too big!"),
	   // 	Ordering::Equal		=>	{
	   // 		println!("You win!");
	    //		break;
	   // 	}
    	//}
	//}
	println!("Enter number:");

	let mut input = String::new();

	io::stdin().read_line(&mut input).ok().expect("Input Error");

	let num: u64 = input.trim().parse().ok().expect("Parsing Error");
	let f = fib(num);

	println!("Fib {} is {}", num, f);
}