package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.DownloadedPackSource.class)
public class DownloadedPackSource_268981937Mixin {
        @Inject(at = @At("HEAD"), method = "popAll()V", cancellable = true)
    private void popAll_307256675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307256675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_307256675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307256675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "configureForServerControl(Lnet/minecraft/network/Connection;Lnet/minecraft/client/resources/server/ServerPackManager$PackPromptStatus;)V", cancellable = true)
    private void configureForServerControl__1946343110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1946343110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rejectServerPacks()V", cancellable = true)
    private void rejectServerPacks_307256675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307256675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allowServerPacks()V", cancellable = true)
    private void allowServerPacks_307256675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307256675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRecovery()V", cancellable = true)
    private void onRecovery_307256675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307256675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "waitForPackFeedback(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void waitForPackFeedback_2047975033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047975033L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "pushLocalPack(Ljava/util/UUID;Ljava/nio/file/Path;)V", cancellable = true)
    private void pushLocalPack_1927446166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1927446166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "configureForLocalWorld()V", cancellable = true)
    private void configureForLocalWorld_307256675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307256675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushPack(Ljava/util/UUID;Ljava/net/URL;Ljava/lang/String;)V", cancellable = true)
    private void pushPack_762723968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(762723968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPack(Ljava/util/UUID;)V", cancellable = true)
    private void popPack__88574153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-88574153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cleanupAfterDisconnect()V", cancellable = true)
    private void cleanupAfterDisconnect_307256675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307256675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRecoveryFailure()V", cancellable = true)
    private void onRecoveryFailure_307256675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307256675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onReloadSuccess()V", cancellable = true)
    private void onReloadSuccess_307256675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307256675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRepositorySource()Lnet/minecraft/server/packs/repository/RepositorySource;", cancellable = true)
    private void createRepositorySource_776449345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776449345L))
            info.setReturnValue(null);
    }


}
