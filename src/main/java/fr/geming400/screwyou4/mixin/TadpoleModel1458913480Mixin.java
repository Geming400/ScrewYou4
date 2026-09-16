package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.frog.TadpoleModel.class)
public class TadpoleModel1458913480Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__444741129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444741129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_2142562025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2142562025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__2132462085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2132462085L))
            info.cancel();
    }


}
