package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.feline.BabyFelineModel.class)
public class BabyFelineModel580114674Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1965751553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1965751553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/FelineRenderState;)V", cancellable = true)
    private void setupAnim_115518298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(115518298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBabyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBabyLayer__134017490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134017490L))
            info.setReturnValue(null);
    }


}
