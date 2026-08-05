package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.ghast.GhastModel.class)
public class GhastModel_1267026456Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_552894291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552894291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTentacles(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;[Lnet/minecraft/client/model/geom/ModelPart;)V", cancellable = true)
    private static void animateTentacles_1719395764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1719395764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1642303962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1642303962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/GhastRenderState;)V", cancellable = true)
    private void setupAnim__1995909895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1995909895L))
            info.cancel();
    }


}
