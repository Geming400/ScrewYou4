package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.feline.BabyFelineModel.class)
public class BabyFelineModel580114674Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1263763219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1263763219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/FelineRenderState;)V", cancellable = true)
    private void setupAnim__1021453716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1021453716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBabyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBabyLayer__1305216403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1305216403L))
            info.setReturnValue(null);
    }


}
