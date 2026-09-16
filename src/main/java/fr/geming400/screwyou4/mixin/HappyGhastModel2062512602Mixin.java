package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.ghast.HappyGhastModel.class)
public class HappyGhastModel2062512602Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer(ZLnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_841775531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841775531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1548806149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1548806149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HappyGhastRenderState;)V", cancellable = true)
    private void setupAnim_1069768482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1069768482L))
            info.cancel();
    }


}
