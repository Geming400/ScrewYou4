package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.goat.GoatModel.class)
public class GoatModel1948485888Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1234353724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234353724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_1024023649(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1024023649L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__960844529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-960844529L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/GoatRenderState;)V", cancellable = true)
    private void setupAnim_1091084240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1091084240L))
            info.cancel();
    }


}
