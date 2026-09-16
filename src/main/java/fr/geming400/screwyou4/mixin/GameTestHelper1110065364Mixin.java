package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestHelper.class)
public class GameTestHelper1110065364Mixin {
        @Inject(at = @At("HEAD"), method = "getBounds()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getBounds__1015829375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015829375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fail(Lnet/minecraft/network/chat/Component;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void fail_1675170922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1675170922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fail(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void fail__1921207619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1921207619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fail(Lnet/minecraft/network/chat/Component;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void fail__1483270683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1483270683L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fail(Ljava/lang/String;)V", cancellable = true)
    private void fail__1728648525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1728648525L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTime(J)V", cancellable = true)
    private void setTime_1107724944(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1107724944L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_988960754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988960754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "kill(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void kill_438862014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(438862014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;D)Ljava/util/List;", cancellable = true)
    private void getEntities_460770990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460770990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/entity/EntityType;)Ljava/util/List;", cancellable = true)
    private void getEntities_2050097102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050097102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEveryBlockInStructure(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEveryBlockInStructure__538386588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-538386588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void setBlock__2146661663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2146661663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void setBlock__1896797220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1896797220L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void setBlock__731586672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-731586672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(IIILnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void setBlock_1243530411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1243530411L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlock_510977365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(510977365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(IIILnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlock__1010413222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1010413222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurt(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void hurt__1631098964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1631098964L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__1645019340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645019340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/levelgen/Heightmap$Types;II)I", cancellable = true)
    private void getHeight__246167447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246167447L))
            info.setReturnValue(-1631295070);
    }

    @Inject(at = @At("HEAD"), method = "discard(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void discard_202313214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(202313214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeAt(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void placeAt_1403861857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1403861857L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "randomTick(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void randomTick_1589231195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1589231195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeed()V", cancellable = true)
    private void succeed_435397253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(435397253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findEntities(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;", cancellable = true)
    private void findEntities_6945571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(6945571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findEntities(Lnet/minecraft/world/entity/EntityType;IIID)Ljava/util/List;", cancellable = true)
    private void findEntities_231082224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231082224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveTo(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void moveTo_1268717461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268717461L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveTo(Lnet/minecraft/world/entity/Mob;FFF)V", cancellable = true)
    private void moveTo__1985424449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1985424449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveTo(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void moveTo_308783069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(308783069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "relativePos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relativePos_1549839377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549839377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickPrecipitation(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void tickPrecipitation_110195905(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(110195905L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickPrecipitation()V", cancellable = true)
    private void tickPrecipitation__1481038239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1481038239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;Ljava/lang/Class;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_286882939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286882939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "destroyBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void destroyBlock__70803122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-70803122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void tickBlock_1505766987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1505766987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTick()J", cancellable = true)
    private void getTick_970765384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970765384L))
            info.setReturnValue(-956547094265270751L);
    }

    @Inject(at = @At("HEAD"), method = "walkTo(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/core/BlockPos;F)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void walkTo__1286609325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286609325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pullLever(III)V", cancellable = true)
    private void pullLever__2002647003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2002647003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pullLever(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void pullLever__654164896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-654164896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertTrue(ZLjava/lang/String;)V", cancellable = true)
    private void assertTrue_308794127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(308794127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertTrue(ZLnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertTrue_341955865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(341955865L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBiome(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void setBiome__1235259415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1235259415L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "failIf(Ljava/lang/Runnable;)V", cancellable = true)
    private void failIf__841750134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-841750134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "failIfEver(Ljava/lang/Runnable;)V", cancellable = true)
    private void failIfEver__1676854388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1676854388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedIf(Ljava/lang/Runnable;)V", cancellable = true)
    private void succeedIf_160115686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(160115686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/phys/BlockHitResult;)V", cancellable = true)
    private void useBlock__317758534(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-317758534L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void useBlock_1464717596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1464717596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void useBlock__1876457695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1876457695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn__331890086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331890086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_788870050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788870050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;DDDLnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawn_1459527957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459527957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;III)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_47267577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47267577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;FFF)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn__57408106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-57408106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn__940190412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-940190412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;I)Ljava/util/List;", cancellable = true)
    private void spawn__788036411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788036411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;", cancellable = true)
    private void spawn_1980486525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980486525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_1882777068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882777068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/item/ItemEntity;", cancellable = true)
    private void spawnItem_709483238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(709483238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/item/ItemEntity;", cancellable = true)
    private void spawnItem_757783518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757783518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnItem(Lnet/minecraft/world/item/Item;FFF)Lnet/minecraft/world/entity/item/ItemEntity;", cancellable = true)
    private void spawnItem__1388044292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388044292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnMob(Lnet/minecraft/world/entity/EntityType;III)Lnet/minecraft/gametest/framework/GameTestMobBuilder;", cancellable = true)
    private void spawnMob__965800250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965800250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnMob(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/gametest/framework/GameTestMobBuilder;", cancellable = true)
    private void spawnMob__1782229823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782229823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnMob(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/gametest/framework/GameTestMobBuilder;", cancellable = true)
    private void spawnMob__1935871495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935871495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnMob(Lnet/minecraft/world/entity/EntityType;FFF)Lnet/minecraft/gametest/framework/GameTestMobBuilder;", cancellable = true)
    private void spawnMob_2093631523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2093631523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void placeBlock__1005323007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1005323007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeBlock(IIILnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void placeBlock__690428644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-690428644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertAtTickTimeContainerContains(JLnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertAtTickTimeContainerContains_95208195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(95208195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertAtTickTimeContainerEmpty(JLnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertAtTickTimeContainerEmpty__87378478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-87378478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityInventoryContains(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertEntityInventoryContains_1140017127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1140017127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityInstancePresent(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void assertEntityInstancePresent_1077815261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1077815261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityInstancePresent(Lnet/minecraft/world/entity/Entity;III)V", cancellable = true)
    private void assertEntityInstancePresent_578668010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(578668010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityInstancePresent(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertEntityInstancePresent_2078121445(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2078121445L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeMockServerPlayerInLevel()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void makeMockServerPlayerInLevel_1127363886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127363886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertLivingEntityHasMobEffect(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/Holder;I)V", cancellable = true)
    private void assertLivingEntityHasMobEffect__601760726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-601760726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenEntityNotPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void succeedWhenEntityNotPresent_1628337269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1628337269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenEntityNotPresent(Lnet/minecraft/world/entity/EntityType;III)V", cancellable = true)
    private void succeedWhenEntityNotPresent_2072359034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2072359034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertContainerContainsSingle(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertContainerContainsSingle_1642336458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1642336458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "absolutePos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void absolutePos_54904518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(54904518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertBlockTag(Lnet/minecraft/tags/TagKey;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertBlockTag__695604008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-695604008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runAfterDelay(JLjava/lang/Runnable;)V", cancellable = true)
    private void runAfterDelay__213885839(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-213885839L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pressButton(III)V", cancellable = true)
    private void pressButton__289926859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-289926859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pressButton(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void pressButton__1639968400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1639968400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findClosestEntity(Lnet/minecraft/world/entity/EntityType;IIID)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void findClosestEntity_1637756023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1637756023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertBlockState(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;Ljava/util/function/Function;)V", cancellable = true)
    private void assertBlockState__733116574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-733116574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void assertBlockState_623751796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(623751796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertionException(Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/gametest/framework/GameTestAssertException;", cancellable = true)
    private void assertionException_236684699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236684699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertionException(Lnet/minecraft/core/BlockPos;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/gametest/framework/GameTestAssertPosException;", cancellable = true)
    private void assertionException_1067446784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067446784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertionException(Lnet/minecraft/core/BlockPos;Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/gametest/framework/GameTestAssertPosException;", cancellable = true)
    private void assertionException_2094934375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2094934375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertionException(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/gametest/framework/GameTestAssertException;", cancellable = true)
    private void assertionException_1696076926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1696076926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertBlock(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;Ljava/util/function/Function;)V", cancellable = true)
    private void assertBlock__510271611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-510271611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockNotPresent(Lnet/minecraft/world/level/block/Block;III)V", cancellable = true)
    private void assertBlockNotPresent__355800055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-355800055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockNotPresent(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertBlockNotPresent_1194871620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1194871620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockPresent(Lnet/minecraft/world/level/block/Block;III)V", cancellable = true)
    private void assertBlockPresent_169551428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(169551428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockPresent(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void assertBlockPresent_1532836003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1532836003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockPresent(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertBlockPresent_1979900351(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1979900351L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startSequence()Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void startSequence__649840312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-649840312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenBlockPresent(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void succeedWhenBlockPresent__933500375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-933500375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenBlockPresent(Lnet/minecraft/world/level/block/Block;III)V", cancellable = true)
    private void succeedWhenBlockPresent__1936662738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1936662738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhen(Ljava/lang/Runnable;)V", cancellable = true)
    private void succeedWhen__1511188247(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1511188247L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnEntity(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void spawnEntity__1332044249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332044249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnEntity(Lnet/minecraft/world/entity/EntityType;III)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void spawnEntity_1108734394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108734394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnEntity(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void spawnEntity_1842114719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1842114719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnEntity(Lnet/minecraft/world/entity/EntityType;FFF)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void spawnEntity_1139695421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139695421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;III)V", cancellable = true)
    private void assertEntityPresent_1476403919(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1476403919L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertEntityPresent_1516828298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1516828298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;)V", cancellable = true)
    private void assertEntityPresent__521830408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-521830408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/AABB;)V", cancellable = true)
    private void assertEntityPresent_455807617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(455807617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void assertEntityPresent_857596888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(857596888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/AABB;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertEntityPresent__342142955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-342142955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAbsoluteDirection(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void getAbsoluteDirection_251154917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(251154917L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "absoluteAABB(Lnet/minecraft/world/phys/AABB;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void absoluteAABB__1984226578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1984226578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "killAllEntitiesOfClass(Ljava/lang/Class;)V", cancellable = true)
    private void killAllEntitiesOfClass__1649383689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1649383689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "absoluteVec(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void absoluteVec__1705904330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1705904330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnWithNoFreeWill(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawnWithNoFreeWill_440602224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440602224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnWithNoFreeWill(Lnet/minecraft/world/entity/EntityType;III)Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawnWithNoFreeWill__357481981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357481981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnWithNoFreeWill(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawnWithNoFreeWill_1052914024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1052914024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnWithNoFreeWill(Lnet/minecraft/world/entity/EntityType;FFF)Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawnWithNoFreeWill_788809862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788809862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeMockPlayer(Lnet/minecraft/world/level/GameType;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void makeMockPlayer__1516665376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516665376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRelativeBounds()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getRelativeBounds_978386197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978386197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertEntityIsHolding(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertEntityIsHolding_921005957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(921005957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertValueEqual(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", cancellable = true)
    private void assertValueEqual_1448828928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1448828928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertValueEqual(Ljava/lang/Object;Ljava/lang/Object;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertValueEqual_1662418826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1662418826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityTouching(Lnet/minecraft/world/entity/EntityType;DDD)V", cancellable = true)
    private void assertEntityTouching__1059518928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1059518928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pulseRedstone(Lnet/minecraft/core/BlockPos;J)V", cancellable = true)
    private void pulseRedstone_307188704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307188704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockProperty(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/properties/Property;Ljava/util/function/Predicate;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertBlockProperty_245597916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(245597916L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockProperty(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)V", cancellable = true)
    private void assertBlockProperty_1195304410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1195304410L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityNotPresent(Lnet/minecraft/world/entity/EntityType;)V", cancellable = true)
    private void assertEntityNotPresent_1998218711(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1998218711L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityNotPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/phys/AABB;)V", cancellable = true)
    private void assertEntityNotPresent__1985924926(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1985924926L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityNotPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertEntityNotPresent_1822667019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1822667019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityNotPresent(Lnet/minecraft/world/entity/EntityType;III)V", cancellable = true)
    private void assertEntityNotPresent_231373968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(231373968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityNotTouching(Lnet/minecraft/world/entity/EntityType;DDD)V", cancellable = true)
    private void assertEntityNotTouching__1000741745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1000741745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertValueInBetween(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertValueInBetween_143247910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(143247910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertValueInBetween(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V", cancellable = true)
    private void assertValueInBetween__1303310180(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1303310180L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertContainerContains(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertContainerContains_259811506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(259811506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertRedstoneSignal(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Ljava/util/function/IntPredicate;Ljava/util/function/Supplier;)V", cancellable = true)
    private void assertRedstoneSignal_260058309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(260058309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "relativeVec(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void relativeVec_1972584193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972584193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "despawnItem(Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void despawnItem_298953274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(298953274L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenEntityData(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;Ljava/util/function/Function;Ljava/lang/Object;)V", cancellable = true)
    private void succeedWhenEntityData_224381513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(224381513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityProperty(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Predicate;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertEntityProperty__103885055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-103885055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityProperty(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Function;Ljava/lang/Object;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertEntityProperty_689748744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(689748744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertItemEntityNotPresent(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void assertItemEntityNotPresent__461861372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-461861372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertItemEntityNotPresent(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertItemEntityNotPresent__18481372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-18481372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedOnTickWhen(ILjava/lang/Runnable;)V", cancellable = true)
    private void succeedOnTickWhen__1999505578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1999505578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runAtTickTime(JLjava/lang/Runnable;)V", cancellable = true)
    private void runAtTickTime_1664352071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1664352071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTestRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getTestRotation_128324908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128324908L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.CLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "killAllEntities()V", cancellable = true)
    private void killAllEntities__1943021629(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1943021629L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertBlockEntityData(Lnet/minecraft/core/BlockPos;Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Supplier;)V", cancellable = true)
    private void assertBlockEntityData__1220989151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1220989151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertContainerEmpty(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertContainerEmpty__240165107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-240165107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTestDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getTestDirection_1004343030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004343030L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "assertSameBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertSameBlockState__305117161(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-305117161L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runBeforeTestEnd(Ljava/lang/Runnable;)V", cancellable = true)
    private void runBeforeTestEnd_1054673222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1054673222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertSameBlockStates(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void assertSameBlockStates__1057725901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1057725901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertFalse(ZLjava/lang/String;)V", cancellable = true)
    private void assertFalse_1744146328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1744146328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertFalse(ZLnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void assertFalse_865399586(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(865399586L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityData(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/world/entity/EntityType;Ljava/util/function/Function;Ljava/lang/Object;)V", cancellable = true)
    private void assertEntityData__1793460694(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1793460694L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityData(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;Ljava/util/function/Function;Ljava/lang/Object;)V", cancellable = true)
    private void assertEntityData_1529556595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1529556595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntityData(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;Ljava/util/function/Predicate;)V", cancellable = true)
    private void assertEntityData__871184946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-871184946L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findOneEntity(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void findOneEntity__772970871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772970871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeAboutToDrown(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void makeAboutToDrown_1041960735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041960735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLowHealth(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void withLowHealth__294580341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-294580341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenEntityPresent(Lnet/minecraft/world/entity/EntityType;III)V", cancellable = true)
    private void succeedWhenEntityPresent_608274213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(608274213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "succeedWhenEntityPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void succeedWhenEntityPresent_1395719008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1395719008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBoundsWithPadding()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getBoundsWithPadding__1110595508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110595508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertEntitiesPresent(Lnet/minecraft/world/entity/EntityType;I)V", cancellable = true)
    private void assertEntitiesPresent_1758883085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1758883085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertEntitiesPresent(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/core/BlockPos;ID)V", cancellable = true)
    private void assertEntitiesPresent__1048997309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1048997309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeMockServerPlayer(Lnet/minecraft/world/level/GameType;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void makeMockServerPlayer__43450813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-43450813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertItemEntityCountIs(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/BlockPos;DI)V", cancellable = true)
    private void assertItemEntityCountIs_2009247882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2009247882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "relativeAABB(Lnet/minecraft/world/phys/AABB;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void relativeAABB_379767939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379767939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertItemEntityPresent(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void assertItemEntityPresent_955665855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(955665855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assertItemEntityPresent(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void assertItemEntityPresent__1199727777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1199727777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEachTick(Ljava/lang/Runnable;)V", cancellable = true)
    private void onEachTick__1705309592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1705309592L))
            info.cancel();
    }


}
