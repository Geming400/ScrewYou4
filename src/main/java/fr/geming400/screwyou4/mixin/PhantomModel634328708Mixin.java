package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.phantom.PhantomModel.class)
public class PhantomModel634328708Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__79803456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-79803456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_2019965587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2019965587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/PhantomRenderState;)V", cancellable = true)
    private void setupAnim_323155186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(323155186L))
            info.cancel();
    }


}
