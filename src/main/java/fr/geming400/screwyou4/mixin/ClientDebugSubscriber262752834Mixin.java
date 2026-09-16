package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientDebugSubscriber.class)
public class ClientDebugSubscriber262752834Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__523074872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-523074872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(J)V", cancellable = true)
    private void tick_565850316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(565850316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateEntity(JLnet/minecraft/world/entity/Entity;Lnet/minecraft/util/debug/DebugSubscription$Update;)V", cancellable = true)
    private void updateEntity__1931129785(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1931129785L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropChunk(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void dropChunk_450690019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(450690019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateChunk(JLnet/minecraft/world/level/ChunkPos;Lnet/minecraft/util/debug/DebugSubscription$Update;)V", cancellable = true)
    private void updateChunk_1366824176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1366824176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateBlock(JLnet/minecraft/core/BlockPos;Lnet/minecraft/util/debug/DebugSubscription$Update;)V", cancellable = true)
    private void updateBlock_559422500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(559422500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropLevel()V", cancellable = true)
    private void dropLevel_2059056192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2059056192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropEntity_896023168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(896023168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushEvent(JLnet/minecraft/util/debug/DebugSubscription$Event;)V", cancellable = true)
    private void pushEvent__1433093363(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1433093363L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDebugValueAccess(Lnet/minecraft/world/level/Level;)Lnet/minecraft/util/debug/DebugValueAccess;", cancellable = true)
    private void createDebugValueAccess_1267382108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1267382108L))
            info.setReturnValue(null);
    }


}
