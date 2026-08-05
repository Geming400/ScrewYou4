package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithEnchantedBonusCondition.class)
public class LootItemRandomChanceWithEnchantedBonusCondition1482338366Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1427116671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427116671L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_346878391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346878391L))
            info.setReturnValue(")Tg!xeE;p(u&筷<vJ`<勃謊|[o)Xm5z洸pwl9雸ᖭ3늓FH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1520601108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1520601108L))
            info.setReturnValue(989595657);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1426988207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1426988207L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__894610732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894610732L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "randomChanceAndLootingBoost(Lnet/minecraft/core/HolderLookup$Provider;FF)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void randomChanceAndLootingBoost_492844731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492844731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unenchantedChance()F", cancellable = true)
    private void unenchantedChance_1520597729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1520597729L))
            info.setReturnValue(5.251046E8F);
    }

    @Inject(at = @At("HEAD"), method = "enchantedChance()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void enchantedChance_1614417965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1614417965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1076775206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076775206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantment()Lnet/minecraft/core/Holder;", cancellable = true)
    private void enchantment__1263753158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1263753158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__346697120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346697120L))
            info.setReturnValue(null);
    }


}
