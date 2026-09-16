package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.EnchantmentActiveCheck.class)
public class EnchantmentActiveCheck_1104912261Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_196285992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(196285992L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1875335785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875335785L))
            info.setReturnValue("(ot];#w\u673B\u7800>w1y'h@JD6\u92A3wu\u809FSk\u3252\u75E6:@\uA6AE7FUA\u739EK\u6EC7FH'ky/\u324C4*o6\u1C70F_X@HZi&\u1684@M{yy@2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1662264351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662264351L))
            info.setReturnValue(-118597715);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__300700216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300700216L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__632059451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632059451L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "active()Z", cancellable = true)
    private void active_567797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(567797L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_1884415488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884415488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2123609782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123609782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantmentActiveCheck()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void enchantmentActiveCheck_1666225882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666225882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantmentInactiveCheck()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void enchantmentInactiveCheck_1745529023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745529023L))
            info.setReturnValue(null);
    }


}
