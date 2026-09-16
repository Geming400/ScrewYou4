package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.creaking.CreakingModel.class)
public class CreakingModel_128192775Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_811841319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(811841319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/CreakingRenderState;)V", cancellable = true)
    private void setupAnim_806170543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(806170543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1775461835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775461835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEyesLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createEyesLayer__1087299723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087299723L))
            info.setReturnValue(null);
    }


}
