package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.creeper.CreeperModel.class)
public class CreeperModel1501820481Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1407509936(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1407509936L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/CreeperRenderState;)V", cancellable = true)
    private void setupAnim__2141938416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2141938416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1286914513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286914513L))
            info.setReturnValue(null);
    }


}
