package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GeneratedTest.class)
public class GeneratedTest1239734691Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1669720346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1669720346L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_104274716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104274716L))
            info.setReturnValue("Fc D%m\u97378%nQu\u80D0Nul\u87739T74\"L_\uCC19QK4|Wr}t\u8561\uCAD429YQ9p|Nb6}USI\uFC7F|.I\uD4ADXr; Lu=57%0TKtfy\uC160l?B7/77lvk");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1277997433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277997433L))
            info.setReturnValue(69442301);
    }

    @Inject(at = @At("HEAD"), method = "function()Ljava/util/function/Consumer;", cancellable = true)
    private void function_401628282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(401628282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "functionKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void functionKey_2048226004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2048226004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tests()Ljava/util/Map;", cancellable = true)
    private void tests__764888949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764888949L))
            info.setReturnValue(null);
    }


}
