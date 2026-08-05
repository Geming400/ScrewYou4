package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.CommonComponents.class)
public class CommonComponents_981640453Mixin {
        @Inject(at = @At("HEAD"), method = "space()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void space__1426363513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1426363513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "days(J)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void days_1573115009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573115009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hours(J)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void hours_1573115009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573115009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minutes(J)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void minutes_1573115009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573115009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinLines([Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void joinLines__2018769648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018769648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinLines(Ljava/util/Collection;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void joinLines__1234833026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1234833026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionStatus(Lnet/minecraft/network/chat/Component;Z)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void optionStatus_1282464765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1282464765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionStatus(Z)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void optionStatus__54569787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-54569787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disconnectButtonLabel(Z)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void disconnectButtonLabel__54569787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-54569787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinForNarration([Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void joinForNarration_93026534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(93026534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionNameValue(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void optionNameValue_1477604015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477604015L))
            info.setReturnValue(null);
    }


}
