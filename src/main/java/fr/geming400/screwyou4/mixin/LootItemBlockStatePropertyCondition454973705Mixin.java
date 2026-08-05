package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition.class)
public class LootItemBlockStatePropertyCondition454973705Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1840485964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840485964L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__680486270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680486270L))
            info.setReturnValue("+^5,mKu鰭CL=|hM:䈴v-|[=N.w@ZW'#ꇴDh,<>iG.k7$@15%}HUKiuym%$F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_493236447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493236447L))
            info.setReturnValue(838294213);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1921975393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921975393L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1840614428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840614428L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Optional;", cancellable = true)
    private void properties_700435127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700435127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/core/Holder;", cancellable = true)
    private void block_2003849477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003849477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasBlockStateProperties(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemBlockStatePropertyCondition$Builder;", cancellable = true)
    private static void hasBlockStateProperties__1942116533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942116533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2104139867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104139867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1374061781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1374061781L))
            info.setReturnValue(null);
    }


}
