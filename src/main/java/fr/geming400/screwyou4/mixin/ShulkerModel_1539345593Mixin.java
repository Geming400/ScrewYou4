package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.shulker.ShulkerModel.class)
public class ShulkerModel_1539345593Mixin {
        @Inject(at = @At("HEAD"), method = "createBoxLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBoxLayer_825213428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825213428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1369984825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1369984825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ShulkerRenderState;)V", cancellable = true)
    private void setupAnim__15087291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-15087291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_825213428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825213428L))
            info.setReturnValue(null);
    }


}
