package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.goat.BabyGoatModel.class)
public class BabyGoatModel_379687478Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__334444687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334444687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__544774762(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-544774762L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1765324356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1765324356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/GoatRenderState;)V", cancellable = true)
    private void setupAnim__477714171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-477714171L))
            info.cancel();
    }


}
