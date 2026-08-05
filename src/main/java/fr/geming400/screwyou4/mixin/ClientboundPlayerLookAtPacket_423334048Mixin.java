package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerLookAtPacket.class)
public class ClientboundPlayerLookAtPacket_423334048Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_579201637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579201637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1168143547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1168143547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_127622184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(127622184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPosition(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPosition_1578174310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578174310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFromAnchor()Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private void getFromAnchor_2052283466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052283466L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.EYES);
    }


}
