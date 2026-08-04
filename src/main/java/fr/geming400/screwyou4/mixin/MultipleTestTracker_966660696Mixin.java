package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.MultipleTestTracker.class)
public class MultipleTestTracker_966660696Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void remove__1338467225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1338467225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__168799776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168799776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDone()Z", cancellable = true)
    private void isDone_1004939278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004939278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addListener(Lnet/minecraft/gametest/framework/GameTestListener;)V", cancellable = true)
    private void addListener_798045217(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(798045217L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProgressBar()Ljava/lang/String;", cancellable = true)
    private void getProgressBar__168799776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168799776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTotalCount()I", cancellable = true)
    private void getTotalCount_1004922941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004922941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFailedRequired()Z", cancellable = true)
    private void hasFailedRequired_1004939278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004939278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFailedRequiredCount()I", cancellable = true)
    private void getFailedRequiredCount_1004922941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004922941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTestToTrack(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void addTestToTrack__1338467225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1338467225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFailedOptionalCount()I", cancellable = true)
    private void getFailedOptionalCount_1004922941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004922941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFailedRequired()Ljava/util/Collection;", cancellable = true)
    private void getFailedRequired__846987577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-846987577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFailureListener(Ljava/util/function/Consumer;)V", cancellable = true)
    private void addFailureListener_1647677108(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1647677108L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDoneCount()I", cancellable = true)
    private void getDoneCount_1004922941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004922941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFailedOptional()Z", cancellable = true)
    private void hasFailedOptional_1004939278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004939278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFailedOptional()Ljava/util/Collection;", cancellable = true)
    private void getFailedOptional__846987577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-846987577L))
            info.setReturnValue(null);
    }


}
