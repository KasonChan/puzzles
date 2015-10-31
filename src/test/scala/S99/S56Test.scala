package S99

import S99.S56.symmetric
import helpers.{Branch, Empty}
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by ka-son on 10/31/15.
 */
class S56Test extends FlatSpec with Matchers {

  "symmetric(Branch(\"x\", Branch(\"x\", Empty, Empty), Empty))" should "= false" in {
    symmetric(Branch("x", Branch("x", Empty, Empty), Empty)) shouldBe false
  }

  "symmetric(Branch(\"x\", Branch(\"x\", Empty, Empty), Branch(\"x\", Empty, Empty)))" should "= true" in {
    symmetric(Branch("x", Branch("x", Empty, Empty), Branch("x", Empty, Empty))) shouldBe true
  }

}
