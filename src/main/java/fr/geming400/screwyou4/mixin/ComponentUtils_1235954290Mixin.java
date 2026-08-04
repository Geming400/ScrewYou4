package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ComponentUtils.class)
public class ComponentUtils_1235954290Mixin {
        @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void resolve_1232943350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232943350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;Ljava/util/Optional;I)Ljava/util/Optional;", cancellable = true)
    private static void resolve__1144630245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144630245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;Lnet/minecraft/network/chat/Component;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void resolve__919439317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-919439317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatList(Ljava/util/Collection;Ljava/util/function/Function;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatList_401079653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(401079653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatList(Ljava/util/Collection;Ljava/util/Optional;Ljava/util/function/Function;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void formatList_2056518556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056518556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatList(Ljava/util/Collection;Lnet/minecraft/network/chat/Component;Ljava/util/function/Function;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void formatList__1293964905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1293964905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatList(Ljava/util/Collection;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatList__563781865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563781865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatList(Ljava/util/Collection;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatList__980519189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980519189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrapInSquareBrackets(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void wrapInSquareBrackets__1315967992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1315967992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeStyles(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void mergeStyles__1818797944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818797944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeStyles(Lnet/minecraft/network/chat/MutableComponent;Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void mergeStyles_1445672370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445672370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromMessage(Lcom/mojang/brigadier/Message;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void fromMessage__1475631429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475631429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatAndSortList(Ljava/util/Collection;Ljava/util/function/Function;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatAndSortList_401079653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(401079653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyOnClickText(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void copyOnClickText_1054418430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054418430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTranslationResolvable(Lnet/minecraft/network/chat/Component;)Z", cancellable = true)
    private static void isTranslationResolvable__665220556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665220556L))
            info.setReturnValue(null);
    }


}
