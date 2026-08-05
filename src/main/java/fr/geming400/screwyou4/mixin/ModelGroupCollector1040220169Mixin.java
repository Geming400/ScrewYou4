package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ModelGroupCollector.class)
public class ModelGroupCollector1040220169Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/client/color/block/BlockColors;Lnet/minecraft/client/resources/model/BlockStateModelLoader$LoadedModels;)Lit/unimi/dsi/fastutil/objects/Object2IntMap;", cancellable = true)
    private static void build__1473434641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1473434641L))
            info.setReturnValue(null);
    }


}
