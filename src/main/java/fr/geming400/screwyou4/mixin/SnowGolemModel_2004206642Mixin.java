package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.golem.SnowGolemModel.class)
public class SnowGolemModel_2004206642Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead__1894368000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1894368000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1607112110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607112110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__1587168924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1587168924L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_100552032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(100552032L))
            info.setReturnValue(null);
    }


}
