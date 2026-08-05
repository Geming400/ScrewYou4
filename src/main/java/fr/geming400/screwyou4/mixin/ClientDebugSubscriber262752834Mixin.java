package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientDebugSubscriber.class)
public class ClientDebugSubscriber262752834Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_301027573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(301027573L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(J)V", cancellable = true)
    private void tick_1477593327(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1477593327L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropEntity__188971826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-188971826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropLevel()V", cancellable = true)
    private void dropLevel_301027573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(301027573L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushEvent(JLnet/minecraft/util/debug/DebugSubscription$Event;)V", cancellable = true)
    private void pushEvent_226617197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(226617197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateChunk(JLnet/minecraft/world/level/ChunkPos;Lnet/minecraft/util/debug/DebugSubscription$Update;)V", cancellable = true)
    private void updateChunk__462650988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-462650988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateEntity(JLnet/minecraft/world/entity/Entity;Lnet/minecraft/util/debug/DebugSubscription$Update;)V", cancellable = true)
    private void updateEntity_1095788603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1095788603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropChunk(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void dropChunk_1777635041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1777635041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateBlock(JLnet/minecraft/core/BlockPos;Lnet/minecraft/util/debug/DebugSubscription$Update;)V", cancellable = true)
    private void updateBlock__199977504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-199977504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDebugValueAccess(Lnet/minecraft/world/level/Level;)Lnet/minecraft/util/debug/DebugValueAccess;", cancellable = true)
    private void createDebugValueAccess__993891234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993891234L))
            info.setReturnValue(null);
    }


}
