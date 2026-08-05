package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundInitializeBorderPacket.class)
public class ClientboundInitializeBorderPacket_1594264759Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__84760330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84760330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1791772292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1791772292L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2022633625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2022633625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOldSize()D", cancellable = true)
    private void getOldSize_1632522199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632522199L))
            info.setReturnValue(1.62837300212471E8D);
    }

    @Inject(at = @At("HEAD"), method = "getNewSize()D", cancellable = true)
    private void getNewSize_1632522199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632522199L))
            info.setReturnValue(1.62837300212471E8D);
    }

    @Inject(at = @At("HEAD"), method = "getLerpTime()J", cancellable = true)
    private void getLerpTime_1632527965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632527965L))
            info.setReturnValue(4793628372814990346L);
    }

    @Inject(at = @At("HEAD"), method = "getNewAbsoluteMaxSize()I", cancellable = true)
    private void getNewAbsoluteMaxSize_1632527004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632527004L))
            info.setReturnValue(1747180291);
    }

    @Inject(at = @At("HEAD"), method = "getNewCenterX()D", cancellable = true)
    private void getNewCenterX_1632522199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632522199L))
            info.setReturnValue(1.62837300212471E8D);
    }

    @Inject(at = @At("HEAD"), method = "getNewCenterZ()D", cancellable = true)
    private void getNewCenterZ_1632522199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632522199L))
            info.setReturnValue(1.62837300212471E8D);
    }

    @Inject(at = @At("HEAD"), method = "getWarningTime()I", cancellable = true)
    private void getWarningTime_1632527004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632527004L))
            info.setReturnValue(1747180291);
    }

    @Inject(at = @At("HEAD"), method = "getWarningBlocks()I", cancellable = true)
    private void getWarningBlocks_1632527004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632527004L))
            info.setReturnValue(1747180291);
    }


}
