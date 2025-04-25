# patrones-diseno-java
Curso patrones de diseño JAVA (https://conexia.udemy.com/course/patrones-de-diseno-java)

# Patrones de diseño
## Patrones Creacionales

### Factory Method
El patrón Factory Method es un patrón de diseño creacional que permite definir una interfaz para crear objetos, pero
permite a las subclases decidir qué clase instanciar. Es muy útil cuando el código cliente no debe conocer la clase
concreta que va a usar.

#### Estructura del patrón:
**Producto**: Interfaz o clase abstracta común para todos los objetos que se pueden crear.

**Creador (Creator)**: Clase abstracta con un método factoryMethod que devuelve objetos del tipo Producto.

**Creadores Concretos** (ConcreteCreator): Implementan el método factoryMethod para crear instancias específicas.

#### Beneficios del patrón:
Desacopla la creación del objeto de su uso.

Facilita la extensión del sistema agregando nuevas clases concretas sin tocar el código cliente.

Mejora la mantenibilidad.