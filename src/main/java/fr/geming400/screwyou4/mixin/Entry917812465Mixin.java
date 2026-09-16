package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.CrashReportCategory.Entry.class)
public class Entry917812465Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value_1214606123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1214606123L))
            info.setReturnValue("P5v\u8ECEi=)]U\uD7CC&q<)9VSGNv\u6B61W{QR@N$*)E.c");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_9186197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9186197L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1688235990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688235990L))
            info.setReturnValue("2\u054FvhM|x0p9Xl &jNw&\u3167L");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1475164556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1475164556L))
            info.setReturnValue(1889790536);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/lang/String;", cancellable = true)
    private void key__1320816231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1320816231L))
            info.setReturnValue(")/<S4taq>\u0AC7 O,4(Jj(#`I8R\u0547w4/GVyt\u0E51#jg)+TNF%$,D0}y..\u3C81n\u2D45R7\"&5f\u68429");
    }


}
