package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.ravager.RavagerModel.class)
public class RavagerModel1422102813Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_707970649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707970649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1487227604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1487227604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/RavagerRenderState;)V", cancellable = true)
    private void setupAnim__499232136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-499232136L))
            info.cancel();
    }


}
