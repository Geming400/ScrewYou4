package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLevelChunkWithLightPacket.class)
public class ClientboundLevelChunkWithLightPacket110666750Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_266534340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266534340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1480810844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1480810844L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__185045113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-185045113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_985474914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(985474914L))
            info.setReturnValue(2085364346);
    }

    @Inject(at = @At("HEAD"), method = "getZ()I", cancellable = true)
    private void getZ_1042733216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042733216L))
            info.setReturnValue(703828456);
    }

    @Inject(at = @At("HEAD"), method = "getChunkData()Lnet/minecraft/network/protocol/game/ClientboundLevelChunkPacketData;", cancellable = true)
    private void getChunkData_839998286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839998286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightData()Lnet/minecraft/network/protocol/game/ClientboundLightUpdatePacketData;", cancellable = true)
    private void getLightData_539604125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(539604125L))
            info.setReturnValue(null);
    }


}
