package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.WeightedVariants.class)
public class WeightedVariants1272973257Mixin {
        @Inject(at = @At("HEAD"), method = "collectParts(Lnet/minecraft/util/RandomSource;Ljava/util/List;)V", cancellable = true)
    private void collectParts__1312764381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1312764381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "particleMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void particleMaterial__199797428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199797428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "materialFlags()I", cancellable = true)
    private void materialFlags_532490255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532490255L))
            info.setReturnValue(-2022809380);
    }


}
