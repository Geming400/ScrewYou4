package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.slime.MagmaCubeModel.class)
public class MagmaCubeModel_860717249Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;)V", cancellable = true)
    private void setupAnim__1099454871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1099454871L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2048613169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2048613169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_146585084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146585084L))
            info.setReturnValue(null);
    }


}
