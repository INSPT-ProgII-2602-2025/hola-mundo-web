package holamundo.model;

import holamundo.model.Terminator;
import java.util.ArrayList;
import java.util.List;

public class TerminatorService {
    // 1. Instancia Singleton
    private static final TerminatorService instance = new TerminatorService();

    // 2. "Base de datos" en memoria y simple contador
    private static List<Terminator> terminators;
    private static int nextId = 1;

    // 3. Constructor privado
    private TerminatorService() {
        // Datos de muestra iniciales
        terminators = new ArrayList<>();
        terminators.add(new Terminator(nextId++, "T-800", "Endoesqueleto de combate infiltrador."));
        terminators.add(new Terminator(nextId++, "T-1000", "Hecho de polialeación mimética."));
    }

    // 4. Método para obtener la única instancia
    public static TerminatorService getInstance() {
        return instance;
    }

    // --- Métodos CRUD ---

    /**
     * READ: Obtiene todos los Terminators.
     */
    public List<Terminator> getAllTerminators() {
        return new ArrayList<>(terminators);
    }

    /**
     * READ: Busca un Terminator por su ID.
     */
    public Terminator getTerminatorById(int id) {
        Terminator foundTerminator = null;
        boolean found = false;
        int i = 0;
        
        while (i < terminators.size() && !found) {
            Terminator t = terminators.get(i);
            if (t.getId() == id) {
                foundTerminator = t;
                found = true;
            }
            i++;
        }
        return foundTerminator;
    }

    /**
     * CREATE/UPDATE: Guarda un nuevo Terminator o actualiza uno existente.
     */
    public void saveTerminator(Terminator terminator) {
        if (terminator.getId() == 0) {
            // CREATE: Asigna un nuevo ID si es un nuevo Terminator
            terminator.setId(nextId++);
            terminators.add(terminator);
        } else {
            // UPDATE: Actualiza el Terminator existente
            Terminator existingTerminator = getTerminatorById(terminator.getId());
            if (existingTerminator != null) {
                existingTerminator.setModel(terminator.getModel());
                existingTerminator.setDescription(terminator.getDescription());
            }
        }
    }
    
    /**
     * DELETE: Elimina un Terminator por su ID.
     */
    public void deleteTerminator(int id) {
        int i = 0;
        boolean removed = false;
        
        while (i < terminators.size() && !removed) {
            if (terminators.get(i).getId() == id) {
                terminators.remove(i);
                removed = true;
            }
            i++;
        }
    }
}