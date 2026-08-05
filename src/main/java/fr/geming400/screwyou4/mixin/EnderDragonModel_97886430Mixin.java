package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.dragon.EnderDragonModel.class)
public class EnderDragonModel_97886430Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__616245735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616245735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EnderDragonRenderState;)V", cancellable = true)
    private void setupAnim_1243594809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1243594809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1483523308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1483523308L))
            info.cancel();
    }


}
