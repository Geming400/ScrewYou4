package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.MultiPartModel.class)
public class MultiPartModel1070616197Mixin {
        @Inject(at = @At("HEAD"), method = "collectParts(Lnet/minecraft/util/RandomSource;Ljava/util/List;)V", cancellable = true)
    private void collectParts_65543561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(65543561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "materialFlags()I", cancellable = true)
    private void materialFlags_1108878443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108878443L))
            info.setReturnValue(-348584460);
    }

    @Inject(at = @At("HEAD"), method = "particleMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void particleMaterial__1129434565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1129434565L))
            info.setReturnValue(null);
    }


}
