package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.squid.SquidModel.class)
public class SquidModel_2026362279Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1312230114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312230114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SquidRenderState;)V", cancellable = true)
    private void setupAnim__886679111(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-886679111L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__882968139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-882968139L))
            info.cancel();
    }


}
