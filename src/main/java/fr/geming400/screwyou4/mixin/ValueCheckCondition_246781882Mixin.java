package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.ValueCheckCondition.class)
public class ValueCheckCondition_246781882Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void value_17111292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17111292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__661844387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661844387L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1017205406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017205406L))
            info.setReturnValue("\uFFE8\u4944^*i55zi<,k=.ljYm8*<\u6AE1sgp:!}\u88ED1R\u274A<O(1;c@Y|{&71\u19C7BZ<\uB458`GaEt9\u1572Q?\u83ED\uB446P,rC+zq(5+\u9EC0+#\u47BF!9bC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_804133972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804133972L))
            info.setReturnValue(320603087);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1158830595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1158830595L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1490189830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1490189830L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__771936890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-771936890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "range()Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private void range_1502349851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502349851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasValue(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;Lnet/minecraft/world/level/storage/loot/IntRange;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void hasValue__1705572048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1705572048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1313227135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313227135L))
            info.setReturnValue(null);
    }


}
