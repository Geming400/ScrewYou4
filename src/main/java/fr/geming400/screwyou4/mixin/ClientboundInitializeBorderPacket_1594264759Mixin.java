package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundInitializeBorderPacket.class)
public class ClientboundInitializeBorderPacket_1594264759Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1750132348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750132348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2787164(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2787164L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1298552895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1298552895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNewCenterX()D", cancellable = true)
    private void getNewCenterX__432955746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432955746L))
            info.setReturnValue(4.2100630064230984E8D);
    }

    @Inject(at = @At("HEAD"), method = "getNewCenterZ()D", cancellable = true)
    private void getNewCenterZ__375697444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-375697444L))
            info.setReturnValue(4.2100630001287925E8D);
    }

    @Inject(at = @At("HEAD"), method = "getNewAbsoluteMaxSize()I", cancellable = true)
    private void getNewAbsoluteMaxSize_1293861592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1293861592L))
            info.setReturnValue(888890316);
    }

    @Inject(at = @At("HEAD"), method = "getLerpTime()J", cancellable = true)
    private void getLerpTime_1765063747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765063747L))
            info.setReturnValue(155566100328326284L);
    }

    @Inject(at = @At("HEAD"), method = "getWarningBlocks()I", cancellable = true)
    private void getWarningBlocks_1962727824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962727824L))
            info.setReturnValue(1354068352);
    }

    @Inject(at = @At("HEAD"), method = "getWarningTime()I", cancellable = true)
    private void getWarningTime__519606487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519606487L))
            info.setReturnValue(-929930456);
    }

    @Inject(at = @At("HEAD"), method = "getOldSize()D", cancellable = true)
    private void getOldSize__451917691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-451917691L))
            info.setReturnValue(4.2100630065074146E8D);
    }

    @Inject(at = @At("HEAD"), method = "getNewSize()D", cancellable = true)
    private void getNewSize__326032084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326032084L))
            info.setReturnValue(4.2100630019695824E8D);
    }


}
