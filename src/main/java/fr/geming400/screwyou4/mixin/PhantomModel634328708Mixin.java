package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.phantom.PhantomModel.class)
public class PhantomModel634328708Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1269325901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1269325901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1317977253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1317977253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/PhantomRenderState;)V", cancellable = true)
    private void setupAnim__563238880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-563238880L))
            info.cancel();
    }


}
