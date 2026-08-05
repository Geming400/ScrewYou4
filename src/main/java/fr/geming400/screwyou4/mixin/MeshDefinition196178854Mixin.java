package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.MeshDefinition.class)
public class MeshDefinition196178854Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/client/model/geom/builders/MeshTransformer;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private void apply__1997918227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997918227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRoot()Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void getRoot_340688394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340688394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformed(Ljava/util/function/UnaryOperator;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private void transformed__917910621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-917910621L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }


}
