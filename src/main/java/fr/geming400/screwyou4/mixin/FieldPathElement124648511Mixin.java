package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.FieldPathElement.class)
public class FieldPathElement124648511Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1010811960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010811960L))
            info.setReturnValue("5uPh:eG/Us\u5428tYd6;\uD0F3\u21BAg\\");
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get__1010811960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010811960L))
            info.setReturnValue("5uPh:eG/Us\u5428tYd6;\uD0F3\u21BAg\\");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1510160770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510160770L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1010811464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010811464L))
            info.setReturnValue("uC_MmjrXb,_rL{&'`s+KrE\u8420C!ferfo!Sf=z_\u465C^\u4702*JO+^\u1F08f9bfjix0uc\uB8EERNvE\"%h|V1!b6,/\u8FEE\u27587]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_162911253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162911253L))
            info.setReturnValue(1491858230);
    }


}
