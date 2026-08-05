package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.sniffer.SniffletModel.class)
public class SniffletModel_724058194Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_9926029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9926029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SnifferRenderState;)V", cancellable = true)
    private void setupAnim__329684083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-329684083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_2109695072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2109695072L))
            info.cancel();
    }


}
