package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.parrot.ParrotModel.class)
public class ParrotModel_54275067Mixin {
        @Inject(at = @At("HEAD"), method = "getPose(Lnet/minecraft/world/entity/animal/parrot/Parrot;)Lnet/minecraft/client/model/animal/parrot/ParrotModel$Pose;", cancellable = true)
    private static void getPose__1807564449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807564449L))
            info.setReturnValue(net.minecraft.client.model.animal.parrot.ParrotModel.Pose.PARTY);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1849379543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849379543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_737923611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(737923611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ParrotRenderState;)V", cancellable = true)
    private void setupAnim__638977065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-638977065L))
            info.cancel();
    }


}
