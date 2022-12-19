open System
let line = Console.ReadLine()
let result = line.Split ' '
let a = int result.[0] 
let b = int result.[1]
let c = int result.[2]
Console.WriteLine(a*b*c)