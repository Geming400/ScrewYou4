package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.geometry.QuadCollection.class)
public class QuadCollection_308236015Mixin {
        @Inject(at = @At("HEAD"), method = "getAll()Ljava/util/List;", cancellable = true)
    private void getAll_1896678409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896678409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuads(Lnet/minecraft/core/Direction;)Ljava/util/List;", cancellable = true)
    private void getQuads__1836888472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836888472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasMaterialFlag(I)Z", cancellable = true)
    private void hasMaterialFlag_467000395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467000395L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "materialFlags()I", cancellable = true)
    private void materialFlags__432246988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432246988L))
            info.setReturnValue(-1052482768);
    }


}
