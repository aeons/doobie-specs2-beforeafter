import cats.effect.IO
import doobie.implicits._
import doobie.specs2._
import doobie.util.transactor.Transactor
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeAfterAll

class DoobieBeforeAfter extends Specification with IOChecker with BeforeAfterAll {

  val transactor = Transactor.fromDriverManager[IO](
    "org.postgresql.Driver",
    "jdbc:postgresql:world",
    "postgres",
    ""
  )

  check(sql"select 42, true".query[(Int, Boolean)])

  override def beforeAll(): Unit = println("beforeAll")

  override def afterAll(): Unit = println("afterAll")

}
