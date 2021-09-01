fun main(args: Array<String>){
    if(args.size != 0){
        var arr = emptyArray<String>()
        for(n in args){
            if("$n" !in arr) {
                arr += "$n";
            }
        }
        for(c in arr){
            println(c)
        }
    }
    else
    {
        println("n/a")
    }
}
