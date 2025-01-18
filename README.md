# **Tarea3 -- EnVivoTickets**


## Integrantes:
- PAULO MARCELO TAPIA LOOR 
- CHRISTIAN JAVIER MACIAS MENDOZA 
- ROBERTO CARLOS BARRIOS URETA 

## Explicacion de Patrones:

### Patron Decorator:
El patron Decorator se utiliza para agregar nuevas funcionalidades a un objeto existente sin modificar su estructura interna. En este caso, se utiliza para agregar funcionalidades a la clase Ticket, cosas como las ***bebidas*** o ***alimento*** extra en los tickets de los eventos es donde se puede ver implementado este patron.

### Patron Observer:
El patron Observer se utiliza para notificar a los objetos que dependen de otro objeto cuando este cambia. En este caso, se utiliza para ***notificar a los objetos que dependen de la clase Evento cuando este cambia***. Por ejemplo, cuando se agrega una nueva caracteristica a un evento, se notifica a los clientes que han adquirido un ticket para el evento afectado. 

### Patron Facade:
El patron Facade se utiliza para proporcionar una interfaz simplificada a un sistema complejo. En este caso, se utiliza para proporcionar una interfaz simplificada a la clase Evento, la cual es la clase que maneja la logica general de la aplicacion. Por ejemplo, la clase Evento tiene metodos para agregar y eliminar caracteristicas, pero la clase Facade *proporciona una interfaz simplificada para que los clientes puedan realizar estas operaciones de manera sencilla*.

### Patron Factory Method:
El patron Factory Method se utiliza para proporcionar una interfaz para crear objetos sin especificar la clase concreta que se utilizará. En este caso, se utiliza para proporcionar una interfaz para crear objetos de tipo Ticket sin especificar la clase concreta que se utilizará. Por ejemplo, la clase TicketFactory proporciona una interfaz para crear objetos de tipo Ticket, pero la clase concreta que se utilizará se especifica en el momento de la creación del objeto; en este caso en particular las variaciones posibles para los tickets son las 3 categorias que se ofrecen las cuales serian ***VIP***, ***Platea*** y ***Balcon***, aunque esto siempre se encuentra a libre extension acorde a las necesidades de los usuarios.