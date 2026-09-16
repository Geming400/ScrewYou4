package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.ambient.BatModel.class)
public class BatModel959541566Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1643190111(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1643190111L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/BatRenderState;)V", cancellable = true)
    private void setupAnim__1939412510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1939412510L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__944113043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944113043L))
            info.setReturnValue(null);
    }


}
