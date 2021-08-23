package com.scripts



/**
 * " "
 * ''
 * """ """
 * ''''''
 * / /
 * $/ /$
 * */

def name = "Ivan'''''''''''''\''''"
def name2 = 'Ivan"""""""\""""'
def name3 = '''Ivan ivanov'''
def strValue = "Hello $name"
println strValue

value = """
SELECT * 
FROM table
WHERE name = ${getWithPrefix(name)}
"""
println value

def value5 = /Hello world $name3/

def value4 = $/Hello word $name3/$

println name[2]
println name[-2]
println name[1..5]
println name * 3
println name - 'an'

def getWithPrefix(String name) {
    "prefix-" + name
}