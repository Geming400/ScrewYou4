package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLoginPacket.class)
public class ClientboundLoginPacket_2025368176Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2113731531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113731531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1116741907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116741907L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1499175596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1499175596L))
            info.setReturnValue("K\uD380)g^nOp6:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1712247030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1712247030L))
            info.setReturnValue(1266142709);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1729656312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1729656312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_433890581(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(433890581L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/Set;", cancellable = true)
    private void levels__527709502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527709502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enforcesSecureChat()Z", cancellable = true)
    private void enforcesSecureChat_1155439878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155439878L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showDeathScreen()Z", cancellable = true)
    private void showDeathScreen_1382919491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1382919491L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "commonPlayerSpawnInfo()Lnet/minecraft/network/protocol/game/CommonPlayerSpawnInfo;", cancellable = true)
    private void commonPlayerSpawnInfo__546376748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-546376748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reducedDebugInfo()Z", cancellable = true)
    private void reducedDebugInfo_222178947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222178947L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "simulationDistance()I", cancellable = true)
    private void simulationDistance__1822592327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822592327L))
            info.setReturnValue(-2060684766);
    }

    @Inject(at = @At("HEAD"), method = "maxPlayers()I", cancellable = true)
    private void maxPlayers_1252458855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252458855L))
            info.setReturnValue(805619068);
    }

    @Inject(at = @At("HEAD"), method = "chunkRadius()I", cancellable = true)
    private void chunkRadius__568799658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568799658L))
            info.setReturnValue(508545758);
    }

    @Inject(at = @At("HEAD"), method = "doLimitedCrafting()Z", cancellable = true)
    private void doLimitedCrafting_385014101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(385014101L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hardcore()Z", cancellable = true)
    private void hardcore__1593044132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593044132L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onlineMode()Z", cancellable = true)
    private void onlineMode__1705841840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1705841840L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playerId()I", cancellable = true)
    private void playerId_1983158777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983158777L))
            info.setReturnValue(454697373);
    }


}
