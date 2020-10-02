// when in kotlin 
// in place of switch we have when 

fun main(args : Array<String>)
{
    val choice = 15 
    when(choice)
    {
      in 10..20-> print("10")
       in  20..30-> print("11")
        else ->
        {
            print("enter valid choice")
        }
    }
}
