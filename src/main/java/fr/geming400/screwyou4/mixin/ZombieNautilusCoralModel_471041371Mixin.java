package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.nautilus.ZombieNautilusCoralModel.class)
public class ZombieNautilusCoralModel_471041371Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1154689915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1154689915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;)V", cancellable = true)
    private void setupAnim_1151831092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1151831092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1432613239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432613239L))
            info.setReturnValue(null);
    }


}
