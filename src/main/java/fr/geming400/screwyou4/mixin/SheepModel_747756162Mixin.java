package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.sheep.SheepModel.class)
public class SheepModel_747756162Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_33623997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33623997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__176706078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-176706078L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_2133393040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2133393040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SheepRenderState;)V", cancellable = true)
    private void setupAnim_893950141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(893950141L))
            info.cancel();
    }


}
