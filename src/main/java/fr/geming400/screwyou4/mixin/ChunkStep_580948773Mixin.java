package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkStep.class)
public class ChunkStep_580948773Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1966461031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1966461031L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__554511203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554511203L))
            info.setReturnValue("`Kq9愌&⼐8I\"CkP/iN}HD3wnyX碼폝^YbfL敱KL#,uo\"?pk]RY}祆^J㝷gu;_.XmMW2$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_619211514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619211514L))
            info.setReturnValue(-1289206797);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/chunk/status/WorldGenContext;Lnet/minecraft/util/StaticCache2D;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void apply__907869732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907869732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "task()Lnet/minecraft/world/level/chunk/status/ChunkStatusTask;", cancellable = true)
    private void task_381924173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381924173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAccumulatedRadiusOf(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)I", cancellable = true)
    private void getAccumulatedRadiusOf__735670023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735670023L))
            info.setReturnValue(-1636609107);
    }

    @Inject(at = @At("HEAD"), method = "accumulatedDependencies()Lnet/minecraft/world/level/chunk/status/ChunkDependencies;", cancellable = true)
    private void accumulatedDependencies_206952379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206952379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directDependencies()Lnet/minecraft/world/level/chunk/status/ChunkDependencies;", cancellable = true)
    private void directDependencies_206952379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206952379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStateWriteRadius()I", cancellable = true)
    private void blockStateWriteRadius_619211018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619211018L))
            info.setReturnValue(-1012187589);
    }

    @Inject(at = @At("HEAD"), method = "targetStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void targetStatus_598228370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598228370L))
            info.setReturnValue(null);
    }


}
