package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.EnvironmentAttributeCheck.class)
public class EnvironmentAttributeCheck_708324671Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__295196278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295196278L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__200301598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-200301598L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1478748195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478748195L))
            info.setReturnValue("A]*H\uB550];\uA338@Kq\uAA5C7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1265676761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1265676761L))
            info.setReturnValue(1163281457);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1028647041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028647041L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__697287806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697287806L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/world/attribute/EnvironmentAttribute;", cancellable = true)
    private void attribute_207594683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(207594683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1774769924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1774769924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "environmentAttribute(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/lang/Object;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void environmentAttribute_409028340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409028340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_1487827898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487827898L))
            info.setReturnValue(null);
    }


}
