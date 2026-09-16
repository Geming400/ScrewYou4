package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.MultipleTestTracker.class)
public class MultipleTestTracker_966660696Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void remove_1975196395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1975196395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1737083724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737083724L))
            info.setReturnValue("{%TV\uBFA9\uB8B8\u08A9-b\u22C7r&E<)xKL}(xv[rdHo\u8289)nP?/fRZvqQ)CZ\u82FEO1\" ;i3.*r&evDSd\"?w2C#4\u908F? )f&\"o");
    }

    @Inject(at = @At("HEAD"), method = "isDone()Z", cancellable = true)
    private void isDone__557307966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557307966L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addListener(Lnet/minecraft/gametest/framework/GameTestListener;)V", cancellable = true)
    private void addListener__1336688234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1336688234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTestToTrack(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void addTestToTrack__880096476(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-880096476L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFailedOptional()Ljava/util/Collection;", cancellable = true)
    private void getFailedOptional__1772980038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772980038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDoneCount()I", cancellable = true)
    private void getDoneCount_271432358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271432358L))
            info.setReturnValue(-1957476194);
    }

    @Inject(at = @At("HEAD"), method = "getProgressBar()Ljava/lang/String;", cancellable = true)
    private void getProgressBar__405841072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-405841072L))
            info.setReturnValue("IiLlJR+{qfX\u2C4A0\u11DE.qOUc1oRh\"\u8814y-\u15F6D\uD177`Aw%\uCB22[B@J'T/#2$j8{\u2D8D{oz\u1EF2W5#8XYL(i@7\u5EB9#Xcp*2L}rOs>]_:u\u3B57c\uA569X\u18BEyn1g;2");
    }

    @Inject(at = @At("HEAD"), method = "getFailedRequiredCount()I", cancellable = true)
    private void getFailedRequiredCount__721853920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721853920L))
            info.setReturnValue(1694453450);
    }

    @Inject(at = @At("HEAD"), method = "hasFailedRequired()Z", cancellable = true)
    private void hasFailedRequired__997426792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997426792L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFailedOptionalCount()I", cancellable = true)
    private void getFailedOptionalCount__2038266719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2038266719L))
            info.setReturnValue(1323221403);
    }

    @Inject(at = @At("HEAD"), method = "addFailureListener(Ljava/util/function/Consumer;)V", cancellable = true)
    private void addFailureListener_1077012721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1077012721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTotalCount()I", cancellable = true)
    private void getTotalCount__927585092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-927585092L))
            info.setReturnValue(866271060);
    }

    @Inject(at = @At("HEAD"), method = "getFailedRequired()Ljava/util/Collection;", cancellable = true)
    private void getFailedRequired__508266439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508266439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFailedOptional()Z", cancellable = true)
    private void hasFailedOptional__1392113033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1392113033L))
            info.setReturnValue(false);
    }


}
