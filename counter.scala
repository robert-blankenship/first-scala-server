import akka.actor.{
	Actor,
	ActorSystem,
	ActorRef,
	Props
}

import spray.routing._
import spray.http._
import MediaTypes._

class ServiceActor extends Actor with Service {
	def receive = runRoute(route)
	def actorRefFactory = context
}

object app extends App {
	import akka.io.IO
	import akka.util.Timeout
	import akka.pattern.ask
	import spray.can.Http
	import scala.concurrent.duration._

	implicit val system = ActorSystem("on-spray-can")

	val service: ActorRef = system.actorOf(Props[ServiceActor], name="demo-service")

	implicit val timeout = Timeout(5.seconds)

	IO(Http) ? Http.Bind(service, interface="localhost", port=8080)
}

trait Service extends HttpService {
	val route = path("") {
		get { respondWithMediaType(`text/html`) {
			complete {
				<html><body><h1>Hello World</h1></body></html>
			}
		}}
	}
}
