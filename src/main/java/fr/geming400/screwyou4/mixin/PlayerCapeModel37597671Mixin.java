package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.player.PlayerCapeModel.class)
public class PlayerCapeModel37597671Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1423234550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423234550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_1330923993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1330923993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)V", cancellable = true)
    private void setupAnim_464385141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(464385141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCapeLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createCapeLayer__676534493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-676534493L))
            info.setReturnValue(null);
    }


}
