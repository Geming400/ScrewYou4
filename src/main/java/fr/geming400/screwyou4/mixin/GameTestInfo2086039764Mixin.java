package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestInfo.class)
public class GameTestInfo2086039764Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_950579293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950579293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__357026789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357026789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDone()Z", cancellable = true)
    private void isDone_2124318347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124318347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fail(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void fail_184860827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(184860827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fail(Lnet/minecraft/gametest/framework/GameTestException;)V", cancellable = true)
    private void fail_777782643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(777782643L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void tick_33518498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(33518498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel__1541389532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1541389532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation_587718406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587718406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListeners()Ljava/util/stream/Stream;", cancellable = true)
    private void getListeners_1875333449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875333449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addListener(Lnet/minecraft/gametest/framework/GameTestListener;)V", cancellable = true)
    private void addListener_1917424286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1917424286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSequence()Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void createSequence_1896257259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896257259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRequired()Z", cancellable = true)
    private void isRequired_2124318347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124318347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRunAtTickTime(JLjava/lang/Runnable;)V", cancellable = true)
    private void setRunAtTickTime__1417034497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1417034497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTestOrigin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getTestOrigin_192652885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(192652885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTimeoutTicks()I", cancellable = true)
    private void getTimeoutTicks_2124302010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124302010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestBlockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getTestBlockPos_192652885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(192652885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeStructure()V", cancellable = true)
    private void placeStructure_2124314503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2124314503L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startExecution(I)Lnet/minecraft/gametest/framework/GameTestInfo;", cancellable = true)
    private void startExecution_1902801687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902801687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retryOptions()Lnet/minecraft/gametest/framework/RetryOptions;", cancellable = true)
    private void retryOptions_1224894330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224894330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestInstanceBlockEntity()Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity;", cancellable = true)
    private void getTestInstanceBlockEntity_1257201735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1257201735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTestBlockPos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setTestBlockPos__2040160933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2040160933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareTestStructure()Lnet/minecraft/gametest/framework/GameTestInfo;", cancellable = true)
    private void prepareTestStructure__1834779042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1834779042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSucceeded()Z", cancellable = true)
    private void hasSucceeded_2124318347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124318347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestHolder()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void getTestHolder_897693737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(897693737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxAttempts()I", cancellable = true)
    private void maxAttempts_2124302010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124302010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredSuccesses()I", cancellable = true)
    private void requiredSuccesses_2124302010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124302010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureBounds()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getStructureBounds_665382412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665382412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getError()Lnet/minecraft/gametest/framework/GameTestException;", cancellable = true)
    private void getError__578233217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578233217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTest()Lnet/minecraft/gametest/framework/GameTestInstance;", cancellable = true)
    private void getTest_599480727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599480727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "succeed()V", cancellable = true)
    private void succeed_2124314503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2124314503L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasFailed()Z", cancellable = true)
    private void hasFailed_2124318347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124318347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasStarted()Z", cancellable = true)
    private void hasStarted_2124318347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124318347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRunTime()J", cancellable = true)
    private void getRunTime_2124302971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124302971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFlaky()Z", cancellable = true)
    private void isFlaky_2124318347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124318347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyReset()Lnet/minecraft/gametest/framework/GameTestInfo;", cancellable = true)
    private void copyReset__1834779042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1834779042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTick()I", cancellable = true)
    private void getTick_2124302010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124302010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOptional()Z", cancellable = true)
    private void isOptional_2124318347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124318347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructure()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getStructure__357026789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357026789L))
            info.setReturnValue(null);
    }


}
