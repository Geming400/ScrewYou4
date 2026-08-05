package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.player.PlayerCapeModel.class)
public class PlayerCapeModel37597671Mixin {
        @Inject(at = @At("HEAD"), method = "createCapeLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createCapeLayer_1860675653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1860675653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim__377488277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-377488277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_721246216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(721246216L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)V", cancellable = true)
    private void setupAnim__672586873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-672586873L))
            info.cancel();
    }


}
