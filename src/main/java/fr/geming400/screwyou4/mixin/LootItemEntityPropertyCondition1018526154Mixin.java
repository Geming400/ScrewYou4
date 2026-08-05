package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition.class)
public class LootItemEntityPropertyCondition1018526154Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1890928883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890928883L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__116933821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116933821L))
            info.setReturnValue("}I\uA0B1JZu`zTa-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1056788896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1056788896L))
            info.setReturnValue(-409736091);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1358422944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1358422944L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1890800419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890800419L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate_1263987576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263987576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperties(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void hasProperties_4178943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(4178943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperties(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;Lnet/minecraft/advancements/predicates/entity/EntityPredicate;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void hasProperties__1823116810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823116810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1540587418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1540587418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__810509332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-810509332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTarget()Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private void entityTarget_508521958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508521958L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.THIS);
    }

    @Inject(at = @At("HEAD"), method = "entityPresent(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void entityPresent__763835302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763835302L))
            info.setReturnValue(null);
    }


}
