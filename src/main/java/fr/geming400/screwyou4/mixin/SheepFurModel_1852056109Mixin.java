package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.sheep.SheepFurModel.class)
public class SheepFurModel_1852056109Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1057274309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1057274309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_927593869(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(927593869L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SheepRenderState;)V", cancellable = true)
    private void setupAnim_1998250088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1998250088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFurLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createFurLayer_1137923944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137923944L))
            info.setReturnValue(null);
    }


}
