package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.hoglin.HoglinModel.class)
public class HoglinModel2038094922Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1323962758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323962758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__871235495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-871235495L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HoglinRenderState;)V", cancellable = true)
    private void setupAnim__893119536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-893119536L))
            info.cancel();
    }


}
