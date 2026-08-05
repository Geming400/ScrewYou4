package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.SingleVariant.class)
public class SingleVariant802498255Mixin {
        @Inject(at = @At("HEAD"), method = "collectParts(Lnet/minecraft/util/RandomSource;Ljava/util/List;)V", cancellable = true)
    private void collectParts__202574381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-202574381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "materialFlags()I", cancellable = true)
    private void materialFlags_840760501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840760501L))
            info.setReturnValue(-1576216767);
    }

    @Inject(at = @At("HEAD"), method = "particleMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void particleMaterial__1397552507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1397552507L))
            info.setReturnValue(null);
    }


}
