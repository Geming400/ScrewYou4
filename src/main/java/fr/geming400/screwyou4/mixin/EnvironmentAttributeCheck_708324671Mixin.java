package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.EnvironmentAttributeCheck.class)
public class EnvironmentAttributeCheck_708324671Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__1727450407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727450407L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2093836929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2093836929L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__427135305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427135305L))
            info.setReturnValue("&FZ\u7084\uC409t:+l\u6B0C5;-v");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_746587412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746587412L))
            info.setReturnValue(-301209753);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_2093965393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2093965393L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1668624428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668624428L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/world/attribute/EnvironmentAttribute;", cancellable = true)
    private void attribute__664240609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664240609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1850788902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850788902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1120710816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120710816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "environmentAttribute(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/lang/Object;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void environmentAttribute__1552324899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552324899L))
            info.setReturnValue(null);
    }


}
