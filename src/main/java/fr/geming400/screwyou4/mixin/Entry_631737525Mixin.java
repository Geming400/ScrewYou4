package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.Entry.class)
public class Entry_631737525Mixin {
        @Inject(at = @At("HEAD"), method = "profile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void profile_1148905804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148905804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2017249783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017249783L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__503722451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503722451L))
            info.setReturnValue("8C\u1B21*\u4DE23s\"\u5B2Bc!.vJ+?u,'pOF!2p|xuM\u8EAFSnsHGV\u4268\uBD37ML\u1588\u81D0@#y@_$`%L\u556ESJ1[`BC?-l\u401C)}Vuqf\u4B61m`Y90\u1780;.\u8DEB]MHb?%v ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_670000266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670000266L))
            info.setReturnValue(-1159080474);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayName__1545171641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545171641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "latency()I", cancellable = true)
    private void latency_669999770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669999770L))
            info.setReturnValue(-955933055);
    }

    @Inject(at = @At("HEAD"), method = "gameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void gameMode__763708774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763708774L))
            info.setReturnValue(net.minecraft.world.level.GameType.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "listed()Z", cancellable = true)
    private void listed_670016107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670016107L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "listOrder()I", cancellable = true)
    private void listOrder_669999770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669999770L))
            info.setReturnValue(-955933055);
    }

    @Inject(at = @At("HEAD"), method = "showHat()Z", cancellable = true)
    private void showHat_670016107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670016107L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "chatSession()Lnet/minecraft/network/chat/RemoteChatSession$Data;", cancellable = true)
    private void chatSession__1187079520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1187079520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profileId()Ljava/util/UUID;", cancellable = true)
    private void profileId_1042872007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042872007L))
            info.setReturnValue(null);
    }


}
