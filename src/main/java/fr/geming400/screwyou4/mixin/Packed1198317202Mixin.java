package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Score.Packed.class)
public class Packed1198317202Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value__1106353753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1106353753L))
            info.setReturnValue(-1847367401);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_289690934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289690934L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1968740727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968740727L))
            info.setReturnValue("\"N9{_@\u4208\u67D0\u8820<O7pZ\u0128:G)?65n.n-fra4Zk8\uAC4CHWm3 3v*DxRic$:x'osLiq+X^nRK(m{d\uD3CC;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1755669293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1755669293L))
            info.setReturnValue(-1015199119);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/Optional;", cancellable = true)
    private void display_243647234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243647234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormat()Ljava/util/Optional;", cancellable = true)
    private void numberFormat__557394720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557394720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "locked()Z", cancellable = true)
    private void locked_1360467839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1360467839L))
            info.setReturnValue(true);
    }


}
