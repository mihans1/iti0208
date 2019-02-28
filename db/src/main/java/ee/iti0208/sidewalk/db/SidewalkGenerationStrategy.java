package ee.iti0208.sidewalk.db;

import org.jooq.util.ColumnDefinition;
import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

@SuppressWarnings("WeakerAccess")
public class SidewalkGenerationStrategy extends DefaultGeneratorStrategy {

    private String capitalize(String string) {
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }

    @Override
    public String getJavaIdentifier(Definition definition) {
        if(definition instanceof ColumnDefinition) {
            return definition.getOutputName().replaceAll("(.+)(\\p{javaUpperCase})", "$1_$2").toUpperCase();
        }
        return super.getJavaIdentifier(definition);
    }

    @Override
    public String getJavaSetterName(Definition definition, Mode mode) {
        return "set" + capitalize(definition.getOutputName());
    }

    @Override
    public String getJavaGetterName(Definition definition, Mode mode) {
        return "get" + capitalize(definition.getOutputName());
    }
}
