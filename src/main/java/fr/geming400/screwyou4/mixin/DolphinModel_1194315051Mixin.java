package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.dolphin.DolphinModel.class)
public class DolphinModel_1194315051Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__709339559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709339559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1877963595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1877963595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/DolphinRenderState;)V", cancellable = true)
    private void setupAnim__1640267881(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1640267881L))
            info.cancel();
    }


}
