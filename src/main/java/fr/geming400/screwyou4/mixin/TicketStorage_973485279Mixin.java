package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.TicketStorage.class)
public class TicketStorage_973485279Mixin {
        @Inject(at = @At("HEAD"), method = "addTicketWithRadius(Lnet/minecraft/server/level/TicketType;Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void addTicketWithRadius_1023580587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1023580587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "activateAllDeactivatedTickets()V", cancellable = true)
    private void activateAllDeactivatedTickets__225224692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-225224692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateChunkForced(Lnet/minecraft/world/level/ChunkPos;Z)Z", cancellable = true)
    private void updateChunkForced_1358096656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1358096656L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getForceLoadedChunks()Lit/unimi/dsi/fastutil/longs/LongSet;", cancellable = true)
    private void getForceLoadedChunks__1372426711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372426711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldKeepDimensionActive()Z", cancellable = true)
    private void shouldKeepDimensionActive_921614849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921614849L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "deactivateTicketsOnClosing()V", cancellable = true)
    private void deactivateTicketsOnClosing_383993390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(383993390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeTicketIf(Lnet/minecraft/world/level/TicketStorage$TicketPredicate;Lit/unimi/dsi/fastutil/longs/Long2ObjectOpenHashMap;)V", cancellable = true)
    private void removeTicketIf_1734853326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1734853326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicketDebugString(JZ)Ljava/lang/String;", cancellable = true)
    private void getTicketDebugString__315900423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315900423L))
            info.setReturnValue("\uBB7B4{Rrq\u5979{LZ{bTS\u8C5ET#'XBv5J{\u80AE\u366FKg_!\u6FB5E\u43DF4KPc!o7");
    }

    @Inject(at = @At("HEAD"), method = "removeTicket(Lnet/minecraft/server/level/Ticket;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void removeTicket_1126810933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1126810933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeTicket(JLnet/minecraft/server/level/Ticket;)Z", cancellable = true)
    private void removeTicket__1981840205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981840205L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "replaceTicketLevelOfType(ILnet/minecraft/server/level/TicketType;)V", cancellable = true)
    private void replaceTicketLevelOfType__1648677583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1648677583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicketLevelAt(JZ)I", cancellable = true)
    private void getTicketLevelAt__1463890433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463890433L))
            info.setReturnValue(1057986425);
    }

    @Inject(at = @At("HEAD"), method = "purgeStaleTickets(Lnet/minecraft/server/level/ChunkMap;)V", cancellable = true)
    private void purgeStaleTickets_1294300591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1294300591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeTicketWithRadius(Lnet/minecraft/server/level/TicketType;Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void removeTicketWithRadius_1066236456(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1066236456L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSimulationChunkUpdatedListener(Lnet/minecraft/world/level/TicketStorage$ChunkUpdated;)V", cancellable = true)
    private void setSimulationChunkUpdatedListener__1294463914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294463914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLoadingChunkUpdatedListener(Lnet/minecraft/world/level/TicketStorage$ChunkUpdated;)V", cancellable = true)
    private void setLoadingChunkUpdatedListener__1058339387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1058339387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasTickets()Z", cancellable = true)
    private void hasTickets_953572296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953572296L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTickets(J)Ljava/util/List;", cancellable = true)
    private void getTickets__1282273853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282273853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTicket(Lnet/minecraft/server/level/Ticket;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void addTicket_1866985490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1866985490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTicket(JLnet/minecraft/server/level/Ticket;)Z", cancellable = true)
    private void addTicket_1682791158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682791158L))
            info.setReturnValue(false);
    }


}
