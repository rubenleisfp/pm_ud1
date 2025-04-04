interface Observable {
    fun subscribe(observer: Observer)
    fun unsubscribe(observer: Observer)
}

interface Observer {
    fun update(message: String)
}

class Publisher : Observable {
    private val observers: MutableList<Observer> = mutableListOf()

    override fun subscribe(observer: Observer) {
        observers.add(observer)
        println("Observer ${observer.javaClass.simpleName} subscribed.")
    }

    override fun unsubscribe(observer: Observer) {
        observers.remove(observer)
        println("Observer ${observer.javaClass.simpleName} unsubscribed.")
    }

        fun publishMessage(message: String) {
        println("Publishing message: $message")
        observers.forEach { observer ->
            observer.update(message)
        }
    }
}

class EmailNotification : Observer {
    override fun update(message: String) {
        println("Email notification received: $message")
        // Logic to send an email notification
    }
}

class SMSNotification : Observer {
    override fun update(message: String) {
        println("SMS notification received: $message")
        // Logic to send an SMS notification
    }
}

fun main() {
    val publisher = Publisher()

    val emailNotification = EmailNotification()
    val smsNotification = SMSNotification()

    publisher.subscribe(emailNotification)
    publisher.subscribe(smsNotification)

    publisher.publishMessage("Hello, subscribers!")

    publisher.unsubscribe(emailNotification)

    publisher.publishMessage("Goodbye, subscribers!")
}