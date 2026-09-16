package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.MultiPartModel.class)
public class MultiPartModel1070616197Mixin {
        @Inject(at = @At("HEAD"), method = "collectParts(Lnet/minecraft/util/RandomSource;Ljava/util/List;)V", cancellable = true)
    private void collectParts__1515121441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1515121441L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "materialFlags()I", cancellable = true)
    private void materialFlags_330133195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330133195L))
            info.setReturnValue(-7799136);
    }

    @Inject(at = @At("HEAD"), method = "particleMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void particleMaterial__402154488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-402154488L))
            info.setReturnValue(null);
    }


}
