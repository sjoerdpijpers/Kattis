open System
let line = System.Console.ReadLine()
let N = System.Int32.Parse(line)
let R = N%100

if N<100
    then printfn "%i" 99
    else
        if R<49 
            then 
                let lower = N-R-1
                printfn "%i" lower
            else 
                let upper = N+(100-R)-1
                printfn "%i" upper