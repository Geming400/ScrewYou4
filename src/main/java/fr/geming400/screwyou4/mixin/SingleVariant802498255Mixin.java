package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.SingleVariant.class)
public class SingleVariant802498255Mixin {
        @Inject(at = @At("HEAD"), method = "collectParts(Lnet/minecraft/util/RandomSource;Ljava/util/List;)V", cancellable = true)
    private void collectParts__1783239383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1783239383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "materialFlags()I", cancellable = true)
    private void materialFlags_62015253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62015253L))
            info.setReturnValue(-900751728);
    }

    @Inject(at = @At("HEAD"), method = "particleMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void particleMaterial__670272430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670272430L))
            info.setReturnValue(null);
    }


}
