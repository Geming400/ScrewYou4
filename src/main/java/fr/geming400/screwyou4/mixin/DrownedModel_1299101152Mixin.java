package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.zombie.DrownedModel.class)
public class DrownedModel_1299101152Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1489633843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489633843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim__1702539823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1702539823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1610229266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1610229266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;)V", cancellable = true)
    private void setupAnim__1555467462(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1555467462L))
            info.cancel();
    }


}
