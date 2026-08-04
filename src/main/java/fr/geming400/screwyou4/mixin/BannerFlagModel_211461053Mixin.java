package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.banner.BannerFlagModel.class)
public class BannerFlagModel_211461053Mixin {
        @Inject(at = @At("HEAD"), method = "createFlagLayer(Z)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createFlagLayer__458731474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-458731474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1597097931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1597097931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Float;)V", cancellable = true)
    private void setupAnim__615282626(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-615282626L))
            info.cancel();
    }


}
