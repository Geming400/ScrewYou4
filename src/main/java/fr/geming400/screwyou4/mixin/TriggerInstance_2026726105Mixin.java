package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ItemUsedOnLocationTrigger.TriggerInstance.class)
public class TriggerInstance_2026726105Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__882728933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882728933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_891266129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891266129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2064988846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064988846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__350222994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350222994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__113214624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-113214624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "location()Ljava/util/Optional;", cancellable = true)
    private void location__2022779770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022779770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlockWithProperties(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/Property;I)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlockWithProperties__1618062754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618062754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlockWithProperties(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/Property;Z)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlockWithProperties_466308143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466308143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlockWithProperties(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/String;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlockWithProperties__124794333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124794333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlockWithProperties(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlockWithProperties_1390110138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390110138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlock([Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlock__190937712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190937712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlock__1844438649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844438649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allayDropItemOnBlock(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void allayDropItemOnBlock_318661309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318661309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemUsedOnBlock(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void itemUsedOnBlock_318661309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318661309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__2022779770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022779770L))
            info.setReturnValue(null);
    }


}
