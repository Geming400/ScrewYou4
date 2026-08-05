package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.EnvironmentAttributeValue.class)
public class EnvironmentAttributeValue1895297162Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1014157875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1014157875L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_759837187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(759837187L))
            info.setReturnValue("mY:>I%*桗WT>傲$vs%HF8gPe.弘[I=〺G實2b1橱Wbj8 ^`l Y6ze/2rR|[D1'䑫꣩/ZO4튏Y:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1933559904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933559904L))
            info.setReturnValue(-2070198110);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat__481671156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481671156L))
            info.setReturnValue(5.561263E8F);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/world/attribute/EnvironmentAttribute;", cancellable = true)
    private void attribute_522731883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(522731883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEnvironmentAttribute(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lnet/minecraft/world/level/storage/loot/providers/number/EnvironmentAttributeValue;", cancellable = true)
    private static void forEnvironmentAttribute_937775778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937775778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__663816410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663816410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_66261676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66261676L))
            info.setReturnValue(null);
    }


}
