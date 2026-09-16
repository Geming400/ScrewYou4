package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.goat.GoatModel.class)
public class GoatModel1948485888Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1662832863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1662832863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__1642760717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1642760717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/GoatRenderState;)V", cancellable = true)
    private void setupAnim_1040739170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1040739170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_44831279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(44831279L))
            info.setReturnValue(null);
    }


}
