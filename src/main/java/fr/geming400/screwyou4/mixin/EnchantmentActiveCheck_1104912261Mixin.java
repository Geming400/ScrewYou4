package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.EnchantmentActiveCheck.class)
public class EnchantmentActiveCheck_1104912261Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1804542777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1804542777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__30547715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30547715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1143175002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143175002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1272036838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1272036838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1804414313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1804414313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "active()Z", cancellable = true)
    private void active_1143190843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143190843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1454201312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454201312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantmentActiveCheck()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void enchantmentActiveCheck__1276692635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1276692635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantmentInactiveCheck()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void enchantmentInactiveCheck__1276692635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1276692635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__724123226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724123226L))
            info.setReturnValue(null);
    }


}
