package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SequenceFunction.class)
public class SequenceFunction1465665575Mixin {
        @Inject(at = @At("HEAD"), method = "of(Ljava/util/List;)Lnet/minecraft/world/level/storage/loot/functions/SequenceFunction;", cancellable = true)
    private static void of__1342899751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342899751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void apply_503668280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503668280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void apply_874836661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874836661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_446946804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(446946804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1762856467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1762856467L))
            info.setReturnValue(null);
    }


}
