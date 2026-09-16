package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.axolotl.AdultAxolotlModel.class)
public class AdultAxolotlModel_77407710Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1826246900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826246900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_761056254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(761056254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AxolotlRenderState;)V", cancellable = true)
    private void setupAnim_799328959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(799328959L))
            info.cancel();
    }


}
