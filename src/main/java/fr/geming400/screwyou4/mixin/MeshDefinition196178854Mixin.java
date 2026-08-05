package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.MeshDefinition.class)
public class MeshDefinition196178854Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/client/model/geom/builders/MeshTransformer;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private void apply__99657537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-99657537L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }

    @Inject(at = @At("HEAD"), method = "getRoot()Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void getRoot_1347982258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347982258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformed(Ljava/util/function/UnaryOperator;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private void transformed_487224632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487224632L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }


}
