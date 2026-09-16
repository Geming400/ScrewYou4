package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.sniffer.SniffletModel.class)
public class SniffletModel_724058194Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1407706738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1407706738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SnifferRenderState;)V", cancellable = true)
    private void setupAnim__1216078149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1216078149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1179596416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1179596416L))
            info.setReturnValue(null);
    }


}
