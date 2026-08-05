package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SequenceFunction.class)
public class SequenceFunction1465665575Mixin {
        @Inject(at = @At("HEAD"), method = "of(Ljava/util/List;)Lnet/minecraft/world/level/storage/loot/functions/SequenceFunction;", cancellable = true)
    private static void of_1967878544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967878544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void apply__162160566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162160566L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void apply_1304317767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1304317767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1252671030(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1252671030L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1093447997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093447997L))
            info.setReturnValue(null);
    }


}
