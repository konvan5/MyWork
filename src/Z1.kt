
fun main(args: Array<String>){
    if(args.isEmpty()){
        var text = readLine()
        for(t in (text as String).split(' '))
            println(t)
    } else {
        for(t in args)
            println(t)
    }
}