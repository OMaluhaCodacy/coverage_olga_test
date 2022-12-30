object TestBot {

  def answerUser(message: String) = message match {
    case "Hello" => "I'm bot, tell me your problem"
    case "call mom" => "please wait, I'm calling"
    case "Bye" => "See you!"
    case n => s"I'm looking for $n"
  }

  def count(x: Int): Int = {
    if (x % 2 == 1) x + 3
    else x * 2
  }

  def addIfTwelve(n : Int): Int = n match {
    case 12 => n + 1
    case _ => n

  }
}
