package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.sniffer.SnifferModel.class)
public class SnifferModel804454462Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1099200147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099200147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1488103007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1488103007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SnifferRenderState;)V", cancellable = true)
    private void setupAnim__1135681880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1135681880L))
            info.cancel();
    }


}
