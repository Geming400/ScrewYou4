package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.WrittenBookPredicate.PagePredicate.class)
public class PagePredicate2134262477Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__775192560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-775192560L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_998802502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998802502L))
            info.setReturnValue("_\u0610\u0D2A\u79EAl6mSM\uAEE8fE\u3AC0,^(\u34C6 8zO8txvj@E[iy\u625FHmJeAo\uB3B1\u8175Y'1M2=7+N\uA46F7\"'!:jpptpE:\u07A3QFMtSS5eQ\uA662=0>$Q\uAD60@b^[\uD148X$-/+T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2122442077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122442077L))
            info.setReturnValue(-2071401142);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__775064096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-775064096L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/server/network/Filterable;)Z", cancellable = true)
    private void test__1902424912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902424912L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void contents__42646688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42646688L))
            info.setReturnValue(null);
    }


}
