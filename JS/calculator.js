#!/usr/bin/env node

var fs = require('fs'),
    assert = require('assert');

var lines = fs.readFileSync('./test_cases.csv', {encoding: 'utf8'})
      .split('\n')
      .filter(function(line) { return line; });

function evaluate(input) {
  // Put your code here!
  

}

var passes = lines.reduce(function(passes, line) {
  var toks = line.split(','),
      passed = evaluate(toks[0]) == parseInt(toks[1]);

  return passes + (passed ? 1 : 0);
}, 0);

var tests = lines.length,
    smiley = passes === tests ? ' :)' : '',
    message = 'Passed ' + passes + '/' + tests + smiley;

console.log(message);