package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.class)
public class ClientboundSetPlayerTeamPacket1831069943Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_695609472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695609472L))
            info.setReturnValue("/W");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_152044855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(152044855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParameters()Ljava/util/Optional;", cancellable = true)
    private void getParameters_2076531365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076531365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2028577477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2028577477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1785828440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1785828440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayers()Ljava/util/Collection;", cancellable = true)
    private void getPlayers_17421671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17421671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRemovePacket(Lnet/minecraft/world/scores/PlayerTeam;)Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket;", cancellable = true)
    private static void createRemovePacket_1586155121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1586155121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPlayerPacket(Lnet/minecraft/world/scores/PlayerTeam;Ljava/lang/String;Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;)Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket;", cancellable = true)
    private static void createPlayerPacket__210943258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-210943258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAddOrModifyPacket(Lnet/minecraft/world/scores/PlayerTeam;Z)Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket;", cancellable = true)
    private static void createAddOrModifyPacket_933180575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933180575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerAction()Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;", cancellable = true)
    private void getPlayerAction_1199841809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199841809L))
            info.setReturnValue(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Action.ADD);
    }

    @Inject(at = @At("HEAD"), method = "getTeamAction()Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;", cancellable = true)
    private void getTeamAction_1199841809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199841809L))
            info.setReturnValue(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Action.ADD);
    }


}
