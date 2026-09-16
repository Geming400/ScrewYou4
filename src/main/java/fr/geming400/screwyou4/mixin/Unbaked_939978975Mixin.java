package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.EmptyBlockModel.Unbaked.class)
public class Unbaked_939978975Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_31352706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(31352706L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1710402499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710402499L))
            info.setReturnValue("z2\u95A8_1c.co#\u8194wDz\"3RL<b\u9591QB\uB916CRF+VN=WY{lx0\u0B1A\u57D44pS\"Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1497331065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497331065L))
            info.setReturnValue(-1377365519);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake__1749146292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749146292L))
            info.setReturnValue(null);
    }


}
