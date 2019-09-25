fun main(args: Array<String>){
    if(args.isEmpty()){
        var text = readLine()
        for(t in (text as String).split(' ').sorted())
            println(t)
    } else {
        for(t in args.sorted())
            println(t)
    }
}