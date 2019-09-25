fun main(args: Array<String>){
    var text: List<String>
    if(args.isEmpty())
        text = (readLine()as String).split(' ').sorted()
    else  text = args.sorted()
    var temp: String = ""
    var count: Int = 1
    for(t in text)
        if(temp == "")
            temp = t
        else if(temp == t){
            count++
        } else {
            println("$temp $count")
            temp = t
            count = 1
        }
    println("$temp $count")
}