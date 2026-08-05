package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityType.class)
public class EntityType2083748937Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1440795330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1440795330L))
            info.setReturnValue("\"7)Zxk.\uD1CD-;|?UHAC]mz\uC5B4\u75AE=cz\u16C2'ZG\uC81Fx-cQ\uD4FF?vxK(!\uBAE38b!9r (s\u8A6A\uFCC7kK-[c4z`pY3L/y\u12F3Xy");
    }

    @Inject(at = @At("HEAD"), method = "getKey(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getKey_324021280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(324021280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toShortString()Ljava/lang/String;", cancellable = true)
    private void toShortString__1009976188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1009976188L))
            info.setReturnValue("r+40Avxc<\u10F8Hv_qwbQU_K,gJxK&45MIYY\uD54E");
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/PostSpawnProcessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntitySpawnReason;ZZ)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void create__833720159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-833720159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;)Ljava/util/Optional;", cancellable = true)
    private static void create__1098776749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1098776749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnRequest;)Ljava/util/Optional;", cancellable = true)
    private static void create_1234935087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234935087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void create_564536232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564536232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnRequest;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void create_447210665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447210665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription_1639804962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639804962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCategory()Lnet/minecraft/world/entity/MobCategory;", cancellable = true)
    private void getCategory_1809094536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809094536L))
            info.setReturnValue(net.minecraft.world.entity.MobCategory.AMBIENT);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId_746631059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746631059L))
            info.setReturnValue("|\u4207\u6847N@Q|%#p]jBge3iRWDSa#|iz`|g4Fx{r\u636AO\u267AN4Gzv_yb\uA01A\uC3841ax:x0*@R_3j\uB78A!o2\uD192zX ^6dO?AY3B<:u=|pNC8%\uB432%S)X\"l!\"G");
    }

    @Inject(at = @At("HEAD"), method = "getDefaultLootTable()Ljava/util/Optional;", cancellable = true)
    private void getDefaultLootTable__1030732494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030732494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSerialize()Z", cancellable = true)
    private void canSerialize_844879632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844879632L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDimensions()Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDimensions__852655329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852655329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builtInRegistryHolder()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void builtInRegistryHolder_2067775922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067775922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireImmune()Z", cancellable = true)
    private void fireImmune__1440836793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1440836793L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "by(Lnet/minecraft/world/level/storage/ValueInput;)Ljava/util/Optional;", cancellable = true)
    private static void by_619827936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619827936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()F", cancellable = true)
    private void getWidth_145849564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145849564L))
            info.setReturnValue(9.036143E8F);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()F", cancellable = true)
    private void getHeight_358128879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358128879L))
            info.setReturnValue(9.036143E8F);
    }

    @Inject(at = @At("HEAD"), method = "tryCast(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void tryCast_1379203362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379203362L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "tryCast(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void tryCast__1714721662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1714721662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures_1180130271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180130271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntitySpawnReason;ZZ)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn__882399748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882399748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/PostSpawnProcessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntitySpawnReason;ZZ)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn__1645195070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645195070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_836205339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836205339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSummon()Z", cancellable = true)
    private void canSummon_2021514191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021514191L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canSpawn(Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void canSpawn_143342906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143342906L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "appendCustomEntityStackConfig(Lnet/minecraft/world/entity/PostSpawnProcessor;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/PostSpawnProcessor;", cancellable = true)
    private static void appendCustomEntityStackConfig__135682832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135682832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntitiesRecursive(Lnet/minecraft/world/level/storage/ValueInput$ValueInputList;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;)Ljava/util/stream/Stream;", cancellable = true)
    private static void loadEntitiesRecursive__1044476029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1044476029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntityRecursive(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/EntityProcessor;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void loadEntityRecursive_793118353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793118353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntityRecursive(Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnRequest;Lnet/minecraft/world/entity/EntityProcessor;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void loadEntityRecursive__871709323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-871709323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntityRecursive(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/nbt/CompoundTag;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/EntityProcessor;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void loadEntityRecursive_860010012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860010012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntityRecursive(Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/EntityProcessor;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void loadEntityRecursive__285777566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-285777566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntityRecursive(Lnet/minecraft/nbt/CompoundTag;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnRequest;Lnet/minecraft/world/entity/EntityProcessor;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void loadEntityRecursive_1972450444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972450444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trackDeltas()Z", cancellable = true)
    private void trackDeltas_492338394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492338394L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBaseClass()Ljava/lang/Class;", cancellable = true)
    private void getBaseClass_884864152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884864152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateCustomEntityTag(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/component/TypedEntityData;)V", cancellable = true)
    private static void updateCustomEntityTag__1851723458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1851723458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onlyOpCanSetNbt()Z", cancellable = true)
    private void onlyOpCanSetNbt__1802666657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802666657L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "updateInterval()I", cancellable = true)
    private void updateInterval_567404097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(567404097L))
            info.setReturnValue(-822551796);
    }

    @Inject(at = @At("HEAD"), method = "clientTrackingRange()I", cancellable = true)
    private void clientTrackingRange_948964436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948964436L))
            info.setReturnValue(-422197370);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedInPeaceful()Z", cancellable = true)
    private void isAllowedInPeaceful__955646738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-955646738L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnAABB(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getSpawnAABB__1089902886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1089902886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBlockDangerous(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBlockDangerous_1906040136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906040136L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSpawnFarFromPlayer()Z", cancellable = true)
    private void canSpawnFarFromPlayer_1762971273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762971273L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "appendComponentsConfig(Lnet/minecraft/world/entity/PostSpawnProcessor;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/PostSpawnProcessor;", cancellable = true)
    private static void appendComponentsConfig__1701450609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701450609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefaultStackConfig(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/PostSpawnProcessor;", cancellable = true)
    private static void createDefaultStackConfig_440419146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440419146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendDefaultStackConfig(Lnet/minecraft/world/entity/PostSpawnProcessor;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/PostSpawnProcessor;", cancellable = true)
    private static void appendDefaultStackConfig_463027831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463027831L))
            info.setReturnValue(null);
    }


}
