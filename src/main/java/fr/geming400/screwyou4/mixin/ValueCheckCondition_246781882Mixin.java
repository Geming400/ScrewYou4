package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.ValueCheckCondition.class)
public class ValueCheckCondition_246781882Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void value__1416875765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1416875765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1632294140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632294140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__888678094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888678094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_285044623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285044623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__2130167217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2130167217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1632422604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632422604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1823412572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1823412572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "range()Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private void range__406751432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406751432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasValue(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;Lnet/minecraft/world/level/storage/loot/IntRange;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void hasValue__1255793927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255793927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1982635605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982635605L))
            info.setReturnValue(null);
    }


}
