package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.armorstand.ArmorStandArmorModel.class)
public class ArmorStandArmorModel1703940719Mixin {
        @Inject(at = @At("HEAD"), method = "createArmorLayerSet(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void createArmorLayerSet_46373861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(46373861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ArmorStandRenderState;)V", cancellable = true)
    private void setupAnim__1978418547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1978418547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1907378032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1907378032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_1288854771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1288854771L))
            info.cancel();
    }


}
