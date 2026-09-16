package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.dragon.EnderDragonModel.class)
public class EnderDragonModel_97886430Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1805768180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1805768180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EnderDragonRenderState;)V", cancellable = true)
    private void setupAnim_1296116839(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1296116839L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_781534974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(781534974L))
            info.cancel();
    }


}
