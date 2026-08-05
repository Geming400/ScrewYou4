package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.SelectBlockModel.SwitchCase.class)
public class SwitchCase_1541219814Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1368235224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1368235224L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_405759838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405759838L))
            info.setReturnValue("v\uBCD7dJmRJ\uAB70\uA55F\u1D62iA\u1812g}\uD3A9IPc8<&jp\u67EE\uB7A0_1P\uD2DF>sD5\u0EBD:HQSM7}2;j \u29EEG\u94A7z\uFFFC N,U\uBF05jku2g");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__1127410667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127410667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1579482555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579482555L))
            info.setReturnValue(-129155146);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private void model__20787611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-20787611L))
            info.setReturnValue(null);
    }


}
