package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerData.class)
public class ServerData_1707481815Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/multiplayer/ServerData$Type;", cancellable = true)
    private void type__391098382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391098382L))
            info.setReturnValue(net.minecraft.client.multiplayer.ServerData.Type.LAN);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/client/multiplayer/ServerData$State;", cancellable = true)
    private void state__892500374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892500374L))
            info.setReturnValue(net.minecraft.client.multiplayer.ServerData.State.UNREACHABLE);
    }

    @Inject(at = @At("HEAD"), method = "setState(Lnet/minecraft/client/multiplayer/ServerData$State;)V", cancellable = true)
    private void setState_1996929968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1996929968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void write__1184445617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1184445617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private static void read__569725471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-569725471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private void copyFrom__293696883(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-293696883L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResourcePackStatus()Lnet/minecraft/client/multiplayer/ServerData$ServerPackStatus;", cancellable = true)
    private void getResourcePackStatus__2114160717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2114160717L))
            info.setReturnValue(net.minecraft.client.multiplayer.ServerData.ServerPackStatus.DISABLED);
    }

    @Inject(at = @At("HEAD"), method = "setResourcePackStatus(Lnet/minecraft/client/multiplayer/ServerData$ServerPackStatus;)V", cancellable = true)
    private void setResourcePackStatus_1435495133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1435495133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearCodeOfConduct()V", cancellable = true)
    private void clearCodeOfConduct_235858614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(235858614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyNameIconFrom(Lnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private void copyNameIconFrom_1010883665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1010883665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptCodeOfConduct(Ljava/lang/String;)V", cancellable = true)
    private void acceptCodeOfConduct_1453060795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1453060795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setIconBytes([B)V", cancellable = true)
    private void setIconBytes_2064410656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2064410656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIconBytes()[B", cancellable = true)
    private void getIconBytes_1169222936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169222936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLan()Z", cancellable = true)
    private void isLan__759804450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759804450L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isRealm()Z", cancellable = true)
    private void isRealm__1734306776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734306776L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasAcceptedCodeOfConduct(Ljava/lang/String;)Z", cancellable = true)
    private void hasAcceptedCodeOfConduct__441929576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441929576L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validateIcon([B)[B", cancellable = true)
    private static void validateIcon__1713388260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1713388260L))
            info.setReturnValue(null);
    }


}
