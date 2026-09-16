package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.ChainModifiers.class)
public class ChainModifiers_1561426383Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_652800114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652800114L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1963117389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1963117389L))
            info.setReturnValue("sxz\u7D24:Q\u464A9\u257CbA=\u4C33&s<E");
    }

    @Inject(at = @At("HEAD"), method = "flags()B", cancellable = true)
    private void flags__1431551162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431551162L))
            info.setReturnValue(33);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2118778473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118778473L))
            info.setReturnValue(-709570550);
    }

    @Inject(at = @At("HEAD"), method = "setForked()Lnet/minecraft/commands/execution/ChainModifiers;", cancellable = true)
    private void setForked_127952202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(127952202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReturn()Z", cancellable = true)
    private void isReturn__1387877173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1387877173L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setReturn()Lnet/minecraft/commands/execution/ChainModifiers;", cancellable = true)
    private void setReturn__997872549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997872549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isForked()Z", cancellable = true)
    private void isForked_1163304890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163304890L))
            info.setReturnValue(true);
    }


}
