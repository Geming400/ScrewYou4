package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.Block.class)
public class Block_308675777Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getName__1550586518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1550586518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1079098805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079098805L))
            info.setReturnValue("Lj#='V-[\u5D01+R$y\u2171?:7\u92C8u=Y^'n%]g\u21BFk8;r\"{z\u732D4\uFACE-6&HnnG\"?");
    }

    @Inject(at = @At("HEAD"), method = "getId(Lnet/minecraft/world/level/block/state/BlockState;)I", cancellable = true)
    private static void getId_416996508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416996508L))
            info.setReturnValue(534512495);
    }

    @Inject(at = @At("HEAD"), method = "destroy(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void destroy__1098620716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1098620716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "box(DDDDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void box_86372517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86372517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "column(DDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void column__708603760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-708603760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "column(DDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void column_521386992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521386992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void stepOn_113026403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(113026403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFriction()F", cancellable = true)
    private void getFriction_1199067379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199067379L))
            info.setReturnValue(9.23774E7F);
    }

    @Inject(at = @At("HEAD"), method = "defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void defaultBlockState_866094595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866094595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builtInRegistryHolder()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void builtInRegistryHolder_292702761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(292702761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpeedFactor()F", cancellable = true)
    private void getSpeedFactor__103138269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103138269L))
            info.setReturnValue(9.23774E7F);
    }

    @Inject(at = @At("HEAD"), method = "getBounceRestitution()F", cancellable = true)
    private void getBounceRestitution__2133086505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133086505L))
            info.setReturnValue(9.23774E7F);
    }

    @Inject(at = @At("HEAD"), method = "getJumpFactor()F", cancellable = true)
    private void getJumpFactor__1258222544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1258222544L))
            info.setReturnValue(9.23774E7F);
    }

    @Inject(at = @At("HEAD"), method = "isPossibleToRespawnInThis(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isPossibleToRespawnInThis_258728529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258728529L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "boxZ(DDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void boxZ_161442647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161442647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "boxZ(DDDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void boxZ__1407630953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407630953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "boxZ(DDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void boxZ_1723021833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723021833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFaceFull(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void isFaceFull_1328578568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1328578568L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "boxes(ILjava/util/function/IntFunction;)[Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void boxes__1331602204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331602204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDrops(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemInstance;)Ljava/util/List;", cancellable = true)
    private static void getDrops_1174109006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174109006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDrops(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/BlockEntity;)Ljava/util/List;", cancellable = true)
    private static void getDrops__1872818759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1872818759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stateById(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void stateById__1565081878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565081878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byItem(Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private static void byItem__56930032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56930032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateDefinition()Lnet/minecraft/world/level/block/state/StateDefinition;", cancellable = true)
    private void getStateDefinition__1034114226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034114226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cube(DDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void cube__1529079471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1529079471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cube(D)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void cube__1496782447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1496782447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_2134454592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134454592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_635738374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635738374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_713357309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(713357309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSupportCenter(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void canSupportCenter__1925701297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925701297L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "updateFromNeighbourShapes(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void updateFromNeighbourShapes_1419339271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419339271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushEntitiesUp(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void pushEntitiesUp__499389742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499389742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dropResources(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private static void dropResources_944821597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(944821597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropResources(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void dropResources__815629463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-815629463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropResources(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void dropResources_863690942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(863690942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popResourceFromFace(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void popResourceFromFace__1300824165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1300824165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderFace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void shouldRenderFace_986598323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986598323L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isExceptionForConnection(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isExceptionForConnection_1689370140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689370140L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isShapeFullBlock(Lnet/minecraft/world/phys/shapes/VoxelShape;)Z", cancellable = true)
    private static void isShapeFullBlock__67573685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67573685L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canSupportRigidBlock(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void canSupportRigidBlock__1060810265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060810265L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "popResource(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void popResource__2029651978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2029651978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateOrDestroy(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private static void updateOrDestroy__1860763928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1860763928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateOrDestroy(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;II)V", cancellable = true)
    private static void updateOrDestroy_1802914311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1802914311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withPropertiesOf(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void withPropertiesOf_1480687007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480687007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExplosionResistance()F", cancellable = true)
    private void getExplosionResistance__1273521045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1273521045L))
            info.setReturnValue(9.33761E7F);
    }

    @Inject(at = @At("HEAD"), method = "playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void playerDestroy_634319365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(634319365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePrecipitation(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/biome/Biome$Precipitation;)V", cancellable = true)
    private void handlePrecipitation_117075389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(117075389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy_1812670730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1812670730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasDynamicShape()Z", cancellable = true)
    private void hasDynamicShape__1929341541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929341541L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "dropFromExplosion(Lnet/minecraft/world/level/Explosion;)Z", cancellable = true)
    private void dropFromExplosion__1339535279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1339535279L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "wasExploded(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/Explosion;)V", cancellable = true)
    private void wasExploded__389980798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-389980798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "asItem()Lnet/minecraft/world/item/Item;", cancellable = true)
    private void asItem_158473409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(158473409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__1739557782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1739557782L))
            info.cancel();
    }


}
