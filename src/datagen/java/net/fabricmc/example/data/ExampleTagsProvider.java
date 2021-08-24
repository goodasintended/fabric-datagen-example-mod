package net.fabricmc.example.data;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.BlockTagsProvider;
import net.minecraft.util.Identifier;

public class ExampleTagsProvider extends BlockTagsProvider {

    protected ExampleTagsProvider(DataGenerator root) {
        super(root);
    }

    @Override
    protected void configure() {
        getOrCreateTagBuilder(TagFactory.BLOCK.create(new Identifier("modid:example")))
            .add(Blocks.DIRT, Blocks.DIAMOND_BLOCK, Blocks.OAK_BUTTON);
    }

    @Override
    public String getName() {
        return "Example Tags";
    }

}
