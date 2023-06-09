package net.max.projectx.painting;

import net.max.projectx.ProjectX;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {

    public static final PaintingVariant SUNSET = registerPainting("sunset", new  PaintingVariant(32,16));
    public static final PaintingVariant PLANT = registerPainting("plant", new  PaintingVariant(16,16));
    public static final PaintingVariant WANDERER = registerPainting("wanderer", new  PaintingVariant(16,32));


    private static PaintingVariant registerPainting(String name, PaintingVariant PaintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(ProjectX.MOD_ID, name), PaintingVariant);
    }





    public static void registerPainting() {
        ProjectX.LOGGER.debug("Registering Paintings for " + ProjectX.MOD_ID);
    }
}
