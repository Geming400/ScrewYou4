package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.guardian.GuardianModel.class)
public class GuardianModel1271435722Mixin {
        @Inject(at = @At("HEAD"), method = "createElderGuardianLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createElderGuardianLayer_557303558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(557303558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1637894695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1637894695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/GuardianRenderState;)V", cancellable = true)
    private void setupAnim_1216487952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1216487952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_557303558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(557303558L))
            info.setReturnValue(null);
    }


}
