package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ComponentUtils.class)
public class ComponentUtils_1235954290Mixin {
        @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void resolve_2034748042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2034748042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;Ljava/util/Optional;I)Ljava/util/Optional;", cancellable = true)
    private static void resolve__1087807825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087807825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;Lnet/minecraft/network/chat/Component;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void resolve__1833297641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833297641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatList(Ljava/util/Collection;Ljava/util/function/Function;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatList_1858208848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1858208848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatList(Ljava/util/Collection;Ljava/util/Optional;Ljava/util/function/Function;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void formatList__1584924207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584924207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatList(Ljava/util/Collection;Lnet/minecraft/network/chat/Component;Ljava/util/function/Function;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void formatList__1000971124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1000971124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatList(Ljava/util/Collection;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatList__1797459828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797459828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatList(Ljava/util/Collection;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatList__1028417504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028417504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTranslationResolvable(Lnet/minecraft/network/chat/Component;)Z", cancellable = true)
    private static void isTranslationResolvable__441599750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441599750L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "formatAndSortList(Ljava/util/Collection;Ljava/util/function/Function;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatAndSortList__1681135351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1681135351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyOnClickText(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void copyOnClickText__1968759459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968759459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromMessage(Lcom/mojang/brigadier/Message;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void fromMessage__708419912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-708419912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeStyles(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void mergeStyles_1169335618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169335618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeStyles(Lnet/minecraft/network/chat/MutableComponent;Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void mergeStyles_704427244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704427244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrapInSquareBrackets(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void wrapInSquareBrackets__207327183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207327183L))
            info.setReturnValue(null);
    }


}
