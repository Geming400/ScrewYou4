package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.equine.DonkeyModel.class)
public class DonkeyModel_2079586561Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1531732191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1531732191L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/DonkeyRenderState;)V", cancellable = true)
    private void setupAnim_1546187139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1546187139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EquineRenderState;)V", cancellable = true)
    private void setupAnim_1372996350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1372996350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer(F)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_691148659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(691148659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSaddleLayer(F)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSaddleLayer__203999848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203999848L))
            info.setReturnValue(null);
    }


}
