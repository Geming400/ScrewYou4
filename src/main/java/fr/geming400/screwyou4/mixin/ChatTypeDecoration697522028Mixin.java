package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ChatTypeDecoration.class)
public class ChatTypeDecoration697522028Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2083034287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2083034287L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__437937947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-437937947L))
            info.setReturnValue("xyU^YlGI>97Z⏇5(\"C`zd`qov@m");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_735784770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735784770L))
            info.setReturnValue(-1114764408);
    }

    @Inject(at = @At("HEAD"), method = "parameters()Ljava/util/List;", cancellable = true)
    private void parameters__1971108452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971108452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void style_387915339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(387915339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSender(Ljava/lang/String;)Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private static void withSender__2071586354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071586354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translationKey()Ljava/lang/String;", cancellable = true)
    private void translationKey__437938443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-437938443L))
            info.setReturnValue("a7DNiU\"neSOX?U^lnhW?O+3 #z磪:JRh9M6?9ⱘ[s=h-^AB~3媭t/㿪QtW|R42DJV$DBl&䲁?[B@ ﵞo<+|nbY</_79\"eg");
    }

    @Inject(at = @At("HEAD"), method = "teamMessage(Ljava/lang/String;)Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private static void teamMessage__2071586354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071586354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outgoingDirectMessage(Ljava/lang/String;)Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private static void outgoingDirectMessage__2071586354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071586354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "incomingDirectMessage(Ljava/lang/String;)Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private static void incomingDirectMessage__2071586354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071586354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorate(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/ChatType$Bound;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void decorate__1614119894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614119894L))
            info.setReturnValue(null);
    }


}
