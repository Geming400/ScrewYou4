package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.equine.BabyDonkeyModel.class)
public class BabyDonkeyModel_1524493495Mixin {
        @Inject(at = @At("HEAD"), method = "createBabyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBabyLayer_810361330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810361330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1384836923(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1384836923L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/DonkeyRenderState;)V", cancellable = true)
    private void setupAnim_2128066087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2128066087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EquineRenderState;)V", cancellable = true)
    private void setupAnim_1954875298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1954875298L))
            info.cancel();
    }


}
