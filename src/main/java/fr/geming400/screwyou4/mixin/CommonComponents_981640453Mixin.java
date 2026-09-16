package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.CommonComponents.class)
public class CommonComponents_981640453Mixin {
        @Inject(at = @At("HEAD"), method = "space()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void space_80772929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80772929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "days(J)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void days_379445528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379445528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hours(J)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void hours__944203312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944203312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minutes(J)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void minutes__93529184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-93529184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinLines([Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void joinLines__1437742661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437742661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinLines(Ljava/util/Collection;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void joinLines_1229452659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229452659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disconnectButtonLabel(Z)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void disconnectButtonLabel_2004155487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004155487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionStatus(Z)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void optionStatus_328066462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328066462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionStatus(Lnet/minecraft/network/chat/Component;Z)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void optionStatus_1650677700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650677700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionNameValue(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void optionNameValue__1853139042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1853139042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinForNarration([Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void joinForNarration__1391667447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1391667447L))
            info.setReturnValue(null);
    }


}
