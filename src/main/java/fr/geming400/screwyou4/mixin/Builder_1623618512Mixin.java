package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.geometry.QuadCollection.Builder.class)
public class Builder_1623618512Mixin {
        @Inject(at = @At("HEAD"), method = "addAll(Lnet/minecraft/client/resources/model/geometry/QuadCollection;)Lnet/minecraft/client/resources/model/geometry/QuadCollection$Builder;", cancellable = true)
    private void addAll_112737655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112737655L))
            info.setReturnValue(new net.minecraft.client.resources.model.geometry.QuadCollection$Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/resources/model/geometry/QuadCollection;", cancellable = true)
    private void build__67218469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67218469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addUnculledFace(Lnet/minecraft/client/resources/model/geometry/BakedQuad;)Lnet/minecraft/client/resources/model/geometry/QuadCollection$Builder;", cancellable = true)
    private void addUnculledFace_1226965474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226965474L))
            info.setReturnValue(new net.minecraft.client.resources.model.geometry.QuadCollection$Builder());
    }

    @Inject(at = @At("HEAD"), method = "addCulledFace(Lnet/minecraft/core/Direction;Lnet/minecraft/client/resources/model/geometry/BakedQuad;)Lnet/minecraft/client/resources/model/geometry/QuadCollection$Builder;", cancellable = true)
    private void addCulledFace__1552050450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552050450L))
            info.setReturnValue(null);
    }


}
