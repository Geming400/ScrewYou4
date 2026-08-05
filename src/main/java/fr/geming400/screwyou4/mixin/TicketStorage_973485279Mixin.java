package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.TicketStorage.class)
public class TicketStorage_973485279Mixin {
        @Inject(at = @At("HEAD"), method = "getTicketDebugString(JZ)Ljava/lang/String;", cancellable = true)
    private void getTicketDebugString_252413719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(252413719L))
            info.setReturnValue("㫢|s\"ϠNa)Hs(7Y9`N]^ eHg7sZPt-#sNA");
    }

    @Inject(at = @At("HEAD"), method = "getTicketLevelAt(JZ)I", cancellable = true)
    private void getTicketLevelAt_21922324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21922324L))
            info.setReturnValue(1034339269);
    }

    @Inject(at = @At("HEAD"), method = "removeTicket(Lnet/minecraft/server/level/Ticket;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void removeTicket__1069027195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069027195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeTicket(JLnet/minecraft/server/level/Ticket;)Z", cancellable = true)
    private void removeTicket__1101505693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101505693L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "replaceTicketLevelOfType(ILnet/minecraft/server/level/TicketType;)V", cancellable = true)
    private void replaceTicketLevelOfType_1680364134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1680364134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "purgeStaleTickets(Lnet/minecraft/server/level/ChunkMap;)V", cancellable = true)
    private void purgeStaleTickets__1852433514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1852433514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeTicketWithRadius(Lnet/minecraft/server/level/TicketType;Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void removeTicketWithRadius__1694438672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1694438672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLoadingChunkUpdatedListener(Lnet/minecraft/world/level/TicketStorage$ChunkUpdated;)V", cancellable = true)
    private void setLoadingChunkUpdatedListener__774505151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-774505151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSimulationChunkUpdatedListener(Lnet/minecraft/world/level/TicketStorage$ChunkUpdated;)V", cancellable = true)
    private void setSimulationChunkUpdatedListener__774505151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-774505151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "activateAllDeactivatedTickets()V", cancellable = true)
    private void activateAllDeactivatedTickets_1011760017(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1011760017L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldKeepDimensionActive()Z", cancellable = true)
    private void shouldKeepDimensionActive_1011763861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011763861L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getForceLoadedChunks()Lit/unimi/dsi/fastutil/longs/LongSet;", cancellable = true)
    private void getForceLoadedChunks_908599305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908599305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateChunkForced(Lnet/minecraft/world/level/ChunkPos;Z)Z", cancellable = true)
    private void updateChunkForced_733297203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733297203L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addTicketWithRadius(Lnet/minecraft/server/level/TicketType;Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void addTicketWithRadius__1694438672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1694438672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasTickets()Z", cancellable = true)
    private void hasTickets_1011763861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011763861L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addTicket(JLnet/minecraft/server/level/Ticket;)Z", cancellable = true)
    private void addTicket__1101505693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101505693L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addTicket(Lnet/minecraft/server/level/Ticket;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void addTicket__1069027195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069027195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTickets(J)Ljava/util/List;", cancellable = true)
    private void getTickets_1448802260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448802260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeTicketIf(Lnet/minecraft/world/level/TicketStorage$TicketPredicate;Lit/unimi/dsi/fastutil/longs/Long2ObjectOpenHashMap;)V", cancellable = true)
    private void removeTicketIf_869852705(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(869852705L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deactivateTicketsOnClosing()V", cancellable = true)
    private void deactivateTicketsOnClosing_1011760017(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1011760017L))
            info.cancel();
    }


}
