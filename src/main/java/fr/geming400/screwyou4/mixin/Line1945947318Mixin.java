package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.GuiMessage.Line.class)
public class Line1945947318Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Lnet/minecraft/client/multiplayer/chat/GuiMessage;", cancellable = true)
    private void parent__514617530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-514617530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__963507719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963507719L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_810487343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810487343L))
            info.setReturnValue("2U(澥ះ/s;]=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1984210060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984210060L))
            info.setReturnValue(-102486934);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private void tag_1385439486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1385439486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "content()Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void content__1289380950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1289380950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTagIconLeft(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getTagIconLeft_975161600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975161600L))
            info.setReturnValue(1561895399);
    }

    @Inject(at = @At("HEAD"), method = "addedTime()I", cancellable = true)
    private void addedTime_1984209564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984209564L))
            info.setReturnValue(100660485);
    }

    @Inject(at = @At("HEAD"), method = "endOfEntry()Z", cancellable = true)
    private void endOfEntry_1984225901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984225901L))
            info.setReturnValue(false);
    }


}
