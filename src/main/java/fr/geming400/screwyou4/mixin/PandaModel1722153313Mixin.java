package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.panda.PandaModel.class)
public class PandaModel1722153313Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1008021149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1008021149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/PandaRenderState;)V", cancellable = true)
    private void setupAnim__1331919332(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1331919332L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_797691074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(797691074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1187177104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1187177104L))
            info.cancel();
    }


}
