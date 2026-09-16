package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition.class)
public class LootItemEntityPropertyCondition1018526154Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_109899886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109899886L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1788949679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1788949679L))
            info.setReturnValue("p{YZa}i,*J*e^,(P\u5E96oEnu^(8]}%*\uCB76cgSR;#\u1C29nF(|{WR={O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1575878245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575878245L))
            info.setReturnValue(1432601958);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__387086322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387086322L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__718445557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-718445557L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate_1247387695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247387695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_1798029382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798029382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperties(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void hasProperties_365942892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365942892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperties(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;Lnet/minecraft/advancements/predicates/entity/EntityPredicate;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void hasProperties__970767517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970767517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2084971408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084971408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTarget()Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private void entityTarget__1768655086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768655086L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.ATTACKER);
    }

    @Inject(at = @At("HEAD"), method = "entityPresent(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void entityPresent_553434546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553434546L))
            info.setReturnValue(null);
    }


}
