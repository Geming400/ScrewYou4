package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.LayerDefinition.class)
public class LayerDefinition_2072719402Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/client/model/geom/builders/MeshTransformer;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private void apply__811976080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811976080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/model/geom/builders/MeshDefinition;II)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void create__255449368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-255449368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bakeRoot()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void bakeRoot__697025010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697025010L))
            info.setReturnValue(null);
    }


}
