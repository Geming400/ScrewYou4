package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.equine.BabyDonkeyModel.class)
public class BabyDonkeyModel_1524493495Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EquineRenderState;)V", cancellable = true)
    private void setupAnim_817903284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(817903284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2086825257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2086825257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/DonkeyRenderState;)V", cancellable = true)
    private void setupAnim_991094073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(991094073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBabyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBabyLayer__360837583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360837583L))
            info.setReturnValue(null);
    }


}
