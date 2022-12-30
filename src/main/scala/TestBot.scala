class TestBot {

  def answerUser(message: String) = message match {
    case "Hello" => println("I'm bot, tell me your problem")
    case "call mom" => println("please wait, I'm calling")
    case "Bye" => println("See you!")
    case n => println(s"I'm looking for $n")
  }

  def count(x: Int): Int = {
    if (x % 2 == 1) x + 3
    else x * 2
  }
}
