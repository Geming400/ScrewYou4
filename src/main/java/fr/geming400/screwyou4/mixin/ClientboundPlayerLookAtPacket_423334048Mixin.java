package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerLookAtPacket.class)
public class ClientboundPlayerLookAtPacket_423334048Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1255691041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255691041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_620841581(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(620841581L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1101402960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1101402960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPosition(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPosition_470224967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(470224967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFromAnchor()Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private void getFromAnchor__1487481195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487481195L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.EYES);
    }


}
