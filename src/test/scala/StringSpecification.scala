import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object StringSpecification extends Properties("String") {

  property("startsWith") = forAll { (a: String, b: String) => (a+b).startsWith(a) }

  property("concatenate") = forAll { (a: String, b: String) => (a+b).length > a.length && (a+b).length > b.length }

  property("substring") = forAll { (a: String, b: String, c: String) => (a+b+c).substring(a.length, a.length+b.length) == b }

  property("concatLists") = forAll { (l1: List[Int], l2: List[Int]) => l1.size + l2.size == (l1 ::: l2).size }

  property("propSqrt") = forAll { (n: Int) => scala.math.sqrt(n*n) == n }

  property("ReverseList") = forAll { l: List[String] => l.reverse.reverse == l }

  property("ConcatString") = forAll { (s1: String, s2: String) => (s1 + s2).endsWith(s2) }

  property("FillingLruMap") = forAll { (key:String, value:String) => 

  }
}
