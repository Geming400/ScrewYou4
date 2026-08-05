package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.parrot.ParrotModel.class)
public class ParrotModel_54275067Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__659857098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659857098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPose(Lnet/minecraft/world/entity/animal/parrot/Parrot;)Lnet/minecraft/client/model/animal/parrot/ParrotModel$Pose;", cancellable = true)
    private static void getPose__279100840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279100840L))
            info.setReturnValue(net.minecraft.client.model.animal.parrot.ParrotModel.Pose.PARTY);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1439911945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1439911945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ParrotRenderState;)V", cancellable = true)
    private void setupAnim_497994949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(497994949L))
            info.cancel();
    }


}
