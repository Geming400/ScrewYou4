package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagFile.class)
public class TagFile1577028152Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1332426885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332426885L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_441568177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441568177L))
            info.setReturnValue("x`J]kRfi}Av'%i7J\u6233kG}@\"i\u7FA9N>W&aL}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1615290894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615290894L))
            info.setReturnValue(1945298748);
    }

    @Inject(at = @At("HEAD"), method = "replace()Z", cancellable = true)
    private void replace_1615306735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615306735L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1091602328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091602328L))
            info.setReturnValue(null);
    }


}
