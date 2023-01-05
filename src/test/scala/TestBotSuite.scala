import TestBot.answerUser
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers


class TestBotSuite extends AnyFlatSpec with Matchers{
  "answerUser" should "return correct answer on bye" in {
    val result = answerUser("Bye")
    assert(result == "See you!")
  }
  it should "return correct answer on hello" in {
    val result = answerUser("Hello")
    assert(result == "I'm bot, tell me your problem")
  }
  it should "return correct answer to call mom" in {
    val result = answerUser("call mom")
    assert(result == "please wait, I'm calling")
  }
  it should "return correct answer to find a cat" in {
    val result = answerUser("find a cat")
    assert(result == "I'm looking for find a cat")
  }

}
