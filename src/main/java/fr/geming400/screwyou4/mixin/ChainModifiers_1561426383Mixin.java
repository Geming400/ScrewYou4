package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.ChainModifiers.class)
public class ChainModifiers_1561426383Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1348028655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1348028655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_425966407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(425966407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flags()B", cancellable = true)
    private void flags_1599681901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599681901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1599689124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599689124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isForked()Z", cancellable = true)
    private void isForked_1599704965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599704965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setForked()Lnet/minecraft/commands/execution/ChainModifiers;", cancellable = true)
    private void setForked__1169357491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1169357491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReturn()Z", cancellable = true)
    private void isReturn_1599704965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599704965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setReturn()Lnet/minecraft/commands/execution/ChainModifiers;", cancellable = true)
    private void setReturn__1169357491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1169357491L))
            info.setReturnValue(null);
    }


}
