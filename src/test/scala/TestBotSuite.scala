import TestBot.answerUser
import org.scalatest.flatspec.AnyFlatSpec

class TestBotSuite extends AnyFlatSpec{
  "answerUser" should "return correct answer on bye" in {
    val result = answerUser("Bye")
    assert(result == "See you!")
  }
  it should "return correct answer on hello" in {
    val result = answerUser("Hello")
    assert(result == "I'm bot, tell me your problem")
  }
}
