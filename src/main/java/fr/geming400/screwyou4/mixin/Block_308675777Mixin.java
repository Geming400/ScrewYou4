package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.Block.class)
public class Block_308675777Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getName__2099328437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099328437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__826784695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826784695L))
            info.setReturnValue("ᦰ䧱J;Uv0!u(쭠s;.`쏀%oS<ZbhS'䶶os&.IWoVU᥊E+眀砆xH$쎔6}GO%7S|X>G䔐'qbM_r</d");
    }

    @Inject(at = @At("HEAD"), method = "getId(Lnet/minecraft/world/level/block/state/BlockState;)I", cancellable = true)
    private static void getId_163370701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163370701L))
            info.setReturnValue(1153792884);
    }

    @Inject(at = @At("HEAD"), method = "destroy(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void destroy__85995890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-85995890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "box(DDDDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void box__1134257894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1134257894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "column(DDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void column__1816041562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816041562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "column(DDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void column_550553498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550553498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cube(DDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void cube__1816041562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816041562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cube(D)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void cube__504903386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504903386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateDefinition()Lnet/minecraft/world/level/block/state/StateDefinition;", cancellable = true)
    private void getStateDefinition__1449819492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449819492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void defaultBlockState__1987082594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987082594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asItem()Lnet/minecraft/world/item/Item;", cancellable = true)
    private void asItem__210259642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-210259642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__949923991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949923991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_186073695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(186073695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy__413380385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413380385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSupportCenter(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void canSupportCenter__534719773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-534719773L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderFace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void shouldRenderFace__504389223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504389223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "updateOrDestroy(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private static void updateOrDestroy_446489882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(446489882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateOrDestroy(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;II)V", cancellable = true)
    private static void updateOrDestroy_313338389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(313338389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isExceptionForConnection(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isExceptionForConnection_163387038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163387038L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "updateFromNeighbourShapes(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void updateFromNeighbourShapes__1030626261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030626261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builtInRegistryHolder()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void builtInRegistryHolder__879670251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-879670251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSupportRigidBlock(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void canSupportRigidBlock__268852952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-268852952L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "pushEntitiesUp(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void pushEntitiesUp_1000471004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000471004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "popResource(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void popResource_1694243413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1694243413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExplosionResistance()F", cancellable = true)
    private void getExplosionResistance_346935139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346935139L))
            info.setReturnValue(1.278728E8F);
    }

    @Inject(at = @At("HEAD"), method = "isPossibleToRespawnInThis(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isPossibleToRespawnInThis_163386790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163386790L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasDynamicShape()Z", cancellable = true)
    private void hasDynamicShape_346954359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346954359L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getJumpFactor()F", cancellable = true)
    private void getJumpFactor_346935139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346935139L))
            info.setReturnValue(1.278728E8F);
    }

    @Inject(at = @At("HEAD"), method = "wasExploded(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/Explosion;)V", cancellable = true)
    private void wasExploded__1811368786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1811368786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpeedFactor()F", cancellable = true)
    private void getSpeedFactor_346935139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346935139L))
            info.setReturnValue(1.278728E8F);
    }

    @Inject(at = @At("HEAD"), method = "dropFromExplosion(Lnet/minecraft/world/level/Explosion;)Z", cancellable = true)
    private void dropFromExplosion__2001556619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001556619L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBounceRestitution()F", cancellable = true)
    private void getBounceRestitution_346935139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346935139L))
            info.setReturnValue(1.278728E8F);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy_2036107924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2036107924L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withPropertiesOf(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void withPropertiesOf__28873905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28873905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isShapeFullBlock(Lnet/minecraft/world/phys/shapes/VoxelShape;)Z", cancellable = true)
    private static void isShapeFullBlock_1217225170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217225170L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "popResourceFromFace(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void popResourceFromFace__1025433695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1025433695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFriction()F", cancellable = true)
    private void getFriction_346935139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346935139L))
            info.setReturnValue(1.278728E8F);
    }

    @Inject(at = @At("HEAD"), method = "handlePrecipitation(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/biome/Biome$Precipitation;)V", cancellable = true)
    private void handlePrecipitation__963348158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-963348158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropResources(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private static void dropResources_1009942163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1009942163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropResources(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void dropResources_575490463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(575490463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropResources(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void dropResources__344004408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-344004408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void playerDestroy__1131067394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1131067394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "boxZ(DDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void boxZ_550553498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550553498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "boxZ(DDDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void boxZ_900556326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900556326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "boxZ(DDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void boxZ__1816041562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816041562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn_1682480612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1682480612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDrops(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/BlockEntity;)Ljava/util/List;", cancellable = true)
    private static void getDrops_1188331815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188331815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDrops(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemInstance;)Ljava/util/List;", cancellable = true)
    private static void getDrops_2017168700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017168700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFaceFull(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void isFaceFull__267676514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-267676514L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "stateById(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void stateById_1548233293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1548233293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void stepOn__376522600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-376522600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "boxes(ILjava/util/function/IntFunction;)[Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void boxes_1422556523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1422556523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byItem(Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private static void byItem_266120582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266120582L))
            info.setReturnValue(null);
    }


}
