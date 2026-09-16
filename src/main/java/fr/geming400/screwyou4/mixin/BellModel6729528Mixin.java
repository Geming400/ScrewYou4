package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.bell.BellModel.class)
public class BellModel6729528Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_690378073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(690378073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/model/object/bell/BellModel$State;)V", cancellable = true)
    private void setupAnim_502657931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(502657931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1896925081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1896925081L))
            info.setReturnValue(null);
    }


}
