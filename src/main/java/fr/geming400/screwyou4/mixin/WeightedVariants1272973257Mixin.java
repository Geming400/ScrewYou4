package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.WeightedVariants.class)
public class WeightedVariants1272973257Mixin {
        @Inject(at = @At("HEAD"), method = "particleMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void particleMaterial__927077505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-927077505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "materialFlags()I", cancellable = true)
    private void materialFlags_1311235503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311235503L))
            info.setReturnValue(-413275692);
    }

    @Inject(at = @At("HEAD"), method = "collectParts(Lnet/minecraft/util/RandomSource;Ljava/util/List;)V", cancellable = true)
    private void collectParts_267900621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(267900621L))
            info.cancel();
    }


}
