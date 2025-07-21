### 1️⃣ MainActivity.java
- **Descripción:** Es la actividad principal donde se configura la interfaz de usuario (UI). Se instancia el ViewModel y se observa el `LiveData` para actualizar la lista de carros automáticamente.
- **Ventaja:** Mantiene la lógica de UI separada de la lógica de datos gracias al patrón MVVM.

---

### 2️⃣ CarroViewModel.java
- **Descripción:** Clase que extiende `ViewModel`. Aquí se guarda la lista de `Carro` usando `MutableLiveData` y se expone como `LiveData` para que pueda ser observada desde la UI.
- **Ventaja:** Gestiona los datos de forma independiente al ciclo de vida de la actividad. La UI no necesita saber cómo se obtienen o modifican los datos.

---

### 3️⃣ CarroAdapter.java
- **Descripción:** Un adaptador personalizado que extiende `ArrayAdapter<Carro>`. Se encarga de convertir cada objeto `Carro` en una vista que se muestra en el `ListView`.
- **Ventaja:** Permite separar cómo se muestran los datos (presentación) de la lógica de negocio y del almacenamiento de datos.

---

### 4️⃣ dm/Carro.java
- **Descripción:** Clase modelo que representa un carro. Implementa `Serializable` para poder pasar objetos entre actividades si fuera necesario.
- **Ventaja:** Define claramente la estructura de datos que se utiliza en toda la app.

---

### 5️⃣ res/layout/activity_main.xml
- **Descripción:** Define el layout principal de la actividad. Contiene un `ListView` que muestra la lista de carros.
- **Ventaja:** Permite separar la UI del código Java, facilitando su mantenimiento.

---

### 6️⃣ res/layout/item_carro.xml
- **Descripción:** Define cómo se verá cada elemento de la lista en el `ListView`. Incluye `TextView`s para fabricante, modelo, año y litros de gasolina.
- **Ventaja:** Permite personalizar la vista de cada item sin afectar la lógica de la app.

---

🎯 **Ventajas del Patrón MVVM en este proyecto**
✔ **Separación de responsabilidades**: La UI (View), la lógica de presentación (ViewModel) y los datos (Model) están bien separados.
✔ **Reutilización**: El ViewModel puede ser usado por múltiples actividades o fragmentos.
✔ **Observabilidad**: Con `LiveData`, los cambios en los datos se reflejan automáticamente en la UI.
✔ **Escalabilidad**: Fácil de mantener y escalar cuando la app crece.
*/


¿Qué es LiveData?

📌 LiveData es una clase de datos observable que forma parte de la arquitectura de Android Jetpack. Permite que los componentes de la interfaz de usuario (UI) observen los datos sin necesidad de gestionarlos manualmente, y se asegura de que la UI siempre esté actualizada con la última información.

🛠️ Características principales:

Observabilidad 🧐
Permite que actividades, fragmentos u otros observadores se suscriban para recibir actualizaciones cuando los datos cambian.

Consciente del ciclo de vida ⏳
Solo notifica a los observadores activos (los que están en estado STARTED o RESUMED). Esto evita errores como actualizaciones cuando la actividad está en segundo plano o destruida.

Actualización automática de UI 🔄
Cada vez que los datos cambian, la UI que está observando el LiveData se actualiza automáticamente.
No hay fugas de memoria 💧

Se gestiona internamente con los LifecycleOwners (como Activity o Fragment), lo que evita que se mantengan referencias innecesarias y posibles memory leaks.
📦 Componentes relacionados:

MutableLiveData:
Es una subclase de LiveData que permite modificar el valor almacenado mediante setValue() o postValue(). Ideal para usar dentro de ViewModel.

Observer:
Es la interfaz que implementan los observadores para reaccionar a cambios en los datos.
