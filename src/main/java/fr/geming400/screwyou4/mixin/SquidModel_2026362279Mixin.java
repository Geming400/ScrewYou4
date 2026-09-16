package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.squid.SquidModel.class)
public class SquidModel_2026362279Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SquidRenderState;)V", cancellable = true)
    private void setupAnim_1847591015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1847591015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1584956473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1584956473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_122707669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122707669L))
            info.setReturnValue(null);
    }


}
