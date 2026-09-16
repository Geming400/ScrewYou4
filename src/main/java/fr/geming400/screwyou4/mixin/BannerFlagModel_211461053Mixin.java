package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.banner.BannerFlagModel.class)
public class BannerFlagModel_211461053Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_895109597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(895109597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Float;)V", cancellable = true)
    private void setupAnim__1746306068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1746306068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlagLayer(Z)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createFlagLayer_201587557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(201587557L))
            info.setReturnValue(null);
    }


}
