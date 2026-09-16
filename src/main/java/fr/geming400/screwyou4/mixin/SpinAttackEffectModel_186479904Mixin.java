package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.effects.SpinAttackEffectModel.class)
public class SpinAttackEffectModel_186479904Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)V", cancellable = true)
    private void setupAnim__523704641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-523704641L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_870128448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(870128448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createLayer__1473647280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1473647280L))
            info.setReturnValue(null);
    }


}
