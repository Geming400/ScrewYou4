package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.ghast.GhastModel.class)
public class GhastModel_1267026456Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__636628154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636628154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTentacles(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;[Lnet/minecraft/client/model/geom/ModelPart;)V", cancellable = true)
    private static void animateTentacles__830260620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-830260620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1950675000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1950675000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/GhastRenderState;)V", cancellable = true)
    private void setupAnim_738360231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(738360231L))
            info.cancel();
    }


}
