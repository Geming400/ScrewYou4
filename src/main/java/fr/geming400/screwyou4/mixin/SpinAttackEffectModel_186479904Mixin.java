package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.effects.SpinAttackEffectModel.class)
public class SpinAttackEffectModel_186479904Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)V", cancellable = true)
    private void setupAnim_613267373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(613267373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1572116782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1572116782L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createLayer__527652261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527652261L))
            info.setReturnValue(null);
    }


}
