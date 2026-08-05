package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.Entry.class)
public class Entry_631737525Mixin {
        @Inject(at = @At("HEAD"), method = "profile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void profile__855403915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-855403915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__276888744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-276888744L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1402161049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402161049L))
            info.setReturnValue("QD/{5e\u7F7F`!A4^rE,Ry,5}Gy)(;:|!Tr7`y)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1189089615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189089615L))
            info.setReturnValue(2119278141);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayName_1942162292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942162292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "latency()I", cancellable = true)
    private void latency__401308580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-401308580L))
            info.setReturnValue(-9863555);
    }

    @Inject(at = @At("HEAD"), method = "profileId()Ljava/util/UUID;", cancellable = true)
    private void profileId_987433323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987433323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void gameMode__153955761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153955761L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "chatSession()Lnet/minecraft/network/chat/RemoteChatSession$Data;", cancellable = true)
    private void chatSession_318717122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318717122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listed()Z", cancellable = true)
    private void listed_1623892686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623892686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "listOrder()I", cancellable = true)
    private void listOrder__803005622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803005622L))
            info.setReturnValue(-717862581);
    }

    @Inject(at = @At("HEAD"), method = "showHat()Z", cancellable = true)
    private void showHat__103781683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103781683L))
            info.setReturnValue(false);
    }


}
