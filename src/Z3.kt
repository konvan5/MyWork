fun main(args: Array<String>){
    if(args.isEmpty()){
        var text = readLine()
        for(t in (text as String).split(' ').sorted().distinct())
            println(t)
    } else {
        for(t in args.sorted().distinct())
            println(t)
    }
}