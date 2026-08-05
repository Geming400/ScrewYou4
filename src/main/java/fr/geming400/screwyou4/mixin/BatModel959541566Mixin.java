package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.ambient.BatModel.class)
public class BatModel959541566Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1949788851(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1949788851L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/BatRenderState;)V", cancellable = true)
    private void setupAnim_1802989492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1802989492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_245409402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(245409402L))
            info.setReturnValue(null);
    }


}
