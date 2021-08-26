fun main(args: Array<String>){
    if(args.size != 0){
        args.sort()
        for(n in args){
            println(n)
        }
    }
    else
    {
        println("n/a")
    }
}
