package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.frog.FrogModel.class)
public class FrogModel_86540297Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1472177175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1472177175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/FrogRenderState;)V", cancellable = true)
    private void setupAnim__87753375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-87753375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__627591868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-627591868L))
            info.setReturnValue(null);
    }


}
