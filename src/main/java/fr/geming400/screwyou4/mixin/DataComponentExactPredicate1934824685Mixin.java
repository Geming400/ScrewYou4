package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentExactPredicate.class)
public class DataComponentExactPredicate1934824685Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1026197921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026197921L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1589719582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589719582L))
            info.setReturnValue("%C&g-,\uC5E7`\u5AAAf+\u5BA1'Xk\u631FTY?\u7420x_\u8CC4a9rTUxVpli\u3E76I\u08D3u\u5DD1\u50F0C8(\"XJF[ -uVE:\uC371 j^7:U ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1802791016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802791016L))
            info.setReturnValue(2119327709);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_197852974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(197852974L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void test_2057756721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2057756721L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1301026239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301026239L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/core/component/DataComponentExactPredicate$Builder;", cancellable = true)
    private static void builder_1507367578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507367578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Lnet/minecraft/core/component/DataComponentMap;)Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private static void allOf_221785342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221785342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expect(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private static void expect__2128483741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128483741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alwaysMatches()Z", cancellable = true)
    private void alwaysMatches_1603186944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603186944L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "someOf(Lnet/minecraft/core/component/DataComponentMap;[Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private static void someOf__461641402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-461641402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asPatch()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void asPatch_1076798488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076798488L))
            info.setReturnValue(null);
    }


}
