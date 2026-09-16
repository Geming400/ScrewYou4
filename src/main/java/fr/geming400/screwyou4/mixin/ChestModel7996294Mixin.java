package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.chest.ChestModel.class)
public class ChestModel7996294Mixin {
        @Inject(at = @At("HEAD"), method = "createSingleBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSingleBodyLayer__1145379763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145379763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDoubleBodyRightLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createDoubleBodyRightLayer__667656474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-667656474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDoubleBodyLeftLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createDoubleBodyLeftLayer_1914902173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1914902173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Float;)V", cancellable = true)
    private void setupAnim__1949770826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1949770826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_691644839(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(691644839L))
            info.cancel();
    }


}
