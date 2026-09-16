package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestInfo.class)
public class GameTestInfo2086039764Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1438504503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1438504503L))
            info.setReturnValue("H#\u04CDX\u33C4g,'@dyy\u3E33\u879A4cGky`\u2F9A@\"\u09AE&9A\u3C94p\u9FE3[dv2_?UnO]5DH-\u80B6Y\"DU\u8A1713&}CeEn\u4892E^W)$E(!");
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__506738122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506738122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDone()Z", cancellable = true)
    private void isDone_562071103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562071103L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fail(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void fail__945233219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-945233219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fail(Lnet/minecraft/gametest/framework/GameTestException;)V", cancellable = true)
    private void fail_255902741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(255902741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void tick_90656127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(90656127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_1964935154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964935154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestOrigin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getTestOrigin_1861567943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861567943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTimeoutTicks()I", cancellable = true)
    private void getTimeoutTicks__1377523313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377523313L))
            info.setReturnValue(-329419281);
    }

    @Inject(at = @At("HEAD"), method = "setRunAtTickTime(JLjava/lang/Runnable;)V", cancellable = true)
    private void setRunAtTickTime__998621051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-998621051L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTestBlockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getTestBlockPos_236454022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236454022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareTestStructure()Lnet/minecraft/gametest/framework/GameTestInfo;", cancellable = true)
    private void prepareTestStructure_1560593636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560593636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retryOptions()Lnet/minecraft/gametest/framework/RetryOptions;", cancellable = true)
    private void retryOptions_1410106596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1410106596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSucceeded()Z", cancellable = true)
    private void hasSucceeded__506600956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506600956L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startExecution(I)Lnet/minecraft/gametest/framework/GameTestInfo;", cancellable = true)
    private void startExecution__1117583123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117583123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestInstanceBlockEntity()Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity;", cancellable = true)
    private void getTestInstanceBlockEntity__1562222694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1562222694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListeners()Ljava/util/stream/Stream;", cancellable = true)
    private void getListeners__957299104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957299104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addListener(Lnet/minecraft/gametest/framework/GameTestListener;)V", cancellable = true)
    private void addListener__217309165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-217309165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSequence()Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void createSequence_486957422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486957422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeStructure()V", cancellable = true)
    private void placeStructure__903444773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-903444773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStructureBounds()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getStructureBounds__1148449542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148449542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestHolder()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void getTestHolder_1146369493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1146369493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTestBlockPos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setTestBlockPos__775437994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-775437994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation_1191354618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1191354618L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.COUNTERCLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "requiredSuccesses()I", cancellable = true)
    private void requiredSuccesses_1399780072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399780072L))
            info.setReturnValue(-1024103042);
    }

    @Inject(at = @At("HEAD"), method = "maxAttempts()I", cancellable = true)
    private void maxAttempts__1435973584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435973584L))
            info.setReturnValue(257478587);
    }

    @Inject(at = @At("HEAD"), method = "succeed()V", cancellable = true)
    private void succeed_1411371653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1411371653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTest()Lnet/minecraft/gametest/framework/GameTestInstance;", cancellable = true)
    private void getTest__1773558897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773558897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTick()I", cancellable = true)
    private void getTick_1946738823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946738823L))
            info.setReturnValue(-1612711147);
    }

    @Inject(at = @At("HEAD"), method = "getStructure()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getStructure_1301058008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301058008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRequired()Z", cancellable = true)
    private void isRequired_966925634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966925634L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOptional()Z", cancellable = true)
    private void isOptional_572239393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572239393L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getError()Lnet/minecraft/gametest/framework/GameTestException;", cancellable = true)
    private void getError_831403729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831403729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFailed()Z", cancellable = true)
    private void hasFailed__2012061324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2012061324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasStarted()Z", cancellable = true)
    private void hasStarted__508543388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508543388L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRunTime()J", cancellable = true)
    private void getRunTime__990817287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990817287L))
            info.setReturnValue(1419069535571454213L);
    }

    @Inject(at = @At("HEAD"), method = "isFlaky()Z", cancellable = true)
    private void isFlaky_691180012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(691180012L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "copyReset()Lnet/minecraft/gametest/framework/GameTestInfo;", cancellable = true)
    private void copyReset_2046121284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046121284L))
            info.setReturnValue(null);
    }


}
