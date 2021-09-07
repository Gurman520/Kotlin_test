fun main(args: Array<String>){
    if(args.size != 0){
        args.sort()
        var s: Int
        s = args.size
        var i:Int = 0
        while(i < s){
            var count: Int = 1
            while(++i < s && args[i] == args[i - 1]) ++count
            print(args[i - 1])
            println(" $count")
        }

    }
    else
    {
        println("n/a")
    }
}
