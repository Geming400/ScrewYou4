package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundChangeDifficultyPacket.class)
public class ClientboundChangeDifficultyPacket1042292744Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1198160334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198160334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_133666476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133666476L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1812716269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1812716269L))
            info.setReturnValue("\uA89Den_J#\"uy$gP!l6N\u9021\uA24E[=\u1232\u90A8\u7FBCFk\u97A2&-3J#@P\uD022HH?\u5F23A9\u8E7AQ\u5B68Xi-t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1599644835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599644835L))
            info.setReturnValue(1327523437);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_746580881(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(746580881L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__549184850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-549184850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "difficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void difficulty_1249013861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249013861L))
            info.setReturnValue(net.minecraft.world.Difficulty.EASY);
    }

    @Inject(at = @At("HEAD"), method = "locked()Z", cancellable = true)
    private void locked_1204443381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1204443381L))
            info.setReturnValue(true);
    }


}
