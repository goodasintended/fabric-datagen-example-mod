package net.fabricmc.example.data;

import lol.bai.datagen.api.DataInitializer;
import lol.bai.datagen.api.GeneratorOptions;
import net.minecraft.data.DataGenerator;
import org.jetbrains.annotations.NotNull;

public class ExampleData implements DataInitializer {

    @Override
    public void onInitializeData(@NotNull DataGenerator generator, @NotNull GeneratorOptions options) {
        generator.install(new ExampleTagsProvider(generator));
    }

}
