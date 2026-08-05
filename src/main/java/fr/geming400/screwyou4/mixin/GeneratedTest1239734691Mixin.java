package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GeneratedTest.class)
public class GeneratedTest1239734691Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_331108423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331108423L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2010158216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010158216L))
            info.setReturnValue("*f<(I}lol\u626B\uCE72w(7aWEy+\u3F9C9B&G\u88ADvnbX:\u8A6B.\u55760g54*E%R\uBBC7<ActnKc+$@%<;\"@h:(\u9857G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1797086782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1797086782L))
            info.setReturnValue(858560390);
    }

    @Inject(at = @At("HEAD"), method = "function()Ljava/util/function/Consumer;", cancellable = true)
    private void function_1667810210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667810210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "functionKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void functionKey__1915605171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915605171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tests()Ljava/util/Map;", cancellable = true)
    private void tests_2042907850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042907850L))
            info.setReturnValue(null);
    }


}
