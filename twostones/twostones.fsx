open System
let n = System.Console.ReadLine()
let m = System.Int32.Parse(n)
if m%2 = 1 
    then printfn "Alice"
    else printfn "Bob"