package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithEnchantedBonusCondition.class)
public class LootItemRandomChanceWithEnchantedBonusCondition1482338366Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_573712098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(573712098L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2042205405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042205405L))
            info.setReturnValue("E: <FSm\uC20A!Gw20Br\u9D44JD9VE\uC85FS:)/CN\u4823N7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2039690457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2039690457L))
            info.setReturnValue(-1732054790);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test_76725890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76725890L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__254633345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-254633345L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__2033125702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2033125702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1746183676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746183676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantment()Lnet/minecraft/core/Holder;", cancellable = true)
    private void enchantment_349647907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(349647907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomChanceAndLootingBoost(Lnet/minecraft/core/HolderLookup$Provider;FF)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void randomChanceAndLootingBoost__1377346766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377346766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unenchantedChance()F", cancellable = true)
    private void unenchantedChance_2061184622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061184622L))
            info.setReturnValue(5.669812E8F);
    }

    @Inject(at = @At("HEAD"), method = "enchantedChance()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void enchantedChance__1836358343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836358343L))
            info.setReturnValue(null);
    }


}
