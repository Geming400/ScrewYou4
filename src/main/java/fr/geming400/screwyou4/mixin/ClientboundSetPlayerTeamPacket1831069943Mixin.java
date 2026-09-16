package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.class)
public class ClientboundSetPlayerTeamPacket1831069943Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__57776959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-57776959L))
            info.setReturnValue("\u79EAYzP\u80DBr9{'^<TZ*]R<mu)zm#}e>YQj?u'kTS]\u1325/Q>p=\"$$L\u645F&-OP");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1986937533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1986937533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParameters()Ljava/util/Optional;", cancellable = true)
    private void getParameters__1140444027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140444027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_239592349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(239592349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1535358080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1535358080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerAction()Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;", cancellable = true)
    private void getPlayerAction_1305216900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1305216900L))
            info.setReturnValue(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Action.REMOVE);
    }

    @Inject(at = @At("HEAD"), method = "getTeamAction()Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;", cancellable = true)
    private void getTeamAction__1943719928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943719928L))
            info.setReturnValue(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Action.ADD);
    }

    @Inject(at = @At("HEAD"), method = "getPlayers()Ljava/util/Collection;", cancellable = true)
    private void getPlayers_1526575075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1526575075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPlayerPacket(Lnet/minecraft/world/scores/PlayerTeam;Ljava/lang/String;Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;)Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket;", cancellable = true)
    private static void createPlayerPacket_1933139275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933139275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRemovePacket(Lnet/minecraft/world/scores/PlayerTeam;)Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket;", cancellable = true)
    private static void createRemovePacket__958309335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958309335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAddOrModifyPacket(Lnet/minecraft/world/scores/PlayerTeam;Z)Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket;", cancellable = true)
    private static void createAddOrModifyPacket_1111038313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111038313L))
            info.setReturnValue(null);
    }


}
