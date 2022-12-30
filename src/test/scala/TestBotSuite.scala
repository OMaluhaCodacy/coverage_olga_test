import TestBot.answerUser
import org.scalatest.flatspec.AnyFlatSpec

class TestBotSuite extends AnyFlatSpec{
  "answerUser" should "return correct answer on bye" in {
    val result = answerUser("Bye")
    assert(result == "See you!")
  }
}
