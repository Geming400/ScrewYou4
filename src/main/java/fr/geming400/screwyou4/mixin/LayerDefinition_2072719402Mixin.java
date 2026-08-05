package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.LayerDefinition.class)
public class LayerDefinition_2072719402Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/client/model/geom/builders/MeshTransformer;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private void apply__2095436834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095436834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/model/geom/builders/MeshDefinition;II)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void create__1518261908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518261908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bakeRoot()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void bakeRoot_314483283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(314483283L))
            info.setReturnValue(null);
    }


}
