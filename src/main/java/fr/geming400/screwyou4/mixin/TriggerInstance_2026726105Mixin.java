package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ItemUsedOnLocationTrigger.TriggerInstance.class)
public class TriggerInstance_2026726105Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1118099836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1118099836L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1497817667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497817667L))
            info.setReturnValue("xiF%\u8365;r#,Kj\uB674P:;\uFE2FZcGr1[pVJ\u1E10");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1710889101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710889101L))
            info.setReturnValue(-1854815794);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__1554172005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1554172005L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__2008068086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2008068086L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "location()Ljava/util/Optional;", cancellable = true)
    private void location_834135355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834135355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlockWithProperties(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlockWithProperties_1435403537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435403537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlockWithProperties(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/Property;I)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlockWithProperties_993815207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993815207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlockWithProperties(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/String;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlockWithProperties_695086330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695086330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlockWithProperties(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/Property;Z)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlockWithProperties__1216781192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1216781192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlock([Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlock_939369792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939369792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placedBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void placedBlock__1335525417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1335525417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allayDropItemOnBlock(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void allayDropItemOnBlock__1376465654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376465654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemUsedOnBlock(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void itemUsedOnBlock__1038817249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038817249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_796073063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796073063L))
            info.setReturnValue(null);
    }


}
