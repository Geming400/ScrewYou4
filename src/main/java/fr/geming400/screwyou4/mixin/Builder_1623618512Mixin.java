package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.geometry.QuadCollection.Builder.class)
public class Builder_1623618512Mixin {
        @Inject(at = @At("HEAD"), method = "addAll(Lnet/minecraft/client/resources/model/geometry/QuadCollection;)Lnet/minecraft/client/resources/model/geometry/QuadCollection$Builder;", cancellable = true)
    private void addAll__512969033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-512969033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/resources/model/geometry/QuadCollection;", cancellable = true)
    private void build__1045182775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1045182775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addUnculledFace(Lnet/minecraft/client/resources/model/geometry/BakedQuad;)Lnet/minecraft/client/resources/model/geometry/QuadCollection$Builder;", cancellable = true)
    private void addUnculledFace_140726970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140726970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCulledFace(Lnet/minecraft/core/Direction;Lnet/minecraft/client/resources/model/geometry/BakedQuad;)Lnet/minecraft/client/resources/model/geometry/QuadCollection$Builder;", cancellable = true)
    private void addCulledFace__1344287297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344287297L))
            info.setReturnValue(new net.minecraft.client.resources.model.geometry.QuadCollection.Builder());
    }


}
