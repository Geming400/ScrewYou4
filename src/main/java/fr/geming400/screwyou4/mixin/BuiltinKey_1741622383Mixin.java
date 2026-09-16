package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.SnbtOperations.BuiltinKey.class)
public class BuiltinKey_1741622383Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_832996114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832996114L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1782921885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782921885L))
            info.setReturnValue("i\u3232 Kv3\u776F\uA1A4opMWG?i7E_^x");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1995992823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995992823L))
            info.setReturnValue(-1808748395);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_2082783954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082783954L))
            info.setReturnValue("(#?Z=!\u2CDE0$JVB\"soIl!:4cnct\u1199\u2A7AA>t)\uBFCF5nn ilq\uB7DA\u0FB7SS\uFA87\u7EB4w,!M@VVF3,tJZ#?H.tr3Q_IH|!b\u688D\u6AE9o'");
    }

    @Inject(at = @At("HEAD"), method = "argCount()I", cancellable = true)
    private void argCount_1384760731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384760731L))
            info.setReturnValue(-321498277);
    }


}
