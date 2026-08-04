package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.ServerPackManager.class)
public class ServerPackManager1276251203Mixin {
        @Inject(at = @At("HEAD"), method = "popAll()V", cancellable = true)
    private void popAll_1314525942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314525942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1314525942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314525942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushLocalPack(Ljava/util/UUID;Ljava/nio/file/Path;)V", cancellable = true)
    private void pushLocalPack__1360251863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1360251863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushPack(Ljava/util/UUID;Ljava/net/URL;Lcom/google/common/hash/HashCode;)V", cancellable = true)
    private void pushPack_1163992506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1163992506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPack(Ljava/util/UUID;)V", cancellable = true)
    private void popPack_918695114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(918695114L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allowServerPacks()V", cancellable = true)
    private void allowServerPacks_1314525942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314525942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetPromptStatus()V", cancellable = true)
    private void resetPromptStatus_1314525942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314525942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rejectServerPacks()V", cancellable = true)
    private void rejectServerPacks_1314525942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314525942L))
            info.cancel();
    }


}
