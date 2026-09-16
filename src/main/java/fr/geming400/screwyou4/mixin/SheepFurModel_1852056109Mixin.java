package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.sheep.SheepFurModel.class)
public class SheepFurModel_1852056109Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1759262643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1759262643L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__1739190497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1739190497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SheepRenderState;)V", cancellable = true)
    private void setupAnim_437552918(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(437552918L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFurLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createFurLayer_1715684498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715684498L))
            info.setReturnValue(null);
    }


}
