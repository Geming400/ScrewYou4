package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.shulker.ShulkerModel.class)
public class ShulkerModel_1539345593Mixin {
        @Inject(at = @At("HEAD"), method = "createBoxLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBoxLayer_1925757398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925757398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2071973159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2071973159L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ShulkerRenderState;)V", cancellable = true)
    private void setupAnim__901481357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-901481357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__364309017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364309017L))
            info.setReturnValue(null);
    }


}
