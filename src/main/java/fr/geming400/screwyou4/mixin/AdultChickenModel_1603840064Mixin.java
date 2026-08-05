package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.chicken.AdultChickenModel.class)
public class AdultChickenModel_1603840064Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1305490354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1305490354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ChickenRenderState;)V", cancellable = true)
    private void setupAnim_1632947541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1632947541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_889707899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889707899L))
            info.setReturnValue(null);
    }


}
