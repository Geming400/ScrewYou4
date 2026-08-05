package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLoginPacket.class)
public class ClientboundLoginPacket_2025368176Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_346343087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346343087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__884086862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884086862L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_889908200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889908200L))
            info.setReturnValue("(U\u0D43mZ]bHu<=\u4755{8oG\uA5AA\u552Cd\u4E7Fd5 Gz61)iR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2063630917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063630917L))
            info.setReturnValue(303439210);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__2072091587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2072091587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1591530208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1591530208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/Set;", cancellable = true)
    private void levels_196332689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(196332689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxPlayers()I", cancellable = true)
    private void maxPlayers_2063630421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063630421L))
            info.setReturnValue(506586629);
    }

    @Inject(at = @At("HEAD"), method = "reducedDebugInfo()Z", cancellable = true)
    private void reducedDebugInfo_2063646758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063646758L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "simulationDistance()I", cancellable = true)
    private void simulationDistance_2063630421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063630421L))
            info.setReturnValue(506586629);
    }

    @Inject(at = @At("HEAD"), method = "onlineMode()Z", cancellable = true)
    private void onlineMode_2063646758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063646758L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "chunkRadius()I", cancellable = true)
    private void chunkRadius_2063630421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063630421L))
            info.setReturnValue(506586629);
    }

    @Inject(at = @At("HEAD"), method = "enforcesSecureChat()Z", cancellable = true)
    private void enforcesSecureChat_2063646758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063646758L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hardcore()Z", cancellable = true)
    private void hardcore_2063646758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063646758L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "doLimitedCrafting()Z", cancellable = true)
    private void doLimitedCrafting_2063646758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063646758L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "playerId()I", cancellable = true)
    private void playerId_2063630421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063630421L))
            info.setReturnValue(506586629);
    }

    @Inject(at = @At("HEAD"), method = "showDeathScreen()Z", cancellable = true)
    private void showDeathScreen_2063646758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063646758L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "commonPlayerSpawnInfo()Lnet/minecraft/network/protocol/game/CommonPlayerSpawnInfo;", cancellable = true)
    private void commonPlayerSpawnInfo_1320178417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320178417L))
            info.setReturnValue(null);
    }


}
