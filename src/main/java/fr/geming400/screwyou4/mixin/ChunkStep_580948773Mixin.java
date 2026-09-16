package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkStep.class)
public class ChunkStep_580948773Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__327677496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327677496L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1351372297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1351372297L))
            info.setReturnValue(" N,X)I\u2B01m\u5E1E\uA86E,W}uA'\u3EE0\u573Bb4PwRf'|) I2+]H(QrwE6$\u99CB>\u794DIt30u_}>$|`,b4J`C8e1R,MN-?6\u7B96\uFD44[Hy\uFE76+l@Xr<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1138300863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138300863L))
            info.setReturnValue(-1777922582);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void apply_1125766062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1125766062L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "task()Lnet/minecraft/world/level/chunk/status/ChunkStatusTask;", cancellable = true)
    private void task_726715218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726715218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAccumulatedRadiusOf(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)I", cancellable = true)
    private void getAccumulatedRadiusOf__1477576092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477576092L))
            info.setReturnValue(800770061);
    }

    @Inject(at = @At("HEAD"), method = "accumulatedDependencies()Lnet/minecraft/world/level/chunk/status/ChunkDependencies;", cancellable = true)
    private void accumulatedDependencies_354700294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354700294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStateWriteRadius()I", cancellable = true)
    private void blockStateWriteRadius__785603971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-785603971L))
            info.setReturnValue(1443868123);
    }

    @Inject(at = @At("HEAD"), method = "directDependencies()Lnet/minecraft/world/level/chunk/status/ChunkDependencies;", cancellable = true)
    private void directDependencies_1580590061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580590061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void targetStatus__980929163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980929163L))
            info.setReturnValue(null);
    }


}
