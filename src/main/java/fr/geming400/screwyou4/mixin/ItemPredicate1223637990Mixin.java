package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.ItemPredicate.class)
public class ItemPredicate1223637990Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1685817047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1685817047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_88178015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88178015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1261900732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261900732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/ItemInstance;)Z", cancellable = true)
    private void test_1843249505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843249505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1685688583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1685688583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void count_1072402932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072402932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/Optional;", cancellable = true)
    private void items_1469099412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469099412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/advancements/predicates/DataComponentMatchers;", cancellable = true)
    private void components_1680552193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680552193L))
            info.setReturnValue(null);
    }


}
