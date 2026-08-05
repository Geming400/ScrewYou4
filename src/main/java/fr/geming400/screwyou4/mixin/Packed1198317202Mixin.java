package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Score.Packed.class)
public class Packed1198317202Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_1236579448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236579448L))
            info.setReturnValue(-256221035);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1711137835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1711137835L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_62857227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62857227L))
            info.setReturnValue("!xaL7$౯Ivcxz7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1236579944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236579944L))
            info.setReturnValue(-459368454);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/Optional;", cancellable = true)
    private void display_1443778624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1443778624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormat()Ljava/util/Optional;", cancellable = true)
    private void numberFormat_1443778624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1443778624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "locked()Z", cancellable = true)
    private void locked_1236595785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236595785L))
            info.setReturnValue(false);
    }


}
