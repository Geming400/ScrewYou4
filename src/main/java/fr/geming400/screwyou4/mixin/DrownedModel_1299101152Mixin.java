package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.zombie.DrownedModel.class)
public class DrownedModel_1299101152Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1982749696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1982749696L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_884015203(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(884015203L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;)V", cancellable = true)
    private void setupAnim_1602527820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1602527820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__318575616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-318575616L))
            info.setReturnValue(null);
    }


}
