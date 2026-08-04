package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityType.class)
public class EntityType2083748937Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_948288466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948288466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKey(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getKey__1586689431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1586689431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toShortString()Ljava/lang/String;", cancellable = true)
    private void toShortString_948288466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948288466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void create_890402732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890402732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;)Ljava/util/Optional;", cancellable = true)
    private static void create_342761559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(342761559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/PostSpawnProcessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntitySpawnReason;ZZ)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void create__1228691683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228691683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnRequest;)Ljava/util/Optional;", cancellable = true)
    private static void create_1846993203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846993203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnRequest;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void create_1959137573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959137573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription__93160228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-93160228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCategory()Lnet/minecraft/world/entity/MobCategory;", cancellable = true)
    private void getCategory__1204913388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1204913388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntitySpawnReason;ZZ)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn__1828738281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828738281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_250342240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250342240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/PostSpawnProcessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntitySpawnReason;ZZ)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn__1228691683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228691683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builtInRegistryHolder()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void builtInRegistryHolder_895402910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895402910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBlockDangerous(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBlockDangerous_1938459951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938459951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseClass()Ljava/lang/Class;", cancellable = true)
    private void getBaseClass_1083085417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083085417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpawnFarFromPlayer()Z", cancellable = true)
    private void canSpawnFarFromPlayer_2122027520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122027520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlyOpCanSetNbt()Z", cancellable = true)
    private void onlyOpCanSetNbt_2122027520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122027520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntitiesRecursive(Lnet/minecraft/world/level/storage/ValueInput$ValueInputList;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;)Ljava/util/stream/Stream;", cancellable = true)
    private static void loadEntitiesRecursive_672422990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672422990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendComponentsConfig(Lnet/minecraft/world/entity/PostSpawnProcessor;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/PostSpawnProcessor;", cancellable = true)
    private static void appendComponentsConfig_771674333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771674333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendDefaultStackConfig(Lnet/minecraft/world/entity/PostSpawnProcessor;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/PostSpawnProcessor;", cancellable = true)
    private static void appendDefaultStackConfig_834517204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834517204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateCustomEntityTag(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/component/TypedEntityData;)V", cancellable = true)
    private static void updateCustomEntityTag__520975679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-520975679L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures__1546397861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546397861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateInterval()I", cancellable = true)
    private void updateInterval_2122011183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122011183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpawn(Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void canSpawn_1078777839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078777839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryCast(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void tryCast__1255204504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255204504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryCast(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void tryCast_2095955848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095955848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()F", cancellable = true)
    private void getHeight_2122008300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122008300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()F", cancellable = true)
    private void getWidth_2122008300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122008300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSerialize()Z", cancellable = true)
    private void canSerialize_2122027520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122027520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultLootTable()Ljava/util/Optional;", cancellable = true)
    private void getDefaultLootTable__1965756937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1965756937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireImmune()Z", cancellable = true)
    private void fireImmune_2122027520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122027520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSummon()Z", cancellable = true)
    private void canSummon_2122027520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122027520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId_948288466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948288466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDimensions()Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDimensions_1180569730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180569730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefaultStackConfig(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/PostSpawnProcessor;", cancellable = true)
    private static void createDefaultStackConfig__1411002449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1411002449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnAABB(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getSpawnAABB__1249733899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249733899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trackDeltas()Z", cancellable = true)
    private void trackDeltas_2122027520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122027520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "by(Lnet/minecraft/world/level/storage/ValueInput;)Ljava/util/Optional;", cancellable = true)
    private static void by__458171447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-458171447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientTrackingRange()I", cancellable = true)
    private void clientTrackingRange_2122011183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122011183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedInPeaceful()Z", cancellable = true)
    private void isAllowedInPeaceful_2122027520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122027520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntityRecursive(Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnRequest;Lnet/minecraft/world/entity/EntityProcessor;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void loadEntityRecursive__352723938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352723938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntityRecursive(Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/EntityProcessor;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void loadEntityRecursive__1377414759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377414759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntityRecursive(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/nbt/CompoundTag;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/EntityProcessor;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void loadEntityRecursive_918696275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918696275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntityRecursive(Lnet/minecraft/nbt/CompoundTag;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnRequest;Lnet/minecraft/world/entity/EntityProcessor;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void loadEntityRecursive__1708736253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708736253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadEntityRecursive(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/EntityProcessor;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void loadEntityRecursive_1775752826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775752826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendCustomEntityStackConfig(Lnet/minecraft/world/entity/PostSpawnProcessor;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/PostSpawnProcessor;", cancellable = true)
    private static void appendCustomEntityStackConfig_834517204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834517204L))
            info.setReturnValue(null);
    }


}
