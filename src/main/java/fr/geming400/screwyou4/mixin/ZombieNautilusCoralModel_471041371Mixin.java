package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.nautilus.ZombieNautilusCoralModel.class)
public class ZombieNautilusCoralModel_471041371Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__243090794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-243090794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1856678249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1856678249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;)V", cancellable = true)
    private void setupAnim__1434723934(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1434723934L))
            info.cancel();
    }


}
