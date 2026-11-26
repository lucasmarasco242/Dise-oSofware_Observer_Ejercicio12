Ejercicio 2 - Indicador de Estado de Conexión de Red

Explicación del programa

En este ejercicio se implementó el patrón de diseño Observer para actualizar un icono en la barra de herramientas y un mensaje en la barra de estado cuando cambia el estado de la red, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz ObservadorRed con el método alCambiarEstado(String estado).
- Dos clases observadoras (IconoBarraHerramientas y MensajeBarraEstado) que reaccionan ante cada cambio de estado de red.
- Una clase MonitorRed que encapsula la lista de observadores y notifica al cambiar el estado de conexión.

Luego, dentro del método main, se crea el monitor de red, se suscriben ambos componentes visuales y se cambian los estados a Conectado, Intermitente y Desconectado.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común ObservadorRed para que los componentes visuales reaccionen pasivamente sin consultar el monitor.
- Encapsular en MonitorRed el registro, baja y notificación segura de los observadores.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
[ICONO BARRA HERRAMIENTAS] Estado visual de red: Conectado
[BARRA DE ESTADO] Conexión de red: Conectado
[ICONO BARRA HERRAMIENTAS] Estado visual de red: Intermitente
[BARRA DE ESTADO] Conexión de red: Intermitente
[ICONO BARRA HERRAMIENTAS] Estado visual de red: Desconectado
[BARRA DE ESTADO] Conexión de red: Desconectado

Captura de pantalla

<img width="687" height="261" alt="image" src="https://github.com/user-attachments/assets/cf44f98b-d735-4a5b-a138-674e9cde1904" />
