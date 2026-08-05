package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.CrashReportCategory.Entry.class)
public class Entry917812465Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value__217648006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217648006L))
            info.setReturnValue("jYQK>J?gvnJ*K?,p\u2AEC\uFC79Q+U6\u4C5C\u02B0.#4uhs)\u2185>>b#m\u37BF\u5E35\u08D7BYv9g@m,51\"\uC877ek?LB\u3AF8\u652D\u9CA3vmQLpOe=V o\u393C`4");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1991642572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991642572L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__217647510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217647510L))
            info.setReturnValue("Q/\u5669# m6ks u_xy^pjs<hOX\u9D37\u6955qJ+1SVU\u8383Mqtp'zbFED\u5321[:qJ,8*\u260BLAi\uA680KT5H0lA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_956075207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(956075207L))
            info.setReturnValue(-547097586);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/lang/String;", cancellable = true)
    private void key__217648006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217648006L))
            info.setReturnValue("jYQK>J?gvnJ*K?,p\u2AEC\uFC79Q+U6\u4C5C\u02B0.#4uhs)\u2185>>b#m\u37BF\u5E35\u08D7BYv9g@m,51\"\uC877ek?LB\u3AF8\u652D\u9CA3vmQLpOe=V o\u393C`4");
    }


}
