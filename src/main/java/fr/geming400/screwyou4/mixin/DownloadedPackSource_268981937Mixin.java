package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.DownloadedPackSource.class)
public class DownloadedPackSource_268981937Mixin {
        @Inject(at = @At("HEAD"), method = "popAll()V", cancellable = true)
    private void popAll_1774187987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1774187987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1845593493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1845593493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allowServerPacks()V", cancellable = true)
    private void allowServerPacks_302293301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(302293301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rejectServerPacks()V", cancellable = true)
    private void rejectServerPacks__1808464501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1808464501L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "configureForServerControl(Lnet/minecraft/network/Connection;Lnet/minecraft/client/resources/server/ServerPackManager$PackPromptStatus;)V", cancellable = true)
    private void configureForServerControl__2013807421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2013807421L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "configureForLocalWorld()V", cancellable = true)
    private void configureForLocalWorld_646885465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(646885465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "waitForPackFeedback(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void waitForPackFeedback_473549163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473549163L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "pushLocalPack(Ljava/util/UUID;Ljava/nio/file/Path;)V", cancellable = true)
    private void pushLocalPack_118890412(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(118890412L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cleanupAfterDisconnect()V", cancellable = true)
    private void cleanupAfterDisconnect__1255762545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1255762545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRecoveryFailure()V", cancellable = true)
    private void onRecoveryFailure__626505011(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-626505011L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onReloadSuccess()V", cancellable = true)
    private void onReloadSuccess_1741852600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1741852600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRecovery()V", cancellable = true)
    private void onRecovery__1250281649(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1250281649L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRepositorySource()Lnet/minecraft/server/packs/repository/RepositorySource;", cancellable = true)
    private void createRepositorySource_1936284386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936284386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushPack(Ljava/util/UUID;Ljava/net/URL;Ljava/lang/String;)V", cancellable = true)
    private void pushPack_1536680973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1536680973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPack(Ljava/util/UUID;)V", cancellable = true)
    private void popPack__1238840979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1238840979L))
            info.cancel();
    }


}
