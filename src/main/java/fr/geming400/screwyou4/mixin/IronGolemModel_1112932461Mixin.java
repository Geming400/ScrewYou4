package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.golem.IronGolemModel.class)
public class IronGolemModel_1112932461Mixin {
        @Inject(at = @At("HEAD"), method = "getFlowerHoldingArm()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getFlowerHoldingArm__1656811951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1656811951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_398800296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398800296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1796397957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1796397957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/IronGolemRenderState;)V", cancellable = true)
    private void setupAnim_647088273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(647088273L))
            info.cancel();
    }


}
