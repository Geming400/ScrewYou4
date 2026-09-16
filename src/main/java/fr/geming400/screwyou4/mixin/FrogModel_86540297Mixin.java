package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.frog.FrogModel.class)
public class FrogModel_86540297Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_770188841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(770188841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/FrogRenderState;)V", cancellable = true)
    private void setupAnim__138098445(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-138098445L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1817114313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817114313L))
            info.setReturnValue(null);
    }


}
