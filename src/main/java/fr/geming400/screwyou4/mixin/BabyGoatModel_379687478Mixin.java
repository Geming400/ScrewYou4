package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.goat.BabyGoatModel.class)
public class BabyGoatModel_379687478Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1063336022(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1063336022L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_1083408168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1083408168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/GoatRenderState;)V", cancellable = true)
    private void setupAnim__528059241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-528059241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1523967132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1523967132L))
            info.setReturnValue(null);
    }


}
