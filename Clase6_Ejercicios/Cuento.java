package Clase6_Ejercicios;

import java.util.Scanner;

public class Cuento {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int opcion;

        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso:");
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
        System.out.println("2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora\n");
        System.out.println("Elige una opción: ");
        opcion = reader.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Decides explorar la oscuridad en busca de la fuente de un susurro escalofriante. Te adentras en el bosque encantado, un lugar donde las sombras bailan y las ramas susurran secretos antiguos. Te topas con dos caminos, uno tiene un letrero de una cueva y otro de un árbol encantado:");
                System.out.println("1) La cueva de las voces perdidas");
                System.out.println("2) El árbol de los secretos");
                System.out.println("Elige una opción: ");
                opcion = reader.nextInt();
                if (opcion == 1){
                    System.out.println("Te aventuras valientemente hacia la oscuridad de la cueva, decidido a descubrir la fuente de las voces perdidas que te han estado susurrando. A medida que te adentras más en las profundidades de la cueva, las voces se vuelven más claras y te das cuenta de que son voces de personas atrapadas en un estado de tormento eterno.\n" +
                            "Siguiendo los susurros, llegas a una cámara subterránea donde encuentras un antiguo altar. En él, descubres un medallón brillante con símbolos enigmáticos. Al tocar el medallón, las voces se unen en una sola voz agradecida, y la energía oscura que las mantenía atrapadas comienza a disiparse. Has logrado liberar a las almas perdidas y devolver la tranquilidad a la cueva.\n" +
                            "Tu valentía y determinación han triunfado sobre la oscuridad, y ahora las voces pueden descansar en paz. Regresas a la superficie con una sensación de logro y sabiduría, sabiendo que tu valentía ha hecho la diferencia en el mundo.");
                } else if (opcion == 2) {
                    System.out.println("Decides escuchar los secretos susurrados por el árbol, intrigado por lo que puedas descubrir. A medida que te sumerges en el susurro del árbol, los secretos comienzan a revelarse lentamente. Descubres que el árbol ha sido testigo de siglos de historias y conocimientos ocultos.\n" +
                            "Entre los secretos compartidos por el árbol, encuentras información valiosa sobre antiguos artefactos mágicos, ubicaciones de tesoros perdidos y sabiduría ancestral. Con cada secreto revelado, te sientes más conectado con el tejido del universo y adquieres conocimientos que pocos han tenido la oportunidad de obtener.\n" +
                            "Sin embargo, también descubres secretos oscuros y peligrosos que podrían desequilibrar el mundo si caen en manos equivocadas. Te enfrentas a una elección: ¿utilizarás el conocimiento que has adquirido para el bien común o lo guardarás en secreto para protegerlo de aquellos que buscan aprovecharlo con malas intenciones?\n" +
                            "El árbol de los secretos te ha otorgado un poderoso regalo, pero ahora recae en ti decidir cómo usarlo.");
                } else{
                    System.out.println("Error! La opción ingresada es incorrecta.");
                }
                break;
            case 2:
                System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas:");
                System.out.println("1) Entras por la puerta de la izquierda");
                System.out.println("2) Optas por la puerta de la derecha");
                System.out.println("Elige una opción: ");
                opcion = reader.nextInt();
                if (opcion==1){
                    System.out.println("Decides entrar por la puerta de la izquierda, sintiendo una extraña atracción hacia ella. Al cruzar el umbral, te encuentras con una habitación oscura y llena de silencio. Solo una tenue luz proveniente de una vela parpadeante ilumina el espacio.\n" +
                            "Mientras te adentras con cautela, percibes un ligero olor a humedad y escuchas el eco de tus propios pasos. Al acercarte a una vieja estantería cubierta de polvo, descubres una serie de objetos antiguos: un mapa envejecido, una brújula oxidada y una llave de aspecto misterioso.\n" +
                            "El mapa llama poderosamente tu atención. Parece indicar un tesoro oculto en algún lugar del bosque. Movido por la emoción, decides seguir las indicaciones del mapa en busca de aventura y riquezas.\n" +
                            "Emprendes tu travesía por el bosque, siguiendo senderos estrechos y enfrentando obstáculos naturales. Con cada paso, el ambiente se vuelve más denso y misterioso. A medida que avanzas, los árboles parecen cobrar vida, sus ramas se entrelazan formando arcos oscuros y susurran secretos al viento nocturno.\n" +
                            "Después de horas de búsqueda, siguiendo el mapa con determinación, llegas a una clara en medio del bosque. En su centro, se alza un antiguo roble retorcido con raíces que se hunden profundamente en la tierra. Sientes una extraña energía emanando del árbol.\n" +
                            "La llave que encontraste en la cabaña encaja perfectamente en un agujero tallado en el tronco del roble. Con un giro suave, la llave se desbloquea y el árbol se abre, revelando una escalera oculta que desciende hacia las profundidades.\n" +
                            "Intrigado, bajas por la escalera, adentrándote en un misterioso mundo subterráneo. La luz de tu linterna ilumina el camino, revelando tesoros brillantes y antiguos artefactos en cada esquina. Sigues explorando hasta llegar a una gran cámara central.\n" +
                            "En el centro de la cámara, encuentras un cofre ornamentado. Tu corazón late con anticipación mientras abres el cofre cuidadosamente. De repente, un resplandor dorado irrumpe, llenando la habitación. Te encuentras rodeado de montones de monedas de oro y gemas preciosas, un tesoro inimaginable.\n" +
                            "Sin embargo, en ese instante, te das cuenta de algo aún más valioso. En las paredes de la cámara hay inscripciones y pinturas que cuentan la historia de un antiguo clan de protectores del bosque. Comprendes que este tesoro no es solo material, sino una responsabilidad: proteger y preservar la magia del bosque para las generaciones futuras.\n" +
                            "Sales de la cámara con el corazón lleno de gratitud y determinación. Ahora te conviertes en el guardián del bosque, usando la riqueza que has encontrado para financiar proyectos de conservación y educación ambiental. Tu vida se transforma en una misión, dedicada a proteger y promover la belleza y la importancia de los bosques para el mundo.");
                } else if (opcion==2){
                    System.out.println("Optas por la puerta de la derecha, intrigado por lo que puedas encontrar al otro lado. Con un leve chirrido, la puerta se abre revelando una habitación oscura con una única vela parpadeante en el centro. Decides encenderla para iluminar el espacio y explorar más a fondo.\n" +
                            "A medida que la vela ilumina la habitación, tus ojos se posan en una estantería llena de libros antiguos y polvorientos. Te acercas a examinarlos y encuentras un libro en particular que parece destacar entre los demás. Su portada está adornada con grabados intrincados y letras doradas que forman un título en un idioma desconocido.\n" +
                            "Sientes una extraña atracción hacia ese libro en particular y decides abrirlo. Al hacerlo, una luz mágica se desprende de sus páginas, llenando la habitación con un resplandor cálido. A medida que la luz se disipa, te das cuenta de que has sido transportado a un mundo completamente nuevo.\n" +
                            "Te encuentras en un exuberante jardín rodeado de criaturas fantásticas y plantas mágicas. La belleza del lugar es abrumadora, y te das cuenta de que has ingresado a un reino místico y encantado. Un ser diminuto y alado, un hada, se acerca a ti y te saluda con una sonrisa amable.\n" +
                            "El hada te explica que el libro que encontraste es un portal mágico que te ha llevado a este reino. Te informa que has sido elegido como el \"Guardián de los Secretos\" y que tienes la responsabilidad de proteger y preservar la sabiduría ancestral que se encuentra en ese mundo mágico.\n" +
                            "A medida que exploras este nuevo reino, descubres lugares asombrosos y te encuentras con personajes míticos y sabios. Aprendes lecciones valiosas sobre la importancia del equilibrio, la magia y la conexión con la naturaleza.\n" +
                            "Sin embargo, también te enfrentas a desafíos y peligros. Debes superar pruebas de ingenio y valentía para cumplir tu deber como Guardián de los Secretos. A medida que ganas experiencia y sabiduría, te conviertes en una figura respetada en el reino y encuentras un sentido de propósito y pertenencia en este mundo mágico.\n" +
                            "Tu viaje como Guardián de los Secretos continúa, explorando los misterios y maravillas de este reino. Te das cuenta de que la puerta de la derecha no solo te llevó a una habitación, sino a una trascendental aventura que cambiará tu vida para siempre.");
                } else{
                    System.out.println("Error! La opción ingresada es incorrecta.");
                }
                break;
            default:
                System.out.println("Opción incorrecta!");
                break;
        }
        System.out.println("\nFin de la historia!");
    }
}
