package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundJigsawGeneratePacket.class)
public class ServerboundJigsawGeneratePacket_1811813845Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_132788756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132788756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__56808150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-56808150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1805084539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1805084539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levels()I", cancellable = true)
    private void levels_1850076090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1850076090L))
            info.setReturnValue(-124690354);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__81573035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81573035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keepJigsaws()Z", cancellable = true)
    private void keepJigsaws_1850092427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1850092427L))
            info.setReturnValue(false);
    }


}
