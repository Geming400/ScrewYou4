package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.GuiMessage.class)
public class GuiMessage_827247088Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature__417237696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417237696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2082207950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082207950L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__308212888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-308212888L))
            info.setReturnValue("^mm-{gp3ElcVd%F@dy辧p LaLU");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_865509829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865509829L))
            info.setReturnValue(-1240001095);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/client/multiplayer/chat/GuiMessageSource;", cancellable = true)
    private void source__1965851356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1965851356L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.GuiMessageSource.SYSTEM_SERVER);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private void tag_266739255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266739255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "content()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void content__1349662078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1349662078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splitLines(Lnet/minecraft/client/gui/Font;I)Ljava/util/List;", cancellable = true)
    private void splitLines__852781846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852781846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addedTime()I", cancellable = true)
    private void addedTime_865509333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865509333L))
            info.setReturnValue(-603028387);
    }


}
