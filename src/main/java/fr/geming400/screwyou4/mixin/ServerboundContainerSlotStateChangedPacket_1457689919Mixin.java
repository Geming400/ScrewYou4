package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundContainerSlotStateChangedPacket.class)
public class ServerboundContainerSlotStateChangedPacket_1457689919Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1613557508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613557508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_549063650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549063650L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2066853853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2066853853L))
            info.setReturnValue("pyg68wO+D;ZZ\u8C1B}k8\u9CC8#xzb =2bk`v\u18A4ih\u6C263#Ndp_\u567FsJ(\uAAB1GDK#W:4|]5/peJr);d/wi8m(GZyD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2015042009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015042009L))
            info.setReturnValue(760055935);
    }

    @Inject(at = @At("HEAD"), method = "newState()Z", cancellable = true)
    private void newState_2024609476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024609476L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1161978055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1161978055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_2095050092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2095050092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId_547274536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547274536L))
            info.setReturnValue(-94028144);
    }

    @Inject(at = @At("HEAD"), method = "slotId()I", cancellable = true)
    private void slotId_1726114571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726114571L))
            info.setReturnValue(1357072723);
    }


}
