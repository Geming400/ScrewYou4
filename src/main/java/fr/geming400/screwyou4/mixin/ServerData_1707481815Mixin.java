package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerData.class)
public class ServerData_1707481815Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/multiplayer/ServerData$Type;", cancellable = true)
    private void type_1950330936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950330936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/client/multiplayer/ServerData$State;", cancellable = true)
    private void state__1654662629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654662629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setState(Lnet/minecraft/client/multiplayer/ServerData$State;)V", cancellable = true)
    private void setState_1005875041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1005875041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void write_137258894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137258894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private static void read_1507258443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507258443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private void copyFrom_1747967886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1747967886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearCodeOfConduct()V", cancellable = true)
    private void clearCodeOfConduct_1745756553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1745756553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptCodeOfConduct(Ljava/lang/String;)V", cancellable = true)
    private void acceptCodeOfConduct__1435124333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1435124333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyNameIconFrom(Lnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private void copyNameIconFrom_1747967886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1747967886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIconBytes()[B", cancellable = true)
    private void getIconBytes__1401650852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1401650852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIconBytes([B)V", cancellable = true)
    private void setIconBytes_1220462416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1220462416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResourcePackStatus()Lnet/minecraft/client/multiplayer/ServerData$ServerPackStatus;", cancellable = true)
    private void getResourcePackStatus_946472804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946472804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setResourcePackStatus(Lnet/minecraft/client/multiplayer/ServerData$ServerPackStatus;)V", cancellable = true)
    private void setResourcePackStatus__795918632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-795918632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLan()Z", cancellable = true)
    private void isLan_1745760397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745760397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRealm()Z", cancellable = true)
    private void isRealm_1745760397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745760397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAcceptedCodeOfConduct(Ljava/lang/String;)Z", cancellable = true)
    private void hasAcceptedCodeOfConduct__1435120489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435120489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateIcon([B)[B", cancellable = true)
    private static void validateIcon__505899667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505899667L))
            info.setReturnValue(null);
    }


}
