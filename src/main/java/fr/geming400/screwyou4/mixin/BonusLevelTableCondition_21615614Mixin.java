package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition.class)
public class BonusLevelTableCondition_21615614Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1407127872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407127872L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1113844362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1113844362L))
            info.setReturnValue("Jqr<<6");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values_1647952429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647952429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_59878355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59878355L))
            info.setReturnValue(-796266206);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test_1939633811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939633811L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1407256336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407256336L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1757469337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757469337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantment()Lnet/minecraft/core/Holder;", cancellable = true)
    private void enchantment_1570491385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570491385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1807419873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807419873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bonusLevelFlatChance(Lnet/minecraft/core/Holder;[F)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void bonusLevelFlatChance__352432072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352432072L))
            info.setReturnValue(null);
    }


}
