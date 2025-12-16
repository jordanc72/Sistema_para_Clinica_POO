# Sistema-para-Clinica-POO
Trabajo Integrador de Programación Orientada a Objetos en Java.

### Sistema Clínica Médica

Una clínica médica requiere un sistema para facilitar la gestión comercial, llevar el control de las prestaciones que brinda y administrar el contacto con los pacientes. El instituto ofrece atención en distintas áreas médicas.

Es importante para el instituto poder brindar al personal administrativo facilidades para la atención de los pacientes y el armado inicial de las prestaciones a realizar. Saber
cuáles son las prestaciones que están activas para brindar turnos a los pacientes, conocer las especialidades con turnos disponibles, y los turnos que tomó un paciente.

Las prestaciones son brindadas por médicos, actualmente cada prestación tiene un solo doctor y cada área médica debe tener un médico coordinador. Se desea que los doctores puedan registrar la asistencia de cada paciente y cargar los estudios y recetas prescriptas durante la visita en una misma pantalla.

La clínica posee consultorios tradicionales y laboratorios donde se realizan los distintos estudios los cuales disponen de los equipos necesarios. El administrativo debería poder asignarle a los distintos turnos el consultorio/laboratoriodonde va a brindarse la atención, y el médico que la brindará en no más de 2 pantallas. Es indispensable evitar la superposición horaria de todos los médicos y turnos.

Cada paciente debe estar registrado con sus datos personales, y los turnos que tiene. Se aceptan pacientes de obras sociales, prepagas o particulares. Asimismo un
paciente puede abonar sus prestaciones con tarjeta de crédito mediante una interfaz con la red bancaria correspondiente, pero dicha comunicación debe realizarse en menos de 5 segundos.

Todas las prestaciones definen un tratamiento o serie de estudios/medicamentos a recetar. Los turnos se caracterizan por tener una fecha, hora de inicio yhora de finalización, A diferencia de las prestaciones tradicionales, los estudios no tienen asociados medicamentos a recetar. Los estudios son realizados en una única fecha, por lo que para acreditar la participación es necesaria solamente la asistencia en esa fecha y hora.

La clínica también puede brindar sobre turnos en caso de ser necesario. Por otro lado el director delaclínica estaría interesado en la idea de que al registrarse una cantidad determinada de inasistencias continuas o discontinuas de algún paciente, se genere automáticamente un evento para que un administrativo pueda llamarlo. Por otro lado, quisiera obtener ciertos reportes mensuales de cantidad de
prestaciones brindadas por médico y estudios realizados en la clínica.

Como la clínica no quiere abonar licencias, desearía que el sistema se realice con software libre y corra en entornos Linux. Asimismo, el director solicita que el personal de soporte esté disponible 24hs todos los días de la semana.

### Ejercicio:
Realice el análisis (AOO), diseño (DOO) y programación orientada a objetos (POO) de un sistema que resuelva y modele la situación planteada.
Se desea plantear una solución que pueda adaptarse a distintas clínicas medicas y que disponga de la flexibilidad para que su mantenimiento sea sencillo ante posibles cambios y nuevas solicitudes.

## Se pide que entregue:
* Definición de requisitos del sistema (Clasificados)
* Definición de Casos de Uso (Todos)
* Diagramas de secuencia de sistema
* Glosario
* Especificación de Casos de Uso
* Diagrama de clases
* Diagrama de estados
* Implementación de la solución completa en Java.
* Implementación de un programa que pruebe dicha solución.
* Casos de pruebas (Todos)
