package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.equine.DonkeyModel.class)
public class DonkeyModel_2079586561Mixin {
        @Inject(at = @At("HEAD"), method = "createSaddleLayer(F)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSaddleLayer__1088361210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1088361210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer(F)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1088361210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1088361210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/DonkeyRenderState;)V", cancellable = true)
    private void setupAnim__1611808143(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1611808143L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__829743857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-829743857L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EquineRenderState;)V", cancellable = true)
    private void setupAnim__1784998932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1784998932L))
            info.cancel();
    }


}
