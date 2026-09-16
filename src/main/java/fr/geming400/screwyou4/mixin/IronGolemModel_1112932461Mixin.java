package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.golem.IronGolemModel.class)
public class IronGolemModel_1112932461Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__790722149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-790722149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlowerHoldingArm()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getFlowerHoldingArm__1295577017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1295577017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1796581005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1796581005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/IronGolemRenderState;)V", cancellable = true)
    private void setupAnim__774084545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-774084545L))
            info.cancel();
    }


}
