package factory;

import vehicles.engines.Engine;
import vehicles.engines.V6Engine;
import vehicles.engines.V8Engine;

public class EngineFactory {
    public static Engine createEngine(String engineType) {
        if("V8".equalsIgnoreCase(engineType)) {
            return new V8Engine();
        } else if ("V6".equalsIgnoreCase(engineType)) {
            return new V6Engine();
        } else {
            throw new IllegalArgumentException("Invalid Engine Type: " + engineType);
        }
    }
}
