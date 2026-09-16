package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.ServerPackManager.class)
public class ServerPackManager1276251203Mixin {
        @Inject(at = @At("HEAD"), method = "popAll()V", cancellable = true)
    private void popAll__1513510042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1513510042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1146567545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1146567545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushPack(Ljava/util/UUID;Ljava/net/URL;Lcom/google/common/hash/HashCode;)V", cancellable = true)
    private void pushPack_846728333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(846728333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPack(Ljava/util/UUID;)V", cancellable = true)
    private void popPack__231571712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-231571712L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allowServerPacks()V", cancellable = true)
    private void allowServerPacks_1309562568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1309562568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetPromptStatus()V", cancellable = true)
    private void resetPromptStatus_982400177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(982400177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rejectServerPacks()V", cancellable = true)
    private void rejectServerPacks__801195234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-801195234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushLocalPack(Ljava/util/UUID;Ljava/nio/file/Path;)V", cancellable = true)
    private void pushLocalPack_1126159679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1126159679L))
            info.cancel();
    }


}
