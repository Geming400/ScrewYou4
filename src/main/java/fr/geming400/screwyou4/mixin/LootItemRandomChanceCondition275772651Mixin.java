package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition.class)
public class LootItemRandomChanceCondition275772651Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1661284910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661284910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__859687324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-859687324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_314035393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(314035393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1661413374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661413374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__2101176447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101176447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2011626375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011626375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomChance(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void randomChance__568728417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568728417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomChance(F)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void randomChance_476853698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476853698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chance()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void chance__1387884995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1387884995L))
            info.setReturnValue(null);
    }


}
