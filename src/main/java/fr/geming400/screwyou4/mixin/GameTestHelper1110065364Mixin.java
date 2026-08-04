package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestHelper.class)
public class GameTestHelper1110065364Mixin {
        @Inject(at = @At("HEAD"), method = "getBounds()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getBounds__310591988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310591988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fail(Ljava/lang/String;)V", cancellable = true)
    private void fail__2032540783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2032540783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fail(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void fail__791113573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-791113573L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fail(Lnet/minecraft/network/chat/Component;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void fail__335467321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-335467321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fail(Lnet/minecraft/network/chat/Component;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void fail__1390741044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1390741044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTime(J)V", cancellable = true)
    private void setTime__1970061439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1970061439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_1777603364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777603364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "kill(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void kill_658340704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(658340704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/entity/EntityType;)Ljava/util/List;", cancellable = true)
    private void getEntities_637989733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(637989733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;D)Ljava/util/List;", cancellable = true)
    private void getEntities__1481727995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481727995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discard(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void discard_658340704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(658340704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;DDDLnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawn_274556954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274556954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_1462707901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462707901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn__1313776971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313776971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;FFF)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_186817457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186817457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;III)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_291493140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291493140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;I)Ljava/util/List;", cancellable = true)
    private void spawn_769118176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769118176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_744599439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744599439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;", cancellable = true)
    private void spawn__537541672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537541672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_1763153287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763153287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;Ljava/lang/Class;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_265015905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265015905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_1508691310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508691310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlock__1408644214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1408644214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void setBlock_737666951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(737666951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void setBlock__1287534469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1287534469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(IIILnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlock__1574957105(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1574957105L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(IIILnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void setBlock_1523285334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1523285334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void setBlock__1967364522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1967364522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "absolutePos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void absolutePos__1161406935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161406935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "destroyBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void destroyBlock_1278831963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278831963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "relativePos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relativePos__1161406935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161406935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTick()J", cancellable = true)
    private void getTick_1148328571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148328571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/levelgen/Heightmap$Types;II)I", cancellable = true)
    private void getHeight_1905652390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905652390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveTo(Lnet/minecraft/world/entity/Mob;FFF)V", cancellable = true)
    private void moveTo__744760941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-744760941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveTo(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void moveTo__1062086807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1062086807L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveTo(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void moveTo_252726449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(252726449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurt(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void hurt__454700899(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-454700899L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "absoluteAABB(Lnet/minecraft/world/phys/AABB;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void absoluteAABB_723814999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723814999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findEntities(Lnet/minecraft/world/entity/EntityType;IIID)Ljava/util/List;", cancellable = true)
    private void findEntities_1899138250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899138250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findEntities(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;", cancellable = true)
    private void findEntities_1506579453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506579453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEveryBlockInStructure(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEveryBlockInStructure_1791081777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1791081777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pressButton(III)V", cancellable = true)
    private void pressButton_329972960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(329972960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pressButton(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void pressButton_1278831963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278831963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertionException(Lnet/minecraft/core/BlockPos;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/gametest/framework/GameTestAssertPosException;", cancellable = true)
    private void assertionException__465918701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-465918701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertionException(Lnet/minecraft/core/BlockPos;Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/gametest/framework/GameTestAssertPosException;", cancellable = true)
    private void assertionException_1768376308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768376308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertionException(Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/gametest/framework/GameTestAssertException;", cancellable = true)
    private void assertionException_429529128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429529128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertionException(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/gametest/framework/GameTestAssertException;", cancellable = true)
    private void assertionException__915680367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-915680367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnEntity(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void spawnEntity_918444649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918444649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnEntity(Lnet/minecraft/world/entity/EntityType;FFF)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void spawnEntity_233026175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(233026175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnEntity(Lnet/minecraft/world/entity/EntityType;III)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void spawnEntity_202065148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202065148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnEntity(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void spawnEntity_248927585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248927585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startSequence()Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void startSequence_920282859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920282859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertBlockTag(Lnet/minecraft/tags/TagKey;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertBlockTag_734518571(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(734518571L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runAfterDelay(JLjava/lang/Runnable;)V", cancellable = true)
    private void runAfterDelay_1901958399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1901958399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findClosestEntity(Lnet/minecraft/world/entity/EntityType;IIID)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void findClosestEntity_740372692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740372692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getTestRotation__388255994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-388255994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertBlockPresent(Lnet/minecraft/world/level/block/Block;III)V", cancellable = true)
    private void assertBlockPresent__1964914024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1964914024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockPresent(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void assertBlockPresent__464710449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-464710449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockPresent(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertBlockPresent__1466039021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1466039021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "absoluteVec(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void absoluteVec__1495246887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495246887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnWithNoFreeWill(Lnet/minecraft/world/entity/EntityType;FFF)Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawnWithNoFreeWill_389212550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389212550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnWithNoFreeWill(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawnWithNoFreeWill_1344679792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344679792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnWithNoFreeWill(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawnWithNoFreeWill_620335720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(620335720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnWithNoFreeWill(Lnet/minecraft/world/entity/EntityType;III)Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawnWithNoFreeWill__757079293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757079293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeMockPlayer(Lnet/minecraft/world/level/GameType;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void makeMockPlayer__81403769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81403769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAbsoluteDirection(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void getAbsoluteDirection__1116599597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116599597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRelativeBounds()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getRelativeBounds__310591988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310591988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertBlockNotPresent(Lnet/minecraft/world/level/block/Block;III)V", cancellable = true)
    private void assertBlockNotPresent__1964914024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1964914024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockNotPresent(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertBlockNotPresent__1466039021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1466039021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenBlockPresent(Lnet/minecraft/world/level/block/Block;III)V", cancellable = true)
    private void succeedWhenBlockPresent__1964914024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1964914024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenBlockPresent(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void succeedWhenBlockPresent__1466039021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1466039021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhen(Ljava/lang/Runnable;)V", cancellable = true)
    private void succeedWhen__1728160251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1728160251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockState(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;Ljava/util/function/Function;)V", cancellable = true)
    private void assertBlockState_1867335436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1867335436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void assertBlockState__1408644214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1408644214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlock(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;Ljava/util/function/Function;)V", cancellable = true)
    private void assertBlock_1867335436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1867335436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "killAllEntitiesOfClass(Ljava/lang/Class;)V", cancellable = true)
    private void killAllEntitiesOfClass_1009889210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1009889210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "relativeVec(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void relativeVec__1495246887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495246887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertEntitiesPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;ID)V", cancellable = true)
    private void assertEntitiesPresent_39765079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39765079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntitiesPresent(Lnet/minecraft/world/entity/EntityType;I)V", cancellable = true)
    private void assertEntitiesPresent__1261389279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1261389279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "relativeAABB(Lnet/minecraft/world/phys/AABB;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void relativeAABB_723814999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723814999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertEntityNotPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertEntityNotPresent_1268937724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268937724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityNotPresent(Lnet/minecraft/world/entity/EntityType;III)V", cancellable = true)
    private void assertEntityNotPresent__648377663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-648377663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityNotPresent(Lnet/minecraft/world/entity/EntityType;)V", cancellable = true)
    private void assertEntityNotPresent_894135622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(894135622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityNotPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/AABB;)V", cancellable = true)
    private void assertEntityNotPresent__1543832717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1543832717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pulseRedstone(Lnet/minecraft/core/BlockPos;J)V", cancellable = true)
    private void pulseRedstone_2075186221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2075186221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityIsHolding(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertEntityIsHolding__162830827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-162830827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertContainerContains(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertContainerContains_502451340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(502451340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertItemEntityPresent(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertItemEntityPresent__1654018848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1654018848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertItemEntityPresent(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void assertItemEntityPresent_637700800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(637700800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityNotTouching(Lnet/minecraft/world/entity/EntityType;DDD)V", cancellable = true)
    private void assertEntityNotTouching__938692132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-938692132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenEntityPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void succeedWhenEntityPresent_1268937724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268937724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenEntityPresent(Lnet/minecraft/world/entity/EntityType;III)V", cancellable = true)
    private void succeedWhenEntityPresent__648377663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-648377663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertSameBlockStates(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertSameBlockStates__3436496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-3436496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/AABB;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertEntityPresent_1143403399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1143403399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/AABB;)V", cancellable = true)
    private void assertEntityPresent__1543832717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1543832717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;)V", cancellable = true)
    private void assertEntityPresent_894135622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(894135622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;III)V", cancellable = true)
    private void assertEntityPresent__648377663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-648377663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void assertEntityPresent_1762923686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1762923686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertEntityPresent_1268937724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268937724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertRedstoneSignal(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Ljava/util/function/IntPredicate;Ljava/util/function/Supplier;)V", cancellable = true)
    private void assertRedstoneSignal__1831192285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1831192285L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertValueInBetween(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V", cancellable = true)
    private void assertValueInBetween_260494132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(260494132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertValueInBetween(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertValueInBetween_505172158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(505172158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockEntityData(Lnet/minecraft/core/BlockPos;Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Supplier;)V", cancellable = true)
    private void assertBlockEntityData__1130776659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1130776659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertValueEqual(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", cancellable = true)
    private void assertValueEqual_1535041993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1535041993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertValueEqual(Ljava/lang/Object;Ljava/lang/Object;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertValueEqual_1887978195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1887978195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityData(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/world/entity/EntityType;Ljava/util/function/Function;Ljava/lang/Object;)V", cancellable = true)
    private void assertEntityData__909488681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-909488681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityData(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;Ljava/util/function/Predicate;)V", cancellable = true)
    private void assertEntityData_812882753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(812882753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityData(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;Ljava/util/function/Function;Ljava/lang/Object;)V", cancellable = true)
    private void assertEntityData__243823264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-243823264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "killAllEntities()V", cancellable = true)
    private void killAllEntities_1148340103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1148340103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findOneEntity(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void findOneEntity_959698521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959698521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "despawnItem(Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void despawnItem_2069645095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2069645095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeAboutToDrown(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void makeAboutToDrown_1754589793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754589793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeMockServerPlayer(Lnet/minecraft/world/level/GameType;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void makeMockServerPlayer__81403769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81403769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertBlockProperty(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/properties/Property;Ljava/util/function/Predicate;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertBlockProperty__1483717832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1483717832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockProperty(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)V", cancellable = true)
    private void assertBlockProperty__2117557450(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2117557450L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBoundsWithPadding()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getBoundsWithPadding__310591988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310591988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertItemEntityCountIs(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/BlockPos;DI)V", cancellable = true)
    private void assertItemEntityCountIs__620934169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-620934169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertItemEntityNotPresent(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void assertItemEntityNotPresent_637700800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(637700800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertItemEntityNotPresent(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertItemEntityNotPresent__1654018848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1654018848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runAtTickTime(JLjava/lang/Runnable;)V", cancellable = true)
    private void runAtTickTime_1901958399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1901958399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityTouching(Lnet/minecraft/world/entity/EntityType;DDD)V", cancellable = true)
    private void assertEntityTouching__938692132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-938692132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertFalse(ZLnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertFalse_210807077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(210807077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertFalse(ZLjava/lang/String;)V", cancellable = true)
    private void assertFalse_1690838299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1690838299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertContainerEmpty(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertContainerEmpty_1278831963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278831963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withLowHealth(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void withLowHealth_1754589793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754589793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertSameBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertSameBlockState__1851881465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1851881465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickPrecipitation()V", cancellable = true)
    private void tickPrecipitation_1148340103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1148340103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickPrecipitation(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void tickPrecipitation_1278831963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278831963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTestDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getTestDirection_347210079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(347210079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "succeedOnTickWhen(ILjava/lang/Runnable;)V", cancellable = true)
    private void succeedOnTickWhen__315799554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-315799554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenEntityData(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;Ljava/util/function/Function;Ljava/lang/Object;)V", cancellable = true)
    private void succeedWhenEntityData__243823264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-243823264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityProperty(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Function;Ljava/lang/Object;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertEntityProperty__932367866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-932367866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityProperty(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Predicate;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertEntityProperty_1626557507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1626557507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runBeforeTestEnd(Ljava/lang/Runnable;)V", cancellable = true)
    private void runBeforeTestEnd__1728160251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1728160251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/item/ItemEntity;", cancellable = true)
    private void spawnItem_993689144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993689144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnItem(Lnet/minecraft/world/item/Item;FFF)Lnet/minecraft/world/entity/item/ItemEntity;", cancellable = true)
    private void spawnItem__1025732018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025732018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/item/ItemEntity;", cancellable = true)
    private void spawnItem_1781541808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781541808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertEntityInstancePresent(Lnet/minecraft/world/entity/Entity;III)V", cancellable = true)
    private void assertEntityInstancePresent_1351716455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351716455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityInstancePresent(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertEntityInstancePresent__1176726494(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1176726494L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityInstancePresent(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void assertEntityInstancePresent__1038223040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1038223040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenEntityNotPresent(Lnet/minecraft/world/entity/EntityType;III)V", cancellable = true)
    private void succeedWhenEntityNotPresent__648377663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-648377663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenEntityNotPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void succeedWhenEntityNotPresent_1268937724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268937724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertContainerContainsSingle(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertContainerContainsSingle_502451340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(502451340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeMockServerPlayerInLevel()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void makeMockServerPlayerInLevel_113004881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(113004881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertLivingEntityHasMobEffect(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/Holder;I)V", cancellable = true)
    private void assertLivingEntityHasMobEffect__2103962431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2103962431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityInventoryContains(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertEntityInventoryContains__162830827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-162830827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertAtTickTimeContainerContains(JLnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertAtTickTimeContainerContains_147718534(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(147718534L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertAtTickTimeContainerEmpty(JLnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertAtTickTimeContainerEmpty_2085580705(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2085580705L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEachTick(Ljava/lang/Runnable;)V", cancellable = true)
    private void onEachTick__1728160251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1728160251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeed()V", cancellable = true)
    private void succeed_1148340103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1148340103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void useBlock_1278831963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278831963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void useBlock_678645462(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(678645462L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/phys/BlockHitResult;)V", cancellable = true)
    private void useBlock__1274863808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1274863808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "randomTick(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void randomTick_1278831963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278831963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertTrue(ZLnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertTrue_210807077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(210807077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertTrue(ZLjava/lang/String;)V", cancellable = true)
    private void assertTrue_1690838299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1690838299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pullLever(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void pullLever_1278831963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278831963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pullLever(III)V", cancellable = true)
    private void pullLever_329972960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(329972960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "walkTo(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/core/BlockPos;F)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void walkTo_1013482999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013482999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void placeBlock_737666951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(737666951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeBlock(IIILnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void placeBlock_1303505698(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303505698L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnMob(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/gametest/framework/GameTestMobBuilder;", cancellable = true)
    private void spawnMob__1495739354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495739354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnMob(Lnet/minecraft/world/entity/EntityType;FFF)Lnet/minecraft/gametest/framework/GameTestMobBuilder;", cancellable = true)
    private void spawnMob__1202209848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1202209848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnMob(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/gametest/framework/GameTestMobBuilder;", cancellable = true)
    private void spawnMob__1496437730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1496437730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnMob(Lnet/minecraft/world/entity/EntityType;III)Lnet/minecraft/gametest/framework/GameTestMobBuilder;", cancellable = true)
    private void spawnMob_33325675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33325675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "failIf(Ljava/lang/Runnable;)V", cancellable = true)
    private void failIf__1728160251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1728160251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "failIfEver(Ljava/lang/Runnable;)V", cancellable = true)
    private void failIfEver__1728160251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1728160251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedIf(Ljava/lang/Runnable;)V", cancellable = true)
    private void succeedIf__1728160251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1728160251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeAt(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void placeAt_1896052039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1896052039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void tickBlock_1278831963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278831963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBiome(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void setBiome_1297734667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1297734667L))
            info.cancel();
    }


}
