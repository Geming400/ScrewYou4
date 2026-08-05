package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.golem.SnowGolemModel.class)
public class SnowGolemModel_2004206642Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead__765537770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-765537770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1290074477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290074477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__905123776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-905123776L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_1079615442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1079615442L))
            info.cancel();
    }


}
